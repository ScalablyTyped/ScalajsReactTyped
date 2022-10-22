package typingsJapgolly.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple enum for top/bottom filters to select whether to filter by the top N or bottom N percent, number, or sum of values.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.TopBottomSelectionType")
@js.native
object TopBottomSelectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Excel.TopBottomSelectionType & String] = js.native
  
  /* "Items" */ val items: typingsJapgolly.officeJsPreview.Excel.TopBottomSelectionType.items & String = js.native
  
  /* "Percent" */ val percent: typingsJapgolly.officeJsPreview.Excel.TopBottomSelectionType.percent & String = js.native
  
  /* "Sum" */ val sum: typingsJapgolly.officeJsPreview.Excel.TopBottomSelectionType.sum & String = js.native
}
