package typingsJapgolly.trezorConnect.anon

import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.WordRequestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var device: typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.Device
  
  var `type`: WordRequestType
}
object Type {
  
  inline def apply(device: typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.Device, `type`: WordRequestType): Type = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setDevice(value: typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setType(value: WordRequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
