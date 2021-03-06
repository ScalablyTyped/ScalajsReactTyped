package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.host
  - typingsJapgolly.std.stdStrings.prflx
  - typingsJapgolly.std.stdStrings.relay
  - typingsJapgolly.std.stdStrings.srflx
*/
trait RTCIceCandidateType extends js.Object

object RTCIceCandidateType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def host: typingsJapgolly.std.stdStrings.host = this.cast("host")
  @scala.inline
  def prflx: typingsJapgolly.std.stdStrings.prflx = this.cast("prflx")
  @scala.inline
  def relay: typingsJapgolly.std.stdStrings.relay = this.cast("relay")
  @scala.inline
  def srflx: typingsJapgolly.std.stdStrings.srflx = this.cast("srflx")
}

