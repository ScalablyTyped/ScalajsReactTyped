package typingsJapgolly.reduxForm.fieldMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonFieldProps extends CommonFieldInputProps {
  var onBlur: EventWithDataHandler[ReactFocusEventFrom[Element]]
  var onChange: EventWithDataHandler[ReactEventFrom[Element]]
}

object CommonFieldProps {
  @scala.inline
  def apply(
    name: String,
    onBlur: (/* event */ js.UndefOr[ReactFocusEventFrom[Element]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Callback,
    onChange: (/* event */ js.UndefOr[ReactEventFrom[Element]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Callback,
    onDragStart: (ReactDragEventFrom[Element], /* name */ js.UndefOr[String]) => Callback,
    onDrop: (ReactDragEventFrom[Element], /* name */ js.UndefOr[String]) => Callback,
    onFocus: (ReactFocusEventFrom[Element], /* name */ js.UndefOr[String]) => Callback
  ): CommonFieldProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(js.Any.fromFunction4((t0: /* event */ js.UndefOr[japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element]], t1: /* newValue */ js.UndefOr[js.Any], t2: /* previousValue */ js.UndefOr[js.Any], t3: /* name */ js.UndefOr[java.lang.String]) => onBlur(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("onChange")(js.Any.fromFunction4((t0: /* event */ js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]], t1: /* newValue */ js.UndefOr[js.Any], t2: /* previousValue */ js.UndefOr[js.Any], t3: /* name */ js.UndefOr[java.lang.String]) => onChange(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("onDragStart")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* name */ js.UndefOr[java.lang.String]) => onDragStart(t0, t1).runNow()))
    __obj.updateDynamic("onDrop")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* name */ js.UndefOr[java.lang.String]) => onDrop(t0, t1).runNow()))
    __obj.updateDynamic("onFocus")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element], t1: /* name */ js.UndefOr[java.lang.String]) => onFocus(t0, t1).runNow()))
    __obj.asInstanceOf[CommonFieldProps]
  }
}

