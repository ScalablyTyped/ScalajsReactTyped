package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasChild extends StObject {
  
  def hasChild(style: Any): Boolean
  
  def isEmpty(): Boolean
}
object HasChild {
  
  inline def apply(hasChild: Any => Boolean, isEmpty: CallbackTo[Boolean]): HasChild = {
    val __obj = js.Dynamic.literal(hasChild = js.Any.fromFunction1(hasChild), isEmpty = isEmpty.toJsFn)
    __obj.asInstanceOf[HasChild]
  }
  
  extension [Self <: HasChild](x: Self) {
    
    inline def setHasChild(value: Any => Boolean): Self = StObject.set(x, "hasChild", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
  }
}
