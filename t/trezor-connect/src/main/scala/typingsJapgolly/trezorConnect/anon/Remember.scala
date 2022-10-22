package typingsJapgolly.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remember extends StObject {
  
  var device: typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.Device
  
  var remember: Boolean
}
object Remember {
  
  inline def apply(device: typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.Device, remember: Boolean): Remember = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], remember = remember.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remember]
  }
  
  extension [Self <: Remember](x: Self) {
    
    inline def setDevice(value: typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setRemember(value: Boolean): Self = StObject.set(x, "remember", value.asInstanceOf[js.Any])
  }
}
