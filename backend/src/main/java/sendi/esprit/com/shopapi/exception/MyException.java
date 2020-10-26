package sendi.esprit.com.shopapi.exception;


import sendi.esprit.com.shopapi.enums.ResultEnum;

/**
 * Created By Mahmoud on 06/10/2020.
 */
public class MyException extends RuntimeException {

    private Integer code;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public MyException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
