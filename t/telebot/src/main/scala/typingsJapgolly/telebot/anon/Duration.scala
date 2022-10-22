package typingsJapgolly.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var notification: js.UndefOr[Boolean] = js.undefined
  
  var performer: js.UndefOr[String] = js.undefined
  
  var replyMarkup: js.UndefOr[Any] = js.undefined
  
  var replyToMessage: js.UndefOr[Double] = js.undefined
  
  var serverDownload: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object Duration {
  
  inline def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setNotification(value: Boolean): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setPerformer(value: String): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setReplyMarkup(value: Any): Self = StObject.set(x, "replyMarkup", value.asInstanceOf[js.Any])
    
    inline def setReplyMarkupUndefined: Self = StObject.set(x, "replyMarkup", js.undefined)
    
    inline def setReplyToMessage(value: Double): Self = StObject.set(x, "replyToMessage", value.asInstanceOf[js.Any])
    
    inline def setReplyToMessageUndefined: Self = StObject.set(x, "replyToMessage", js.undefined)
    
    inline def setServerDownload(value: Boolean): Self = StObject.set(x, "serverDownload", value.asInstanceOf[js.Any])
    
    inline def setServerDownloadUndefined: Self = StObject.set(x, "serverDownload", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
