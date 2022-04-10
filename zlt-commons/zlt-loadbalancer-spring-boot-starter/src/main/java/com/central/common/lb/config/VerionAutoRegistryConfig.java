package com.central.common.lb.config;

import com.central.common.constant.ConfigConstants;
import com.central.common.lb.filter.LbIsolationFilter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.context.annotation.Import;

/**
 * 示例
 *
 * @author jarvis create by 2022/4/10
 */
@LoadBalancerClients(defaultConfiguration = VersionLoadBalancerConfig.class)
@ConditionalOnProperty(prefix = ConfigConstants.CONFIG_LOADBALANCE_ISOLATION, name = "enabled", havingValue = "true", matchIfMissing = false)
@Import({VersionRegisterBeanPostProcessor.class, LbIsolationFilter.class})
public class VerionAutoRegistryConfig {
}
