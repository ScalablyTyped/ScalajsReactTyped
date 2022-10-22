package typingsJapgolly.ssUtils.ssutils

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleServerEventsOptions extends StObject {
  
  var handlers: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  
  var heartbeatIntervalMs: js.UndefOr[Double] = js.undefined
  
  var heartbeatUrl: js.UndefOr[String] = js.undefined
  
  var receivers: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var success: js.UndefOr[js.Function3[/* selector */ String, /* msg */ String, /* e */ Any, Unit]] = js.undefined
  
  var unRegisterUrl: js.UndefOr[String] = js.undefined
  
  var validate: js.UndefOr[
    js.Function4[
      /* op */ js.UndefOr[String], 
      /* target */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* json */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.undefined
}
object HandleServerEventsOptions {
  
  inline def apply(): HandleServerEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleServerEventsOptions]
  }
  
  extension [Self <: HandleServerEventsOptions](x: Self) {
    
    inline def setHandlers(value: StringDictionary[js.Function]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    inline def setHeartbeatIntervalMs(value: Double): Self = StObject.set(x, "heartbeatIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatIntervalMsUndefined: Self = StObject.set(x, "heartbeatIntervalMs", js.undefined)
    
    inline def setHeartbeatUrl(value: String): Self = StObject.set(x, "heartbeatUrl", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatUrlUndefined: Self = StObject.set(x, "heartbeatUrl", js.undefined)
    
    inline def setReceivers(value: StringDictionary[Any]): Self = StObject.set(x, "receivers", value.asInstanceOf[js.Any])
    
    inline def setReceiversUndefined: Self = StObject.set(x, "receivers", js.undefined)
    
    inline def setSuccess(value: (/* selector */ String, /* msg */ String, /* e */ Any) => Callback): Self = StObject.set(x, "success", js.Any.fromFunction3((t0: /* selector */ String, t1: /* msg */ String, t2: /* e */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUnRegisterUrl(value: String): Self = StObject.set(x, "unRegisterUrl", value.asInstanceOf[js.Any])
    
    inline def setUnRegisterUrlUndefined: Self = StObject.set(x, "unRegisterUrl", js.undefined)
    
    inline def setValidate(
      value: (/* op */ js.UndefOr[String], /* target */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* json */ js.UndefOr[String]) => Boolean
    ): Self = StObject.set(x, "validate", js.Any.fromFunction4(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
