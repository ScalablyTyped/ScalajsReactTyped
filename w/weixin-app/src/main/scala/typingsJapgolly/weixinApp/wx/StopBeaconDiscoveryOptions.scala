package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBeaconDiscoveryOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("complete")
  var complete_StopBeaconDiscoveryOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  @JSName("fail")
  var fail_StopBeaconDiscoveryOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  @JSName("success")
  var success_StopBeaconDiscoveryOptions: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.undefined
}
object StopBeaconDiscoveryOptions {
  
  inline def apply(): StopBeaconDiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopBeaconDiscoveryOptions]
  }
  
  extension [Self <: StopBeaconDiscoveryOptions](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ ErrMsgResponse => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ ErrMsgResponse) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
