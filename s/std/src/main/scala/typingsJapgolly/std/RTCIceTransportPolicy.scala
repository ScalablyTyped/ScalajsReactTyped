package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.relay
  - typings.std.stdStrings.all
*/
trait RTCIceTransportPolicy extends js.Object

object RTCIceTransportPolicy {
  @scala.inline
  def all: typingsJapgolly.std.stdStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def relay: typingsJapgolly.std.stdStrings.relay = this.cast("relay")
}

