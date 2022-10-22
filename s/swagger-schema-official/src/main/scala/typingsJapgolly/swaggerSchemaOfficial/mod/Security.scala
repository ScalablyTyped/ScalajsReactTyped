package typingsJapgolly.swaggerSchemaOfficial.mod

import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.header
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swaggerSchemaOfficial.mod.BasicAuthenticationSecurity
  - typingsJapgolly.swaggerSchemaOfficial.mod.OAuth2AccessCodeSecurity
  - typingsJapgolly.swaggerSchemaOfficial.mod.OAuth2ApplicationSecurity
  - typingsJapgolly.swaggerSchemaOfficial.mod.OAuth2ImplicitSecurity
  - typingsJapgolly.swaggerSchemaOfficial.mod.OAuth2PasswordSecurity
  - typingsJapgolly.swaggerSchemaOfficial.mod.ApiKeySecurity
*/
trait Security extends StObject
object Security {
  
  inline def ApiKeySecurity(in: query | header, name: String): typingsJapgolly.swaggerSchemaOfficial.mod.ApiKeySecurity = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("apiKey")
    __obj.asInstanceOf[typingsJapgolly.swaggerSchemaOfficial.mod.ApiKeySecurity]
  }
  
  inline def BasicAuthenticationSecurity(): typingsJapgolly.swaggerSchemaOfficial.mod.BasicAuthenticationSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("basic")
    __obj.asInstanceOf[typingsJapgolly.swaggerSchemaOfficial.mod.BasicAuthenticationSecurity]
  }
  
  inline def OAuth2AccessCodeSecurity(authorizationUrl: String, tokenUrl: String): typingsJapgolly.swaggerSchemaOfficial.mod.OAuth2AccessCodeSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "accessCode", tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typingsJapgolly.swaggerSchemaOfficial.mod.OAuth2AccessCodeSecurity]
  }
  
  inline def OAuth2ApplicationSecurity(tokenUrl: String): typingsJapgolly.swaggerSchemaOfficial.mod.OAuth2ApplicationSecurity = {
    val __obj = js.Dynamic.literal(flow = "application", tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typingsJapgolly.swaggerSchemaOfficial.mod.OAuth2ApplicationSecurity]
  }
  
  inline def OAuth2ImplicitSecurity(authorizationUrl: String): typingsJapgolly.swaggerSchemaOfficial.mod.OAuth2ImplicitSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "implicit")
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typingsJapgolly.swaggerSchemaOfficial.mod.OAuth2ImplicitSecurity]
  }
  
  inline def OAuth2PasswordSecurity(tokenUrl: String): typingsJapgolly.swaggerSchemaOfficial.mod.OAuth2PasswordSecurity = {
    val __obj = js.Dynamic.literal(flow = "password", tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typingsJapgolly.swaggerSchemaOfficial.mod.OAuth2PasswordSecurity]
  }
}
