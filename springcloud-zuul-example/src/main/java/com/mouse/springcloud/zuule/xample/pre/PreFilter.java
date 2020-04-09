package com.mouse.springcloud.zuule.xample.pre;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * @author mouse
 * @version 1.0
 * @date 2020-04-07
 * @description
 */
public class PreFilter extends ZuulFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(PreFilter.class);

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 13;
    }

    @Override
    public boolean shouldFilter() {
        return Boolean.TRUE;
    }

    @Override
    public Object run() throws ZuulException {
        LOGGER.info("PreFilter, execute.");
        return null;
//        throw new ZuulException("msg",200,"error");
    }

}
