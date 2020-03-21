package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalViewOptions extends js.Object {
  var beforeOpen: js.UndefOr[js.Function1[/* e */ ModalViewBeforeOpenEvent, Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ ModalViewCloseEvent, Unit]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ ModalViewInitEvent, Unit]] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ ModalViewOpenEvent, Unit]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ModalViewOptions {
  @scala.inline
  def apply(
    beforeOpen: /* e */ ModalViewBeforeOpenEvent => Callback = null,
    close: /* e */ ModalViewCloseEvent => Callback = null,
    height: Int | Double = null,
    init: /* e */ ModalViewInitEvent => Callback = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    open: /* e */ ModalViewOpenEvent => Callback = null,
    width: Int | Double = null
  ): ModalViewOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.ModalViewBeforeOpenEvent) => beforeOpen(t0).runNow()))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.ModalViewCloseEvent) => close(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.ModalViewInitEvent) => init(t0).runNow()))
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.ModalViewOpenEvent) => open(t0).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalViewOptions]
  }
}

