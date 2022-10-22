package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectedBluetoothDevicesOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 蓝牙设备主 service 的 uuid 列表
    */
  var services: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  var success: js.UndefOr[js.Function1[/* result */ GetConnectedBluetoothDevicesSuccess, Unit]] = js.undefined
}
object GetConnectedBluetoothDevicesOptions {
  
  inline def apply(): GetConnectedBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOptions]
  }
  
  extension [Self <: GetConnectedBluetoothDevicesOptions](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setServices(value: js.Array[Any]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: Any*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setSuccess(value: /* result */ GetConnectedBluetoothDevicesSuccess => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ GetConnectedBluetoothDevicesSuccess) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
