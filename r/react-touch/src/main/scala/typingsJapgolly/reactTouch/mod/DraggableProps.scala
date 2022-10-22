package typingsJapgolly.reactTouch.mod

import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableProps extends StObject {
  
  var children: DraggableCallback
  
  /**
    * An object that defines the initial position of the draggable component.
    * You can pass any of the following styles to it
    * and they'll be updated and passed back out in the callback with every animation tick.
    */
  var style: DraggableStyle
}
object DraggableProps {
  
  inline def apply(children: /* argument */ DraggableCallbackArgument => Element, style: DraggableStyle): DraggableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProps]
  }
  
  extension [Self <: DraggableProps](x: Self) {
    
    inline def setChildren(value: /* argument */ DraggableCallbackArgument => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setStyle(value: DraggableStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
