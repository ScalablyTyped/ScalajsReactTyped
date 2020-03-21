package typingsJapgolly.ol.eventMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEvent extends js.Object {
  var target: js.Any
  var `type`: String
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object BaseEvent {
  @scala.inline
  def apply(preventDefault: Callback, stopPropagation: Callback, target: js.Any, `type`: String): BaseEvent = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent]
  }
}

