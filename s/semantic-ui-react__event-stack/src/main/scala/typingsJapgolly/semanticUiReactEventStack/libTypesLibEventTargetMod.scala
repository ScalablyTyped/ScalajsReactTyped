package typingsJapgolly.semanticUiReactEventStack

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.semanticUiReactEventStack.libTypesTypesMod.EventListeners
import typingsJapgolly.semanticUiReactEventStack.libTypesTypesMod.TargetElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesLibEventTargetMod {
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventTarget", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EventTarget {
    def this(target: TargetElement) = this()
    
    /* CompleteClass */
    override def addHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit = js.native
    
    /* private */ /* CompleteClass */
    var addTargetHandler: Any = js.native
    
    /* private */ /* CompleteClass */
    var createEmitter: Any = js.native
    
    /* private */ /* CompleteClass */
    override val handlers: Any = js.native
    
    /* CompleteClass */
    override def hasHandlers(): Boolean = js.native
    
    /* private */ /* CompleteClass */
    override val pools: Any = js.native
    
    /* CompleteClass */
    override def removeHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit = js.native
    
    /* private */ /* CompleteClass */
    var removeTargetHandler: Any = js.native
    
    /* private */ /* CompleteClass */
    override val target: Any = js.native
  }
  
  trait EventTarget extends StObject {
    
    def addHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit
    
    /* private */ var addTargetHandler: Any
    
    /* private */ var createEmitter: Any
    
    /* private */ val handlers: Any
    
    def hasHandlers(): Boolean
    
    /* private */ val pools: Any
    
    def removeHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit
    
    /* private */ var removeTargetHandler: Any
    
    /* private */ val target: Any
  }
  object EventTarget {
    
    inline def apply(
      addHandlers: (String, String, EventListeners) => Callback,
      addTargetHandler: Any,
      createEmitter: Any,
      handlers: Any,
      hasHandlers: CallbackTo[Boolean],
      pools: Any,
      removeHandlers: (String, String, EventListeners) => Callback,
      removeTargetHandler: Any,
      target: Any
    ): EventTarget = {
      val __obj = js.Dynamic.literal(addHandlers = js.Any.fromFunction3((t0: String, t1: String, t2: EventListeners) => (addHandlers(t0, t1, t2)).runNow()), addTargetHandler = addTargetHandler.asInstanceOf[js.Any], createEmitter = createEmitter.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any], hasHandlers = hasHandlers.toJsFn, pools = pools.asInstanceOf[js.Any], removeHandlers = js.Any.fromFunction3((t0: String, t1: String, t2: EventListeners) => (removeHandlers(t0, t1, t2)).runNow()), removeTargetHandler = removeTargetHandler.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTarget]
    }
    
    extension [Self <: EventTarget](x: Self) {
      
      inline def setAddHandlers(value: (String, String, EventListeners) => Callback): Self = StObject.set(x, "addHandlers", js.Any.fromFunction3((t0: String, t1: String, t2: EventListeners) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddTargetHandler(value: Any): Self = StObject.set(x, "addTargetHandler", value.asInstanceOf[js.Any])
      
      inline def setCreateEmitter(value: Any): Self = StObject.set(x, "createEmitter", value.asInstanceOf[js.Any])
      
      inline def setHandlers(value: Any): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHasHandlers(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasHandlers", value.toJsFn)
      
      inline def setPools(value: Any): Self = StObject.set(x, "pools", value.asInstanceOf[js.Any])
      
      inline def setRemoveHandlers(value: (String, String, EventListeners) => Callback): Self = StObject.set(x, "removeHandlers", js.Any.fromFunction3((t0: String, t1: String, t2: EventListeners) => (value(t0, t1, t2)).runNow()))
      
      inline def setRemoveTargetHandler(value: Any): Self = StObject.set(x, "removeTargetHandler", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
