package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings._empty
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.both
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.list
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.listbox
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-bootstrap-typeahead.react-bootstrap-typeahead.Omit<react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<T>, 'role'> */
trait InputContainerPropsMultiple[T /* <: TypeaheadModel */] extends js.Object {
  var `aria-activedescendant`: String
  var `aria-autocomplete`: list | both
  var `aria-expanded`: Boolean
  var `aria-haspopup`: listbox
  var `aria-owns`: String
  var autoComplete: String
  var disabled: Boolean
  var inputClassName: String
  var inputRef: LegacyRef[HTMLInputElement]
  var labelKey: TypeaheadLabelKey[T]
  var onBlur: js.Function1[/* e */ Event_, Unit]
  var onChange: js.Function1[/* selected */ js.Array[T], Unit]
  var onClick: js.Function1[/* e */ Event_, Unit]
  var onFocus: js.Function1[/* e */ Event_, Unit]
  var onKeyDown: js.Function1[/* e */ Event_, Unit]
  var placeholder: js.UndefOr[String] = js.undefined
  var role: _empty
  var selected: js.Array[T]
  var value: String
  def onRemove(e: Event_): Unit
  def renderToken(selectedItem: T, props: TypeaheadMenuProps[T], index: Double): Node
}

object InputContainerPropsMultiple {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    `aria-activedescendant`: String,
    `aria-autocomplete`: list | both,
    `aria-expanded`: Boolean,
    `aria-haspopup`: listbox,
    `aria-owns`: String,
    autoComplete: String,
    disabled: Boolean,
    inputClassName: String,
    labelKey: TypeaheadLabelKey[T],
    onBlur: /* e */ Event_ => Callback,
    onChange: /* selected */ js.Array[T] => Callback,
    onClick: /* e */ Event_ => Callback,
    onFocus: /* e */ Event_ => Callback,
    onKeyDown: /* e */ Event_ => Callback,
    onRemove: Event_ => Callback,
    renderToken: (T, TypeaheadMenuProps[T], Double) => CallbackTo[Node],
    role: _empty,
    selected: js.Array[T],
    value: String,
    inputRef: LegacyRef[HTMLInputElement] = null,
    placeholder: String = null
  ): InputContainerPropsMultiple[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], inputClassName = inputClassName.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onBlur(t0).runNow()))
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* selected */ js.Array[T]) => onChange(t0).runNow()))
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onClick(t0).runNow()))
    __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onFocus(t0).runNow()))
    __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onKeyDown(t0).runNow()))
    __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onRemove(t0).runNow()))
    __obj.updateDynamic("renderToken")(js.Any.fromFunction3((t0: T, t1: typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadMenuProps[T], t2: scala.Double) => renderToken(t0, t1, t2).runNow()))
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContainerPropsMultiple[T]]
  }
}

