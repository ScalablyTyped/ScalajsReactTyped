package typingsJapgolly.bootstrapMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.click
  - typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.`right-click`
  - typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.hover
*/
trait BootstrapMenuEvent extends js.Object

object BootstrapMenuEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.click = this.cast("click")
  @scala.inline
  def hover: typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.hover = this.cast("hover")
  @scala.inline
  def `right-click`: typingsJapgolly.bootstrapMenu.bootstrapMenuStrings.`right-click` = this.cast("right-click")
}

