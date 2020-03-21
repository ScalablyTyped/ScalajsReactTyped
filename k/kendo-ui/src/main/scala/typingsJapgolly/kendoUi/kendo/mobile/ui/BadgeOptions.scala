package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeOptions extends js.Object {
  var appearance: js.UndefOr[String] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ BadgeChangeEvent, Unit]] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ BadgeEvent, Unit]] = js.undefined
  var look: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ BadgeEvent, Unit]] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object BadgeOptions {
  @scala.inline
  def apply(
    appearance: String = null,
    change: /* e */ BadgeChangeEvent => Callback = null,
    hide: /* e */ BadgeEvent => Callback = null,
    look: String = null,
    name: String = null,
    show: /* e */ BadgeEvent => Callback = null,
    template: String | js.Function = null,
    `type`: String = null,
    value: String | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BadgeOptions = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.BadgeChangeEvent) => change(t0).runNow()))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.BadgeEvent) => hide(t0).runNow()))
    if (look != null) __obj.updateDynamic("look")(look.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.mobile.ui.BadgeEvent) => show(t0).runNow()))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeOptions]
  }
}

