package typingsJapgolly.mathjax.MathJax

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hooks extends StObject {
  
  def Add(hook: Any, priority: Double): CallbackObject
  
  def Execute(): CallbackObject
  
  def Remove(hook: CallbackObject): Unit
}
object Hooks {
  
  inline def apply(
    Add: (Any, Double) => CallbackObject,
    Execute: CallbackTo[CallbackObject],
    Remove: CallbackObject => japgolly.scalajs.react.Callback
  ): Hooks = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Execute = Execute.toJsFn, Remove = js.Any.fromFunction1((t0: CallbackObject) => Remove(t0).runNow()))
    __obj.asInstanceOf[Hooks]
  }
  
  extension [Self <: Hooks](x: Self) {
    
    inline def setAdd(value: (Any, Double) => CallbackObject): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setExecute(value: CallbackTo[CallbackObject]): Self = StObject.set(x, "Execute", value.toJsFn)
    
    inline def setRemove(value: CallbackObject => japgolly.scalajs.react.Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: CallbackObject) => value(t0).runNow()))
  }
}
