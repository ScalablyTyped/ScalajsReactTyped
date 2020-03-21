package typingsJapgolly.pusherChatkitClient.messageMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pusherChatkitClient.messageMod.InlinePayload
  - typingsJapgolly.pusherChatkitClient.messageMod.UrlPayload
  - typingsJapgolly.pusherChatkitClient.messageMod.AttachmentPayload
*/
trait MessagePayload extends js.Object

object MessagePayload {
  @scala.inline
  def InlinePayload(content: String, `type`: String): MessagePayload = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayload]
  }
  @scala.inline
  def UrlPayload(`type`: String, url: String): MessagePayload = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayload]
  }
  @scala.inline
  def AttachmentPayload(
    name: String,
    size: Double,
    `type`: String,
    url: CallbackTo[js.Promise[String]],
    urlExpiry: CallbackTo[js.Promise[js.Date]],
    customData: js.Any = null
  ): MessagePayload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("url")(url.toJsFn)
    __obj.updateDynamic("urlExpiry")(urlExpiry.toJsFn)
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayload]
  }
}

