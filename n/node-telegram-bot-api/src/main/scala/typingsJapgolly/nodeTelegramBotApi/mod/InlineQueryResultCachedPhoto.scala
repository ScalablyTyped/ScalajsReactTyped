package typingsJapgolly.nodeTelegramBotApi.mod

import typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.photo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultCachedPhoto
  extends StObject
     with InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  
  var photo_file_id: String
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: photo
}
object InlineQueryResultCachedPhoto {
  
  inline def apply(id: String, photo_file_id: String): InlineQueryResultCachedPhoto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], photo_file_id = photo_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("photo")
    __obj.asInstanceOf[InlineQueryResultCachedPhoto]
  }
  
  extension [Self <: InlineQueryResultCachedPhoto](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    inline def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    inline def setPhoto_file_id(value: String): Self = StObject.set(x, "photo_file_id", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: photo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
