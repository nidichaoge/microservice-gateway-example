package com.mouse.springcloud.zuule.xample.error;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * @author mouse
 * @version 1.0
 * @date 2020-04-08
 * @description
 */
public class ErrorFilter extends ZuulFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorFilter.class);

    @Override
    public String filterType() {
        return FilterConstants.ERROR_TYPE;
    }

    @Override
    public int filterOrder() {
        return 19;
    }

    @Override
    public boolean shouldFilter() {
        return Boolean.TRUE;
    }

    @Override
    public Object run() throws ZuulException {
        LOGGER.info("ErrorFilter, execute.");
        return null;
    }

}
