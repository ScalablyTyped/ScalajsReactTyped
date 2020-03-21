package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.both
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.combobox
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.list
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.listbox
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputContainerPropsSingle[T /* <: TypeaheadModel */] extends js.Object {
  var `aria-activedescendant`: String
  var `aria-autocomplete`: list | both
  var `aria-expanded`: Boolean
  var `aria-haspopup`: listbox
  var `aria-owns`: String
  var autoComplete: String
  var disabled: Boolean
  var inputRef: LegacyRef[HTMLInputElement]
  var placeholder: String | Null
  var role: combobox
  var value: String
  def onBlur(e: Event_): Unit
  def onChange(selected: js.Array[T]): Unit
  def onClick(e: Event_): Unit
  def onFocus(e: Event_): Unit
  def onKeyDown(e: Event_): Unit
}

object InputContainerPropsSingle {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    `aria-activedescendant`: String,
    `aria-autocomplete`: list | both,
    `aria-expanded`: Boolean,
    `aria-haspopup`: listbox,
    `aria-owns`: String,
    autoComplete: String,
    disabled: Boolean,
    onBlur: Event_ => Callback,
    onChange: js.Array[T] => Callback,
    onClick: Event_ => Callback,
    onFocus: Event_ => Callback,
    onKeyDown: Event_ => Callback,
    role: combobox,
    value: String,
    inputRef: LegacyRef[HTMLInputElement] = null,
    placeholder: String = null
  ): InputContainerPropsSingle[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onBlur(t0).runNow()))
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: js.Array[T]) => onChange(t0).runNow()))
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onClick(t0).runNow()))
    __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onFocus(t0).runNow()))
    __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onKeyDown(t0).runNow()))
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContainerPropsSingle[T]]
  }
}

