package typingsJapgolly.antd.libRadioInterfaceMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioChangeEvent extends js.Object {
  var nativeEvent: MouseEvent
  var target: RadioChangeEventTarget
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object RadioChangeEvent {
  @scala.inline
  def apply(
    nativeEvent: MouseEvent,
    preventDefault: Callback,
    stopPropagation: Callback,
    target: RadioChangeEventTarget
  ): RadioChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.asInstanceOf[RadioChangeEvent]
  }
}

