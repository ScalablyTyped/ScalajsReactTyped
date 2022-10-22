package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains a cell address within a spreadsheet document. */
trait CellAddress extends StObject {
  
  /** is the index of the column where the cell is located. */
  var Column: Double
  
  /** is the index of the row where the cell is located. */
  var Row: Double
  
  /** is the index of the sheet that contains the cell. */
  var Sheet: Double
}
object CellAddress {
  
  inline def apply(Column: Double, Row: Double, Sheet: Double): CellAddress = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellAddress]
  }
  
  extension [Self <: CellAddress](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
    
    inline def setSheet(value: Double): Self = StObject.set(x, "Sheet", value.asInstanceOf[js.Any])
  }
}
