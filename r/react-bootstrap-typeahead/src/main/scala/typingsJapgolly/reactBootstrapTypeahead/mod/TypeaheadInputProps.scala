package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadProps<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadInputPropKeys> */
trait TypeaheadInputProps[T /* <: TypeaheadModel */] extends js.Object {
  var bsSize: js.UndefOr[TypeaheadBsSizes] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[InputProps] = js.undefined
  var labelKey: js.UndefOr[TypeaheadLabelKey[T]] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* selected */ js.Array[T], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var renderToken: js.UndefOr[
    js.Function3[/* selectedItem */ T, /* props */ TypeaheadMenuProps[T], /* index */ Double, Node]
  ] = js.undefined
  var selected: js.UndefOr[js.Array[T]] = js.undefined
}

object TypeaheadInputProps {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    bsSize: TypeaheadBsSizes = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputProps: InputProps = null,
    labelKey: TypeaheadLabelKey[T] = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onBlur: /* e */ Event_ => Callback = null,
    onChange: /* selected */ js.Array[T] => Callback = null,
    onFocus: /* e */ Event_ => Callback = null,
    onKeyDown: /* e */ Event_ => Callback = null,
    placeholder: String = null,
    renderToken: (/* selectedItem */ T, /* props */ TypeaheadMenuProps[T], /* index */ Double) => CallbackTo[Node] = null,
    selected: js.Array[T] = null
  ): TypeaheadInputProps[T] = {
    val __obj = js.Dynamic.literal()
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* selected */ js.Array[T]) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onFocus(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onKeyDown(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (renderToken != null) __obj.updateDynamic("renderToken")(js.Any.fromFunction3((t0: /* selectedItem */ T, t1: /* props */ typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadMenuProps[T], t2: /* index */ scala.Double) => renderToken(t0, t1, t2).runNow()))
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadInputProps[T]]
  }
}

