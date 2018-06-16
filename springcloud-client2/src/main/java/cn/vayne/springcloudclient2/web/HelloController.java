package cn.vayne.springcloudclient2.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/20 下午4:42
 * @ProjectName: springcloud-v1
 * @Version: 1.0.0
 */
@RestController
@Slf4j
public class HelloController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "/add",method = RequestMethod.GET)
	public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
		List<String> services = discoveryClient.getServices();
		Integer c = a * b;
		log.info("/add:service_msg:{},result:{}",services.get(0),c);
		return c;
	}

}
