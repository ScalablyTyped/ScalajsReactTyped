package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains options which define how the dashboard item is exported to Excel format.
  */
trait ExcelFormatOptions extends StObject {
  
  /** @deprecated The ExcelFormatOptions.CsvValueSeparator property is obsolete now. Use the DashboardExcelExportOptions.CsvValueSeparator property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets a character used to separate values in a CSV document.
    */
  var CsvValueSeparator: String
  
  /** @deprecated The ExcelFormatOptions.Format property is obsolete now. Use the DashboardExcelExportOptions.Format property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the Excel format in which the dashboard item is exported.
    */
  var Format: String
}
object ExcelFormatOptions {
  
  inline def apply(CsvValueSeparator: String, Format: String): ExcelFormatOptions = {
    val __obj = js.Dynamic.literal(CsvValueSeparator = CsvValueSeparator.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelFormatOptions]
  }
  
  extension [Self <: ExcelFormatOptions](x: Self) {
    
    inline def setCsvValueSeparator(value: String): Self = StObject.set(x, "CsvValueSeparator", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
  }
}
