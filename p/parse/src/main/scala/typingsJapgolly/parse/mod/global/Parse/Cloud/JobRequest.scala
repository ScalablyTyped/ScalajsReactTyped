package typingsJapgolly.parse.mod.global.Parse.Cloud

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobRequest[T /* <: Params */] extends StObject {
  
  def message(response: Any): Unit
  
  var params: T
}
object JobRequest {
  
  inline def apply[T /* <: Params */](message: Any => Callback, params: T): JobRequest[T] = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction1((t0: Any) => message(t0).runNow()), params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobRequest[T]]
  }
  
  extension [Self <: JobRequest[?], T /* <: Params */](x: Self & JobRequest[T]) {
    
    inline def setMessage(value: Any => Callback): Self = StObject.set(x, "message", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
