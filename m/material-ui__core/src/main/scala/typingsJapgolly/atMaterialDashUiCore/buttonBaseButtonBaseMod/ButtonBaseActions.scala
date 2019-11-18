package typingsJapgolly.atMaterialDashUiCore.buttonBaseButtonBaseMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonBaseActions extends js.Object {
  def focusVisible(): Unit
}

object ButtonBaseActions {
  @scala.inline
  def apply(focusVisible: Callback): ButtonBaseActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focusVisible")(focusVisible.toJsFn)
    __obj.asInstanceOf[ButtonBaseActions]
  }
}

