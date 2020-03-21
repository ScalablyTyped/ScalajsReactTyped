package typingsJapgolly.slideout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.slideout.slideoutStrings.beforeopen
  - typingsJapgolly.slideout.slideoutStrings.open
  - typingsJapgolly.slideout.slideoutStrings.beforeclose
  - typingsJapgolly.slideout.slideoutStrings.close
  - typingsJapgolly.slideout.slideoutStrings.translatestart
  - typingsJapgolly.slideout.slideoutStrings.translate
  - typingsJapgolly.slideout.slideoutStrings.translateend
*/
trait Events extends js.Object

object Events {
  @scala.inline
  def beforeclose: typingsJapgolly.slideout.slideoutStrings.beforeclose = this.cast("beforeclose")
  @scala.inline
  def beforeopen: typingsJapgolly.slideout.slideoutStrings.beforeopen = this.cast("beforeopen")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typingsJapgolly.slideout.slideoutStrings.close = this.cast("close")
  @scala.inline
  def open: typingsJapgolly.slideout.slideoutStrings.open = this.cast("open")
  @scala.inline
  def translate: typingsJapgolly.slideout.slideoutStrings.translate = this.cast("translate")
  @scala.inline
  def translateend: typingsJapgolly.slideout.slideoutStrings.translateend = this.cast("translateend")
  @scala.inline
  def translatestart: typingsJapgolly.slideout.slideoutStrings.translatestart = this.cast("translatestart")
}

