package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.anon.characteristicsArrayuuids
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBLEDeviceCharacteristicsOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String
  
  /**
    * 蓝牙服务 uuid
    */
  var serviceId: String
  
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  @JSName("success")
  def success_MGetBLEDeviceCharacteristicsOptions(res: characteristicsArrayuuids): Unit
}
object GetBLEDeviceCharacteristicsOptions {
  
  inline def apply(deviceId: String, serviceId: String, success: characteristicsArrayuuids => Callback): GetBLEDeviceCharacteristicsOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: characteristicsArrayuuids) => success(t0).runNow()))
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsOptions]
  }
  
  extension [Self <: GetBLEDeviceCharacteristicsOptions](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: characteristicsArrayuuids => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: characteristicsArrayuuids) => value(t0).runNow()))
  }
}
