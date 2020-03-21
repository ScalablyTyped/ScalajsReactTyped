package typingsJapgolly.zoneJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.zoneJs.zoneJsStrings.macroTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacroTask extends Task {
  @JSName("type")
  var type_MacroTask: macroTask
}

object MacroTask {
  @scala.inline
  def apply(
    callback: js.Function,
    cancelScheduleRequest: Callback,
    invoke: js.Function,
    runCount: Double,
    source: String,
    state: TaskState,
    `type`: macroTask,
    zone: Zone,
    cancelFn: /* task */ Task => Callback = null,
    data: TaskData = null,
    scheduleFn: /* task */ Task => Callback = null
  ): MacroTask = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], invoke = invoke.asInstanceOf[js.Any], runCount = runCount.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.updateDynamic("cancelScheduleRequest")(cancelScheduleRequest.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cancelFn != null) __obj.updateDynamic("cancelFn")(js.Any.fromFunction1((t0: /* task */ typingsJapgolly.zoneJs.Task) => cancelFn(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (scheduleFn != null) __obj.updateDynamic("scheduleFn")(js.Any.fromFunction1((t0: /* task */ typingsJapgolly.zoneJs.Task) => scheduleFn(t0).runNow()))
    __obj.asInstanceOf[MacroTask]
  }
}

