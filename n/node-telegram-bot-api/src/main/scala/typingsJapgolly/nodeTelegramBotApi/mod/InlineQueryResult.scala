package typingsJapgolly.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedAudio
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedDocument
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedGif
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedMpeg4Gif
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedPhoto
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedSticker
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedVideo
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedVoice
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultArticle
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultAudio
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultContact
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultGame
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultDocument
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultGif
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultLocation
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultMpeg4Gif
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultPhoto
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultVenue
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultVideo
  - typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultVoice
*/
trait InlineQueryResult extends StObject
object InlineQueryResult {
  
  inline def InlineQueryResultArticle(id: String, input_message_content: InputMessageContent, title: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultArticle = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input_message_content = input_message_content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("article")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultArticle]
  }
  
  inline def InlineQueryResultAudio(audio_url: String, id: String, title: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultAudio = {
    val __obj = js.Dynamic.literal(audio_url = audio_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("audio")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultAudio]
  }
  
  inline def InlineQueryResultCachedAudio(audio_file_id: String, id: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedAudio = {
    val __obj = js.Dynamic.literal(audio_file_id = audio_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("audio")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedAudio]
  }
  
  inline def InlineQueryResultCachedDocument(document_file_id: String, id: String, title: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedDocument = {
    val __obj = js.Dynamic.literal(document_file_id = document_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("document")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedDocument]
  }
  
  inline def InlineQueryResultCachedGif(gif_file_id: String, id: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedGif = {
    val __obj = js.Dynamic.literal(gif_file_id = gif_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gif")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedGif]
  }
  
  inline def InlineQueryResultCachedMpeg4Gif(id: String, mpeg4_file_id: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_file_id = mpeg4_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mpeg4_gif")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedMpeg4Gif]
  }
  
  inline def InlineQueryResultCachedPhoto(id: String, photo_file_id: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedPhoto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], photo_file_id = photo_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("photo")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedPhoto]
  }
  
  inline def InlineQueryResultCachedSticker(id: String, sticker_file_id: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedSticker = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sticker_file_id = sticker_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sticker")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedSticker]
  }
  
  inline def InlineQueryResultCachedVideo(id: String, title: String, video_file_id: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedVideo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video_file_id = video_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedVideo]
  }
  
  inline def InlineQueryResultCachedVoice(id: String, title: String, voice_file_id: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedVoice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], voice_file_id = voice_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("voice")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultCachedVoice]
  }
  
  inline def InlineQueryResultContact(first_name: String, id: String, phone_number: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultContact = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("contact")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultContact]
  }
  
  inline def InlineQueryResultDocument(document_url: String, id: String, mime_type: String, title: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultDocument = {
    val __obj = js.Dynamic.literal(document_url = document_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("document")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultDocument]
  }
  
  inline def InlineQueryResultGame(game_short_name: String, id: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultGame = {
    val __obj = js.Dynamic.literal(game_short_name = game_short_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("game")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultGame]
  }
  
  inline def InlineQueryResultGif(gif_url: String, id: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultGif = {
    val __obj = js.Dynamic.literal(gif_url = gif_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gif")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultGif]
  }
  
  inline def InlineQueryResultLocation(id: String, latitude: Double, longitude: Double, title: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultLocation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("location")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultLocation]
  }
  
  inline def InlineQueryResultMpeg4Gif(id: String, mpeg4_url: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_url = mpeg4_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mpeg4_gif")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultMpeg4Gif]
  }
  
  inline def InlineQueryResultPhoto(id: String, photo_url: String, thumb_url: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultPhoto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], photo_url = photo_url.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("photo")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultPhoto]
  }
  
  inline def InlineQueryResultVenue(address: String, id: String, latitude: Double, longitude: Double, title: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultVenue = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("venue")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultVenue]
  }
  
  inline def InlineQueryResultVideo(id: String, mime_type: String, thumb_url: String, title: String, video_url: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultVideo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video_url = video_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultVideo]
  }
  
  inline def InlineQueryResultVoice(id: String, title: String, voice_url: String): typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultVoice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("voice")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InlineQueryResultVoice]
  }
}
