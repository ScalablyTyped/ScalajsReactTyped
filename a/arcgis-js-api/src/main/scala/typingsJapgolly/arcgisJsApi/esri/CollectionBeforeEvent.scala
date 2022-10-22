package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionBeforeEvent[T] extends StObject {
  
  var item: T
  
  def preventDefault(): scala.Unit
}
object CollectionBeforeEvent {
  
  inline def apply[T](item: T, preventDefault: Callback): CollectionBeforeEvent[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn)
    __obj.asInstanceOf[CollectionBeforeEvent[T]]
  }
  
  extension [Self <: CollectionBeforeEvent[?], T](x: Self & CollectionBeforeEvent[T]) {
    
    inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
  }
}
