package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.done
  - typingsJapgolly.std.stdStrings.pending
*/
trait IDBRequestReadyState extends js.Object

object IDBRequestReadyState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def done: typingsJapgolly.std.stdStrings.done = this.cast("done")
  @scala.inline
  def pending: typingsJapgolly.std.stdStrings.pending = this.cast("pending")
}

