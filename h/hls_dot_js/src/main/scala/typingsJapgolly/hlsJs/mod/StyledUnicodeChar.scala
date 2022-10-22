package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Unicode character with styling and background.
  * @constructor
  */
trait StyledUnicodeChar extends StObject {
  
  def copy(newChar: StyledUnicodeChar): Unit
  
  def equals(other: StyledUnicodeChar): Boolean
  
  def isEmpty(): Boolean
  
  var penState: PenState
  
  def reset(): Unit
  
  def setChar(uchar: String, newPenState: PenState): Unit
  
  def setPenState(newPenState: PenState): Unit
  
  var uchar: String
}
object StyledUnicodeChar {
  
  inline def apply(
    copy: StyledUnicodeChar => Callback,
    equals_ : StyledUnicodeChar => Boolean,
    isEmpty: CallbackTo[Boolean],
    penState: PenState,
    reset: Callback,
    setChar: (String, PenState) => Callback,
    setPenState: PenState => Callback,
    uchar: String
  ): StyledUnicodeChar = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1((t0: StyledUnicodeChar) => copy(t0).runNow()), isEmpty = isEmpty.toJsFn, penState = penState.asInstanceOf[js.Any], reset = reset.toJsFn, setChar = js.Any.fromFunction2((t0: String, t1: PenState) => (setChar(t0, t1)).runNow()), setPenState = js.Any.fromFunction1((t0: PenState) => setPenState(t0).runNow()), uchar = uchar.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[StyledUnicodeChar]
  }
  
  extension [Self <: StyledUnicodeChar](x: Self) {
    
    inline def setCopy(value: StyledUnicodeChar => Callback): Self = StObject.set(x, "copy", js.Any.fromFunction1((t0: StyledUnicodeChar) => value(t0).runNow()))
    
    inline def setEquals_(value: StyledUnicodeChar => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setPenState(value: PenState): Self = StObject.set(x, "penState", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSetChar(value: (String, PenState) => Callback): Self = StObject.set(x, "setChar", js.Any.fromFunction2((t0: String, t1: PenState) => (value(t0, t1)).runNow()))
    
    inline def setSetPenState(value: PenState => Callback): Self = StObject.set(x, "setPenState", js.Any.fromFunction1((t0: PenState) => value(t0).runNow()))
    
    inline def setUchar(value: String): Self = StObject.set(x, "uchar", value.asInstanceOf[js.Any])
  }
}
