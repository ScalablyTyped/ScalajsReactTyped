package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XColorScaleEntry extends StObject {
  
  var Color: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
  
  var Formula: String
  
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  var Type: Double
  
  def getColor(): Color
  
  def getFormula(): String
  
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  def getType(): Double
  
  def setColor(Color: Color): Unit
  
  def setFormula(Formula: String): Unit
  
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  def setType(Type: Double): Unit
}
object XColorScaleEntry {
  
  inline def apply(
    Color: Color,
    Formula: String,
    Type: Double,
    getColor: CallbackTo[Color],
    getFormula: CallbackTo[String],
    getType: CallbackTo[Double],
    setColor: Color => Callback,
    setFormula: String => Callback,
    setType: Double => Callback
  ): XColorScaleEntry = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], getColor = getColor.toJsFn, getFormula = getFormula.toJsFn, getType = getType.toJsFn, setColor = js.Any.fromFunction1((t0: Color) => setColor(t0).runNow()), setFormula = js.Any.fromFunction1((t0: String) => setFormula(t0).runNow()), setType = js.Any.fromFunction1((t0: Double) => setType(t0).runNow()))
    __obj.asInstanceOf[XColorScaleEntry]
  }
  
  extension [Self <: XColorScaleEntry](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    inline def setGetColor(value: CallbackTo[Color]): Self = StObject.set(x, "getColor", value.toJsFn)
    
    inline def setGetFormula(value: CallbackTo[String]): Self = StObject.set(x, "getFormula", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[Double]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setSetColor(value: Color => Callback): Self = StObject.set(x, "setColor", js.Any.fromFunction1((t0: Color) => value(t0).runNow()))
    
    inline def setSetFormula(value: String => Callback): Self = StObject.set(x, "setFormula", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetType(value: Double => Callback): Self = StObject.set(x, "setType", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
