package typingsJapgolly.materialUiCore.tabsTabsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsActions extends js.Object {
  def updateIndicator(): Unit = js.native
}

object TabsActions {
  @scala.inline
  def apply(updateIndicator: Callback): TabsActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("updateIndicator")(updateIndicator.toJsFn)
    __obj.asInstanceOf[TabsActions]
  }
}

