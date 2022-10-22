package typingsJapgolly.nodeSass.mod.types

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Number
  extends StObject
     with Value {
  
  def getUnit(): java.lang.String
  
  def getValue(): Double
  
  def setUnit(u: java.lang.String): Unit
  
  def setValue(n: Double): Unit
}
object Number {
  
  @JSImport("node-sass", "types.Number")
  @js.native
  val ^ : NumberConstructor = js.native
  
  extension [Self <: Number](x: Self) {
    
    inline def setGetUnit(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getUnit", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[Double]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setSetUnit(value: java.lang.String => Callback): Self = StObject.set(x, "setUnit", js.Any.fromFunction1((t0: java.lang.String) => value(t0).runNow()))
    
    inline def setSetValue(value: Double => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
