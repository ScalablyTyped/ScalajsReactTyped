package typingsJapgolly.nodeSass.mod.types

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enumerable extends StObject {
  
  def getLength(): Double
  
  def getValue(index: Double): Value
  
  def setValue(index: Double, value: Value): Unit
}
object Enumerable {
  
  inline def apply(getLength: CallbackTo[Double], getValue: Double => Value, setValue: (Double, Value) => Callback): Enumerable = {
    val __obj = js.Dynamic.literal(getLength = getLength.toJsFn, getValue = js.Any.fromFunction1(getValue), setValue = js.Any.fromFunction2((t0: Double, t1: Value) => (setValue(t0, t1)).runNow()))
    __obj.asInstanceOf[Enumerable]
  }
  
  extension [Self <: Enumerable](x: Self) {
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setGetValue(value: Double => Value): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: (Double, Value) => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction2((t0: Double, t1: Value) => (value(t0, t1)).runNow()))
  }
}
