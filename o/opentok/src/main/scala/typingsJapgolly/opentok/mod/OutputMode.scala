package typingsJapgolly.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.opentok.opentokStrings.composed
  - typingsJapgolly.opentok.opentokStrings.individual
*/
trait OutputMode extends js.Object

object OutputMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def composed: typingsJapgolly.opentok.opentokStrings.composed = this.cast("composed")
  @scala.inline
  def individual: typingsJapgolly.opentok.opentokStrings.individual = this.cast("individual")
}

