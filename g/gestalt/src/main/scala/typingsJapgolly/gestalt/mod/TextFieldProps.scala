package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.gestalt.AnonValue
import typingsJapgolly.gestalt.AnonValueString
import typingsJapgolly.gestalt.gestaltStrings.`current-password`
import typingsJapgolly.gestalt.gestaltStrings.date
import typingsJapgolly.gestalt.gestaltStrings.down
import typingsJapgolly.gestalt.gestaltStrings.email
import typingsJapgolly.gestalt.gestaltStrings.left
import typingsJapgolly.gestalt.gestaltStrings.number
import typingsJapgolly.gestalt.gestaltStrings.off
import typingsJapgolly.gestalt.gestaltStrings.on
import typingsJapgolly.gestalt.gestaltStrings.password
import typingsJapgolly.gestalt.gestaltStrings.right
import typingsJapgolly.gestalt.gestaltStrings.text
import typingsJapgolly.gestalt.gestaltStrings.up
import typingsJapgolly.gestalt.gestaltStrings.url
import typingsJapgolly.gestalt.gestaltStrings.username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFieldProps extends js.Object {
  var autoComplete: js.UndefOr[`current-password` | on | off | username] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var id: String
  var idealErrorDirection: js.UndefOr[up | right | down | left] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* args */ AnonValueString, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* args */ AnonValueString, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[date | email | number | password | text | url] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def onChange(args: AnonValue): Unit
}

object TextFieldProps {
  @scala.inline
  def apply(
    id: String,
    onChange: AnonValue => Callback,
    autoComplete: `current-password` | on | off | username = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    idealErrorDirection: up | right | down | left = null,
    name: String = null,
    onBlur: /* args */ AnonValueString => Callback = null,
    onFocus: /* args */ AnonValueString => Callback = null,
    placeholder: String = null,
    `type`: date | email | number | password | text | url = null,
    value: String = null
  ): TextFieldProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.gestalt.AnonValue) => onChange(t0).runNow()))
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (idealErrorDirection != null) __obj.updateDynamic("idealErrorDirection")(idealErrorDirection.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonValueString) => onBlur(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonValueString) => onFocus(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldProps]
  }
}

