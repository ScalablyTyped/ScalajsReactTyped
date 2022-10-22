package typingsJapgolly.fluentuiReactComponentEventListener

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Node
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsTypesMod {
  
  type EventHandler[T /* <: EventTypes */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any, 
    Unit
  ]
  
  trait EventListenerOptions[T /* <: EventTypes */] extends StObject {
    
    /** Indicating that events of this type will be dispatched to the registered listener before being dispatched to any EventTarget beneath it in the DOM tree. */
    var capture: js.UndefOr[Boolean] = js.undefined
    
    /** A function which receives a notification when an event of the specified type occurs. */
    var listener: EventHandler[T]
    
    /** A target node. Use `target` or `targetRef` prop. */
    var target: js.UndefOr[Target] = js.undefined
    
    /** A ref object with a target node. */
    var targetRef: js.UndefOr[RefHandle[Target]] = js.undefined
    
    /** A case-sensitive string representing the event type to listen for. */
    var `type`: T
  }
  object EventListenerOptions {
    
    inline def apply[T /* <: EventTypes */](
      listener: /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any => Callback,
      `type`: T
    ): EventListenerOptions[T] = {
      val __obj = js.Dynamic.literal(listener = js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any) => listener(t0).runNow()))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventListenerOptions[T]]
    }
    
    extension [Self <: EventListenerOptions[?], T /* <: EventTypes */](x: Self & EventListenerOptions[T]) {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setListener(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any => Callback
      ): Self = StObject.set(x, "listener", js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any) => value(t0).runNow()))
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetRef(value: RefHandle[Target]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fluentuiReactComponentEventListener.fluentuiReactComponentEventListenerStrings.DOMContentLoaded
    - typingsJapgolly.fluentuiReactComponentEventListener.fluentuiReactComponentEventListenerStrings.fullscreenchange
    - typingsJapgolly.fluentuiReactComponentEventListener.fluentuiReactComponentEventListenerStrings.fullscreenerror
    - typingsJapgolly.fluentuiReactComponentEventListener.fluentuiReactComponentEventListenerStrings.pointerlockchange
    - typingsJapgolly.fluentuiReactComponentEventListener.fluentuiReactComponentEventListenerStrings.pointerlockerror
    - typingsJapgolly.fluentuiReactComponentEventListener.fluentuiReactComponentEventListenerStrings.readystatechange
    - typingsJapgolly.fluentuiReactComponentEventListener.fluentuiReactComponentEventListenerStrings.visibilitychange
  */
  trait EventTypes extends StObject
  
  type Target = Node | Window
  
  type TargetRef = RefHandle[Target]
}
