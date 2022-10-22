package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.IEnumerable
import typingsJapgolly.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseCollection[T]
  extends StObject
     with IEnumerable[T] {
  
  def get_count(): Double
  
  def itemAtIndex(index: Double): T
}
object BaseCollection {
  
  inline def apply[T](getEnumerator: CallbackTo[IEnumerator[T]], get_count: CallbackTo[Double], itemAtIndex: Double => T): BaseCollection[T] = {
    val __obj = js.Dynamic.literal(getEnumerator = getEnumerator.toJsFn, get_count = get_count.toJsFn, itemAtIndex = js.Any.fromFunction1(itemAtIndex))
    __obj.asInstanceOf[BaseCollection[T]]
  }
  
  extension [Self <: BaseCollection[?], T](x: Self & BaseCollection[T]) {
    
    inline def setGet_count(value: CallbackTo[Double]): Self = StObject.set(x, "get_count", value.toJsFn)
    
    inline def setItemAtIndex(value: Double => T): Self = StObject.set(x, "itemAtIndex", js.Any.fromFunction1(value))
  }
}
