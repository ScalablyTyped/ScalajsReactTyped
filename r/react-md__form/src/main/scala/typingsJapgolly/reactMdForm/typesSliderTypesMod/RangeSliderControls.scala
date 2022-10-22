package typingsJapgolly.reactMdForm.typesSliderTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeSliderControls extends StObject {
  
  def decrement(index: ThumbIndex): Unit
  
  def decrementJump(index: ThumbIndex): Unit
  
  def increment(index: ThumbIndex): Unit
  
  def incrementJump(index: ThumbIndex): Unit
  
  def maximum(index: ThumbIndex): Unit
  
  def minimum(index: ThumbIndex): Unit
  
  def persist(): Unit
  
  var setValue: Dispatch[SetStateAction[RangeSliderValue]]
}
object RangeSliderControls {
  
  inline def apply(
    decrement: ThumbIndex => Callback,
    decrementJump: ThumbIndex => Callback,
    increment: ThumbIndex => Callback,
    incrementJump: ThumbIndex => Callback,
    maximum: ThumbIndex => Callback,
    minimum: ThumbIndex => Callback,
    persist: Callback,
    setValue: SetStateAction[RangeSliderValue] => Callback
  ): RangeSliderControls = {
    val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1((t0: ThumbIndex) => decrement(t0).runNow()), decrementJump = js.Any.fromFunction1((t0: ThumbIndex) => decrementJump(t0).runNow()), increment = js.Any.fromFunction1((t0: ThumbIndex) => increment(t0).runNow()), incrementJump = js.Any.fromFunction1((t0: ThumbIndex) => incrementJump(t0).runNow()), maximum = js.Any.fromFunction1((t0: ThumbIndex) => maximum(t0).runNow()), minimum = js.Any.fromFunction1((t0: ThumbIndex) => minimum(t0).runNow()), persist = persist.toJsFn, setValue = js.Any.fromFunction1((t0: SetStateAction[RangeSliderValue]) => setValue(t0).runNow()))
    __obj.asInstanceOf[RangeSliderControls]
  }
  
  extension [Self <: RangeSliderControls](x: Self) {
    
    inline def setDecrement(value: ThumbIndex => Callback): Self = StObject.set(x, "decrement", js.Any.fromFunction1((t0: ThumbIndex) => value(t0).runNow()))
    
    inline def setDecrementJump(value: ThumbIndex => Callback): Self = StObject.set(x, "decrementJump", js.Any.fromFunction1((t0: ThumbIndex) => value(t0).runNow()))
    
    inline def setIncrement(value: ThumbIndex => Callback): Self = StObject.set(x, "increment", js.Any.fromFunction1((t0: ThumbIndex) => value(t0).runNow()))
    
    inline def setIncrementJump(value: ThumbIndex => Callback): Self = StObject.set(x, "incrementJump", js.Any.fromFunction1((t0: ThumbIndex) => value(t0).runNow()))
    
    inline def setMaximum(value: ThumbIndex => Callback): Self = StObject.set(x, "maximum", js.Any.fromFunction1((t0: ThumbIndex) => value(t0).runNow()))
    
    inline def setMinimum(value: ThumbIndex => Callback): Self = StObject.set(x, "minimum", js.Any.fromFunction1((t0: ThumbIndex) => value(t0).runNow()))
    
    inline def setPersist(value: Callback): Self = StObject.set(x, "persist", value.toJsFn)
    
    inline def setSetValue(value: SetStateAction[RangeSliderValue] => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: SetStateAction[RangeSliderValue]) => value(t0).runNow()))
  }
}
