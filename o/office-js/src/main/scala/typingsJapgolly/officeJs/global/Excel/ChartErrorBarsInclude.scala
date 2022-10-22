package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents which parts of the error bar to include.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartErrorBarsInclude")
@js.native
object ChartErrorBarsInclude extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.ChartErrorBarsInclude & String] = js.native
  
  /* "Both" */ val both: typingsJapgolly.officeJs.Excel.ChartErrorBarsInclude.both & String = js.native
  
  /* "MinusValues" */ val minusValues: typingsJapgolly.officeJs.Excel.ChartErrorBarsInclude.minusValues & String = js.native
  
  /* "PlusValues" */ val plusValues: typingsJapgolly.officeJs.Excel.ChartErrorBarsInclude.plusValues & String = js.native
}
