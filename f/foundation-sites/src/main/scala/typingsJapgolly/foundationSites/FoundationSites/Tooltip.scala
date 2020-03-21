package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/tooltip.html#javascript-reference
trait Tooltip extends js.Object {
  def destroy(): Unit
  def hide(): Unit
  def show(): Unit
  def toggle(): Unit
}

object Tooltip {
  @scala.inline
  def apply(destroy: Callback, hide: Callback, show: Callback, toggle: Callback): Tooltip = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.asInstanceOf[Tooltip]
  }
}

