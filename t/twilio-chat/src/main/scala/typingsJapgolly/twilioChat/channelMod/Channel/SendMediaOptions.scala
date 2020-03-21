package typingsJapgolly.twilioChat.channelMod.Channel

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMediaOptions extends js.Object {
  var contentType: String
  var media: String | Buffer
}

object SendMediaOptions {
  @scala.inline
  def apply(contentType: String, media: String | Buffer): SendMediaOptions = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendMediaOptions]
  }
}

