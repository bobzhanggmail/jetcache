/**
 * Created on  13-09-19 20:40
 */
package com.taobao.geek.jetcache.spring;

import com.alibaba.fastjson.util.IdentityHashMap;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractBeanFactoryPointcutAdvisor;

/**
 * @author yeli.hl
 */
public class JetCacheAdvisor extends AbstractBeanFactoryPointcutAdvisor {

    private JetCachePointcut pointcut = new JetCachePointcut();

    private IdentityHashMap cacheConfigMap;

    @Override
    public Pointcut getPointcut() {
        pointcut.setCacheConfigMap(cacheConfigMap);
        return pointcut;
    }

    public void setCacheConfigMap(IdentityHashMap cacheConfigMap) {
        this.cacheConfigMap = cacheConfigMap;
    }
}
