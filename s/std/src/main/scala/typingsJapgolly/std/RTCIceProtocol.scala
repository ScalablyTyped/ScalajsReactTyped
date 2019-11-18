package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.udp
  - typings.std.stdStrings.tcp
*/
trait RTCIceProtocol extends js.Object

object RTCIceProtocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tcp: typingsJapgolly.std.stdStrings.tcp = this.cast("tcp")
  @scala.inline
  def udp: typingsJapgolly.std.stdStrings.udp = this.cast("udp")
}

