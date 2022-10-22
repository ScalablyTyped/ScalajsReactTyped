package typingsJapgolly.openapiTypes.mod.OpenAPIV3

import typingsJapgolly.openapiTypes.anon.AuthorizationCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openapiTypes.mod.OpenAPIV3.HttpSecurityScheme
  - typingsJapgolly.openapiTypes.mod.OpenAPIV3.ApiKeySecurityScheme
  - typingsJapgolly.openapiTypes.mod.OpenAPIV3.OAuth2SecurityScheme
  - typingsJapgolly.openapiTypes.mod.OpenAPIV3.OpenIdSecurityScheme
*/
trait SecuritySchemeObject extends StObject
object SecuritySchemeObject {
  
  inline def ApiKeySecurityScheme(in: String, name: String): typingsJapgolly.openapiTypes.mod.OpenAPIV3.ApiKeySecurityScheme = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("apiKey")
    __obj.asInstanceOf[typingsJapgolly.openapiTypes.mod.OpenAPIV3.ApiKeySecurityScheme]
  }
  
  inline def HttpSecurityScheme(scheme: String): typingsJapgolly.openapiTypes.mod.OpenAPIV3.HttpSecurityScheme = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("http")
    __obj.asInstanceOf[typingsJapgolly.openapiTypes.mod.OpenAPIV3.HttpSecurityScheme]
  }
  
  inline def OAuth2SecurityScheme(flows: AuthorizationCode): typingsJapgolly.openapiTypes.mod.OpenAPIV3.OAuth2SecurityScheme = {
    val __obj = js.Dynamic.literal(flows = flows.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typingsJapgolly.openapiTypes.mod.OpenAPIV3.OAuth2SecurityScheme]
  }
  
  inline def OpenIdSecurityScheme(openIdConnectUrl: String): typingsJapgolly.openapiTypes.mod.OpenAPIV3.OpenIdSecurityScheme = {
    val __obj = js.Dynamic.literal(openIdConnectUrl = openIdConnectUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("openIdConnect")
    __obj.asInstanceOf[typingsJapgolly.openapiTypes.mod.OpenAPIV3.OpenIdSecurityScheme]
  }
}
