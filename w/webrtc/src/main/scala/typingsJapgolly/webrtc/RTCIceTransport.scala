package typingsJapgolly.webrtc

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.webrtc.RTCIceCandidate
import org.scalajs.dom.experimental.webrtc.RTCIceGatheringState
import typingsJapgolly.std.RTCIceCandidatePair
import typingsJapgolly.std.RTCIceParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceTransport extends js.Object {
  //readonly role: RTCIceRole;
  //readonly component: RTCIceComponent;
  //readonly state: RTCIceTransportState;
  val gatheringState: RTCIceGatheringState
  var ongatheringstatechange: IceTransportEventHandler
  var onselectedcandidatepairchange: IceTransportEventHandler
  var onstatechange: IceTransportEventHandler
  def getLocalCandidates(): js.Array[RTCIceCandidate]
  def getLocalParameters(): RTCIceParameters | Null
  def getRemoteCandidates(): js.Array[RTCIceCandidate]
  def getRemoteParameters(): RTCIceParameters | Null
  def getSelectedCandidatePair(): RTCIceCandidatePair | Null
}

object RTCIceTransport {
  @scala.inline
  def apply(
    gatheringState: RTCIceGatheringState,
    getLocalCandidates: CallbackTo[js.Array[RTCIceCandidate]],
    getLocalParameters: CallbackTo[RTCIceParameters | Null],
    getRemoteCandidates: CallbackTo[js.Array[RTCIceCandidate]],
    getRemoteParameters: CallbackTo[RTCIceParameters | Null],
    getSelectedCandidatePair: CallbackTo[RTCIceCandidatePair | Null],
    ongatheringstatechange: IceTransportEventHandler = null,
    onselectedcandidatepairchange: IceTransportEventHandler = null,
    onstatechange: IceTransportEventHandler = null
  ): RTCIceTransport = {
    val __obj = js.Dynamic.literal(gatheringState = gatheringState.asInstanceOf[js.Any])
    __obj.updateDynamic("getLocalCandidates")(getLocalCandidates.toJsFn)
    __obj.updateDynamic("getLocalParameters")(getLocalParameters.toJsFn)
    __obj.updateDynamic("getRemoteCandidates")(getRemoteCandidates.toJsFn)
    __obj.updateDynamic("getRemoteParameters")(getRemoteParameters.toJsFn)
    __obj.updateDynamic("getSelectedCandidatePair")(getSelectedCandidatePair.toJsFn)
    if (ongatheringstatechange != null) __obj.updateDynamic("ongatheringstatechange")(ongatheringstatechange.asInstanceOf[js.Any])
    if (onselectedcandidatepairchange != null) __obj.updateDynamic("onselectedcandidatepairchange")(onselectedcandidatepairchange.asInstanceOf[js.Any])
    if (onstatechange != null) __obj.updateDynamic("onstatechange")(onstatechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceTransport]
  }
}

