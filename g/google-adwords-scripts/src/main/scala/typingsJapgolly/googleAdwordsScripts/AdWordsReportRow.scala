package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsReportRow extends StObject {
  
  def formatForUpload(): js.Object
}
object AdWordsReportRow {
  
  inline def apply(formatForUpload: CallbackTo[js.Object]): AdWordsReportRow = {
    val __obj = js.Dynamic.literal(formatForUpload = formatForUpload.toJsFn)
    __obj.asInstanceOf[AdWordsReportRow]
  }
  
  extension [Self <: AdWordsReportRow](x: Self) {
    
    inline def setFormatForUpload(value: CallbackTo[js.Object]): Self = StObject.set(x, "formatForUpload", value.toJsFn)
  }
}
