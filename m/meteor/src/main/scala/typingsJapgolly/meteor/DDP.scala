package typingsJapgolly.meteor

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.meteor.Meteor.SubscriptionHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DDP {
  
  trait DDPStatic extends StObject {
    
    @JSName("apply")
    def apply(method: String, parameters: Any*): Any
    
    def call(method: String, parameters: Any*): Any
    
    def disconnect(): Unit
    
    def methods(IMeteorMethodsDictionary: Any): Any
    
    def onReconnect(): Unit
    
    def reconnect(): Unit
    
    def status(): DDPStatus
    
    def subscribe(name: String, rest: Any*): SubscriptionHandle
  }
  object DDPStatic {
    
    inline def apply(
      apply: (String, /* repeated */ Any) => Any,
      call: (String, /* repeated */ Any) => Any,
      disconnect: japgolly.scalajs.react.Callback,
      methods: Any => Any,
      onReconnect: japgolly.scalajs.react.Callback,
      reconnect: japgolly.scalajs.react.Callback,
      status: CallbackTo[DDPStatus],
      subscribe: (String, /* repeated */ Any) => SubscriptionHandle
    ): DDPStatic = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), call = js.Any.fromFunction2(call), disconnect = disconnect.toJsFn, methods = js.Any.fromFunction1(methods), onReconnect = onReconnect.toJsFn, reconnect = reconnect.toJsFn, status = status.toJsFn, subscribe = js.Any.fromFunction2(subscribe))
      __obj.asInstanceOf[DDPStatic]
    }
    
    extension [Self <: DDPStatic](x: Self) {
      
      inline def setApply(value: (String, /* repeated */ Any) => Any): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
      
      inline def setCall(value: (String, /* repeated */ Any) => Any): Self = StObject.set(x, "call", js.Any.fromFunction2(value))
      
      inline def setDisconnect(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setMethods(value: Any => Any): Self = StObject.set(x, "methods", js.Any.fromFunction1(value))
      
      inline def setOnReconnect(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "onReconnect", value.toJsFn)
      
      inline def setReconnect(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "reconnect", value.toJsFn)
      
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
    - typingsJapgolly.meteor.meteorStrings.connected
    - typingsJapgolly.meteor.meteorStrings.connecting
    - typingsJapgolly.meteor.meteorStrings.failed
    - typingsJapgolly.meteor.meteorStrings.waiting
    - typingsJapgolly.meteor.meteorStrings.offline
  */
  trait Status extends StObject
  object Status {
    
    inline def connected: typingsJapgolly.meteor.meteorStrings.connected = "connected".asInstanceOf[typingsJapgolly.meteor.meteorStrings.connected]
    
    inline def connecting: typingsJapgolly.meteor.meteorStrings.connecting = "connecting".asInstanceOf[typingsJapgolly.meteor.meteorStrings.connecting]
    
    inline def failed: typingsJapgolly.meteor.meteorStrings.failed = "failed".asInstanceOf[typingsJapgolly.meteor.meteorStrings.failed]
    
    inline def offline: typingsJapgolly.meteor.meteorStrings.offline = "offline".asInstanceOf[typingsJapgolly.meteor.meteorStrings.offline]
    
    inline def waiting: typingsJapgolly.meteor.meteorStrings.waiting = "waiting".asInstanceOf[typingsJapgolly.meteor.meteorStrings.waiting]
  }
}
