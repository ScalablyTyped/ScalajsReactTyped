package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileUpload
  extends StObject
     with BulkUpload[FileUpload] {
  
  @JSName("apply")
  def apply(): Unit
}
object FileUpload {
  
  inline def apply(
    apply: Callback,
    forCampaignManagement: CallbackTo[FileUpload],
    forOfflineConversions: CallbackTo[FileUpload],
    preview: Callback,
    setFileName: String => FileUpload
  ): FileUpload = {
    val __obj = js.Dynamic.literal(apply = apply.toJsFn, forCampaignManagement = forCampaignManagement.toJsFn, forOfflineConversions = forOfflineConversions.toJsFn, preview = preview.toJsFn, setFileName = js.Any.fromFunction1(setFileName))
    __obj.asInstanceOf[FileUpload]
  }
  
  extension [Self <: FileUpload](x: Self) {
    
    inline def setApply(value: Callback): Self = StObject.set(x, "apply", value.toJsFn)
  }
}
