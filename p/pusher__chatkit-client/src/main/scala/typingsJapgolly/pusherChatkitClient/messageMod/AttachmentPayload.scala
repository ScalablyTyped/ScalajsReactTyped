package typingsJapgolly.pusherChatkitClient.messageMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This is what a file looks like after it's returned by Chatkit
trait AttachmentPayload extends MessagePayload {
  var customData: js.UndefOr[js.Any] = js.undefined
  var name: String
  var size: Double
  var `type`: String
  def url(): js.Promise[String]
  def urlExpiry(): js.Promise[js.Date]
}

object AttachmentPayload {
  @scala.inline
  def apply(
    name: String,
    size: Double,
    `type`: String,
    url: CallbackTo[js.Promise[String]],
    urlExpiry: CallbackTo[js.Promise[js.Date]],
    customData: js.Any = null
  ): AttachmentPayload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("url")(url.toJsFn)
    __obj.updateDynamic("urlExpiry")(urlExpiry.toJsFn)
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentPayload]
  }
}

