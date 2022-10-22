package typingsJapgolly.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeTelegramBotApi.mod.InputMediaPhoto
  - typingsJapgolly.nodeTelegramBotApi.mod.InputMediaVideo
*/
trait InputMedia extends StObject
object InputMedia {
  
  inline def InputMediaPhoto(media: String): typingsJapgolly.nodeTelegramBotApi.mod.InputMediaPhoto = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("photo")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InputMediaPhoto]
  }
  
  inline def InputMediaVideo(media: String): typingsJapgolly.nodeTelegramBotApi.mod.InputMediaVideo = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.InputMediaVideo]
  }
}
