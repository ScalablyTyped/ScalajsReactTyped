package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMobileBroadbandAccountStatics extends StObject {
  
  var availableNetworkAccountIds: IVectorView[String]
  
  def createFromNetworkAccountId(networkAccountId: String): MobileBroadbandAccount
}
object IMobileBroadbandAccountStatics {
  
  inline def apply(
    availableNetworkAccountIds: IVectorView[String],
    createFromNetworkAccountId: String => MobileBroadbandAccount
  ): IMobileBroadbandAccountStatics = {
    val __obj = js.Dynamic.literal(availableNetworkAccountIds = availableNetworkAccountIds.asInstanceOf[js.Any], createFromNetworkAccountId = js.Any.fromFunction1(createFromNetworkAccountId))
    __obj.asInstanceOf[IMobileBroadbandAccountStatics]
  }
  
  extension [Self <: IMobileBroadbandAccountStatics](x: Self) {
    
    inline def setAvailableNetworkAccountIds(value: IVectorView[String]): Self = StObject.set(x, "availableNetworkAccountIds", value.asInstanceOf[js.Any])
    
    inline def setCreateFromNetworkAccountId(value: String => MobileBroadbandAccount): Self = StObject.set(x, "createFromNetworkAccountId", js.Any.fromFunction1(value))
  }
}
