package typingsJapgolly.wordpressApiFetch.mod.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.open
  - typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.closed
*/
trait OpenOrClosed extends js.Object

object OpenOrClosed {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.closed = this.cast("closed")
  @scala.inline
  def open: typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.open = this.cast("open")
}

