package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Day
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Hour
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Minute
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Month
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Second
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents how to filter a date when filtering on values.
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
trait FilterDatetime extends StObject {
  
  /**
    * The date in ISO8601 format used to filter data.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var date: String
  
  /**
    * How specific the date should be used to keep data. For example, if the date is 2005-04-02 and the specifity is set to "month", the filter operation will keep all rows with a date in the month of April 2005.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var specificity: FilterDatetimeSpecificity | Year | Month | Day | Hour | Minute | Second
}
object FilterDatetime {
  
  inline def apply(date: String, specificity: FilterDatetimeSpecificity | Year | Month | Day | Hour | Minute | Second): FilterDatetime = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDatetime]
  }
  
  extension [Self <: FilterDatetime](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setSpecificity(value: FilterDatetimeSpecificity | Year | Month | Day | Hour | Minute | Second): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
  }
}
