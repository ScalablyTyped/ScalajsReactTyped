package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the data validation error alert style. The default is `Stop`.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationAlertStyle")
@js.native
object DataValidationAlertStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.DataValidationAlertStyle & String] = js.native
  
  /* "Information" */ val information: typingsJapgolly.officeJs.Excel.DataValidationAlertStyle.information & String = js.native
  
  /* "Stop" */ val stop: typingsJapgolly.officeJs.Excel.DataValidationAlertStyle.stop & String = js.native
  
  /* "Warning" */ val warning: typingsJapgolly.officeJs.Excel.DataValidationAlertStyle.warning & String = js.native
}
