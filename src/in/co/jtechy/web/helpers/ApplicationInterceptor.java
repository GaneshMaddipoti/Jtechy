/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.co.jtechy.web.helpers;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 *
 * @author Ganesh
 */
public class ApplicationInterceptor implements Interceptor, StrutsStatics {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger
			.getLogger(ApplicationInterceptor.class);

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		final ActionContext context = invocation.getInvocationContext();

		Map sessionMap = ActionContext.getContext().getSession();
		return invocation.invoke();

	}

	@Override
	public void destroy() {
		logger.info("Destroying MyLoggingInterceptor...");
	}

	@Override
	public void init() {
		logger.info("Initializing MyLoggingInterceptor...");
	}
}
