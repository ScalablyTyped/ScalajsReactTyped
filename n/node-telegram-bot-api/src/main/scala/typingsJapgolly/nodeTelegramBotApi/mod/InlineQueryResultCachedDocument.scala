package typingsJapgolly.nodeTelegramBotApi.mod

import typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultCachedDocument
  extends StObject
     with InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var document_file_id: String
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  
  var title: String
  
  var `type`: document
}
object InlineQueryResultCachedDocument {
  
  inline def apply(document_file_id: String, id: String, title: String): InlineQueryResultCachedDocument = {
    val __obj = js.Dynamic.literal(document_file_id = document_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("document")
    __obj.asInstanceOf[InlineQueryResultCachedDocument]
  }
  
  extension [Self <: InlineQueryResultCachedDocument](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocument_file_id(value: String): Self = StObject.set(x, "document_file_id", value.asInstanceOf[js.Any])
    
    inline def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    inline def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: document): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
