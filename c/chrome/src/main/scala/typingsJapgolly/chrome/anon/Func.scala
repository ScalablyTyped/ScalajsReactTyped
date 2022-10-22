package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Func[Result] extends StObject {
  
  /* A JavaScript function to inject. This function will be serialized, and then deserialized for injection. This means that any bound parameters and execution context will be lost. Exactly one of files and function must be specified. */
  def func(): Result
}
object Func {
  
  inline def apply[Result](func: CallbackTo[Result]): Func[Result] = {
    val __obj = js.Dynamic.literal(func = func.toJsFn)
    __obj.asInstanceOf[Func[Result]]
  }
  
  extension [Self <: Func[?], Result](x: Self & Func[Result]) {
    
    inline def setFunc(value: CallbackTo[Result]): Self = StObject.set(x, "func", value.toJsFn)
  }
}
