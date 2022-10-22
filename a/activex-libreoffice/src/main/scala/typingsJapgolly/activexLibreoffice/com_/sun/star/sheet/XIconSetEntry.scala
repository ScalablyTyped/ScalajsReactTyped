package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XIconSetEntry extends StObject {
  
  var Formula: String
  
  /** See com.sun.star.sheet.IconSetEntryType for possible values. */
  var Type: Double
  
  def getFormula(): String
  
  /** See com.sun.star.sheet.IconSetEntryType for possible values. */
  def getType(): Double
  
  def setFormula(Formula: String): Unit
  
  /** See com.sun.star.sheet.IconSetEntryType for possible values. */
  def setType(Type: Double): Unit
}
object XIconSetEntry {
  
  inline def apply(
    Formula: String,
    Type: Double,
    getFormula: CallbackTo[String],
    getType: CallbackTo[Double],
    setFormula: String => Callback,
    setType: Double => Callback
  ): XIconSetEntry = {
    val __obj = js.Dynamic.literal(Formula = Formula.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], getFormula = getFormula.toJsFn, getType = getType.toJsFn, setFormula = js.Any.fromFunction1((t0: String) => setFormula(t0).runNow()), setType = js.Any.fromFunction1((t0: Double) => setType(t0).runNow()))
    __obj.asInstanceOf[XIconSetEntry]
  }
  
  extension [Self <: XIconSetEntry](x: Self) {
    
    inline def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    inline def setGetFormula(value: CallbackTo[String]): Self = StObject.set(x, "getFormula", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[Double]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setSetFormula(value: String => Callback): Self = StObject.set(x, "setFormula", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetType(value: Double => Callback): Self = StObject.set(x, "setType", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
