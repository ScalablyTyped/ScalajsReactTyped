package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleFirewallRuleResponse extends StObject {
  
  var ipAddress: String
  
  var result: Boolean
}
object HandleFirewallRuleResponse {
  
  inline def apply(ipAddress: String, result: Boolean): HandleFirewallRuleResponse = {
    val __obj = js.Dynamic.literal(ipAddress = ipAddress.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleFirewallRuleResponse]
  }
  
  extension [Self <: HandleFirewallRuleResponse](x: Self) {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
