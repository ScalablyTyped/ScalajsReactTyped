package typingsJapgolly.reactMdForm.typesSliderTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderControls extends StObject {
  
  def decrement(): Unit
  
  def decrementJump(): Unit
  
  def increment(): Unit
  
  def incrementJump(): Unit
  
  def maximum(): Unit
  
  def minimum(): Unit
  
  def persist(): Unit
  
  var setValue: Dispatch[SetStateAction[SliderValue]]
}
object SliderControls {
  
  inline def apply(
    decrement: Callback,
    decrementJump: Callback,
    increment: Callback,
    incrementJump: Callback,
    maximum: Callback,
    minimum: Callback,
    persist: Callback,
    setValue: SetStateAction[SliderValue] => Callback
  ): SliderControls = {
    val __obj = js.Dynamic.literal(decrement = decrement.toJsFn, decrementJump = decrementJump.toJsFn, increment = increment.toJsFn, incrementJump = incrementJump.toJsFn, maximum = maximum.toJsFn, minimum = minimum.toJsFn, persist = persist.toJsFn, setValue = js.Any.fromFunction1((t0: SetStateAction[SliderValue]) => setValue(t0).runNow()))
    __obj.asInstanceOf[SliderControls]
  }
  
  extension [Self <: SliderControls](x: Self) {
    
    inline def setDecrement(value: Callback): Self = StObject.set(x, "decrement", value.toJsFn)
    
    inline def setDecrementJump(value: Callback): Self = StObject.set(x, "decrementJump", value.toJsFn)
    
    inline def setIncrement(value: Callback): Self = StObject.set(x, "increment", value.toJsFn)
    
    inline def setIncrementJump(value: Callback): Self = StObject.set(x, "incrementJump", value.toJsFn)
    
    inline def setMaximum(value: Callback): Self = StObject.set(x, "maximum", value.toJsFn)
    
    inline def setMinimum(value: Callback): Self = StObject.set(x, "minimum", value.toJsFn)
    
    inline def setPersist(value: Callback): Self = StObject.set(x, "persist", value.toJsFn)
    
    inline def setSetValue(value: SetStateAction[SliderValue] => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: SetStateAction[SliderValue]) => value(t0).runNow()))
  }
}
