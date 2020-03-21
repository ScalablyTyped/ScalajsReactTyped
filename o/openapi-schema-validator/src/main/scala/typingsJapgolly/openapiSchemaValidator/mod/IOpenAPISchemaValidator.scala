package typingsJapgolly.openapiSchemaValidator.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openapiTypes.mod.OpenAPI.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenAPISchemaValidator extends js.Object {
  /**
    * Validate the provided OpenAPI doc against this validator's schema version and
    * return the results.
    */
  def validate(doc: Document): OpenAPISchemaValidatorResult
}

object IOpenAPISchemaValidator {
  @scala.inline
  def apply(validate: Document => CallbackTo[OpenAPISchemaValidatorResult]): IOpenAPISchemaValidator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: typingsJapgolly.openapiTypes.mod.OpenAPI.Document) => validate(t0).runNow()))
    __obj.asInstanceOf[IOpenAPISchemaValidator]
  }
}

