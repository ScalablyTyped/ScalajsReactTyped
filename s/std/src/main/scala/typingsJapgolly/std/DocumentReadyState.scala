package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.complete
  - typingsJapgolly.std.stdStrings.interactive
  - typingsJapgolly.std.stdStrings.loading
*/
trait DocumentReadyState extends js.Object

object DocumentReadyState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.std.stdStrings.complete = this.cast("complete")
  @scala.inline
  def interactive: typingsJapgolly.std.stdStrings.interactive = this.cast("interactive")
  @scala.inline
  def loading: typingsJapgolly.std.stdStrings.loading = this.cast("loading")
}

