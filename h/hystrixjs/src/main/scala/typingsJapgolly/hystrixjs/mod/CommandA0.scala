package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandA0[R] extends StObject {
  
  def execute[R](): PromiseLike[R]
}
object CommandA0 {
  
  inline def apply[R](execute: CallbackTo[PromiseLike[Any]]): CommandA0[R] = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn)
    __obj.asInstanceOf[CommandA0[R]]
  }
  
  extension [Self <: CommandA0[?], R](x: Self & CommandA0[R]) {
    
    inline def setExecute(value: CallbackTo[PromiseLike[Any]]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
