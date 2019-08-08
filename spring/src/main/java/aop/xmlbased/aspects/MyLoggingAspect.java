package aop.xmlbased.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class MyLoggingAspect {
    Logger logger = Logger.getLogger(getClass());
    public void beforeAdvise(JoinPoint joinPoint) {
        logger.info("method will be invoked: - " + joinPoint.getSignature());
    }
    public void afterAdvise(JoinPoint joinPoint) {
        logger.info("executed successfully: - " + joinPoint.getSignature());
    }
}
