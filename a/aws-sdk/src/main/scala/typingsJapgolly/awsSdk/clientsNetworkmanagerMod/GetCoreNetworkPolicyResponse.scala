package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCoreNetworkPolicyResponse extends StObject {
  
  /**
    * The details about a core network policy.
    */
  var CoreNetworkPolicy: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.CoreNetworkPolicy] = js.undefined
}
object GetCoreNetworkPolicyResponse {
  
  inline def apply(): GetCoreNetworkPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCoreNetworkPolicyResponse]
  }
  
  extension [Self <: GetCoreNetworkPolicyResponse](x: Self) {
    
    inline def setCoreNetworkPolicy(value: CoreNetworkPolicy): Self = StObject.set(x, "CoreNetworkPolicy", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkPolicyUndefined: Self = StObject.set(x, "CoreNetworkPolicy", js.undefined)
  }
}
