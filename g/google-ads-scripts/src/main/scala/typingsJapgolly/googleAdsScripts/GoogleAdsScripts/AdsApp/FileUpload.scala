package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Bulk Upload of an already-existing file, loaded from Blob, Google Sheet or Drive File. */
trait FileUpload extends StObject {
  
  /**
    * Uploads the file and applies the changes.
    *
    * **When previewing a script, apply() previews the Bulk Upload instead of applying it.**
    */
  @JSName("apply")
  def apply(): Unit
  
  /** Specifies that this upload is used for Campaign Management entity changes. */
  def forCampaignManagement(): this.type
  
  /** Specifies that this upload is used for reporting offline conversions. */
  def forOfflineConversions(): this.type
  
  /** Uploads the file and previews the changes. */
  def preview(): Unit
  
  /** Sets the file name of the uploaded file. */
  def setFileName(fileName: String): this.type
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
    
    inline def setForCampaignManagement(value: CallbackTo[FileUpload]): Self = StObject.set(x, "forCampaignManagement", value.toJsFn)
    
    inline def setForOfflineConversions(value: CallbackTo[FileUpload]): Self = StObject.set(x, "forOfflineConversions", value.toJsFn)
    
    inline def setPreview(value: Callback): Self = StObject.set(x, "preview", value.toJsFn)
    
    inline def setSetFileName(value: String => FileUpload): Self = StObject.set(x, "setFileName", js.Any.fromFunction1(value))
  }
}
