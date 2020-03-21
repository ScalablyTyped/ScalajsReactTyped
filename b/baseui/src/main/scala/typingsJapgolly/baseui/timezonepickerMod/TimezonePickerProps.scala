package typingsJapgolly.baseui.timezonepickerMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.baseui.AnonSelect
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimezonePickerProps extends js.Object {
  var date: js.UndefOr[js.Date] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var mapLabels: js.UndefOr[js.Function1[/* args */ Option, Node]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ Timezone, _]] = js.undefined
  var overrides: js.UndefOr[AnonSelect] = js.undefined
  var positive: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[default_ | compact | large_] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TimezonePickerProps {
  @scala.inline
  def apply(
    date: js.Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    mapLabels: /* args */ Option => CallbackTo[Node] = null,
    onChange: /* value */ Timezone => CallbackTo[js.Any] = null,
    overrides: AnonSelect = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    size: default_ | compact | large_ = null,
    value: String = null
  ): TimezonePickerProps = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (mapLabels != null) __obj.updateDynamic("mapLabels")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.selectMod.Option) => mapLabels(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.baseui.timezonepickerMod.Timezone) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimezonePickerProps]
  }
}

