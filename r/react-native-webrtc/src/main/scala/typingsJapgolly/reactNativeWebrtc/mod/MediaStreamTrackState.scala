package typingsJapgolly.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.live
  - typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.ended
*/
trait MediaStreamTrackState extends js.Object

object MediaStreamTrackState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ended: typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.ended = this.cast("ended")
  @scala.inline
  def live: typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.live = this.cast("live")
}

