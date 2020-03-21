package typingsJapgolly.twilioChat.mediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaState extends js.Object {
  var contentType: String
  var filename: js.UndefOr[String] = js.undefined
  var sid: String
  var size: Double
}

object MediaState {
  @scala.inline
  def apply(contentType: String, sid: String, size: Double, filename: String = null): MediaState = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaState]
  }
}

