package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendDataToWirelessDeviceResponse extends StObject {
  
  /**
    * The ID of the message sent to the wireless device.
    */
  var MessageId: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.MessageId] = js.undefined
}
object SendDataToWirelessDeviceResponse {
  
  inline def apply(): SendDataToWirelessDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendDataToWirelessDeviceResponse]
  }
  
  extension [Self <: SendDataToWirelessDeviceResponse](x: Self) {
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
