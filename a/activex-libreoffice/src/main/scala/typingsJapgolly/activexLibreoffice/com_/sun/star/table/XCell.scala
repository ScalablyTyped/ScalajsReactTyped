package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the contents of a cell in a table.
  * @see com.sun.star.table.Cell
  */
trait XCell
  extends StObject
     with XInterface {
  
  /**
    * returns the error value of the cell.
    *
    * If the cell does not contain a formula, the error is always zero.
    */
  val Error: Double
  
  /**
    * returns the formula string of a cell.
    *
    * Even if the cell does not contain a formula, an assignment of this attribute's value to another cell's formula attribute would create the same cell
    * content. This is because this attribute contains the original text value of a string cell. The value of a **value cell** will be formatted using the
    * number format's default format or the formula string, including "=", of a formula cell.
    */
  var Formula: String
  
  /** returns the type of the cell. */
  val Type: CellContentType
  
  /**
    * returns the floating point value of the cell.
    *
    * For a **value cell** the value is returned, for a **string cell** zero is returned and for a **formula cell** the result value of a formula is
    * returned.
    */
  var Value: Double
  
  /**
    * returns the error value of the cell.
    *
    * If the cell does not contain a formula, the error is always zero.
    */
  def getError(): Double
  
  /**
    * returns the formula string of a cell.
    *
    * Even if the cell does not contain a formula, an assignment of this attribute's value to another cell's formula attribute would create the same cell
    * content. This is because this attribute contains the original text value of a string cell. The value of a **value cell** will be formatted using the
    * number format's default format or the formula string, including "=", of a formula cell.
    */
  def getFormula(): String
  
  /** returns the type of the cell. */
  def getType(): CellContentType
  
  /**
    * returns the floating point value of the cell.
    *
    * For a **value cell** the value is returned, for a **string cell** zero is returned and for a **formula cell** the result value of a formula is
    * returned.
    */
  def getValue(): Double
  
  /**
    * sets a formula into the cell.
    *
    * When assigned, the string will be interpreted and a value, text or formula cell is created, depending on the text and the number format.
    */
  def setFormula(aFormula: String): Unit
  
  /**
    * sets a floating point value into the cell.
    *
    * After a call to this method the type of the cell is CellContentType::VALUE.
    */
  def setValue(nValue: Double): Unit
}
object XCell {
  
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
    setValue: Double => Callback
  ): XCell = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = acquire.toJsFn, getError = getError.toJsFn, getFormula = getFormula.toJsFn, getType = getType.toJsFn, getValue = getValue.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFormula = js.Any.fromFunction1((t0: String) => setFormula(t0).runNow()), setValue = js.Any.fromFunction1((t0: Double) => setValue(t0).runNow()))
    __obj.asInstanceOf[XCell]
  }
  
  extension [Self <: XCell](x: Self) {
    
    inline def setError(value: Double): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    inline def setGetError(value: CallbackTo[Double]): Self = StObject.set(x, "getError", value.toJsFn)
    
    inline def setGetFormula(value: CallbackTo[String]): Self = StObject.set(x, "getFormula", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[CellContentType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[Double]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setSetFormula(value: String => Callback): Self = StObject.set(x, "setFormula", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetValue(value: Double => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setType(value: CellContentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
