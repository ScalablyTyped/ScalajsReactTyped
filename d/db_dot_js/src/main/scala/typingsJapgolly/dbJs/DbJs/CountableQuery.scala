package typingsJapgolly.dbJs.DbJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountableQuery[T] extends StObject {
  
  def count(): ExecutableQuery[T]
}
object CountableQuery {
  
  inline def apply[T](count: CallbackTo[ExecutableQuery[T]]): CountableQuery[T] = {
    val __obj = js.Dynamic.literal(count = count.toJsFn)
    __obj.asInstanceOf[CountableQuery[T]]
  }
  
  extension [Self <: CountableQuery[?], T](x: Self & CountableQuery[T]) {
    
    inline def setCount(value: CallbackTo[ExecutableQuery[T]]): Self = StObject.set(x, "count", value.toJsFn)
  }
}
