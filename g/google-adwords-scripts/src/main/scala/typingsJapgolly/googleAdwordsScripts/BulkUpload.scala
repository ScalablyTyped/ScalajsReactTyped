package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkUpload[T] extends StObject {
  
  def forCampaignManagement(): T
  
  def forOfflineConversions(): T
  
  def preview(): Unit
  
  def setFileName(fileName: String): T
}
object BulkUpload {
  
  inline def apply[T](
    forCampaignManagement: CallbackTo[T],
    forOfflineConversions: CallbackTo[T],
    preview: Callback,
    setFileName: String => T
  ): BulkUpload[T] = {
    val __obj = js.Dynamic.literal(forCampaignManagement = forCampaignManagement.toJsFn, forOfflineConversions = forOfflineConversions.toJsFn, preview = preview.toJsFn, setFileName = js.Any.fromFunction1(setFileName))
    __obj.asInstanceOf[BulkUpload[T]]
  }
  
  extension [Self <: BulkUpload[?], T](x: Self & BulkUpload[T]) {
    
    inline def setForCampaignManagement(value: CallbackTo[T]): Self = StObject.set(x, "forCampaignManagement", value.toJsFn)
    
    inline def setForOfflineConversions(value: CallbackTo[T]): Self = StObject.set(x, "forOfflineConversions", value.toJsFn)
    
    inline def setPreview(value: Callback): Self = StObject.set(x, "preview", value.toJsFn)
    
    inline def setSetFileName(value: String => T): Self = StObject.set(x, "setFileName", js.Any.fromFunction1(value))
  }
}
