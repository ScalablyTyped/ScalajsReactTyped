package typingsJapgolly.nodeCron.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledTask extends js.Object {
  def destroy(): Unit
  def getStatus(): String
  def start(): this.type
  def stop(): this.type
}

object ScheduledTask {
  @scala.inline
  def apply(
    destroy: Callback,
    getStatus: CallbackTo[String],
    start: CallbackTo[ScheduledTask],
    stop: CallbackTo[ScheduledTask]
  ): ScheduledTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getStatus")(getStatus.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[ScheduledTask]
  }
}

