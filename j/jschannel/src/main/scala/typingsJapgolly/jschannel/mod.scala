package typingsJapgolly.jschannel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jschannel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(config: ChannelConfiguration): MessagingChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(config.asInstanceOf[js.Any]).asInstanceOf[MessagingChannel]
  
  trait ChannelConfiguration extends StObject {
    
    var debugOutput: js.UndefOr[Boolean] = js.undefined
    
    var gotMessageObserver: js.UndefOr[js.Function2[/* origin */ String, /* message */ Message, Unit]] = js.undefined
    
    var onReady: js.UndefOr[js.Function1[/* channel */ MessagingChannel, Unit]] = js.undefined
    
    var origin: String
    
    var postMessageObserver: js.UndefOr[js.Function2[/* origin */ String, /* message */ Message, Unit]] = js.undefined
    
    var publish: js.UndefOr[Boolean] = js.undefined
    
    var reconnect: js.UndefOr[Boolean] = js.undefined
    
    var remote: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var scope: String
    
    var window: Window
  }
  object ChannelConfiguration {
    
    inline def apply(origin: String, scope: String, window: Window): ChannelConfiguration = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelConfiguration]
    }
    
    extension [Self <: ChannelConfiguration](x: Self) {
      
      inline def setDebugOutput(value: Boolean): Self = StObject.set(x, "debugOutput", value.asInstanceOf[js.Any])
      
      inline def setDebugOutputUndefined: Self = StObject.set(x, "debugOutput", js.undefined)
      
      inline def setGotMessageObserver(value: (/* origin */ String, /* message */ Message) => Callback): Self = StObject.set(x, "gotMessageObserver", js.Any.fromFunction2((t0: /* origin */ String, t1: /* message */ Message) => (value(t0, t1)).runNow()))
      
      inline def setGotMessageObserverUndefined: Self = StObject.set(x, "gotMessageObserver", js.undefined)
      
      inline def setOnReady(value: /* channel */ MessagingChannel => Callback): Self = StObject.set(x, "onReady", js.Any.fromFunction1((t0: /* channel */ MessagingChannel) => value(t0).runNow()))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPostMessageObserver(value: (/* origin */ String, /* message */ Message) => Callback): Self = StObject.set(x, "postMessageObserver", js.Any.fromFunction2((t0: /* origin */ String, t1: /* message */ Message) => (value(t0, t1)).runNow()))
      
      inline def setPostMessageObserverUndefined: Self = StObject.set(x, "postMessageObserver", js.undefined)
      
      inline def setPublish(value: Boolean): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
      
      inline def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
      
      inline def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      inline def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      inline def setRemote(value: String | js.Array[String]): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
      
      inline def setRemoteVarargs(value: String*): Self = StObject.set(x, "remote", js.Array(value*))
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var error: js.UndefOr[js.Function2[/* error */ Any, /* message */ String, Unit]] = js.undefined
    
    var method: String
    
    var params: js.UndefOr[Any] = js.undefined
    
    var success: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Message {
    
    inline def apply(method: String): Message = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setError(value: (/* error */ Any, /* message */ String) => Callback): Self = StObject.set(x, "error", js.Any.fromFunction2((t0: /* error */ Any, t1: /* message */ String) => (value(t0, t1)).runNow()))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setSuccess(value: /* result */ Any => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ Any) => value(t0).runNow()))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait MessageTransaction extends StObject {
    
    def complete(result: Any): Unit
    
    def completed(): Boolean
    
    def delayReturn(delay: Boolean): Boolean
    
    def error(error: Any, message: String): Unit
    
    def invoke(callbackName: String, params: Any): Unit
  }
  object MessageTransaction {
    
    inline def apply(
      complete: Any => Callback,
      completed: CallbackTo[Boolean],
      delayReturn: Boolean => Boolean,
      error: (Any, String) => Callback,
      invoke: (String, Any) => Callback
    ): MessageTransaction = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: Any) => complete(t0).runNow()), completed = completed.toJsFn, delayReturn = js.Any.fromFunction1(delayReturn), error = js.Any.fromFunction2((t0: Any, t1: String) => (error(t0, t1)).runNow()), invoke = js.Any.fromFunction2((t0: String, t1: Any) => (invoke(t0, t1)).runNow()))
      __obj.asInstanceOf[MessageTransaction]
    }
    
    extension [Self <: MessageTransaction](x: Self) {
      
      inline def setComplete(value: Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setCompleted(value: CallbackTo[Boolean]): Self = StObject.set(x, "completed", value.toJsFn)
      
      inline def setDelayReturn(value: Boolean => Boolean): Self = StObject.set(x, "delayReturn", js.Any.fromFunction1(value))
      
      inline def setError(value: (Any, String) => Callback): Self = StObject.set(x, "error", js.Any.fromFunction2((t0: Any, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setInvoke(value: (String, Any) => Callback): Self = StObject.set(x, "invoke", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    }
  }
  
  @js.native
  trait MessagingChannel extends StObject {
    
    def bind(method: String): MessagingChannel = js.native
    def bind(
      method: String,
      callback: js.Function2[/* transaction */ MessageTransaction, /* params */ Any, Unit]
    ): MessagingChannel = js.native
    def bind(
      method: String,
      callback: js.Function2[/* transaction */ MessageTransaction, /* params */ Any, Unit],
      doNotPublish: Boolean
    ): MessagingChannel = js.native
    def bind(method: String, callback: Unit, doNotPublish: Boolean): MessagingChannel = js.native
    
    def call(message: Message): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def notify(message: Message): Unit = js.native
    
    def unbind(method: String): Boolean = js.native
    def unbind(method: String, doNotPublish: Boolean): Boolean = js.native
  }
}
