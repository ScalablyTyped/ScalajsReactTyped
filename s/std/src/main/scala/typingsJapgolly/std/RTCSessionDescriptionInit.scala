package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCSessionDescriptionInit extends js.Object {
  var sdp: js.UndefOr[java.lang.String] = js.undefined
  var `type`: org.scalajs.dom.experimental.webrtc.RTCSdpType
}

object RTCSessionDescriptionInit {
  @scala.inline
  def apply(`type`: org.scalajs.dom.experimental.webrtc.RTCSdpType, sdp: java.lang.String = null): RTCSessionDescriptionInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (sdp != null) __obj.updateDynamic("sdp")(sdp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSessionDescriptionInit]
  }
}

