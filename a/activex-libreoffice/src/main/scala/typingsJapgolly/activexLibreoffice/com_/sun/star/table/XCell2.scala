package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends {@link XCell} methods to access the contents of a cell in a table.
  * @see com.sun.star.table.Cell
  */
trait XCell2
  extends StObject
     with XCell {
  
  /**
    * sets a formula result into the cell.
    *
    * When assigned, the formula cell's result will be set to this value and will not be calculated - unless a HardRecalc is executed.
    */
  def setFormulaResult(nValue: Double): Unit
  
  /**
    * sets a formula string into the cell.
    *
    * When assigned, the formula is set into the string. But is not compiled, tokenized or calculated. Its useful when loading a document and {@link
    * setFormulaResult()} is used. Otherwise it is compiled on trying to fetch a result value.
    */
  def setFormulaString(aFormula: String): Unit
}
object XCell2 {
  
  inline def apply(
    Error: Double,
    Formula: String,
    Type: CellContentType,
    Value: Double,
    acquire: Callback,
    getError: CallbackTo[Double],
    getFormula: CallbackTo[String],
    getType: CallbackTo[CellContentType],
    getValue: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setFormula: String => Callback,
    setFormulaResult: Double => Callback,
    setFormulaString: String => Callback,
    setValue: Double => Callback
  ): XCell2 = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = acquire.toJsFn, getError = getError.toJsFn, getFormula = getFormula.toJsFn, getType = getType.toJsFn, getValue = getValue.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFormula = js.Any.fromFunction1((t0: String) => setFormula(t0).runNow()), setFormulaResult = js.Any.fromFunction1((t0: Double) => setFormulaResult(t0).runNow()), setFormulaString = js.Any.fromFunction1((t0: String) => setFormulaString(t0).runNow()), setValue = js.Any.fromFunction1((t0: Double) => setValue(t0).runNow()))
    __obj.asInstanceOf[XCell2]
  }
  
  extension [Self <: XCell2](x: Self) {
    
    inline def setSetFormulaResult(value: Double => Callback): Self = StObject.set(x, "setFormulaResult", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetFormulaString(value: String => Callback): Self = StObject.set(x, "setFormulaString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
