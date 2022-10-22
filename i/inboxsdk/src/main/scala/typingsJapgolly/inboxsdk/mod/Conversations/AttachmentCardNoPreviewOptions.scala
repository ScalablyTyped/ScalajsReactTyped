package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentCardNoPreviewOptions extends StObject {
  
  var buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor]
  
  var description: String
  
  var fileIconImageUrl: String
  
  var foldColor: js.UndefOr[String] = js.undefined
  
  var iconThumbnailUrl: String
  
  def previewOnClick(event: PreviewClickEvent): Unit
  
  var previewUrl: String
  
  var title: String
}
object AttachmentCardNoPreviewOptions {
  
  inline def apply(
    buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor],
    description: String,
    fileIconImageUrl: String,
    iconThumbnailUrl: String,
    previewOnClick: PreviewClickEvent => Callback,
    previewUrl: String,
    title: String
  ): AttachmentCardNoPreviewOptions = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fileIconImageUrl = fileIconImageUrl.asInstanceOf[js.Any], iconThumbnailUrl = iconThumbnailUrl.asInstanceOf[js.Any], previewOnClick = js.Any.fromFunction1((t0: PreviewClickEvent) => previewOnClick(t0).runNow()), previewUrl = previewUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentCardNoPreviewOptions]
  }
  
  extension [Self <: AttachmentCardNoPreviewOptions](x: Self) {
    
    inline def setButtons(value: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: (DownloadButtonDescriptor | CustomButtonDescriptor)*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFileIconImageUrl(value: String): Self = StObject.set(x, "fileIconImageUrl", value.asInstanceOf[js.Any])
    
    inline def setFoldColor(value: String): Self = StObject.set(x, "foldColor", value.asInstanceOf[js.Any])
    
    inline def setFoldColorUndefined: Self = StObject.set(x, "foldColor", js.undefined)
    
    inline def setIconThumbnailUrl(value: String): Self = StObject.set(x, "iconThumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setPreviewOnClick(value: PreviewClickEvent => Callback): Self = StObject.set(x, "previewOnClick", js.Any.fromFunction1((t0: PreviewClickEvent) => value(t0).runNow()))
    
    inline def setPreviewUrl(value: String): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
