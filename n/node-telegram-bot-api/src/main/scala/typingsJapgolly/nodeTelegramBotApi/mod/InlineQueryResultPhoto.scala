package typingsJapgolly.nodeTelegramBotApi.mod

import typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.photo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultPhoto
  extends StObject
     with InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  
  var photo_height: js.UndefOr[Double] = js.undefined
  
  var photo_url: String
  
  var photo_width: js.UndefOr[Double] = js.undefined
  
  var thumb_url: String
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: photo
}
object InlineQueryResultPhoto {
  
  inline def apply(id: String, photo_url: String, thumb_url: String): InlineQueryResultPhoto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], photo_url = photo_url.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("photo")
    __obj.asInstanceOf[InlineQueryResultPhoto]
  }
  
  extension [Self <: InlineQueryResultPhoto](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    inline def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    inline def setPhoto_height(value: Double): Self = StObject.set(x, "photo_height", value.asInstanceOf[js.Any])
    
    inline def setPhoto_heightUndefined: Self = StObject.set(x, "photo_height", js.undefined)
    
    inline def setPhoto_url(value: String): Self = StObject.set(x, "photo_url", value.asInstanceOf[js.Any])
    
    inline def setPhoto_width(value: Double): Self = StObject.set(x, "photo_width", value.asInstanceOf[js.Any])
    
    inline def setPhoto_widthUndefined: Self = StObject.set(x, "photo_width", js.undefined)
    
    inline def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: photo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
