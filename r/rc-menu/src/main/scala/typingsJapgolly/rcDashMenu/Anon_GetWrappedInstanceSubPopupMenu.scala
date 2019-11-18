package typingsJapgolly.rcDashMenu

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rcDashMenu.libSubPopupMenuMod.SubPopupMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetWrappedInstanceSubPopupMenu extends js.Object {
  def getWrappedInstance(): SubPopupMenu
}

object Anon_GetWrappedInstanceSubPopupMenu {
  @scala.inline
  def apply(getWrappedInstance: CallbackTo[SubPopupMenu]): Anon_GetWrappedInstanceSubPopupMenu = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getWrappedInstance")(getWrappedInstance.toJsFn)
    __obj.asInstanceOf[Anon_GetWrappedInstanceSubPopupMenu]
  }
}

