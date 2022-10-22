package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 设备-----蓝牙
trait OpenBluetoothAdapterOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MOpenBluetoothAdapterOptions(res: Any): Unit
}
object OpenBluetoothAdapterOptions {
  
  inline def apply(success: Any => Callback): OpenBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: Any) => success(t0).runNow()))
    __obj.asInstanceOf[OpenBluetoothAdapterOptions]
  }
  
  extension [Self <: OpenBluetoothAdapterOptions](x: Self) {
    
    inline def setSuccess(value: Any => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
