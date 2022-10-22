package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a column header of a report. */
trait ReportColumnHeader extends StObject {
  
  /** Returns the name of the column header to use in bulk uploads. */
  def getBulkUploadColumnName(): String
  
  /** Returns the name of the column header as used in report queries. */
  def getReportColumnName(): String
}
object ReportColumnHeader {
  
  inline def apply(getBulkUploadColumnName: CallbackTo[String], getReportColumnName: CallbackTo[String]): ReportColumnHeader = {
    val __obj = js.Dynamic.literal(getBulkUploadColumnName = getBulkUploadColumnName.toJsFn, getReportColumnName = getReportColumnName.toJsFn)
    __obj.asInstanceOf[ReportColumnHeader]
  }
  
  extension [Self <: ReportColumnHeader](x: Self) {
    
    inline def setGetBulkUploadColumnName(value: CallbackTo[String]): Self = StObject.set(x, "getBulkUploadColumnName", value.toJsFn)
    
    inline def setGetReportColumnName(value: CallbackTo[String]): Self = StObject.set(x, "getReportColumnName", value.toJsFn)
  }
}
