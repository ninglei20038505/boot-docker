package arubtsov.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtils {

	@Autowired
	private RedisTemplate<String, String> template;

	public void setValue(String key, String value) {
		template.opsForValue().set(key, value);
	}

	public String getValue(String key) {
		return template.opsForValue().get(key);
	}

}
