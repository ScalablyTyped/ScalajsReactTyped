package typingsJapgolly.rcTooltip.mod.RCTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rcTooltip.rcTooltipStrings.hover
  - typingsJapgolly.rcTooltip.rcTooltipStrings.click
  - typingsJapgolly.rcTooltip.rcTooltipStrings.focus
*/
trait Trigger extends js.Object

object Trigger {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typingsJapgolly.rcTooltip.rcTooltipStrings.click = this.cast("click")
  @scala.inline
  def focus: typingsJapgolly.rcTooltip.rcTooltipStrings.focus = this.cast("focus")
  @scala.inline
  def hover: typingsJapgolly.rcTooltip.rcTooltipStrings.hover = this.cast("hover")
}

