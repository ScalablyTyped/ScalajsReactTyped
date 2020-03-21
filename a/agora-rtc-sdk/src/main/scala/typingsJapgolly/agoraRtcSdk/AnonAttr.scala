package typingsJapgolly.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttr extends js.Object {
  /**
    * Whether the remote media stream falls back to audio-only or switches back to the video:
    * - 1: the remote media stream falls back to audio-only due to unreliable network conditions.
    * - 0: the remote media stream switches back to the video stream after the network conditions improve.
    */
  var attr: Double
  /** ID of the remote user sending the stream. */
  var uid: String | Double
}

object AnonAttr {
  @scala.inline
  def apply(attr: Double, uid: String | Double): AnonAttr = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttr]
  }
}

