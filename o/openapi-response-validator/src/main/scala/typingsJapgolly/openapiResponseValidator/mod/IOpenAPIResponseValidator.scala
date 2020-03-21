package typingsJapgolly.openapiResponseValidator.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenAPIResponseValidator extends js.Object {
  def validateResponse(statusCode: String, response: js.Any): Unit | OpenAPIResponseValidatorValidationError
}

object IOpenAPIResponseValidator {
  @scala.inline
  def apply(validateResponse: (String, js.Any) => CallbackTo[Unit | OpenAPIResponseValidatorValidationError]): IOpenAPIResponseValidator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("validateResponse")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => validateResponse(t0, t1).runNow()))
    __obj.asInstanceOf[IOpenAPIResponseValidator]
  }
}

