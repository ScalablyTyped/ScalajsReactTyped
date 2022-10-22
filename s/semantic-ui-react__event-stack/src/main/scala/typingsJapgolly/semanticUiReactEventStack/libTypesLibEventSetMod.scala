package typingsJapgolly.semanticUiReactEventStack

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import typingsJapgolly.semanticUiReactEventStack.libTypesTypesMod.EventListeners
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesLibEventSetMod {
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventSet", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EventSet {
    /**
      * @see https://jsperf.com/suir-eventset-constructor
      */
    def this(eventHandlers: EventListeners) = this()
    
    /**
      * @see https://jsperf.com/suir-eventset-addhandlers
      */
    /* CompleteClass */
    override def addHandlers(additionalHandlers: EventListeners): EventSet = js.native
    
    /**
      * @see https://jsperf.com/suir-eventset-dispatchsingle
      * @see https://jsperf.com/suir-eventset-dispatchmultiple2
      */
    /* CompleteClass */
    override def dispatchEvent(event: Event, dispatchAll: Boolean): Unit = js.native
    
    /* private */ /* CompleteClass */
    override val handlers: Any = js.native
    
    /* CompleteClass */
    override def hasHandlers(): Boolean = js.native
    
    /**
      * @see https://jsperf.com/suir-eventset-removehandlers
      */
    /* CompleteClass */
    override def removeHandlers(removalHandlers: EventListeners): EventSet = js.native
  }
  
  trait EventSet extends StObject {
    
    /**
      * @see https://jsperf.com/suir-eventset-addhandlers
      */
    def addHandlers(additionalHandlers: EventListeners): EventSet
    
    /**
      * @see https://jsperf.com/suir-eventset-dispatchsingle
      * @see https://jsperf.com/suir-eventset-dispatchmultiple2
      */
    def dispatchEvent(event: Event, dispatchAll: Boolean): Unit
    
    /* private */ val handlers: Any
    
    def hasHandlers(): Boolean
    
    /**
      * @see https://jsperf.com/suir-eventset-removehandlers
      */
    def removeHandlers(removalHandlers: EventListeners): EventSet
  }
  object EventSet {
    
    inline def apply(
      addHandlers: EventListeners => EventSet,
      dispatchEvent: (Event, Boolean) => Callback,
      handlers: Any,
      hasHandlers: CallbackTo[Boolean],
      removeHandlers: EventListeners => EventSet
    ): EventSet = {
      val __obj = js.Dynamic.literal(addHandlers = js.Any.fromFunction1(addHandlers), dispatchEvent = js.Any.fromFunction2((t0: Event, t1: Boolean) => (dispatchEvent(t0, t1)).runNow()), handlers = handlers.asInstanceOf[js.Any], hasHandlers = hasHandlers.toJsFn, removeHandlers = js.Any.fromFunction1(removeHandlers))
      __obj.asInstanceOf[EventSet]
    }
    
    extension [Self <: EventSet](x: Self) {
      
      inline def setAddHandlers(value: EventListeners => EventSet): Self = StObject.set(x, "addHandlers", js.Any.fromFunction1(value))
      
      inline def setDispatchEvent(value: (Event, Boolean) => Callback): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction2((t0: Event, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setHandlers(value: Any): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHasHandlers(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasHandlers", value.toJsFn)
      
      inline def setRemoveHandlers(value: EventListeners => EventSet): Self = StObject.set(x, "removeHandlers", js.Any.fromFunction1(value))
    }
  }
}
