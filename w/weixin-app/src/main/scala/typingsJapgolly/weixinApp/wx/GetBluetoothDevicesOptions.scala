package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.anon.devicesArrayBluetoothDevi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBluetoothDevicesOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MGetBluetoothDevicesOptions(res: devicesArrayBluetoothDevi): Unit
}
object GetBluetoothDevicesOptions {
  
  inline def apply(success: devicesArrayBluetoothDevi => Callback): GetBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: devicesArrayBluetoothDevi) => success(t0).runNow()))
    __obj.asInstanceOf[GetBluetoothDevicesOptions]
  }
  
  extension [Self <: GetBluetoothDevicesOptions](x: Self) {
    
    inline def setSuccess(value: devicesArrayBluetoothDevi => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: devicesArrayBluetoothDevi) => value(t0).runNow()))
  }
}
