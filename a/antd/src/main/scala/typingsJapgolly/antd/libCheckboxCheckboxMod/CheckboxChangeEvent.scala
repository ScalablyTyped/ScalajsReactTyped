package typingsJapgolly.antd.libCheckboxCheckboxMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxChangeEvent extends js.Object {
  var nativeEvent: MouseEvent
  var target: CheckboxChangeEventTarget
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object CheckboxChangeEvent {
  @scala.inline
  def apply(
    nativeEvent: MouseEvent,
    preventDefault: Callback,
    stopPropagation: Callback,
    target: CheckboxChangeEventTarget
  ): CheckboxChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.asInstanceOf[CheckboxChangeEvent]
  }
}

