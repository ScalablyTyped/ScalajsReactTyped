package typingsJapgolly.grommet.formMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.grommet.AnonInvalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps extends js.Object {
  var errors: js.UndefOr[js.Object] = js.undefined
  var messages: js.UndefOr[AnonInvalid] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
  var onReset: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], _]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
  var value: js.UndefOr[js.Object] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    errors: js.Object = null,
    messages: AnonInvalid = null,
    onChange: /* event */ ReactEventFrom[Element] => Callback = null,
    onReset: /* event */ ReactEventFrom[Element] => CallbackTo[js.Any] = null,
    onSubmit: /* event */ ReactEventFrom[Element] => Callback = null,
    value: js.Object = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onReset(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onSubmit(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProps]
  }
}

