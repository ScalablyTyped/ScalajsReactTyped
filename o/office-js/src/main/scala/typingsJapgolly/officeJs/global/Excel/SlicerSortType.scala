package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the slicer sort behavior for `Slicer.sortBy`.
  *
  * @remarks
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.SlicerSortType")
@js.native
object SlicerSortType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.SlicerSortType & String] = js.native
  
  /* "Ascending" */ val ascending: typingsJapgolly.officeJs.Excel.SlicerSortType.ascending & String = js.native
  
  /* "DataSourceOrder" */ val dataSourceOrder: typingsJapgolly.officeJs.Excel.SlicerSortType.dataSourceOrder & String = js.native
  
  /* "Descending" */ val descending: typingsJapgolly.officeJs.Excel.SlicerSortType.descending & String = js.native
}
