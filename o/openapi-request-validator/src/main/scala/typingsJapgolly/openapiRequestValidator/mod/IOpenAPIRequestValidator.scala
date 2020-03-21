package typingsJapgolly.openapiRequestValidator.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenAPIRequestValidator extends js.Object {
  def validateRequest(request: Request): js.Any
}

object IOpenAPIRequestValidator {
  @scala.inline
  def apply(validateRequest: Request => CallbackTo[js.Any]): IOpenAPIRequestValidator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("validateRequest")(js.Any.fromFunction1((t0: typingsJapgolly.openapiTypes.mod.OpenAPI.Request) => validateRequest(t0).runNow()))
    __obj.asInstanceOf[IOpenAPIRequestValidator]
  }
}

