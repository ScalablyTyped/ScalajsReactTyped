package typingsJapgolly.reactNativeWebrtc.mod

import typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.all
import typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.public
import typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.relay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCPeerConnectionConfiguration extends js.Object {
  var iceServers: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls]
  var iceTransportPolicy: js.UndefOr[all | public | relay] = js.undefined
}

object RTCPeerConnectionConfiguration {
  @scala.inline
  def apply(
    iceServers: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls],
    iceTransportPolicy: all | public | relay = null
  ): RTCPeerConnectionConfiguration = {
    val __obj = js.Dynamic.literal(iceServers = iceServers.asInstanceOf[js.Any])
    if (iceTransportPolicy != null) __obj.updateDynamic("iceTransportPolicy")(iceTransportPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionConfiguration]
  }
}

