package typingsJapgolly.nodeSass.mod.types

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color
  extends StObject
     with Value {
  
  /**
    * Get the alpha transparency component of the color.
    * @returns number between 0 and 1 inclusive;
    */
  def getA(): Double
  
  /**
    * Get the blue component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def getB(): Double
  
  /**
    * Get the green component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def getG(): Double
  
  /**
    * Get the red component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def getR(): Double
  
  /**
    * Set the alpha component of the color.
    * @param a number between 0 and 1 inclusive;
    */
  def setA(a: Double): Unit
  
  /**
    * Set the blue component of the color.
    * @param b integer between 0 and 255 inclusive;
    */
  def setB(b: Double): Unit
  
  /**
    * Set the green component of the color.
    * @param g integer between 0 and 255 inclusive;
    */
  def setG(g: Double): Unit
  
  /**
    * Set the red component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def setR(r: Double): Unit
}
object Color {
  
  @JSImport("node-sass", "types.Color")
  @js.native
  val ^ : ColorConstructor = js.native
  
  extension [Self <: Color](x: Self) {
    
    inline def setGetA(value: CallbackTo[Double]): Self = StObject.set(x, "getA", value.toJsFn)
    
    inline def setGetB(value: CallbackTo[Double]): Self = StObject.set(x, "getB", value.toJsFn)
    
    inline def setGetG(value: CallbackTo[Double]): Self = StObject.set(x, "getG", value.toJsFn)
    
    inline def setGetR(value: CallbackTo[Double]): Self = StObject.set(x, "getR", value.toJsFn)
    
    inline def setSetA(value: Double => Callback): Self = StObject.set(x, "setA", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetB(value: Double => Callback): Self = StObject.set(x, "setB", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetG(value: Double => Callback): Self = StObject.set(x, "setG", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetR(value: Double => Callback): Self = StObject.set(x, "setR", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
