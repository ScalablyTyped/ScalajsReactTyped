package typingsJapgolly.jasmine.jasmine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Parameters
import typingsJapgolly.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calls[Fn /* <: Func */] extends StObject {
  
  /** By chaining the spy with calls.all(), will return the context (the this) and arguments passed all calls */
  def all(): js.Array[CallInfo[Fn]]
  
  /** By chaining the spy with calls.allArgs(), will return the arguments to all calls */
  def allArgs(): js.Array[Parameters[Fn]]
  
  /** By chaining the spy with calls.any(), will return false if the spy has not been called at all, and then true once at least one call happens. */
  def any(): Boolean
  
  /** By chaining the spy with calls.argsFor(), will return the arguments passed to call number index */
  def argsFor(index: Double): Parameters[Fn]
  
  /** By chaining the spy with calls.count(), will return the number of times the spy was called */
  def count(): Double
  
  /** By chaining the spy with calls.first(), will return the context (the this) and arguments for the first call */
  def first(): CallInfo[Fn]
  
  /** By chaining the spy with calls.mostRecent(), will return the context (the this) and arguments for the most recent call */
  def mostRecent(): CallInfo[Fn]
  
  /** By chaining the spy with calls.reset(), will clears all tracking for a spy */
  def reset(): Unit
  
  /** Set this spy to do a shallow clone of arguments passed to each invocation. */
  def saveArgumentsByValue(): Unit
  
  /** Get the "this" object that was passed to a specific invocation of this spy. */
  def thisFor(index: Double): ThisType[Fn]
}
object Calls {
  
  inline def apply[Fn /* <: Func */](
    all: CallbackTo[js.Array[CallInfo[Fn]]],
    allArgs: CallbackTo[js.Array[Parameters[Fn]]],
    any: CallbackTo[Boolean],
    argsFor: Double => Parameters[Fn],
    count: CallbackTo[Double],
    first: CallbackTo[CallInfo[Fn]],
    mostRecent: CallbackTo[CallInfo[Fn]],
    reset: Callback,
    saveArgumentsByValue: Callback,
    thisFor: Double => ThisType[Fn]
  ): Calls[Fn] = {
    val __obj = js.Dynamic.literal(all = all.toJsFn, allArgs = allArgs.toJsFn, any = any.toJsFn, argsFor = js.Any.fromFunction1(argsFor), count = count.toJsFn, first = first.toJsFn, mostRecent = mostRecent.toJsFn, reset = reset.toJsFn, saveArgumentsByValue = saveArgumentsByValue.toJsFn, thisFor = js.Any.fromFunction1(thisFor))
    __obj.asInstanceOf[Calls[Fn]]
  }
  
  extension [Self <: Calls[?], Fn /* <: Func */](x: Self & Calls[Fn]) {
    
    inline def setAll(value: CallbackTo[js.Array[CallInfo[Fn]]]): Self = StObject.set(x, "all", value.toJsFn)
    
    inline def setAllArgs(value: CallbackTo[js.Array[Parameters[Fn]]]): Self = StObject.set(x, "allArgs", value.toJsFn)
    
    inline def setAny(value: CallbackTo[Boolean]): Self = StObject.set(x, "any", value.toJsFn)
    
    inline def setArgsFor(value: Double => Parameters[Fn]): Self = StObject.set(x, "argsFor", js.Any.fromFunction1(value))
    
    inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setFirst(value: CallbackTo[CallInfo[Fn]]): Self = StObject.set(x, "first", value.toJsFn)
    
    inline def setMostRecent(value: CallbackTo[CallInfo[Fn]]): Self = StObject.set(x, "mostRecent", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSaveArgumentsByValue(value: Callback): Self = StObject.set(x, "saveArgumentsByValue", value.toJsFn)
    
    inline def setThisFor(value: Double => ThisType[Fn]): Self = StObject.set(x, "thisFor", js.Any.fromFunction1(value))
  }
}
