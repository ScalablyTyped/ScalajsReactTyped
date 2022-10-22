package typingsJapgolly.officeJs.global.Excel

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
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.LoadToType & String] = js.native
  
  /* "ConnectionOnly" */ val connectionOnly: typingsJapgolly.officeJs.Excel.LoadToType.connectionOnly & String = js.native
  
  /* "PivotChart" */ val pivotChart: typingsJapgolly.officeJs.Excel.LoadToType.pivotChart & String = js.native
  
  /* "PivotTable" */ val pivotTable: typingsJapgolly.officeJs.Excel.LoadToType.pivotTable & String = js.native
  
  /* "Table" */ val table: typingsJapgolly.officeJs.Excel.LoadToType.table & String = js.native
}
