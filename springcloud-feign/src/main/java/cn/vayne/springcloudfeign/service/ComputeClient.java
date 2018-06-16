package cn.vayne.springcloudfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/24 下午12:38
 * @ProjectName: springcloud-v1
 * @Version: 1.0.0
 */
@FeignClient("compute-service")
public interface ComputeClient {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

}
