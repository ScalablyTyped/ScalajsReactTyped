package typingsJapgolly.officeUiFabricReact.tooltipHostTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipHost extends js.Object {
  /**
    * Dismisses the tooltip.
    */
  def dismiss(): Unit
  /**
    * Shows the tooltip.
    */
  def show(): Unit
}

object ITooltipHost {
  @scala.inline
  def apply(dismiss: Callback, show: Callback): ITooltipHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dismiss")(dismiss.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[ITooltipHost]
  }
}

