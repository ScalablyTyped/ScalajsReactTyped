package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseBluetoothAdapterOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MCloseBluetoothAdapterOptions(res: Any): Unit
}
object CloseBluetoothAdapterOptions {
  
  inline def apply(success: Any => Callback): CloseBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: Any) => success(t0).runNow()))
    __obj.asInstanceOf[CloseBluetoothAdapterOptions]
  }
  
  extension [Self <: CloseBluetoothAdapterOptions](x: Self) {
    
    inline def setSuccess(value: Any => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
