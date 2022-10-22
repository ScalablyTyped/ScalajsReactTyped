package typingsJapgolly.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Implicit
  - typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2AccessCode
  - typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Password
  - typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Application
*/
trait SecuritySchemeOauth2
  extends StObject
     with SecuritySchemeObject
object SecuritySchemeOauth2 {
  
  inline def SecuritySchemeOauth2AccessCode(authorizationUrl: String, scopes: ScopesObject, tokenUrl: String): typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2AccessCode = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "accessCode", scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2AccessCode]
  }
  
  inline def SecuritySchemeOauth2Application(scopes: ScopesObject, tokenUrl: String): typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Application = {
    val __obj = js.Dynamic.literal(flow = "application", scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Application]
  }
  
  inline def SecuritySchemeOauth2Implicit(authorizationUrl: String, scopes: ScopesObject): typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Implicit = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "implicit", scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Implicit]
  }
  
  inline def SecuritySchemeOauth2Password(scopes: ScopesObject, tokenUrl: String): typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Password = {
    val __obj = js.Dynamic.literal(flow = "password", scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Password]
  }
}
