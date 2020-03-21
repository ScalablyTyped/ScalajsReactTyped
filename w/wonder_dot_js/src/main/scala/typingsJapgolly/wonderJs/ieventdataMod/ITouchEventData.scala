package typingsJapgolly.wonderJs.ieventdataMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchEventData extends IEventData {
  var changedTouches: js.Array[ITouchData]
  var currentTarget: HTMLElement | Null
  var target: HTMLElement
  var targetTouches: js.Array[ITouchData]
  var touches: js.Array[ITouchData]
}

object ITouchEventData {
  @scala.inline
  def apply(
    changedTouches: js.Array[ITouchData],
    preventDefault: Callback,
    returnValue: Boolean,
    target: HTMLElement,
    targetTouches: js.Array[ITouchData],
    touches: js.Array[ITouchData],
    currentTarget: HTMLElement = null
  ): ITouchEventData = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetTouches = targetTouches.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITouchEventData]
  }
}

