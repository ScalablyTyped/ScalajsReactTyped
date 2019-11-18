package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCTrackEventInit extends EventInit {
  var receiver: RTCRtpReceiver
  var streams: js.UndefOr[js.Array[org.scalajs.dom.experimental.mediastream.MediaStream]] = js.undefined
  var track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack
  var transceiver: RTCRtpTransceiver
}

object RTCTrackEventInit {
  @scala.inline
  def apply(
    receiver: RTCRtpReceiver,
    track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack,
    transceiver: RTCRtpTransceiver,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    streams: js.Array[org.scalajs.dom.experimental.mediastream.MediaStream] = null
  ): RTCTrackEventInit = {
    val __obj = js.Dynamic.literal(receiver = receiver.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], transceiver = transceiver.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (streams != null) __obj.updateDynamic("streams")(streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTrackEventInit]
  }
}

