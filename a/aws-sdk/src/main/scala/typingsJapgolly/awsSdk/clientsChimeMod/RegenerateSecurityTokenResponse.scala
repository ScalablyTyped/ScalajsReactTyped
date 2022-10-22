package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegenerateSecurityTokenResponse extends StObject {
  
  var Bot: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.Bot] = js.undefined
}
object RegenerateSecurityTokenResponse {
  
  inline def apply(): RegenerateSecurityTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegenerateSecurityTokenResponse]
  }
  
  extension [Self <: RegenerateSecurityTokenResponse](x: Self) {
    
    inline def setBot(value: Bot): Self = StObject.set(x, "Bot", value.asInstanceOf[js.Any])
    
    inline def setBotUndefined: Self = StObject.set(x, "Bot", js.undefined)
  }
}
