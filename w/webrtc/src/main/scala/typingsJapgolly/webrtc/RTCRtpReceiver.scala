package typingsJapgolly.webrtc

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpreceiver
trait RTCRtpReceiver extends js.Object {
  def getContributingSources(): js.Array[RTCRtpContributingSource]
  //readonly track?: MediaStreamTrack;
  //readonly transport?: RTCDtlsTransport;
  //readonly rtcpTransport?: RTCDtlsTransport;
  def getParameters(): RTCRtpParameters
}

object RTCRtpReceiver {
  @scala.inline
  def apply(
    getContributingSources: CallbackTo[js.Array[RTCRtpContributingSource]],
    getParameters: CallbackTo[RTCRtpParameters]
  ): RTCRtpReceiver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContributingSources")(getContributingSources.toJsFn)
    __obj.updateDynamic("getParameters")(getParameters.toJsFn)
    __obj.asInstanceOf[RTCRtpReceiver]
  }
}

