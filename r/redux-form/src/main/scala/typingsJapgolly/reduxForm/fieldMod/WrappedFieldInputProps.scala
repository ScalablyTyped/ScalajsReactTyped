package typingsJapgolly.reduxForm.fieldMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedFieldInputProps extends CommonFieldInputProps {
  var checked: js.UndefOr[Boolean] = js.undefined
  var onBlur: EventOrValueHandler[ReactFocusEventFrom[Element]]
  var onChange: EventOrValueHandler[ReactEventFrom[Element]]
  var value: js.Any
}

object WrappedFieldInputProps {
  @scala.inline
  def apply(
    name: String,
    onBlur: EventOrValueHandler[ReactFocusEventFrom[Element]],
    onChange: EventOrValueHandler[ReactEventFrom[Element]],
    onDragStart: (ReactDragEventFrom[Element], /* name */ js.UndefOr[String]) => Callback,
    onDrop: (ReactDragEventFrom[Element], /* name */ js.UndefOr[String]) => Callback,
    onFocus: (ReactFocusEventFrom[Element], /* name */ js.UndefOr[String]) => Callback,
    value: js.Any,
    checked: js.UndefOr[Boolean] = js.undefined
  ): WrappedFieldInputProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onDragStart")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* name */ js.UndefOr[java.lang.String]) => onDragStart(t0, t1).runNow()))
    __obj.updateDynamic("onDrop")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* name */ js.UndefOr[java.lang.String]) => onDrop(t0, t1).runNow()))
    __obj.updateDynamic("onFocus")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element], t1: /* name */ js.UndefOr[java.lang.String]) => onFocus(t0, t1).runNow()))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedFieldInputProps]
  }
}

