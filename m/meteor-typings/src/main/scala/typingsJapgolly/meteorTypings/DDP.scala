package typingsJapgolly.meteorTypings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.meteorTypings.Meteor.SubscriptionHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DDP {
  
  trait DDPStatic extends StObject {
    
    @JSName("apply")
    def apply(method: String, parameters: Any*): Unit
    
    def call(method: String, parameters: Any*): Unit
    
    def disconnect(): Unit
    
    def methods(IMeteorMethodsDictionary: Any): Any
    
    def onReconnect(): Unit
    
    def reconnect(): Unit
    
    def status(): DDPStatus
    
    def subscribe(name: String, rest: Any*): SubscriptionHandle
  }
  object DDPStatic {
    
    inline def apply(
      apply: (String, /* repeated */ Any) => Callback,
      call: (String, /* repeated */ Any) => Callback,
      disconnect: Callback,
      methods: Any => Any,
      onReconnect: Callback,
      reconnect: Callback,
      status: CallbackTo[DDPStatus],
      subscribe: (String, /* repeated */ Any) => SubscriptionHandle
    ): DDPStatic = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (apply(t0, t1)).runNow()), call = js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (call(t0, t1)).runNow()), disconnect = disconnect.toJsFn, methods = js.Any.fromFunction1(methods), onReconnect = onReconnect.toJsFn, reconnect = reconnect.toJsFn, status = status.toJsFn, subscribe = js.Any.fromFunction2(subscribe))
      __obj.asInstanceOf[DDPStatic]
    }
    
    extension [Self <: DDPStatic](x: Self) {
      
      inline def setApply(value: (String, /* repeated */ Any) => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setCall(value: (String, /* repeated */ Any) => Callback): Self = StObject.set(x, "call", js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setMethods(value: Any => Any): Self = StObject.set(x, "methods", js.Any.fromFunction1(value))
      
      inline def setOnReconnect(value: Callback): Self = StObject.set(x, "onReconnect", value.toJsFn)
      
      inline def setReconnect(value: Callback): Self = StObject.set(x, "reconnect", value.toJsFn)
      
      inline def setStatus(value: CallbackTo[DDPStatus]): Self = StObject.set(x, "status", value.toJsFn)
      
      inline def setSubscribe(value: (String, /* repeated */ Any) => SubscriptionHandle): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
    }
  }
  
  trait DDPStatus extends StObject {
    
    var connected: Boolean
    
    var reason: js.UndefOr[String] = js.undefined
    
    var retryCount: Double
    
    var retryTime: js.UndefOr[Double] = js.undefined
    
    var status: Status
  }
  object DDPStatus {
    
    inline def apply(connected: Boolean, retryCount: Double, status: Status): DDPStatus = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], retryCount = retryCount.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[DDPStatus]
    }
    
    extension [Self <: DDPStatus](x: Self) {
      
      inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      inline def setRetryTime(value: Double): Self = StObject.set(x, "retryTime", value.asInstanceOf[js.Any])
      
      inline def setRetryTimeUndefined: Self = StObject.set(x, "retryTime", js.undefined)
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.meteorTypings.meteorTypingsStrings.connected
    - typingsJapgolly.meteorTypings.meteorTypingsStrings.connecting
    - typingsJapgolly.meteorTypings.meteorTypingsStrings.failed
    - typingsJapgolly.meteorTypings.meteorTypingsStrings.waiting
    - typingsJapgolly.meteorTypings.meteorTypingsStrings.offline
  */
  trait Status extends StObject
  object Status {
    
    inline def connected: typingsJapgolly.meteorTypings.meteorTypingsStrings.connected = "connected".asInstanceOf[typingsJapgolly.meteorTypings.meteorTypingsStrings.connected]
    
    inline def connecting: typingsJapgolly.meteorTypings.meteorTypingsStrings.connecting = "connecting".asInstanceOf[typingsJapgolly.meteorTypings.meteorTypingsStrings.connecting]
    
    inline def failed: typingsJapgolly.meteorTypings.meteorTypingsStrings.failed = "failed".asInstanceOf[typingsJapgolly.meteorTypings.meteorTypingsStrings.failed]
    
    inline def offline: typingsJapgolly.meteorTypings.meteorTypingsStrings.offline = "offline".asInstanceOf[typingsJapgolly.meteorTypings.meteorTypingsStrings.offline]
    
    inline def waiting: typingsJapgolly.meteorTypings.meteorTypingsStrings.waiting = "waiting".asInstanceOf[typingsJapgolly.meteorTypings.meteorTypingsStrings.waiting]
  }
}
