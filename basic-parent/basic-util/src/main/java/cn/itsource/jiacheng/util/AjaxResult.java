package cn.itsource.jiacheng.util;


/**设置值后把当前对象作为方法的返回值   链式编程
 * AjaxResult.me().setSuccess(false).setMessage("添加失败");
 */
public class AjaxResult {

    private boolean success = true;
    private String message;
    //错误码
    private String errorCode;
    //AjaxResult中封装数据
    private Object data;



    public boolean isSuccess() {
        return success;
    }


    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public AjaxResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public Object getData() {
        return data;
    }

    public AjaxResult setData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * 成功
     * @return
     */
    public static AjaxResult me(){
        return new AjaxResult();
    }

}
