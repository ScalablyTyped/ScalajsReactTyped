package typingsJapgolly.reactBeautifulDnd.mod

import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotDraggingStyle extends StObject {
  
  var transform: js.UndefOr[String] = js.undefined
  
  var transition: js.UndefOr[none] = js.undefined
}
object NotDraggingStyle {
  
  inline def apply(): NotDraggingStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotDraggingStyle]
  }
  
  extension [Self <: NotDraggingStyle](x: Self) {
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransition(value: none): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
