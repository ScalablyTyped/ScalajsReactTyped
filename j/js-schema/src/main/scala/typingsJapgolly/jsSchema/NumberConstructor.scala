package typingsJapgolly.jsSchema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberConstructor extends StObject {
  
  def above(n: Double): NumberConstructor
  
  def below(n: Double): NumberConstructor
  
  def max(n: Double): NumberConstructor
  
  def min(n: Double): NumberConstructor
  
  def step(n: Double): NumberConstructor
}
object NumberConstructor {
  
  inline def apply(
    above: Double => NumberConstructor,
    below: Double => NumberConstructor,
    max: Double => NumberConstructor,
    min: Double => NumberConstructor,
    step: Double => NumberConstructor
  ): NumberConstructor = {
    val __obj = js.Dynamic.literal(above = js.Any.fromFunction1(above), below = js.Any.fromFunction1(below), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), step = js.Any.fromFunction1(step))
    __obj.asInstanceOf[NumberConstructor]
  }
  
  extension [Self <: NumberConstructor](x: Self) {
    
    inline def setAbove(value: Double => NumberConstructor): Self = StObject.set(x, "above", js.Any.fromFunction1(value))
    
    inline def setBelow(value: Double => NumberConstructor): Self = StObject.set(x, "below", js.Any.fromFunction1(value))
    
    inline def setMax(value: Double => NumberConstructor): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMin(value: Double => NumberConstructor): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setStep(value: Double => NumberConstructor): Self = StObject.set(x, "step", js.Any.fromFunction1(value))
  }
}
