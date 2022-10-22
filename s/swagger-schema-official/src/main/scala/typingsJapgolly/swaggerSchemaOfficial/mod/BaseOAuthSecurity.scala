package typingsJapgolly.swaggerSchemaOfficial.mod

import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`implicit`
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.accessCode
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.application
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseOAuthSecurity
  extends StObject
     with BaseSecurity {
  
  var flow: accessCode | application | `implicit` | password
  
  var scopes: js.UndefOr[OAuthScope] = js.undefined
  
  @JSName("type")
  var type_BaseOAuthSecurity: oauth2
}
object BaseOAuthSecurity {
  
  inline def apply(flow: accessCode | application | `implicit` | password): BaseOAuthSecurity = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[BaseOAuthSecurity]
  }
  
  extension [Self <: BaseOAuthSecurity](x: Self) {
    
    inline def setFlow(value: accessCode | application | `implicit` | password): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: OAuthScope): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setType(value: oauth2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
