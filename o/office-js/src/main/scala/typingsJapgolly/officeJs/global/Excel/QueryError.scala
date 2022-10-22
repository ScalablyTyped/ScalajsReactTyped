package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An enum that specifies the query load error message.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
@JSGlobal("Excel.QueryError")
@js.native
object QueryError extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.QueryError & String] = js.native
  
  /* "FailedDownload" */ val failedDownload: typingsJapgolly.officeJs.Excel.QueryError.failedDownload & String = js.native
  
  /* "FailedLoadToDataModel" */ val failedLoadToDataModel: typingsJapgolly.officeJs.Excel.QueryError.failedLoadToDataModel & String = js.native
  
  /* "FailedLoadToWorksheet" */ val failedLoadToWorksheet: typingsJapgolly.officeJs.Excel.QueryError.failedLoadToWorksheet & String = js.native
  
  /* "FailedToCompleteDownload" */ val failedToCompleteDownload: typingsJapgolly.officeJs.Excel.QueryError.failedToCompleteDownload & String = js.native
  
  /* "None" */ val none: typingsJapgolly.officeJs.Excel.QueryError.none & String = js.native
  
  /* "Unknown" */ val unknown: typingsJapgolly.officeJs.Excel.QueryError.unknown & String = js.native
}
