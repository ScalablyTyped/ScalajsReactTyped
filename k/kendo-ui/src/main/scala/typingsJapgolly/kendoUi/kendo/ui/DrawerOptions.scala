package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerOptions extends js.Object {
  var hide: js.UndefOr[js.Function1[/* e */ DrawerHideEvent, Unit]] = js.undefined
  var itemClick: js.UndefOr[js.Function1[/* e */ DrawerEvent, Unit]] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var mini: js.UndefOr[Boolean | DrawerMini] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ DrawerEvent, Unit]] = js.undefined
  var swipeToOpen: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String] = js.undefined
}

object DrawerOptions {
  @scala.inline
  def apply(
    hide: /* e */ DrawerHideEvent => Callback = null,
    itemClick: /* e */ DrawerEvent => Callback = null,
    minHeight: Int | Double = null,
    mini: Boolean | DrawerMini = null,
    mode: String = null,
    name: String = null,
    position: String = null,
    show: /* e */ DrawerEvent => Callback = null,
    swipeToOpen: js.UndefOr[Boolean] = js.undefined,
    template: String = null
  ): DrawerOptions = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.DrawerHideEvent) => hide(t0).runNow()))
    if (itemClick != null) __obj.updateDynamic("itemClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.DrawerEvent) => itemClick(t0).runNow()))
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (mini != null) __obj.updateDynamic("mini")(mini.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.DrawerEvent) => show(t0).runNow()))
    if (!js.isUndefined(swipeToOpen)) __obj.updateDynamic("swipeToOpen")(swipeToOpen.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerOptions]
  }
}

