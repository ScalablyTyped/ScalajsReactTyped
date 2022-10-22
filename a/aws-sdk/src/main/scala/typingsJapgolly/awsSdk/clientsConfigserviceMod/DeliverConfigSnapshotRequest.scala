package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliverConfigSnapshotRequest extends StObject {
  
  /**
    * The name of the delivery channel through which the snapshot is delivered.
    */
  var deliveryChannelName: ChannelName
}
object DeliverConfigSnapshotRequest {
  
  inline def apply(deliveryChannelName: ChannelName): DeliverConfigSnapshotRequest = {
    val __obj = js.Dynamic.literal(deliveryChannelName = deliveryChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliverConfigSnapshotRequest]
  }
  
  extension [Self <: DeliverConfigSnapshotRequest](x: Self) {
    
    inline def setDeliveryChannelName(value: ChannelName): Self = StObject.set(x, "deliveryChannelName", value.asInstanceOf[js.Any])
  }
}
