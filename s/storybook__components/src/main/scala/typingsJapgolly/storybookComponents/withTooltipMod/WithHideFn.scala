package typingsJapgolly.storybookComponents.withTooltipMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithHideFn extends js.Object {
  def onHide(): Unit = js.native
}

object WithHideFn {
  @scala.inline
  def apply(onHide: Callback): WithHideFn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onHide")(onHide.toJsFn)
    __obj.asInstanceOf[WithHideFn]
  }
}

