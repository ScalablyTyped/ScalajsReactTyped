package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactTransitionEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.TransitionEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableProvidedDraggableProps extends StObject {
  
  // used for shared global styles
  var `data-rbd-draggable-context-id`: String
  
  var `data-rbd-draggable-id`: String
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[Any]] = js.undefined
  
  // inline style
  var style: js.UndefOr[DraggingStyle | NotDraggingStyle] = js.undefined
}
object DraggableProvidedDraggableProps {
  
  inline def apply(`data-rbd-draggable-context-id`: String, `data-rbd-draggable-id`: String): DraggableProvidedDraggableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-rbd-draggable-context-id")(`data-rbd-draggable-context-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-draggable-id")(`data-rbd-draggable-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProvidedDraggableProps]
  }
  
  extension [Self <: DraggableProvidedDraggableProps](x: Self) {
    
    inline def `setData-rbd-draggable-context-id`(value: String): Self = StObject.set(x, "data-rbd-draggable-context-id", value.asInstanceOf[js.Any])
    
    inline def `setData-rbd-draggable-id`(value: String): Self = StObject.set(x, "data-rbd-draggable-id", value.asInstanceOf[js.Any])
    
    inline def setOnTransitionEnd(value: ReactTransitionEventFrom[Any & Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setStyle(value: DraggingStyle | NotDraggingStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
