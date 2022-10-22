package typingsJapgolly.cfcsCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cfcsCore.declarationReactiveReactiveSubscribeMod.ReactiveSubscribe
import typingsJapgolly.cfcsCore.declarationReactiveTypesMod.ReactiveEventCallback
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Destroy[State /* <: Record[String, Any] */, Instance /* <: ReactiveSubscribe[Record[String, Any]] */] extends StObject {
    
    def destroy(): Unit
    
    def init(): Unit
    
    def instance(): Instance
    
    def methods(): Any
    
    def mounted(): Unit
    
    def off(eventName: String, listener: ReactiveEventCallback[Any, Any]): Unit
    
    def on(eventName: String, listener: ReactiveEventCallback[Any, Any]): Unit
    
    def state(): State
  }
  object Destroy {
    
    inline def apply[State /* <: Record[String, Any] */, Instance /* <: ReactiveSubscribe[Record[String, Any]] */](
      destroy: Callback,
      init: Callback,
      instance: CallbackTo[Instance],
      methods: CallbackTo[Any],
      mounted: Callback,
      off: (String, ReactiveEventCallback[Any, Any]) => Callback,
      on: (String, ReactiveEventCallback[Any, Any]) => Callback,
      state: CallbackTo[State]
    ): Destroy[State, Instance] = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, init = init.toJsFn, instance = instance.toJsFn, methods = methods.toJsFn, mounted = mounted.toJsFn, off = js.Any.fromFunction2((t0: String, t1: ReactiveEventCallback[Any, Any]) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: ReactiveEventCallback[Any, Any]) => (on(t0, t1)).runNow()), state = state.toJsFn)
      __obj.asInstanceOf[Destroy[State, Instance]]
    }
    
    extension [Self <: Destroy[?, ?], State /* <: Record[String, Any] */, Instance /* <: ReactiveSubscribe[Record[String, Any]] */](x: Self & (Destroy[State, Instance])) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setInstance(value: CallbackTo[Instance]): Self = StObject.set(x, "instance", value.toJsFn)
      
      inline def setMethods(value: CallbackTo[Any]): Self = StObject.set(x, "methods", value.toJsFn)
      
      inline def setMounted(value: Callback): Self = StObject.set(x, "mounted", value.toJsFn)
      
      inline def setOff(value: (String, ReactiveEventCallback[Any, Any]) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: String, t1: ReactiveEventCallback[Any, Any]) => (value(t0, t1)).runNow()))
      
      inline def setOn(value: (String, ReactiveEventCallback[Any, Any]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: ReactiveEventCallback[Any, Any]) => (value(t0, t1)).runNow()))
      
      inline def setState(value: CallbackTo[State]): Self = StObject.set(x, "state", value.toJsFn)
    }
  }
}
