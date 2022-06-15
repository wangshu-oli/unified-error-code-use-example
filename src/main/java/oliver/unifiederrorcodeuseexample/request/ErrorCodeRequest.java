package oliver.unifiederrorcodeuseexample.request;

import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author zhangxiaojian
 * @date 2022年06月14日 15:45
 */
@Data
public class ErrorCodeRequest {

    @NotBlank(message = "状态不能为空")
    private String status;

}
