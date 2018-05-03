package com.sinjinsong.webserver.core.exception;

import com.sinjinsong.webserver.core.enumeration.HTTPStatus;
import com.sinjinsong.webserver.core.exception.base.ServletException;

/**
 * @author sinjinsong
 * @date 2018/5/3
 */
public class FilterNotFoundException extends ServletException {
    private static final HTTPStatus status = HTTPStatus.NOT_FOUND;
    public FilterNotFoundException() {
        super(status);
    }
}
