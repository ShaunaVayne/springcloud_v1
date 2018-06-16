package cn.vayne.springcloudribbon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: WangKun
 * @Description: test git
 * @Date: Created in 2018/4/20 下午4:37
 * @ProjectName: springcloud-v1
 * @Version: 1.0.0
 */
@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/add")
	public String add() {
		return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
	}
}
