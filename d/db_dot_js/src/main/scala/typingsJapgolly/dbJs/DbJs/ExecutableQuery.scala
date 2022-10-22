package typingsJapgolly.dbJs.DbJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Query API
trait ExecutableQuery[T] extends StObject {
  
  def execute(): js.Promise[js.Array[T]]
}
object ExecutableQuery {
  
  inline def apply[T](execute: CallbackTo[js.Promise[js.Array[T]]]): ExecutableQuery[T] = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn)
    __obj.asInstanceOf[ExecutableQuery[T]]
  }
  
  extension [Self <: ExecutableQuery[?], T](x: Self & ExecutableQuery[T]) {
    
    inline def setExecute(value: CallbackTo[js.Promise[js.Array[T]]]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
