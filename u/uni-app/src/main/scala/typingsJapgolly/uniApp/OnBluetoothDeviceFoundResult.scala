package typingsJapgolly.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBluetoothDeviceFoundResult extends StObject {
  
  /**
    * 设备列表信息
    */
  var devices: js.UndefOr[js.Array[BluetoothDeviceInfo]] = js.undefined
}
object OnBluetoothDeviceFoundResult {
  
  inline def apply(): OnBluetoothDeviceFoundResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBluetoothDeviceFoundResult]
  }
  
  extension [Self <: OnBluetoothDeviceFoundResult](x: Self) {
    
    inline def setDevices(value: js.Array[BluetoothDeviceInfo]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: BluetoothDeviceInfo*): Self = StObject.set(x, "devices", js.Array(value*))
  }
}
