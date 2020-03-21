package typingsJapgolly.agGrid.iComponentMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAfterGuiAttachedParams extends js.Object {
  def hidePopup(): Unit
}

object IAfterGuiAttachedParams {
  @scala.inline
  def apply(hidePopup: Callback): IAfterGuiAttachedParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hidePopup")(hidePopup.toJsFn)
    __obj.asInstanceOf[IAfterGuiAttachedParams]
  }
}

