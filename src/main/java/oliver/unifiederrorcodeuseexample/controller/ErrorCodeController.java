package oliver.unifiederrorcodeuseexample.controller;

import com.fawvw.ftb3.pt.service.open.utils.ValidationUtils;
import java.util.Locale;
import oliver.unifiederrorcode.result.Result;
import oliver.unifiederrorcode.utils.ExceptionUtil;
import oliver.unifiederrorcodeuseexample.enums.SceneErrorCode;
import oliver.unifiederrorcodeuseexample.request.ErrorCodeRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxiaojian
 * @date 2022年06月14日 15:43
 */
@RestController
@RequestMapping(value = "/error-code")
public class ErrorCodeController {

    @GetMapping
    public Result<Object> errorCode(ErrorCodeRequest request) {
        ValidationUtils.validateEntity(request);
        if (request.getStatus().toLowerCase(Locale.ROOT).equals("fail")) {
            throw ExceptionUtil.getException(SceneErrorCode.REQUEST_PARAMS_FAIL);
        }
        return Result.success();
    }

}
