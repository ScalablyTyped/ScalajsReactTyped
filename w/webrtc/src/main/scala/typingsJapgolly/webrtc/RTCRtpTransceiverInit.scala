package typingsJapgolly.webrtc

import typingsJapgolly.std.RTCRtpTransceiverDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiverinit
trait RTCRtpTransceiverInit extends js.Object {
  var direction: js.UndefOr[RTCRtpTransceiverDirection] = js.undefined
  var sendEncodings: js.UndefOr[js.Array[RTCRtpEncodingParameters]] = js.undefined
   // default = 'sendrecv'
  var streams: js.UndefOr[js.Array[MediaStream]] = js.undefined
}

object RTCRtpTransceiverInit {
  @scala.inline
  def apply(
    direction: RTCRtpTransceiverDirection = null,
    sendEncodings: js.Array[RTCRtpEncodingParameters] = null,
    streams: js.Array[MediaStream] = null
  ): RTCRtpTransceiverInit = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (sendEncodings != null) __obj.updateDynamic("sendEncodings")(sendEncodings.asInstanceOf[js.Any])
    if (streams != null) __obj.updateDynamic("streams")(streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpTransceiverInit]
  }
}

