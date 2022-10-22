package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateWirelessDeviceFromFuotaTaskRequest extends StObject {
  
  var Id: FuotaTaskId
  
  var WirelessDeviceId: typingsJapgolly.awsSdk.clientsIotwirelessMod.WirelessDeviceId
}
object DisassociateWirelessDeviceFromFuotaTaskRequest {
  
  inline def apply(Id: FuotaTaskId, WirelessDeviceId: WirelessDeviceId): DisassociateWirelessDeviceFromFuotaTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], WirelessDeviceId = WirelessDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateWirelessDeviceFromFuotaTaskRequest]
  }
  
  extension [Self <: DisassociateWirelessDeviceFromFuotaTaskRequest](x: Self) {
    
    inline def setId(value: FuotaTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceId(value: WirelessDeviceId): Self = StObject.set(x, "WirelessDeviceId", value.asInstanceOf[js.Any])
  }
}
