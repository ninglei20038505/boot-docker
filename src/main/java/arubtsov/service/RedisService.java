package arubtsov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import arubtsov.redis.RedisUtils;

@Service
public class RedisService {

	@Autowired
	private RedisUtils redisUtils;

	public String get(String key) {
		return redisUtils.getValue(key);
	}

	public void set(String key, String value) {
		redisUtils.setValue(key, value);
	}

}
