package typingsJapgolly.openapiSchemaValidator.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openapiTypes.mod.OpenAPI.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPISchemaValidator extends IOpenAPISchemaValidator {
  var validator: js.Any
}

object OpenAPISchemaValidator {
  @scala.inline
  def apply(validate: Document => CallbackTo[OpenAPISchemaValidatorResult], validator: js.Any): OpenAPISchemaValidator = {
    val __obj = js.Dynamic.literal(validator = validator.asInstanceOf[js.Any])
    __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: typingsJapgolly.openapiTypes.mod.OpenAPI.Document) => validate(t0).runNow()))
    __obj.asInstanceOf[OpenAPISchemaValidator]
  }
}

