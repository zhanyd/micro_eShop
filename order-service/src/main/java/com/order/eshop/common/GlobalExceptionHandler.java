package com.order.eshop.common;

/**
 * Created by Administrator on 2018/2/20 0020.
 */
//@ControllerAdvice
//@ResponseBody
public class GlobalExceptionHandler {

    /*private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(value=Exception.class)
    public ApiResult allExceptionHandler(HttpServletRequest request, Exception exception) throws Exception
    {
        ApiResult apiResult = new ApiResult();
        exception.printStackTrace();
        System.out.println("我报错了："+exception.getLocalizedMessage());
        System.out.println("我报错了："+exception.getCause());
        //System.out.println("我报错了："+exception.getgetSuppressed());
        System.out.println("我报错了："+exception.getMessage());
        System.out.println("我报错了："+exception.getStackTrace());
        logger.error(request.getRequestURI() + ":(getMessage) " + exception.getMessage());
        return apiResult.fail(CodeStatus.EXCEPTION_ERROR,exception.getMessage());
    }*/
}
