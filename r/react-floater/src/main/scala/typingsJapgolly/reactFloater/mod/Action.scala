package typingsJapgolly.reactFloater.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactFloater.reactFloaterStrings.open
  - typingsJapgolly.reactFloater.reactFloaterStrings.close
*/
trait Action extends js.Object

object Action {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typingsJapgolly.reactFloater.reactFloaterStrings.close = this.cast("close")
  @scala.inline
  def open: typingsJapgolly.reactFloater.reactFloaterStrings.open = this.cast("open")
}

