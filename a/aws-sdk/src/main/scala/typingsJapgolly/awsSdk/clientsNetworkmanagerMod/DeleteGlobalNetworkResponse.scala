package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGlobalNetworkResponse extends StObject {
  
  /**
    * Information about the global network.
    */
  var GlobalNetwork: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.GlobalNetwork] = js.undefined
}
object DeleteGlobalNetworkResponse {
  
  inline def apply(): DeleteGlobalNetworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGlobalNetworkResponse]
  }
  
  extension [Self <: DeleteGlobalNetworkResponse](x: Self) {
    
    inline def setGlobalNetwork(value: GlobalNetwork): Self = StObject.set(x, "GlobalNetwork", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkUndefined: Self = StObject.set(x, "GlobalNetwork", js.undefined)
  }
}
