package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the type of the category axis.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisCategoryType")
@js.native
object ChartAxisCategoryType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.ChartAxisCategoryType & String] = js.native
  
  /* "Automatic" */ val automatic: typingsJapgolly.officeJs.Excel.ChartAxisCategoryType.automatic & String = js.native
  
  /* "DateAxis" */ val dateAxis: typingsJapgolly.officeJs.Excel.ChartAxisCategoryType.dateAxis & String = js.native
  
  /* "TextAxis" */ val textAxis: typingsJapgolly.officeJs.Excel.ChartAxisCategoryType.textAxis & String = js.native
}
