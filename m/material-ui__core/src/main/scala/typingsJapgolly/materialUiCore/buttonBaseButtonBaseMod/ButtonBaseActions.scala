package typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonBaseActions extends js.Object {
  def focusVisible(): Unit = js.native
}

object ButtonBaseActions {
  @scala.inline
  def apply(focusVisible: Callback): ButtonBaseActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focusVisible")(focusVisible.toJsFn)
    __obj.asInstanceOf[ButtonBaseActions]
  }
}

