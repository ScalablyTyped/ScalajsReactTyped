package typingsJapgolly.openapiSecurityHandler.mod

import typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecurityDefinitionsObject
import typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecurityRequirementObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPISecurityHandlerArgs extends js.Object {
  var loggingKey: String
  var operationSecurity: js.Array[
    SecurityRequirementObject | typingsJapgolly.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
  ]
  var securityDefinitions: SecurityDefinitionsObject
  var securityHandlers: SecurityHandlers
}

object OpenAPISecurityHandlerArgs {
  @scala.inline
  def apply(
    loggingKey: String,
    operationSecurity: js.Array[
      SecurityRequirementObject | typingsJapgolly.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
    ],
    securityDefinitions: SecurityDefinitionsObject,
    securityHandlers: SecurityHandlers
  ): OpenAPISecurityHandlerArgs = {
    val __obj = js.Dynamic.literal(loggingKey = loggingKey.asInstanceOf[js.Any], operationSecurity = operationSecurity.asInstanceOf[js.Any], securityDefinitions = securityDefinitions.asInstanceOf[js.Any], securityHandlers = securityHandlers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenAPISecurityHandlerArgs]
  }
}

