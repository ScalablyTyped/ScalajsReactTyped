package typingsJapgolly.webrtc

import org.scalajs.dom.experimental.webrtc.RTCBundlePolicy
import org.scalajs.dom.experimental.webrtc.RTCIceTransportPolicy
import typingsJapgolly.std.RTCRtcpMuxPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcconfiguration
trait RTCConfiguration extends js.Object {
   // default = 'all'
  var bundlePolicy: js.UndefOr[RTCBundlePolicy] = js.undefined
   // default = null
  var certificates: js.UndefOr[js.Array[RTCCertificate]] = js.undefined
  var iceCandidatePoolSize: js.UndefOr[Double] = js.undefined
  var iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined
  var iceTransportPolicy: js.UndefOr[RTCIceTransportPolicy] = js.undefined
   // default = 'require'
  var peerIdentity: js.UndefOr[String] = js.undefined
   // default = 'balanced'
  var rtcpMuxPolicy: js.UndefOr[RTCRtcpMuxPolicy] = js.undefined
}

object RTCConfiguration {
  @scala.inline
  def apply(
    bundlePolicy: RTCBundlePolicy = null,
    certificates: js.Array[RTCCertificate] = null,
    iceCandidatePoolSize: Int | Double = null,
    iceServers: js.Array[RTCIceServer] = null,
    iceTransportPolicy: RTCIceTransportPolicy = null,
    peerIdentity: String = null,
    rtcpMuxPolicy: RTCRtcpMuxPolicy = null
  ): RTCConfiguration = {
    val __obj = js.Dynamic.literal()
    if (bundlePolicy != null) __obj.updateDynamic("bundlePolicy")(bundlePolicy.asInstanceOf[js.Any])
    if (certificates != null) __obj.updateDynamic("certificates")(certificates.asInstanceOf[js.Any])
    if (iceCandidatePoolSize != null) __obj.updateDynamic("iceCandidatePoolSize")(iceCandidatePoolSize.asInstanceOf[js.Any])
    if (iceServers != null) __obj.updateDynamic("iceServers")(iceServers.asInstanceOf[js.Any])
    if (iceTransportPolicy != null) __obj.updateDynamic("iceTransportPolicy")(iceTransportPolicy.asInstanceOf[js.Any])
    if (peerIdentity != null) __obj.updateDynamic("peerIdentity")(peerIdentity.asInstanceOf[js.Any])
    if (rtcpMuxPolicy != null) __obj.updateDynamic("rtcpMuxPolicy")(rtcpMuxPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCConfiguration]
  }
}

