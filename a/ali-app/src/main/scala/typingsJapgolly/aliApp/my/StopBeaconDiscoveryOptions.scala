package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBeaconDiscoveryOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_StopBeaconDiscoveryOptions: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.undefined
}
object StopBeaconDiscoveryOptions {
  
  inline def apply(): StopBeaconDiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopBeaconDiscoveryOptions]
  }
  
  extension [Self <: StopBeaconDiscoveryOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ ErrMsgResponse => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ ErrMsgResponse) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
