package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains options which define how the dashboard item is exported to Excel format.
  */
@JSGlobal("ExcelFormatOptions")
@js.native
open class ExcelFormatOptions ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ExcelFormatOptions {
  
  /** @deprecated The ExcelFormatOptions.CsvValueSeparator property is obsolete now. Use the DashboardExcelExportOptions.CsvValueSeparator property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets a character used to separate values in a CSV document.
    */
  /* CompleteClass */
  var CsvValueSeparator: String = js.native
  
  /** @deprecated The ExcelFormatOptions.Format property is obsolete now. Use the DashboardExcelExportOptions.Format property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the Excel format in which the dashboard item is exported.
    */
  /* CompleteClass */
  var Format: String = js.native
}
