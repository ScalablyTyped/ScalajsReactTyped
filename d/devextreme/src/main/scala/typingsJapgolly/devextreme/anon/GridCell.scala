package typingsJapgolly.devextreme.anon

import typingsJapgolly.devextreme.mod.DevExpress.pdfExporter.Cell
import typingsJapgolly.devextreme.mod.DevExpress.pdfExporter.DataGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridCell extends StObject {
  
  var gridCell: js.UndefOr[DataGridCell] = js.undefined
  
  var pdfCell: js.UndefOr[Cell] = js.undefined
}
object GridCell {
  
  inline def apply(): GridCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridCell]
  }
  
  extension [Self <: GridCell](x: Self) {
    
    inline def setGridCell(value: DataGridCell): Self = StObject.set(x, "gridCell", value.asInstanceOf[js.Any])
    
    inline def setGridCellUndefined: Self = StObject.set(x, "gridCell", js.undefined)
    
    inline def setPdfCell(value: Cell): Self = StObject.set(x, "pdfCell", value.asInstanceOf[js.Any])
    
    inline def setPdfCellUndefined: Self = StObject.set(x, "pdfCell", js.undefined)
  }
}
