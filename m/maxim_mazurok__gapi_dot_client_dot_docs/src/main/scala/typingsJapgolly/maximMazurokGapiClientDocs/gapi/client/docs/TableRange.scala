package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRange extends StObject {
  
  /** The column span of the table range. */
  var columnSpan: js.UndefOr[Double] = js.undefined
  
  /** The row span of the table range. */
  var rowSpan: js.UndefOr[Double] = js.undefined
  
  /** The cell location where the table range starts. */
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.undefined
}
object TableRange {
  
  inline def apply(): TableRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRange]
  }
  
  extension [Self <: TableRange](x: Self) {
    
    inline def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
    
    inline def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setTableCellLocation(value: TableCellLocation): Self = StObject.set(x, "tableCellLocation", value.asInstanceOf[js.Any])
    
    inline def setTableCellLocationUndefined: Self = StObject.set(x, "tableCellLocation", js.undefined)
  }
}
