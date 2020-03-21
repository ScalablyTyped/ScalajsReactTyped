package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetOptions extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ ActionSheetEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ ActionSheetOpenEvent, Unit]] = js.undefined
  var popup: js.UndefOr[ActionSheetPopup] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ActionSheetOptions {
  @scala.inline
  def apply(
    cancel: String = null,
    close: /* e */ ActionSheetEvent => Callback = null,
    name: String = null,
    open: /* e */ ActionSheetOpenEvent => Callback = null,
    popup: ActionSheetPopup = null,
    `type`: String = null
  ): ActionSheetOptions = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.ActionSheetEvent) => close(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.ActionSheetOpenEvent) => open(t0).runNow()))
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetOptions]
  }
}

