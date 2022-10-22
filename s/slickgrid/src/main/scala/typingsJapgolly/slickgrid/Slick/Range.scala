package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  /***
    * Returns whether a range contains a given cell.
    * @method contains
    * @param row {Integer}
    * @param cell {Integer}
    * @return {Boolean}
    */
  def contains(row: Double, cell: Double): Boolean
  
  /***
    * @property fromCell
    * @type {Integer}
    */
  var fromCell: Double
  
  /***
    * @property fromRow
    * @type {Integer}
    */
  var fromRow: Double
  
  /***
    * Returns whether a range represents a single cell.
    * @method isSingleCell
    * @return {Boolean}
    */
  def isSingleCell(): Boolean
  
  /***
    * Returns whether a range represents a single row.
    * @method isSingleRow
    * @return {Boolean}
    */
  def isSingleRow(): Boolean
  
  /***
    * @property toCell
    * @type {Integer}
    */
  var toCell: Double
  
  /***
    * @property toRow
    * @type {Integer}
    */
  var toRow: Double
}
object Range {
  
  inline def apply(
    contains: (Double, Double) => Boolean,
    fromCell: Double,
    fromRow: Double,
    isSingleCell: CallbackTo[Boolean],
    isSingleRow: CallbackTo[Boolean],
    toCell: Double,
    toRow: Double
  ): Range = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), fromCell = fromCell.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], isSingleCell = isSingleCell.toJsFn, isSingleRow = isSingleRow.toJsFn, toCell = toCell.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setContains(value: (Double, Double) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
    
    inline def setFromCell(value: Double): Self = StObject.set(x, "fromCell", value.asInstanceOf[js.Any])
    
    inline def setFromRow(value: Double): Self = StObject.set(x, "fromRow", value.asInstanceOf[js.Any])
    
    inline def setIsSingleCell(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSingleCell", value.toJsFn)
    
    inline def setIsSingleRow(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSingleRow", value.toJsFn)
    
    inline def setToCell(value: Double): Self = StObject.set(x, "toCell", value.asInstanceOf[js.Any])
    
    inline def setToRow(value: Double): Self = StObject.set(x, "toRow", value.asInstanceOf[js.Any])
  }
}
