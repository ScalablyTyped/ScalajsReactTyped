package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBLEPeripheralConnectionStateChangedCallbackResult extends StObject {
  
  /** 连接目前状态 */
  var connected: Boolean
  
  /** 连接状态变化的设备 id */
  var deviceId: String
  
  /** server 的 uuid */
  var serverId: String
}
object OnBLEPeripheralConnectionStateChangedCallbackResult {
  
  inline def apply(connected: Boolean, deviceId: String, serverId: String): OnBLEPeripheralConnectionStateChangedCallbackResult = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBLEPeripheralConnectionStateChangedCallbackResult]
  }
  
  extension [Self <: OnBLEPeripheralConnectionStateChangedCallbackResult](x: Self) {
    
    inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
  }
}
