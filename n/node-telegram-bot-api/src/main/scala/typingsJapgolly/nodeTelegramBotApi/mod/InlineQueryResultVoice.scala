package typingsJapgolly.nodeTelegramBotApi.mod

import typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.voice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultVoice
  extends StObject
     with InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  
  var title: String
  
  var `type`: voice
  
  var voice_duration: js.UndefOr[Double] = js.undefined
  
  var voice_url: String
}
object InlineQueryResultVoice {
  
  inline def apply(id: String, title: String, voice_url: String): InlineQueryResultVoice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("voice")
    __obj.asInstanceOf[InlineQueryResultVoice]
  }
  
  extension [Self <: InlineQueryResultVoice](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    inline def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: voice): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVoice_duration(value: Double): Self = StObject.set(x, "voice_duration", value.asInstanceOf[js.Any])
    
    inline def setVoice_durationUndefined: Self = StObject.set(x, "voice_duration", js.undefined)
    
    inline def setVoice_url(value: String): Self = StObject.set(x, "voice_url", value.asInstanceOf[js.Any])
  }
}
