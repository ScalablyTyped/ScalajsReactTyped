package typingsJapgolly.reduxForm.fieldMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonFieldInputProps extends js.Object {
  var name: String
  var onDragStart: EventHandler[ReactDragEventFrom[Element]]
  var onDrop: EventHandler[ReactDragEventFrom[Element]]
  var onFocus: EventHandler[ReactFocusEventFrom[Element]]
}

object CommonFieldInputProps {
  @scala.inline
  def apply(
    name: String,
    onDragStart: (ReactDragEventFrom[Element], /* name */ js.UndefOr[String]) => Callback,
    onDrop: (ReactDragEventFrom[Element], /* name */ js.UndefOr[String]) => Callback,
    onFocus: (ReactFocusEventFrom[Element], /* name */ js.UndefOr[String]) => Callback
  ): CommonFieldInputProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("onDragStart")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* name */ js.UndefOr[java.lang.String]) => onDragStart(t0, t1).runNow()))
    __obj.updateDynamic("onDrop")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* name */ js.UndefOr[java.lang.String]) => onDrop(t0, t1).runNow()))
    __obj.updateDynamic("onFocus")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element], t1: /* name */ js.UndefOr[java.lang.String]) => onFocus(t0, t1).runNow()))
    __obj.asInstanceOf[CommonFieldInputProps]
  }
}

