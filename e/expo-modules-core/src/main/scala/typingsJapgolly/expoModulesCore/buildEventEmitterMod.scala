package typingsJapgolly.expoModulesCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.NativeEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEventEmitterMod {
  
  @JSImport("expo-modules-core/build/EventEmitter", "EventEmitter")
  @js.native
  open class EventEmitter protected () extends StObject {
    def this(nativeModule: NativeModule) = this()
    
    var _eventEmitter: NativeEventEmitter = js.native
    
    var _listenerCount: Double = js.native
    
    var _nativeModule: NativeModule = js.native
    
    def addListener[T](eventName: String, listener: js.Function1[/* event */ T, Unit]): Subscription = js.native
    
    def emit(eventName: String, params: Any*): Unit = js.native
    
    def removeAllListeners(eventName: String): Unit = js.native
    
    def removeSubscription(subscription: Subscription): Unit = js.native
  }
  
  trait NativeModule extends StObject {
    
    def addListener(eventName: String): Unit
    
    def removeListeners(count: Double): Unit
    
    var startObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stopObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object NativeModule {
    
    inline def apply(addListener: String => Callback, removeListeners: Double => Callback): NativeModule = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1((t0: String) => addListener(t0).runNow()), removeListeners = js.Any.fromFunction1((t0: Double) => removeListeners(t0).runNow()))
      __obj.asInstanceOf[NativeModule]
    }
    
    extension [Self <: NativeModule](x: Self) {
      
      inline def setAddListener(value: String => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveListeners(value: Double => Callback): Self = StObject.set(x, "removeListeners", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setStartObserving(value: Callback): Self = StObject.set(x, "startObserving", value.toJsFn)
      
      inline def setStartObservingUndefined: Self = StObject.set(x, "startObserving", js.undefined)
      
      inline def setStopObserving(value: Callback): Self = StObject.set(x, "stopObserving", value.toJsFn)
      
      inline def setStopObservingUndefined: Self = StObject.set(x, "stopObserving", js.undefined)
    }
  }
  
  trait Subscription extends StObject {
    
    /**
      * A method to unsubscribe the listener.
      */
    def remove(): Unit
  }
  object Subscription {
    
    inline def apply(remove: Callback): Subscription = {
      val __obj = js.Dynamic.literal(remove = remove.toJsFn)
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    }
  }
}
