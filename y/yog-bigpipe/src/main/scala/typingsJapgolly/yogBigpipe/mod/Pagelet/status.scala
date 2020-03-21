package typingsJapgolly.yogBigpipe.mod.Pagelet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.yogBigpipe.yogBigpipeStrings.pending
  - typingsJapgolly.yogBigpipe.yogBigpipeStrings.rendering
  - typingsJapgolly.yogBigpipe.yogBigpipeStrings.fulfilled
  - typingsJapgolly.yogBigpipe.yogBigpipeStrings.failed
*/
trait status extends js.Object

object status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typingsJapgolly.yogBigpipe.yogBigpipeStrings.failed = this.cast("failed")
  @scala.inline
  def fulfilled: typingsJapgolly.yogBigpipe.yogBigpipeStrings.fulfilled = this.cast("fulfilled")
  @scala.inline
  def pending: typingsJapgolly.yogBigpipe.yogBigpipeStrings.pending = this.cast("pending")
  @scala.inline
  def rendering: typingsJapgolly.yogBigpipe.yogBigpipeStrings.rendering = this.cast("rendering")
}

