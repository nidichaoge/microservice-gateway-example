package com.mouse.springcloud.zuule.xample.route;

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
public class RouteFilter extends ZuulFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(RouteFilter.class);

    @Override
    public String filterType() {
        return FilterConstants.ROUTE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 15;
    }

    @Override
    public boolean shouldFilter() {
        return Boolean.TRUE;
    }

    @Override
    public Object run() throws ZuulException {
        LOGGER.info("RouteFilter, execute.");
        return null;
    }

}
