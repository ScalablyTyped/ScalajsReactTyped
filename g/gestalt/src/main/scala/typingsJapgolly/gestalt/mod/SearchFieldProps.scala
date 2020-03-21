package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.gestalt.Anon0
import typingsJapgolly.gestalt.AnonSyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFieldProps extends js.Object {
  var accessibilityLabel: String
  var id: String
  var onBlur: js.UndefOr[js.Function1[/* args */ Anon0, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* args */ AnonSyntheticEvent, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def onChange(args: AnonSyntheticEvent): Unit
}

object SearchFieldProps {
  @scala.inline
  def apply(
    accessibilityLabel: String,
    id: String,
    onChange: AnonSyntheticEvent => Callback,
    onBlur: /* args */ Anon0 => Callback = null,
    onFocus: /* args */ AnonSyntheticEvent => Callback = null,
    placeholder: String = null,
    value: String = null
  ): SearchFieldProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.gestalt.AnonSyntheticEvent) => onChange(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.Anon0) => onBlur(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonSyntheticEvent) => onFocus(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFieldProps]
  }
}

