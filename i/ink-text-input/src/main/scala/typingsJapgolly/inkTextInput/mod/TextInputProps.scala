package typingsJapgolly.inkTextInput.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputProps extends js.Object {
  var focus: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TextInputProps {
  @scala.inline
  def apply(
    focus: js.UndefOr[Boolean] = js.undefined,
    onChange: /* value */ String => Callback = null,
    onSubmit: /* value */ String => Callback = null,
    placeholder: String = null,
    value: String = null
  ): TextInputProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onChange(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onSubmit(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputProps]
  }
}

