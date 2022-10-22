package typingsJapgolly.reactAsync.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FulfilledProps[T] extends StObject {
  
  var children: js.UndefOr[FulfilledChildren[T]] = js.undefined
  
  var persist: js.UndefOr[Boolean] = js.undefined
}
object FulfilledProps {
  
  inline def apply[T](): FulfilledProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FulfilledProps[T]]
  }
  
  extension [Self <: FulfilledProps[?], T](x: Self & FulfilledProps[T]) {
    
    inline def setChildren(value: FulfilledChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction2(value: (T, /* state */ AsyncFulfilled[T, AbstractState[T]]) => Node): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
  }
}
