package typingsJapgolly.dbJs.DbJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescableQuery[T] extends StObject {
  
  def desc(): DescQuery[T]
}
object DescableQuery {
  
  inline def apply[T](desc: CallbackTo[DescQuery[T]]): DescableQuery[T] = {
    val __obj = js.Dynamic.literal(desc = desc.toJsFn)
    __obj.asInstanceOf[DescableQuery[T]]
  }
  
  extension [Self <: DescableQuery[?], T](x: Self & DescableQuery[T]) {
    
    inline def setDesc(value: CallbackTo[DescQuery[T]]): Self = StObject.set(x, "desc", value.toJsFn)
  }
}
