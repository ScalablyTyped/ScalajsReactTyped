package typingsJapgolly.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOnCandidate extends js.Object {
  var candidate: RTCIceCandidateType
}

object EventOnCandidate {
  @scala.inline
  def apply(candidate: RTCIceCandidateType): EventOnCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventOnCandidate]
  }
}

