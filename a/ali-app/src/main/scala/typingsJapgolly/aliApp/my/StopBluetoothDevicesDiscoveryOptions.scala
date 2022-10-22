package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBluetoothDevicesDiscoveryOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MStopBluetoothDevicesDiscoveryOptions(res: ErrMsgResponse): Unit
}
object StopBluetoothDevicesDiscoveryOptions {
  
  inline def apply(success: ErrMsgResponse => Callback): StopBluetoothDevicesDiscoveryOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: ErrMsgResponse) => success(t0).runNow()))
    __obj.asInstanceOf[StopBluetoothDevicesDiscoveryOptions]
  }
  
  extension [Self <: StopBluetoothDevicesDiscoveryOptions](x: Self) {
    
    inline def setSuccess(value: ErrMsgResponse => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: ErrMsgResponse) => value(t0).runNow()))
  }
}
