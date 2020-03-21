package typingsJapgolly.openapiDefaultSetter.mod

import typingsJapgolly.openapiTypes.mod.OpenAPIV2.ParameterObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIDefaultSetterArgs extends js.Object {
  var loggingKey: js.UndefOr[String] = js.undefined
  var parameters: js.Array[ParameterObject | typingsJapgolly.openapiTypes.mod.OpenAPIV3.ParameterObject]
}

object OpenAPIDefaultSetterArgs {
  @scala.inline
  def apply(
    parameters: js.Array[ParameterObject | typingsJapgolly.openapiTypes.mod.OpenAPIV3.ParameterObject],
    loggingKey: String = null
  ): OpenAPIDefaultSetterArgs = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    if (loggingKey != null) __obj.updateDynamic("loggingKey")(loggingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIDefaultSetterArgs]
  }
}

