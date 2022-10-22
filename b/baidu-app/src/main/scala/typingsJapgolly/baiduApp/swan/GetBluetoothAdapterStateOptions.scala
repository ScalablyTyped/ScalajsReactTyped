package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBluetoothAdapterStateOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MGetBluetoothAdapterStateOptions(res: BluetoothAdapterStateData): Unit
}
object GetBluetoothAdapterStateOptions {
  
  inline def apply(success: BluetoothAdapterStateData => Callback): GetBluetoothAdapterStateOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: BluetoothAdapterStateData) => success(t0).runNow()))
    __obj.asInstanceOf[GetBluetoothAdapterStateOptions]
  }
  
  extension [Self <: GetBluetoothAdapterStateOptions](x: Self) {
    
    inline def setSuccess(value: BluetoothAdapterStateData => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: BluetoothAdapterStateData) => value(t0).runNow()))
  }
}
