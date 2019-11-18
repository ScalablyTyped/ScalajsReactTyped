package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.sendrecv
  - typings.std.stdStrings.sendonly
  - typings.std.stdStrings.recvonly
  - typings.std.stdStrings.inactive
*/
trait RTCRtpTransceiverDirection extends js.Object

object RTCRtpTransceiverDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typingsJapgolly.std.stdStrings.inactive = this.cast("inactive")
  @scala.inline
  def recvonly: typingsJapgolly.std.stdStrings.recvonly = this.cast("recvonly")
  @scala.inline
  def sendonly: typingsJapgolly.std.stdStrings.sendonly = this.cast("sendonly")
  @scala.inline
  def sendrecv: typingsJapgolly.std.stdStrings.sendrecv = this.cast("sendrecv")
}

