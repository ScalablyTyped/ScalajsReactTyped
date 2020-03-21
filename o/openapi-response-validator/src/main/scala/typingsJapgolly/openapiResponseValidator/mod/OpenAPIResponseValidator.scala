package typingsJapgolly.openapiResponseValidator.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openapiResponseValidator.AnonErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIResponseValidator extends IOpenAPIResponseValidator {
  var errorMapper: js.Any
  var validators: js.Any
  def validateResponse(statusCode: js.Any, response: js.Any): AnonErrors
}

object OpenAPIResponseValidator {
  @scala.inline
  def apply(
    errorMapper: js.Any,
    validateResponse: (js.Any, js.Any) => CallbackTo[AnonErrors],
    validators: js.Any
  ): OpenAPIResponseValidator = {
    val __obj = js.Dynamic.literal(errorMapper = errorMapper.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.updateDynamic("validateResponse")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => validateResponse(t0, t1).runNow()))
    __obj.asInstanceOf[OpenAPIResponseValidator]
  }
}

