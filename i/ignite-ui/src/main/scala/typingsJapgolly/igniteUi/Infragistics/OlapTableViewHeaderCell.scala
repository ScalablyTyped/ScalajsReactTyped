package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapTableViewHeaderCell extends StObject {
  
  /**
    * Returns the name of the axis this header cell is related to.
    */
  def axisName(): String
  
  /**
    * Returns the caption for the header cell.
    */
  def caption(): String
  
  /**
    * Returns the column index for the header cell.
    */
  def columnIndex(): Double
  
  /**
    * Returns the column span for the header cell.
    */
  def columnSpan(): Double
  
  /**
    * Indicates whether the header cell can be expanded.
    */
  def isExpanable(): Boolean
  
  /**
    * Returns the expaned state for the header cell.
    */
  def isExpanded(): Boolean
  
  /**
    * Returns the index of the axis member in the tuple this header cell is related to.
    */
  def memberIndex(): Double
  
  /**
    * Returns the row index for the header cell.
    */
  def rowIndex(): Double
  
  /**
    * Returns the row span for the header cell.
    */
  def rowSpan(): Double
  
  /**
    * Returns the index of tuple in the axis this header cell is related to.
    */
  def tupleIndex(): Double
}
object OlapTableViewHeaderCell {
  
  inline def apply(
    axisName: CallbackTo[String],
    caption: CallbackTo[String],
    columnIndex: CallbackTo[Double],
    columnSpan: CallbackTo[Double],
    isExpanable: CallbackTo[Boolean],
    isExpanded: CallbackTo[Boolean],
    memberIndex: CallbackTo[Double],
    rowIndex: CallbackTo[Double],
    rowSpan: CallbackTo[Double],
    tupleIndex: CallbackTo[Double]
  ): OlapTableViewHeaderCell = {
    val __obj = js.Dynamic.literal(axisName = axisName.toJsFn, caption = caption.toJsFn, columnIndex = columnIndex.toJsFn, columnSpan = columnSpan.toJsFn, isExpanable = isExpanable.toJsFn, isExpanded = isExpanded.toJsFn, memberIndex = memberIndex.toJsFn, rowIndex = rowIndex.toJsFn, rowSpan = rowSpan.toJsFn, tupleIndex = tupleIndex.toJsFn)
    __obj.asInstanceOf[OlapTableViewHeaderCell]
  }
  
  extension [Self <: OlapTableViewHeaderCell](x: Self) {
    
    inline def setAxisName(value: CallbackTo[String]): Self = StObject.set(x, "axisName", value.toJsFn)
    
    inline def setCaption(value: CallbackTo[String]): Self = StObject.set(x, "caption", value.toJsFn)
    
    inline def setColumnIndex(value: CallbackTo[Double]): Self = StObject.set(x, "columnIndex", value.toJsFn)
    
    inline def setColumnSpan(value: CallbackTo[Double]): Self = StObject.set(x, "columnSpan", value.toJsFn)
    
    inline def setIsExpanable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isExpanable", value.toJsFn)
    
    inline def setIsExpanded(value: CallbackTo[Boolean]): Self = StObject.set(x, "isExpanded", value.toJsFn)
    
    inline def setMemberIndex(value: CallbackTo[Double]): Self = StObject.set(x, "memberIndex", value.toJsFn)
    
    inline def setRowIndex(value: CallbackTo[Double]): Self = StObject.set(x, "rowIndex", value.toJsFn)
    
    inline def setRowSpan(value: CallbackTo[Double]): Self = StObject.set(x, "rowSpan", value.toJsFn)
    
    inline def setTupleIndex(value: CallbackTo[Double]): Self = StObject.set(x, "tupleIndex", value.toJsFn)
  }
}
