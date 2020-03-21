package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.closed
  - typingsJapgolly.std.stdStrings.running
  - typingsJapgolly.std.stdStrings.suspended
*/
trait AudioContextState extends js.Object

object AudioContextState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsJapgolly.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def running: typingsJapgolly.std.stdStrings.running = this.cast("running")
  @scala.inline
  def suspended: typingsJapgolly.std.stdStrings.suspended = this.cast("suspended")
}

