package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlVec2 extends StObject {
  
  /**
    * Indicates the x coordinate.
    */
  def getX(): Double
  
  /**
    * Units in which the x value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIXELS
    * * GEPlugin.UNITS_INSET_PIXELS
    */
  def getXUnits(): KmlUnitsEnum
  
  /**
    * Indicates the y coordinate.
    */
  def getY(): Double
  
  /**
    * Units in which the y value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIyELS
    * * GEPlugin.UNITS_INSET_PIyELS
    */
  def getYUnits(): KmlUnitsEnum
  
  /**
    * Sets the coordinates of the vector.
    */
  def set(x: Double, xUnits: KmlUnitsEnum, y: Double, yUnits: KmlUnitsEnum): Unit
  
  /**
    * Indicates the x coordinate.
    */
  def setX(x: Double): Unit
  
  /**
    * Units in which the x value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIXELS
    * * GEPlugin.UNITS_INSET_PIXELS
    */
  def setXUnits(xUnits: KmlUnitsEnum): Unit
  
  /**
    * Indicates the y coordinate.
    */
  def setY(y: Double): Unit
  
  /**
    * Units in which the y value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIyELS
    * * GEPlugin.UNITS_INSET_PIyELS
    */
  def setYUnits(xUnits: KmlUnitsEnum): Unit
}
object KmlVec2 {
  
  inline def apply(
    getX: CallbackTo[Double],
    getXUnits: CallbackTo[KmlUnitsEnum],
    getY: CallbackTo[Double],
    getYUnits: CallbackTo[KmlUnitsEnum],
    set: (Double, KmlUnitsEnum, Double, KmlUnitsEnum) => Callback,
    setX: Double => Callback,
    setXUnits: KmlUnitsEnum => Callback,
    setY: Double => Callback,
    setYUnits: KmlUnitsEnum => Callback
  ): KmlVec2 = {
    val __obj = js.Dynamic.literal(getX = getX.toJsFn, getXUnits = getXUnits.toJsFn, getY = getY.toJsFn, getYUnits = getYUnits.toJsFn, set = js.Any.fromFunction4((t0: Double, t1: KmlUnitsEnum, t2: Double, t3: KmlUnitsEnum) => (set(t0, t1, t2, t3)).runNow()), setX = js.Any.fromFunction1((t0: Double) => setX(t0).runNow()), setXUnits = js.Any.fromFunction1((t0: KmlUnitsEnum) => setXUnits(t0).runNow()), setY = js.Any.fromFunction1((t0: Double) => setY(t0).runNow()), setYUnits = js.Any.fromFunction1((t0: KmlUnitsEnum) => setYUnits(t0).runNow()))
    __obj.asInstanceOf[KmlVec2]
  }
  
  extension [Self <: KmlVec2](x: Self) {
    
    inline def setGetX(value: CallbackTo[Double]): Self = StObject.set(x, "getX", value.toJsFn)
    
    inline def setGetXUnits(value: CallbackTo[KmlUnitsEnum]): Self = StObject.set(x, "getXUnits", value.toJsFn)
    
    inline def setGetY(value: CallbackTo[Double]): Self = StObject.set(x, "getY", value.toJsFn)
    
    inline def setGetYUnits(value: CallbackTo[KmlUnitsEnum]): Self = StObject.set(x, "getYUnits", value.toJsFn)
    
    inline def setSet(value: (Double, KmlUnitsEnum, Double, KmlUnitsEnum) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction4((t0: Double, t1: KmlUnitsEnum, t2: Double, t3: KmlUnitsEnum) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSetX(value: Double => Callback): Self = StObject.set(x, "setX", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetXUnits(value: KmlUnitsEnum => Callback): Self = StObject.set(x, "setXUnits", js.Any.fromFunction1((t0: KmlUnitsEnum) => value(t0).runNow()))
    
    inline def setSetY(value: Double => Callback): Self = StObject.set(x, "setY", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetYUnits(value: KmlUnitsEnum => Callback): Self = StObject.set(x, "setYUnits", js.Any.fromFunction1((t0: KmlUnitsEnum) => value(t0).runNow()))
  }
}
