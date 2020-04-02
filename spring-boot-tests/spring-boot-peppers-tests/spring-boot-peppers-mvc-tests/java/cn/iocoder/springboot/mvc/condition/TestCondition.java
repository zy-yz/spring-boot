package cn.iocoder.springboot.mvc.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName TestCondition
 * @Description TODO
 * @Author peppers
 * @Date 2020/4/1
 * @Version 1.0
 **/
public class TestCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return true;
	}

}
