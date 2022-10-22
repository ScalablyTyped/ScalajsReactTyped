package typingsJapgolly.sharepoint

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEnumerable[T] extends StObject {
  
  def getEnumerator(): IEnumerator[T]
}
object IEnumerable {
  
  inline def apply[T](getEnumerator: CallbackTo[IEnumerator[T]]): IEnumerable[T] = {
    val __obj = js.Dynamic.literal(getEnumerator = getEnumerator.toJsFn)
    __obj.asInstanceOf[IEnumerable[T]]
  }
  
  extension [Self <: IEnumerable[?], T](x: Self & IEnumerable[T]) {
    
    inline def setGetEnumerator(value: CallbackTo[IEnumerator[T]]): Self = StObject.set(x, "getEnumerator", value.toJsFn)
  }
}
