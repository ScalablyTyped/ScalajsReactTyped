package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.anon.devicesArrayBluetoothDevi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectedBluetoothDevicesOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var services: js.Array[String]
  
  @JSName("success")
  def success_MGetConnectedBluetoothDevicesOptions(res: devicesArrayBluetoothDevi): Unit
}
object GetConnectedBluetoothDevicesOptions {
  
  inline def apply(services: js.Array[String], success: devicesArrayBluetoothDevi => Callback): GetConnectedBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: devicesArrayBluetoothDevi) => success(t0).runNow()))
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOptions]
  }
  
  extension [Self <: GetConnectedBluetoothDevicesOptions](x: Self) {
    
    inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setSuccess(value: devicesArrayBluetoothDevi => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: devicesArrayBluetoothDevi) => value(t0).runNow()))
  }
}
