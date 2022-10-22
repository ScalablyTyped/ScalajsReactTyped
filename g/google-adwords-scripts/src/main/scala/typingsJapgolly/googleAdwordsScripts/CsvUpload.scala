package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsvUpload
  extends StObject
     with BulkUpload[CsvUpload] {
  
  def append(row: js.Object): CsvUpload
  
  @JSName("apply")
  def apply(): Unit
}
object CsvUpload {
  
  inline def apply(
    append: js.Object => CsvUpload,
    apply: Callback,
    forCampaignManagement: CallbackTo[CsvUpload],
    forOfflineConversions: CallbackTo[CsvUpload],
    preview: Callback,
    setFileName: String => CsvUpload
  ): CsvUpload = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), apply = apply.toJsFn, forCampaignManagement = forCampaignManagement.toJsFn, forOfflineConversions = forOfflineConversions.toJsFn, preview = preview.toJsFn, setFileName = js.Any.fromFunction1(setFileName))
    __obj.asInstanceOf[CsvUpload]
  }
  
  extension [Self <: CsvUpload](x: Self) {
    
    inline def setAppend(value: js.Object => CsvUpload): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    inline def setApply(value: Callback): Self = StObject.set(x, "apply", value.toJsFn)
  }
}
