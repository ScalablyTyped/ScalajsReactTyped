package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access information about a cell that is mergeable with other sells.
  * @see com.sun.star.table.Cell
  */
trait XMergeableCell
  extends StObject
     with XCell {
  
  /** returns the number of rows this cell spans. */
  val ColumnSpan: Double
  
  /** returns the number of columns this cell spans. */
  val RowSpan: Double
  
  /** returns the number of rows this cell spans. */
  def getColumnSpan(): Double
  
  /** returns the number of columns this cell spans. */
  def getRowSpan(): Double
  
  /** returns `TRUE` if this cell is merged with another cell. */
  def isMerged(): Boolean
}
object XMergeableCell {
  
  inline def apply(
    ColumnSpan: Double,
    Error: Double,
    Formula: String,
    RowSpan: Double,
    Type: CellContentType,
    Value: Double,
    acquire: Callback,
    getColumnSpan: CallbackTo[Double],
    getError: CallbackTo[Double],
    getFormula: CallbackTo[String],
    getRowSpan: CallbackTo[Double],
    getType: CallbackTo[CellContentType],
    getValue: CallbackTo[Double],
    isMerged: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setFormula: String => Callback,
    setValue: Double => Callback
  ): XMergeableCell = {
    val __obj = js.Dynamic.literal(ColumnSpan = ColumnSpan.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], RowSpan = RowSpan.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = acquire.toJsFn, getColumnSpan = getColumnSpan.toJsFn, getError = getError.toJsFn, getFormula = getFormula.toJsFn, getRowSpan = getRowSpan.toJsFn, getType = getType.toJsFn, getValue = getValue.toJsFn, isMerged = isMerged.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFormula = js.Any.fromFunction1((t0: String) => setFormula(t0).runNow()), setValue = js.Any.fromFunction1((t0: Double) => setValue(t0).runNow()))
    __obj.asInstanceOf[XMergeableCell]
  }
  
  extension [Self <: XMergeableCell](x: Self) {
    
    inline def setColumnSpan(value: Double): Self = StObject.set(x, "ColumnSpan", value.asInstanceOf[js.Any])
    
    inline def setGetColumnSpan(value: CallbackTo[Double]): Self = StObject.set(x, "getColumnSpan", value.toJsFn)
    
    inline def setGetRowSpan(value: CallbackTo[Double]): Self = StObject.set(x, "getRowSpan", value.toJsFn)
    
    inline def setIsMerged(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMerged", value.toJsFn)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "RowSpan", value.asInstanceOf[js.Any])
  }
}
