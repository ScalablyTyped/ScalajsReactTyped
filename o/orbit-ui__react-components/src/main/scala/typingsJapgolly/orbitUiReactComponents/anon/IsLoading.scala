package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLoading[T] extends StObject {
  
  var isLoading: Boolean
  
  var items: js.Array[T]
  
  def search(event: ReactEventFrom[Element], query: String): js.Promise[Unit]
}
object IsLoading {
  
  inline def apply[T](
    isLoading: Boolean,
    items: js.Array[T],
    search: (ReactEventFrom[Element], String) => js.Promise[Unit]
  ): IsLoading[T] = {
    val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], search = js.Any.fromFunction2(search))
    __obj.asInstanceOf[IsLoading[T]]
  }
  
  extension [Self <: IsLoading[?], T](x: Self & IsLoading[T]) {
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setSearch(value: (ReactEventFrom[Element], String) => js.Promise[Unit]): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
  }
}
