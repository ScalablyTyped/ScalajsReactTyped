package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetValue extends StObject {
  
  def getValue(): Any
  
  def hasChild(style: Any): Boolean
  
  def isEmpty(): Boolean
}
object GetValue {
  
  inline def apply(getValue: CallbackTo[Any], hasChild: Any => Boolean, isEmpty: CallbackTo[Boolean]): GetValue = {
    val __obj = js.Dynamic.literal(getValue = getValue.toJsFn, hasChild = js.Any.fromFunction1(hasChild), isEmpty = isEmpty.toJsFn)
    __obj.asInstanceOf[GetValue]
  }
  
  extension [Self <: GetValue](x: Self) {
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setHasChild(value: Any => Boolean): Self = StObject.set(x, "hasChild", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
  }
}
