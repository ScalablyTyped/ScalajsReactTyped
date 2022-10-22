package typingsJapgolly.devextreme.mod.default

import typingsJapgolly.devextreme.mod.DevExpress.core.utils.DxPromise
import typingsJapgolly.devextreme.mod.DevExpress.excelExporter.CellRange
import typingsJapgolly.devextreme.mod.DevExpress.excelExporter.ExcelExportDataGridProps
import typingsJapgolly.devextreme.mod.DevExpress.excelExporter.ExcelExportPivotGridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object excelExporter {
  
  @JSImport("devextreme", "default.excelExporter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def exportDataGrid(options: ExcelExportDataGridProps): DxPromise[CellRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportDataGrid")(options.asInstanceOf[js.Any]).asInstanceOf[DxPromise[CellRange]]
  
  inline def exportPivotGrid(options: ExcelExportPivotGridProps): DxPromise[CellRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportPivotGrid")(options.asInstanceOf[js.Any]).asInstanceOf[DxPromise[CellRange]]
}
