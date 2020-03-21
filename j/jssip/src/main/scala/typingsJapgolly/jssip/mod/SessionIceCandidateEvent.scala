package typingsJapgolly.jssip.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.experimental.webrtc.RTCIceCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionIceCandidateEvent extends js.Object {
  var candidate: RTCIceCandidate
  def ready(): Unit
}

object SessionIceCandidateEvent {
  @scala.inline
  def apply(candidate: RTCIceCandidate, ready: Callback): SessionIceCandidateEvent = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
    __obj.updateDynamic("ready")(ready.toJsFn)
    __obj.asInstanceOf[SessionIceCandidateEvent]
  }
}

