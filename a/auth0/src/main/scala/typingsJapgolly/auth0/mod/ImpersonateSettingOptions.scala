package typingsJapgolly.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImpersonateSettingOptions extends StObject {
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var impersonator_id: String
  
  var protocol: String
  
  var token: String
}
object ImpersonateSettingOptions {
  
  inline def apply(impersonator_id: String, protocol: String, token: String): ImpersonateSettingOptions = {
    val __obj = js.Dynamic.literal(impersonator_id = impersonator_id.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImpersonateSettingOptions]
  }
  
  extension [Self <: ImpersonateSettingOptions](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setImpersonator_id(value: String): Self = StObject.set(x, "impersonator_id", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
