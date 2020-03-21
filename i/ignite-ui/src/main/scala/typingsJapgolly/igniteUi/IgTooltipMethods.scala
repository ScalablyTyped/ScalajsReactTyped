package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTooltipMethods extends js.Object {
  def destroy(): Unit
}

object IgTooltipMethods {
  @scala.inline
  def apply(destroy: Callback): IgTooltipMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[IgTooltipMethods]
  }
}

