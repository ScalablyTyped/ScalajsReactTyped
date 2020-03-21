package typingsJapgolly.openapiResponseValidator.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ajv.mod.ErrorObject
import typingsJapgolly.ajv.mod.FormatDefinition
import typingsJapgolly.ajv.mod.FormatValidator
import typingsJapgolly.openapiResponseValidator.AnonSchema
import typingsJapgolly.openapiTypes.mod.IJsonSchema
import typingsJapgolly.openapiTypes.mod.OpenAPIV3.ComponentsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIResponseValidatorArgs extends js.Object {
  var components: js.UndefOr[ComponentsObject] = js.undefined
  var customFormats: StringDictionary[FormatValidator | FormatDefinition]
  var definitions: StringDictionary[IJsonSchema]
  var errorTransformer: js.UndefOr[
    js.Function2[
      /* openAPIResponseValidatorValidationError */ OpenAPIResponseValidatorError, 
      /* ajvError */ ErrorObject, 
      _
    ]
  ] = js.undefined
  var externalSchemas: StringDictionary[IJsonSchema]
  var loggingKey: String
  var responses: StringDictionary[AnonSchema]
}

object OpenAPIResponseValidatorArgs {
  @scala.inline
  def apply(
    customFormats: StringDictionary[FormatValidator | FormatDefinition],
    definitions: StringDictionary[IJsonSchema],
    externalSchemas: StringDictionary[IJsonSchema],
    loggingKey: String,
    responses: StringDictionary[AnonSchema],
    components: ComponentsObject = null,
    errorTransformer: (/* openAPIResponseValidatorValidationError */ OpenAPIResponseValidatorError, /* ajvError */ ErrorObject) => CallbackTo[js.Any] = null
  ): OpenAPIResponseValidatorArgs = {
    val __obj = js.Dynamic.literal(customFormats = customFormats.asInstanceOf[js.Any], definitions = definitions.asInstanceOf[js.Any], externalSchemas = externalSchemas.asInstanceOf[js.Any], loggingKey = loggingKey.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (errorTransformer != null) __obj.updateDynamic("errorTransformer")(js.Any.fromFunction2((t0: /* openAPIResponseValidatorValidationError */ typingsJapgolly.openapiResponseValidator.mod.OpenAPIResponseValidatorError, t1: /* ajvError */ typingsJapgolly.ajv.mod.ErrorObject) => errorTransformer(t0, t1).runNow()))
    __obj.asInstanceOf[OpenAPIResponseValidatorArgs]
  }
}

