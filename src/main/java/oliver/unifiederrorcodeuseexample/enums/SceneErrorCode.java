package oliver.unifiederrorcodeuseexample.enums;

import lombok.AllArgsConstructor;
import oliver.unifiederrorcode.errorcode.BizErrorCode;
import oliver.unifiederrorcode.errorcode.BusinessLineCommonCode;

/**
 * @author Oliver
 * @date 2022年06月10日 15:12
 */
@AllArgsConstructor
public enum SceneErrorCode implements BizErrorCode {

    /*=====================SOM的错误码范围：700 - 999 =====================*/
    // 请求参数不合法错误需要动态设置errorMsg
    REQUEST_PARAMS_NOT_VALID("700", ""),

    /*
     *  示例接口错误，从 701 开始
     */
    REQUEST_PARAMS_FAIL("701", "示例错误");
    private String code;
    private String errorMsg;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getErrorMsg() {
        return errorMsg;
    }

    /*这里返回每个服务的公共错误码段*/
    @Override
    public BusinessLineCommonCode getBusinessLineCommonCode() {
        return BusinessLineCommonCode.AI_SCENE;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
