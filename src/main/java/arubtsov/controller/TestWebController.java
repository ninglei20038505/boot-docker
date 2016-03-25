package arubtsov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import arubtsov.service.RedisService;

@RestController
public class TestWebController {

	@Autowired
	private RedisService redisService;

	@RequestMapping(value = "/index/get", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String index() {
		System.out.println("index................");
		return "Hello Docker!!!!!!!!!!!!!!!!!!!";
	}

	@RequestMapping(value = "/redis/get/{key}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String rGet(@PathVariable("key") String key) {
		String vString = redisService.get(key);
		System.out.println("redisService:" + vString);
		return "Redis Value:" + vString;
	}

	@RequestMapping(value = "/redis/set/{key}/{value}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String rSet(@PathVariable("key") String key, @PathVariable("value") String value) {
		redisService.set(key, value);
		System.out.println("redisService:  SET OK");
		return "Redis Value: SET OK key:" + key + ",value:" + value;
	}

}
