package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to represent a value that can be an <angle> or <number> value. An SVGAngle reflected through the animVal attribute is always read only. */
trait SVGAngle extends StObject {
  
  /* standard dom */
  val SVG_ANGLETYPE_DEG: Double
  
  /* standard dom */
  val SVG_ANGLETYPE_GRAD: Double
  
  /* standard dom */
  val SVG_ANGLETYPE_RAD: Double
  
  /* standard dom */
  val SVG_ANGLETYPE_UNKNOWN: Double
  
  /* standard dom */
  val SVG_ANGLETYPE_UNSPECIFIED: Double
  
  /* standard dom */
  def convertToSpecifiedUnits(unitType: Double): Unit
  
  /* standard dom */
  def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit
  
  /* standard dom */
  val unitType: Double
  
  /* standard dom */
  var value: Double
  
  /* standard dom */
  var valueAsString: java.lang.String
  
  /* standard dom */
  var valueInSpecifiedUnits: Double
}
object SVGAngle {
  
  inline def apply(
    SVG_ANGLETYPE_DEG: Double,
    SVG_ANGLETYPE_GRAD: Double,
    SVG_ANGLETYPE_RAD: Double,
    SVG_ANGLETYPE_UNKNOWN: Double,
    SVG_ANGLETYPE_UNSPECIFIED: Double,
    convertToSpecifiedUnits: Double => Callback,
    newValueSpecifiedUnits: (Double, Double) => Callback,
    unitType: Double,
    value: Double,
    valueAsString: java.lang.String,
    valueInSpecifiedUnits: Double
  ): SVGAngle = {
    val __obj = js.Dynamic.literal(SVG_ANGLETYPE_DEG = SVG_ANGLETYPE_DEG.asInstanceOf[js.Any], SVG_ANGLETYPE_GRAD = SVG_ANGLETYPE_GRAD.asInstanceOf[js.Any], SVG_ANGLETYPE_RAD = SVG_ANGLETYPE_RAD.asInstanceOf[js.Any], SVG_ANGLETYPE_UNKNOWN = SVG_ANGLETYPE_UNKNOWN.asInstanceOf[js.Any], SVG_ANGLETYPE_UNSPECIFIED = SVG_ANGLETYPE_UNSPECIFIED.asInstanceOf[js.Any], convertToSpecifiedUnits = js.Any.fromFunction1((t0: Double) => convertToSpecifiedUnits(t0).runNow()), newValueSpecifiedUnits = js.Any.fromFunction2((t0: Double, t1: Double) => (newValueSpecifiedUnits(t0, t1)).runNow()), unitType = unitType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any], valueInSpecifiedUnits = valueInSpecifiedUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAngle]
  }
  
  extension [Self <: SVGAngle](x: Self) {
    
    inline def setConvertToSpecifiedUnits(value: Double => Callback): Self = StObject.set(x, "convertToSpecifiedUnits", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setNewValueSpecifiedUnits(value: (Double, Double) => Callback): Self = StObject.set(x, "newValueSpecifiedUnits", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSVG_ANGLETYPE_DEG(value: Double): Self = StObject.set(x, "SVG_ANGLETYPE_DEG", value.asInstanceOf[js.Any])
    
    inline def setSVG_ANGLETYPE_GRAD(value: Double): Self = StObject.set(x, "SVG_ANGLETYPE_GRAD", value.asInstanceOf[js.Any])
    
    inline def setSVG_ANGLETYPE_RAD(value: Double): Self = StObject.set(x, "SVG_ANGLETYPE_RAD", value.asInstanceOf[js.Any])
    
    inline def setSVG_ANGLETYPE_UNKNOWN(value: Double): Self = StObject.set(x, "SVG_ANGLETYPE_UNKNOWN", value.asInstanceOf[js.Any])
    
    inline def setSVG_ANGLETYPE_UNSPECIFIED(value: Double): Self = StObject.set(x, "SVG_ANGLETYPE_UNSPECIFIED", value.asInstanceOf[js.Any])
    
    inline def setUnitType(value: Double): Self = StObject.set(x, "unitType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueAsString(value: java.lang.String): Self = StObject.set(x, "valueAsString", value.asInstanceOf[js.Any])
    
    inline def setValueInSpecifiedUnits(value: Double): Self = StObject.set(x, "valueInSpecifiedUnits", value.asInstanceOf[js.Any])
  }
}
