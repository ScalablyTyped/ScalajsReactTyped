package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCoreNetworkResponse extends StObject {
  
  /**
    * Information about the deleted core network.
    */
  var CoreNetwork: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.CoreNetwork] = js.undefined
}
object DeleteCoreNetworkResponse {
  
  inline def apply(): DeleteCoreNetworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCoreNetworkResponse]
  }
  
  extension [Self <: DeleteCoreNetworkResponse](x: Self) {
    
    inline def setCoreNetwork(value: CoreNetwork): Self = StObject.set(x, "CoreNetwork", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkUndefined: Self = StObject.set(x, "CoreNetwork", js.undefined)
  }
}
