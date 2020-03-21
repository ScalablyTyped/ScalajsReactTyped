package typingsJapgolly.openapiTypes.mod.OpenAPIV3

import typingsJapgolly.openapiTypes.AnonAuthorizationCode
import typingsJapgolly.openapiTypes.openapiTypesStrings.apiKey
import typingsJapgolly.openapiTypes.openapiTypesStrings.http
import typingsJapgolly.openapiTypes.openapiTypesStrings.oauth2
import typingsJapgolly.openapiTypes.openapiTypesStrings.openIdConnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openapiTypes.mod.OpenAPIV3.HttpSecurityScheme
  - typingsJapgolly.openapiTypes.mod.OpenAPIV3.ApiKeySecurityScheme
  - typingsJapgolly.openapiTypes.mod.OpenAPIV3.OAuth2SecurityScheme
  - typingsJapgolly.openapiTypes.mod.OpenAPIV3.OpenIdSecurityScheme
*/
trait SecuritySchemeObject extends js.Object

object SecuritySchemeObject {
  @scala.inline
  def HttpSecurityScheme(scheme: String, `type`: http, bearerFormat: String = null, description: String = null): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bearerFormat != null) __obj.updateDynamic("bearerFormat")(bearerFormat.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
  @scala.inline
  def ApiKeySecurityScheme(in: String, name: String, `type`: apiKey, description: String = null): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
  @scala.inline
  def OAuth2SecurityScheme(flows: AnonAuthorizationCode, `type`: oauth2): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(flows = flows.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
  @scala.inline
  def OpenIdSecurityScheme(openIdConnectUrl: String, `type`: openIdConnect, description: String = null): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(openIdConnectUrl = openIdConnectUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
}

