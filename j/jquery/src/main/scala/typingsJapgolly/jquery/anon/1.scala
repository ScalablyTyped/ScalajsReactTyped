package typingsJapgolly.jquery.anon

import typingsJapgolly.jquery.JQuery._ValHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[TElement]
  extends StObject
     with _ValHook[TElement] {
  
  def set(elem: TElement, value: Any): Any
}
object `1` {
  
  inline def apply[TElement](set: (TElement, Any) => Any): `1`[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[`1`[TElement]]
  }
  
  extension [Self <: `1`[?], TElement](x: Self & `1`[TElement]) {
    
    inline def setSet(value: (TElement, Any) => Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
