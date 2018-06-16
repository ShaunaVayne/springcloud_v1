package cn.vayne.springcloudfeign.web;

import cn.vayne.springcloudfeign.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/24 下午12:40
 * @ProjectName: springcloud-v1
 * @Version: 1.0.0
 */
@RestController
public class HelloController {

	@Autowired
	private ComputeClient computeClient;

	@RequestMapping(value = "/add")
	public Integer add() {
		return computeClient.add(10, 20);
	}
}
