package typingsJapgolly.reactPointable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactPointable.reactPointableStrings.auto
  - typingsJapgolly.reactPointable.reactPointableStrings.none
  - typingsJapgolly.reactPointable.reactPointableStrings.`pan-x`
  - typingsJapgolly.reactPointable.reactPointableStrings.`pan-y`
  - typingsJapgolly.reactPointable.reactPointableStrings.manipulation
*/
trait TouchAction extends js.Object

object TouchAction {
  @scala.inline
  def auto: typingsJapgolly.reactPointable.reactPointableStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manipulation: typingsJapgolly.reactPointable.reactPointableStrings.manipulation = this.cast("manipulation")
  @scala.inline
  def none: typingsJapgolly.reactPointable.reactPointableStrings.none = this.cast("none")
  @scala.inline
  def `pan-x`: typingsJapgolly.reactPointable.reactPointableStrings.`pan-x` = this.cast("pan-x")
  @scala.inline
  def `pan-y`: typingsJapgolly.reactPointable.reactPointableStrings.`pan-y` = this.cast("pan-y")
}

