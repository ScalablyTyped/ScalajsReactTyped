package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// class ClientResult {
//    get_value(): any;
//    setValue(value: any): void;
//    constructor();
// }
trait ClientResult[T] extends StObject {
  
  def get_value(): T
  
  def setValue(value: T): Unit
}
object ClientResult {
  
  inline def apply[T](get_value: CallbackTo[T], setValue: T => Callback): ClientResult[T] = {
    val __obj = js.Dynamic.literal(get_value = get_value.toJsFn, setValue = js.Any.fromFunction1((t0: T) => setValue(t0).runNow()))
    __obj.asInstanceOf[ClientResult[T]]
  }
  
  extension [Self <: ClientResult[?], T](x: Self & ClientResult[T]) {
    
    inline def setGet_value(value: CallbackTo[T]): Self = StObject.set(x, "get_value", value.toJsFn)
    
    inline def setSetValue(value: T => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
