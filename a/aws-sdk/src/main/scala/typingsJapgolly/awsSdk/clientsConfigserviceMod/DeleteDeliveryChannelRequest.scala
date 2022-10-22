package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeliveryChannelRequest extends StObject {
  
  /**
    * The name of the delivery channel to delete.
    */
  var DeliveryChannelName: ChannelName
}
object DeleteDeliveryChannelRequest {
  
  inline def apply(DeliveryChannelName: ChannelName): DeleteDeliveryChannelRequest = {
    val __obj = js.Dynamic.literal(DeliveryChannelName = DeliveryChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeliveryChannelRequest]
  }
  
  extension [Self <: DeleteDeliveryChannelRequest](x: Self) {
    
    inline def setDeliveryChannelName(value: ChannelName): Self = StObject.set(x, "DeliveryChannelName", value.asInstanceOf[js.Any])
  }
}
