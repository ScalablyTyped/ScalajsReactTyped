package typingsJapgolly.webrtc

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.RTCRtpTransceiverDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiver
trait RTCRtpTransceiver extends js.Object {
  var direction: RTCRtpTransceiverDirection
  val mid: String | Null
  val receiver: RTCRtpReceiver
  val sender: RTCRtpSender
  val stopped: Boolean
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): Unit
  def setDirection(direction: RTCRtpTransceiverDirection): Unit
  def stop(): Unit
}

object RTCRtpTransceiver {
  @scala.inline
  def apply(
    direction: RTCRtpTransceiverDirection,
    receiver: RTCRtpReceiver,
    sender: RTCRtpSender,
    setCodecPreferences: js.Array[RTCRtpCodecCapability] => Callback,
    setDirection: RTCRtpTransceiverDirection => Callback,
    stop: Callback,
    stopped: Boolean,
    mid: String = null
  ): RTCRtpTransceiver = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any])
    __obj.updateDynamic("setCodecPreferences")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.webrtc.RTCRtpCodecCapability]) => setCodecPreferences(t0).runNow()))
    __obj.updateDynamic("setDirection")(js.Any.fromFunction1((t0: typingsJapgolly.std.RTCRtpTransceiverDirection) => setDirection(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    if (mid != null) __obj.updateDynamic("mid")(mid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpTransceiver]
  }
}

