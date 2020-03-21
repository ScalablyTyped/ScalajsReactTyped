package typingsJapgolly.uikit.mod.UIkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitTooltipElement extends js.Object {
  def hide(): Unit
  def show(): Unit
}

object UIkitTooltipElement {
  @scala.inline
  def apply(hide: Callback, show: Callback): UIkitTooltipElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[UIkitTooltipElement]
  }
}

