package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.anon.Devices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBluetoothDeviceFoundOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_OnBluetoothDeviceFoundOptions: js.UndefOr[js.Function1[/* res */ Devices, Unit]] = js.undefined
}
object OnBluetoothDeviceFoundOptions {
  
  inline def apply(): OnBluetoothDeviceFoundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBluetoothDeviceFoundOptions]
  }
  
  extension [Self <: OnBluetoothDeviceFoundOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ Devices => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ Devices) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
