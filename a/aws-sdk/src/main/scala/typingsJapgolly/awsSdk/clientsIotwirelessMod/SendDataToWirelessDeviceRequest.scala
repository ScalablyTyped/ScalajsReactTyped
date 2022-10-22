package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendDataToWirelessDeviceRequest extends StObject {
  
  /**
    * The ID of the wireless device to receive the data.
    */
  var Id: WirelessDeviceId
  
  var PayloadData: typingsJapgolly.awsSdk.clientsIotwirelessMod.PayloadData
  
  /**
    * The transmit mode to use to send data to the wireless device. Can be: 0 for UM (unacknowledge mode) or 1 for AM (acknowledge mode).
    */
  var TransmitMode: typingsJapgolly.awsSdk.clientsIotwirelessMod.TransmitMode
  
  /**
    * Metadata about the message request.
    */
  var WirelessMetadata: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.WirelessMetadata] = js.undefined
}
object SendDataToWirelessDeviceRequest {
  
  inline def apply(Id: WirelessDeviceId, PayloadData: PayloadData, TransmitMode: TransmitMode): SendDataToWirelessDeviceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PayloadData = PayloadData.asInstanceOf[js.Any], TransmitMode = TransmitMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDataToWirelessDeviceRequest]
  }
  
  extension [Self <: SendDataToWirelessDeviceRequest](x: Self) {
    
    inline def setId(value: WirelessDeviceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setPayloadData(value: PayloadData): Self = StObject.set(x, "PayloadData", value.asInstanceOf[js.Any])
    
    inline def setTransmitMode(value: TransmitMode): Self = StObject.set(x, "TransmitMode", value.asInstanceOf[js.Any])
    
    inline def setWirelessMetadata(value: WirelessMetadata): Self = StObject.set(x, "WirelessMetadata", value.asInstanceOf[js.Any])
    
    inline def setWirelessMetadataUndefined: Self = StObject.set(x, "WirelessMetadata", js.undefined)
  }
}
