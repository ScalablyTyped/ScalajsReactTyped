package typingsJapgolly.weixinApp.anon

import typingsJapgolly.weixinApp.weixinAppStrings.ok
import typingsJapgolly.weixinApp.wx.BluetoothDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  devices :std.Array<weixin-app.wx.BluetoothDevice>} & weixin-app.wx.ErrMsgResponse */
trait devicesArrayBluetoothDevi extends StObject {
  
  var devices: js.Array[BluetoothDevice]
  
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
}
object devicesArrayBluetoothDevi {
  
  inline def apply(devices: js.Array[BluetoothDevice], errMsg: ok | String): devicesArrayBluetoothDevi = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[devicesArrayBluetoothDevi]
  }
  
  extension [Self <: devicesArrayBluetoothDevi](x: Self) {
    
    inline def setDevices(value: js.Array[BluetoothDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: BluetoothDevice*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setErrMsg(value: ok | String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
