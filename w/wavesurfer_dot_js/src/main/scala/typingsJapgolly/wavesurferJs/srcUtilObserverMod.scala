package typingsJapgolly.wavesurferJs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.wavesurferJs.typesUtilMod.EventHandler
import typingsJapgolly.wavesurferJs.typesUtilMod.ListenerDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilObserverMod {
  
  @JSImport("wavesurfer.js/src/util/observer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Observer {
    
    /** Manually fire an event. */
    /* CompleteClass */
    override def fireEvent(eventName: String, args: Any*): Unit = js.native
    
    /* CompleteClass */
    override val handlers: StringDictionary[js.Array[EventHandler]] = js.native
    
    /** Attach a handler function for an event. */
    /* CompleteClass */
    override def on(eventName: String, callback: EventHandler): ListenerDescriptor = js.native
    
    /** Attach a handler to an event. */
    /* CompleteClass */
    override def once(eventName: String, callback: EventHandler): ListenerDescriptor = js.native
    
    /** Disable firing a list of events by name. */
    /* CompleteClass */
    override def setDisabledEventEmissions(eventNames: js.Array[String]): Unit = js.native
    
    /** Remove an event handler. */
    /* CompleteClass */
    override def un(eventName: String, callback: EventHandler): Unit = js.native
    
    /** Remove all event handlers. */
    /* CompleteClass */
    override def unAll(): Unit = js.native
  }
  
  trait Observer extends StObject {
    
    /** Manually fire an event. */
    def fireEvent(eventName: String, args: Any*): Unit
    
    val handlers: StringDictionary[js.Array[EventHandler]]
    
    /** Attach a handler function for an event. */
    def on(eventName: String, callback: EventHandler): ListenerDescriptor
    
    /** Attach a handler to an event. */
    def once(eventName: String, callback: EventHandler): ListenerDescriptor
    
    /** Disable firing a list of events by name. */
    def setDisabledEventEmissions(eventNames: js.Array[String]): Unit
    
    /** Remove an event handler. */
    def un(eventName: String, callback: EventHandler): Unit
    
    /** Remove all event handlers. */
    def unAll(): Unit
  }
  object Observer {
    
    inline def apply(
      fireEvent: (String, /* repeated */ Any) => Callback,
      handlers: StringDictionary[js.Array[EventHandler]],
      on: (String, EventHandler) => ListenerDescriptor,
      once: (String, EventHandler) => ListenerDescriptor,
      setDisabledEventEmissions: js.Array[String] => Callback,
      un: (String, EventHandler) => Callback,
      unAll: Callback
    ): Observer = {
      val __obj = js.Dynamic.literal(fireEvent = js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (fireEvent(t0, t1)).runNow()), handlers = handlers.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), setDisabledEventEmissions = js.Any.fromFunction1((t0: js.Array[String]) => setDisabledEventEmissions(t0).runNow()), un = js.Any.fromFunction2((t0: String, t1: EventHandler) => (un(t0, t1)).runNow()), unAll = unAll.toJsFn)
      __obj.asInstanceOf[Observer]
    }
    
    extension [Self <: Observer](x: Self) {
      
      inline def setFireEvent(value: (String, /* repeated */ Any) => Callback): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setHandlers(value: StringDictionary[js.Array[EventHandler]]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setOn(value: (String, EventHandler) => ListenerDescriptor): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(value: (String, EventHandler) => ListenerDescriptor): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      inline def setSetDisabledEventEmissions(value: js.Array[String] => Callback): Self = StObject.set(x, "setDisabledEventEmissions", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
      
      inline def setUn(value: (String, EventHandler) => Callback): Self = StObject.set(x, "un", js.Any.fromFunction2((t0: String, t1: EventHandler) => (value(t0, t1)).runNow()))
      
      inline def setUnAll(value: Callback): Self = StObject.set(x, "unAll", value.toJsFn)
    }
  }
}
