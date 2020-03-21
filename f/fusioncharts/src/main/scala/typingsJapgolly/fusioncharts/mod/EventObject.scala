package typingsJapgolly.fusioncharts.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObject extends js.Object {
  var cancelled: Boolean
  var detached: Boolean
  var eventId: Double
  var prevented: Boolean
  var sender: FusionCharts
  var `type`: String
  def detachHandler(): Unit
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object EventObject {
  @scala.inline
  def apply(
    cancelled: Boolean,
    detachHandler: Callback,
    detached: Boolean,
    eventId: Double,
    preventDefault: Callback,
    prevented: Boolean,
    sender: FusionCharts,
    stopPropagation: Callback,
    `type`: String
  ): EventObject = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], detached = detached.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], prevented = prevented.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("detachHandler")(detachHandler.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
}

