package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlColor extends StObject {
  
  /**
    * Returns the color of an object.
    */
  def get(): String
  
  /**
    * opacity value
    */
  def getA(): Double
  
  /**
    * blue numerical value
    */
  def getB(): Double
  
  /**
    * green numerical value
    */
  def getG(): Double
  
  /**
    * red numerical value
    */
  def getR(): Double
  
  /**
    * Set the color of an object.
    */
  def set(color: String): Unit
  
  /**
    * opacity value
    */
  def setA(a: Double): Unit
  
  /**
    * blue numerical value
    */
  def setB(b: Double): Unit
  
  /**
    * green numerical value
    */
  def setG(g: Double): Unit
  
  /**
    * red numerical value
    */
  def setR(r: Double): Unit
}
object KmlColor {
  
  inline def apply(
    get: CallbackTo[String],
    getA: CallbackTo[Double],
    getB: CallbackTo[Double],
    getG: CallbackTo[Double],
    getR: CallbackTo[Double],
    set: String => Callback,
    setA: Double => Callback,
    setB: Double => Callback,
    setG: Double => Callback,
    setR: Double => Callback
  ): KmlColor = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, getA = getA.toJsFn, getB = getB.toJsFn, getG = getG.toJsFn, getR = getR.toJsFn, set = js.Any.fromFunction1((t0: String) => set(t0).runNow()), setA = js.Any.fromFunction1((t0: Double) => setA(t0).runNow()), setB = js.Any.fromFunction1((t0: Double) => setB(t0).runNow()), setG = js.Any.fromFunction1((t0: Double) => setG(t0).runNow()), setR = js.Any.fromFunction1((t0: Double) => setR(t0).runNow()))
    __obj.asInstanceOf[KmlColor]
  }
  
  extension [Self <: KmlColor](x: Self) {
    
    inline def setGet(value: CallbackTo[String]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setGetA(value: CallbackTo[Double]): Self = StObject.set(x, "getA", value.toJsFn)
    
    inline def setGetB(value: CallbackTo[Double]): Self = StObject.set(x, "getB", value.toJsFn)
    
    inline def setGetG(value: CallbackTo[Double]): Self = StObject.set(x, "getG", value.toJsFn)
    
    inline def setGetR(value: CallbackTo[Double]): Self = StObject.set(x, "getR", value.toJsFn)
    
    inline def setSet(value: String => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetA(value: Double => Callback): Self = StObject.set(x, "setA", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetB(value: Double => Callback): Self = StObject.set(x, "setB", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetG(value: Double => Callback): Self = StObject.set(x, "setG", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetR(value: Double => Callback): Self = StObject.set(x, "setR", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
