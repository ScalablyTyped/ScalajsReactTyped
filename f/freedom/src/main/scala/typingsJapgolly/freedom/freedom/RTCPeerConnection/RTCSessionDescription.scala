package typingsJapgolly.freedom.freedom.RTCPeerConnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCSessionDescription extends js.Object {
  var sdp: String
  var `type`: String
}

object RTCSessionDescription {
  @scala.inline
  def apply(sdp: String, `type`: String): RTCSessionDescription = {
    val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSessionDescription]
  }
}

