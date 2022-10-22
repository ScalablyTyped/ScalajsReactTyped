package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomaticTapeCreationPolicyInfo extends StObject {
  
  /**
    * An automatic tape creation policy consists of a list of automatic tape creation rules. This returns the rules that determine when and how to automatically create new tapes.
    */
  var AutomaticTapeCreationRules: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.AutomaticTapeCreationRules] = js.undefined
  
  var GatewayARN: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
}
object AutomaticTapeCreationPolicyInfo {
  
  inline def apply(): AutomaticTapeCreationPolicyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticTapeCreationPolicyInfo]
  }
  
  extension [Self <: AutomaticTapeCreationPolicyInfo](x: Self) {
    
    inline def setAutomaticTapeCreationRules(value: AutomaticTapeCreationRules): Self = StObject.set(x, "AutomaticTapeCreationRules", value.asInstanceOf[js.Any])
    
    inline def setAutomaticTapeCreationRulesUndefined: Self = StObject.set(x, "AutomaticTapeCreationRules", js.undefined)
    
    inline def setAutomaticTapeCreationRulesVarargs(value: AutomaticTapeCreationRule*): Self = StObject.set(x, "AutomaticTapeCreationRules", js.Array(value*))
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
