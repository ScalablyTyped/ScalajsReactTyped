package typingsJapgolly.trezorConnect.anon

import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.PinMatrixRequestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  var device: typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.Device
  
  var `type`: PinMatrixRequestType
}
object Device {
  
  inline def apply(
    device: typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.Device,
    `type`: PinMatrixRequestType
  ): Device = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setDevice(value: typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setType(value: PinMatrixRequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
