package typingsJapgolly.reactPlacesAutocomplete

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.combobox
import typingsJapgolly.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.list
import typingsJapgolly.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.off
import typingsJapgolly.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAriaactivedescendant extends js.Object {
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-autocomplete`: list
  var `aria-expanded`: Boolean
  var autoComplete: off
  var disabled: Boolean
  var onBlur: FocusEventHandler[Element]
  var onKeyDown: KeyboardEventHandler[Element]
  var role: combobox
  var `type`: text
  var value: js.UndefOr[String] = js.undefined
  def onChange(ev: AnonTarget): Unit
}

object AnonAriaactivedescendant {
  @scala.inline
  def apply(
    `aria-autocomplete`: list,
    `aria-expanded`: Boolean,
    autoComplete: off,
    disabled: Boolean,
    onBlur: ReactFocusEventFrom[Element] => Callback,
    onChange: AnonTarget => Callback,
    onKeyDown: ReactKeyboardEventFrom[Element] => Callback,
    role: combobox,
    `type`: text,
    `aria-activedescendant`: String = null,
    value: String = null
  ): AnonAriaactivedescendant = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.reactPlacesAutocomplete.AnonTarget) => onChange(t0).runNow()))
    __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAriaactivedescendant]
  }
}

