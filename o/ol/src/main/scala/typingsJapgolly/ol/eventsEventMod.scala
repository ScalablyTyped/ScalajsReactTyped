package typingsJapgolly.ol

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsEventMod {
  
  @JSImport("ol/events/Event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/events/Event", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BaseEvent {
    def this(`type`: String) = this()
    
    /**
      * Stop event propagation.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /**
      * Stop event propagation.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /**
      * The event target.
      */
    /* CompleteClass */
    var target: Any = js.native
    
    /**
      * The event type.
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  inline def preventDefault(evt: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def preventDefault(evt: BaseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stopPropagation(evt: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPropagation")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def stopPropagation(evt: BaseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPropagation")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait BaseEvent extends StObject {
    
    /**
      * Stop event propagation.
      */
    def preventDefault(): Unit
    
    /**
      * Stop event propagation.
      */
    def stopPropagation(): Unit
    
    /**
      * The event target.
      */
    var target: Any
    
    /**
      * The event type.
      */
    var `type`: String
  }
  object BaseEvent {
    
    inline def apply(preventDefault: Callback, stopPropagation: Callback, target: Any, `type`: String): BaseEvent = {
      val __obj = js.Dynamic.literal(preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEvent]
    }
    
    extension [Self <: BaseEvent](x: Self) {
      
      inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
