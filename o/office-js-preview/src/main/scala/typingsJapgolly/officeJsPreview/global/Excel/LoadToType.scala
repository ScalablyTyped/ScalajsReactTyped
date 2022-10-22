package typingsJapgolly.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An enum that specifies the query load to destination.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
@JSGlobal("Excel.LoadToType")
@js.native
object LoadToType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Excel.LoadToType & String] = js.native
  
  /* "ConnectionOnly" */ val connectionOnly: typingsJapgolly.officeJsPreview.Excel.LoadToType.connectionOnly & String = js.native
  
  /* "PivotChart" */ val pivotChart: typingsJapgolly.officeJsPreview.Excel.LoadToType.pivotChart & String = js.native
  
  /* "PivotTable" */ val pivotTable: typingsJapgolly.officeJsPreview.Excel.LoadToType.pivotTable & String = js.native
  
  /* "Table" */ val table: typingsJapgolly.officeJsPreview.Excel.LoadToType.table & String = js.native
}
