package typingsJapgolly.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.`new`
  - typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.checking
  - typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.connected
  - typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.completed
  - typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.failed
  - typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.disconnected
  - typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.closed
*/
trait RTCIceConnectionState extends js.Object

object RTCIceConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checking: typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.checking = this.cast("checking")
  @scala.inline
  def closed: typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.closed = this.cast("closed")
  @scala.inline
  def completed: typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.completed = this.cast("completed")
  @scala.inline
  def connected: typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.connected = this.cast("connected")
  @scala.inline
  def disconnected: typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def failed: typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.failed = this.cast("failed")
  @scala.inline
  def `new`: typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.`new` = this.cast("new")
}

