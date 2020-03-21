package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.all
  - typingsJapgolly.std.stdStrings.nohost
  - typingsJapgolly.std.stdStrings.relay
*/
trait RTCIceGatherPolicy extends js.Object

object RTCIceGatherPolicy {
  @scala.inline
  def all: typingsJapgolly.std.stdStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nohost: typingsJapgolly.std.stdStrings.nohost = this.cast("nohost")
  @scala.inline
  def relay: typingsJapgolly.std.stdStrings.relay = this.cast("relay")
}

