package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.anon.servicesArrayuuidstringis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBLEDeviceServicesOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 蓝牙设备 id，参考 getDevices 接口
    */
  var deviceId: String
  
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  @JSName("success")
  def success_MGetBLEDeviceServicesOptions(res: servicesArrayuuidstringis): Unit
}
object GetBLEDeviceServicesOptions {
  
  inline def apply(deviceId: String, success: servicesArrayuuidstringis => Callback): GetBLEDeviceServicesOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: servicesArrayuuidstringis) => success(t0).runNow()))
    __obj.asInstanceOf[GetBLEDeviceServicesOptions]
  }
  
  extension [Self <: GetBLEDeviceServicesOptions](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: servicesArrayuuidstringis => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: servicesArrayuuidstringis) => value(t0).runNow()))
  }
}
