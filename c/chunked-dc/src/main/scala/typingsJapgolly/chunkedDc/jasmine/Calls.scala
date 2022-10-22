package typingsJapgolly.chunkedDc.jasmine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calls extends StObject {
  
  /** By chaining the spy with calls.all(), will return the context (the this) and arguments passed all calls **/
  def all(): js.Array[CallInfo]
  
  /** By chaining the spy with calls.allArgs(), will return the arguments to all calls **/
  def allArgs(): js.Array[scala.Any]
  
  /** By chaining the spy with calls.any(), will return false if the spy has not been called at all, and then true once at least one call happens. **/
  def any(): Boolean
  
  /** By chaining the spy with calls.argsFor(), will return the arguments passed to call number index **/
  def argsFor(index: Double): js.Array[scala.Any]
  
  /** By chaining the spy with calls.count(), will return the number of times the spy was called **/
  def count(): Double
  
  /** By chaining the spy with calls.first(), will return the context (the this) and arguments for the first call **/
  def first(): CallInfo
  
  /** By chaining the spy with calls.mostRecent(), will return the context (the this) and arguments for the most recent call **/
  def mostRecent(): CallInfo
  
  /** By chaining the spy with calls.reset(), will clears all tracking for a spy **/
  def reset(): Unit
}
object Calls {
  
  inline def apply(
    all: CallbackTo[js.Array[CallInfo]],
    allArgs: CallbackTo[js.Array[scala.Any]],
    any: CallbackTo[Boolean],
    argsFor: Double => js.Array[scala.Any],
    count: CallbackTo[Double],
    first: CallbackTo[CallInfo],
    mostRecent: CallbackTo[CallInfo],
    reset: Callback
  ): Calls = {
    val __obj = js.Dynamic.literal(all = all.toJsFn, allArgs = allArgs.toJsFn, any = any.toJsFn, argsFor = js.Any.fromFunction1(argsFor), count = count.toJsFn, first = first.toJsFn, mostRecent = mostRecent.toJsFn, reset = reset.toJsFn)
    __obj.asInstanceOf[Calls]
  }
  
  extension [Self <: Calls](x: Self) {
    
    inline def setAll(value: CallbackTo[js.Array[CallInfo]]): Self = StObject.set(x, "all", value.toJsFn)
    
    inline def setAllArgs(value: CallbackTo[js.Array[scala.Any]]): Self = StObject.set(x, "allArgs", value.toJsFn)
    
    inline def setAny(value: CallbackTo[Boolean]): Self = StObject.set(x, "any", value.toJsFn)
    
    inline def setArgsFor(value: Double => js.Array[scala.Any]): Self = StObject.set(x, "argsFor", js.Any.fromFunction1(value))
    
    inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setFirst(value: CallbackTo[CallInfo]): Self = StObject.set(x, "first", value.toJsFn)
    
    inline def setMostRecent(value: CallbackTo[CallInfo]): Self = StObject.set(x, "mostRecent", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
