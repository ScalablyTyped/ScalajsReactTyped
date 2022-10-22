package typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pluggable[Input /* <: js.Object */, Output /* <: js.Object */] extends StObject {
  
  /**
    * A function that mutate the passed in middleware stack. Functions implementing
    * this interface can add, remove, modify existing middleware stack from clients
    * or commands
    */
  def applyToStack(stack: MiddlewareStack[Input, Output]): Unit
}
object Pluggable {
  
  inline def apply[Input /* <: js.Object */, Output /* <: js.Object */](applyToStack: MiddlewareStack[Input, Output] => Callback): Pluggable[Input, Output] = {
    val __obj = js.Dynamic.literal(applyToStack = js.Any.fromFunction1((t0: MiddlewareStack[Input, Output]) => applyToStack(t0).runNow()))
    __obj.asInstanceOf[Pluggable[Input, Output]]
  }
  
  extension [Self <: Pluggable[?, ?], Input /* <: js.Object */, Output /* <: js.Object */](x: Self & (Pluggable[Input, Output])) {
    
    inline def setApplyToStack(value: MiddlewareStack[Input, Output] => Callback): Self = StObject.set(x, "applyToStack", js.Any.fromFunction1((t0: MiddlewareStack[Input, Output]) => value(t0).runNow()))
  }
}
