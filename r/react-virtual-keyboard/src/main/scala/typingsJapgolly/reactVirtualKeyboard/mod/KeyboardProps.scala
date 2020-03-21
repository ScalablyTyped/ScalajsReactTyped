package typingsJapgolly.reactVirtualKeyboard.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardProps extends js.Object {
  var callbackParent: js.UndefOr[kbEvents] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onAccepted: js.UndefOr[kbEvents] = js.undefined
  var onChange: js.UndefOr[kbEvents] = js.undefined
  var options: js.UndefOr[ReactKeyboardOptions] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object KeyboardProps {
  @scala.inline
  def apply(
    callbackParent: (/* event */ js.UndefOr[String | Event_], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    name: String = null,
    onAccepted: (/* event */ js.UndefOr[String | Event_], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    onChange: (/* event */ js.UndefOr[String | Event_], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    options: ReactKeyboardOptions = null,
    placeholder: String = null,
    value: String = null
  ): KeyboardProps = {
    val __obj = js.Dynamic.literal()
    if (callbackParent != null) __obj.updateDynamic("callbackParent")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[java.lang.String | typingsJapgolly.std.Event_], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => callbackParent(t0, t1, t2).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAccepted != null) __obj.updateDynamic("onAccepted")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[java.lang.String | typingsJapgolly.std.Event_], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => onAccepted(t0, t1, t2).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[java.lang.String | typingsJapgolly.std.Event_], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => onChange(t0, t1, t2).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardProps]
  }
}

