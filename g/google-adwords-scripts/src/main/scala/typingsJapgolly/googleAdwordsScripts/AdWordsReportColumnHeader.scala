package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsReportColumnHeader extends StObject {
  
  def getBulkUploadColumnName(): String
  
  def getReportColumnName(): String
}
object AdWordsReportColumnHeader {
  
  inline def apply(getBulkUploadColumnName: CallbackTo[String], getReportColumnName: CallbackTo[String]): AdWordsReportColumnHeader = {
    val __obj = js.Dynamic.literal(getBulkUploadColumnName = getBulkUploadColumnName.toJsFn, getReportColumnName = getReportColumnName.toJsFn)
    __obj.asInstanceOf[AdWordsReportColumnHeader]
  }
  
  extension [Self <: AdWordsReportColumnHeader](x: Self) {
    
    inline def setGetBulkUploadColumnName(value: CallbackTo[String]): Self = StObject.set(x, "getBulkUploadColumnName", value.toJsFn)
    
    inline def setGetReportColumnName(value: CallbackTo[String]): Self = StObject.set(x, "getReportColumnName", value.toJsFn)
  }
}
