package typingsJapgolly.inboxsdk.mod.Widgets

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetsInstance extends js.Object {
  def showDrawerView(options: DrawerOptions): DrawerView
  def showModalView(options: ModalOptions): ModalView
  def showMoleView(options: MoleOptions): MoleView
}

object WidgetsInstance {
  @scala.inline
  def apply(
    showDrawerView: DrawerOptions => CallbackTo[DrawerView],
    showModalView: ModalOptions => CallbackTo[ModalView],
    showMoleView: MoleOptions => CallbackTo[MoleView]
  ): WidgetsInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("showDrawerView")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Widgets.DrawerOptions) => showDrawerView(t0).runNow()))
    __obj.updateDynamic("showModalView")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Widgets.ModalOptions) => showModalView(t0).runNow()))
    __obj.updateDynamic("showMoleView")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Widgets.MoleOptions) => showMoleView(t0).runNow()))
    __obj.asInstanceOf[WidgetsInstance]
  }
}

