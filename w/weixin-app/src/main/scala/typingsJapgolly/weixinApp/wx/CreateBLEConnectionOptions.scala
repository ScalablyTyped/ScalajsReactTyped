package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBLEConnectionOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 蓝牙设备 id，参考 getDevices 接口
    */
  var deviceId: String
  
  @JSName("success")
  def success_MCreateBLEConnectionOptions(res: ErrMsgResponse): Unit
}
object CreateBLEConnectionOptions {
  
  inline def apply(deviceId: String, success: ErrMsgResponse => Callback): CreateBLEConnectionOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: ErrMsgResponse) => success(t0).runNow()))
    __obj.asInstanceOf[CreateBLEConnectionOptions]
  }
  
  extension [Self <: CreateBLEConnectionOptions](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: ErrMsgResponse => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: ErrMsgResponse) => value(t0).runNow()))
  }
}
