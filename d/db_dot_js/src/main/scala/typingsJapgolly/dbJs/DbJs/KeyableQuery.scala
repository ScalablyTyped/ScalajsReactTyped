package typingsJapgolly.dbJs.DbJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyableQuery[T] extends StObject {
  
  def keys(): KeysQuery[T]
}
object KeyableQuery {
  
  inline def apply[T](keys: CallbackTo[KeysQuery[T]]): KeyableQuery[T] = {
    val __obj = js.Dynamic.literal(keys = keys.toJsFn)
    __obj.asInstanceOf[KeyableQuery[T]]
  }
  
  extension [Self <: KeyableQuery[?], T](x: Self & KeyableQuery[T]) {
    
    inline def setKeys(value: CallbackTo[KeysQuery[T]]): Self = StObject.set(x, "keys", value.toJsFn)
  }
}
