package typingsJapgolly.reactSelect.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Ref
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-select.react-select/src/types.PropsWithInnerRef & {  data  :any,   id  :number,   index  :number,   isDisabled  :boolean,   isFocused  :boolean,   isSelected  :boolean,   label  :string,   onClick  :react-select.react-select/src/types.MouseEventHandler,   onMouseOver  :react-select.react-select/src/types.MouseEventHandler,   value  :any} */
trait OptionProps extends js.Object {
  var data: js.Any
  var id: Double
  var index: Double
  /** The inner reference. */
  var innerRef: Ref
  var isDisabled: Boolean
  var isFocused: Boolean
  var isSelected: Boolean
  var label: String
  var onClick: MouseEventHandler
  var onMouseOver: MouseEventHandler
  var value: js.Any
}

object OptionProps {
  @scala.inline
  def apply(
    data: js.Any,
    id: Double,
    index: Double,
    isDisabled: Boolean,
    isFocused: Boolean,
    isSelected: Boolean,
    label: String,
    onClick: /* event */ ReactMouseEventFrom[HTMLElement] => Callback,
    onMouseOver: /* event */ ReactMouseEventFrom[HTMLElement] => Callback,
    value: js.Any,
    innerRef: Ref = null
  ): OptionProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0).runNow()))
    __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseOver(t0).runNow()))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionProps]
  }
}

