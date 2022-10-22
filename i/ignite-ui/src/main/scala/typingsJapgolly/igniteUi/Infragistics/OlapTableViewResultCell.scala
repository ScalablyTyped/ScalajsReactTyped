package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapTableViewResultCell extends StObject {
  
  /**
    * Returns the ordinal of this cell used to determine its position into the data cells' grid.
    */
  def cellOrdinal(): Double
  
  /**
    * Returns the formmated value to be displayed by the data cell.
    */
  def formattedValue(): String
  
  /**
    * Returns the index of $.ig.Cell object in $.ig.OlapResult object.
    */
  def resultCellIndex(): Double
  
  /**
    * Returns the value provided by $.ig.Cell object.
    */
  def value(): js.Object
}
object OlapTableViewResultCell {
  
  inline def apply(
    cellOrdinal: CallbackTo[Double],
    formattedValue: CallbackTo[String],
    resultCellIndex: CallbackTo[Double],
    value: CallbackTo[js.Object]
  ): OlapTableViewResultCell = {
    val __obj = js.Dynamic.literal(cellOrdinal = cellOrdinal.toJsFn, formattedValue = formattedValue.toJsFn, resultCellIndex = resultCellIndex.toJsFn, value = value.toJsFn)
    __obj.asInstanceOf[OlapTableViewResultCell]
  }
  
  extension [Self <: OlapTableViewResultCell](x: Self) {
    
    inline def setCellOrdinal(value: CallbackTo[Double]): Self = StObject.set(x, "cellOrdinal", value.toJsFn)
    
    inline def setFormattedValue(value: CallbackTo[String]): Self = StObject.set(x, "formattedValue", value.toJsFn)
    
    inline def setResultCellIndex(value: CallbackTo[Double]): Self = StObject.set(x, "resultCellIndex", value.toJsFn)
    
    inline def setValue(value: CallbackTo[js.Object]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
