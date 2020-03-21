package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasSchedulesBuilder[B] extends js.Object {
  def withSchedules(schedules: ExtensionScheduleInput): B
}

object hasSchedulesBuilder {
  @scala.inline
  def apply[B](withSchedules: ExtensionScheduleInput => CallbackTo[B]): hasSchedulesBuilder[B] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("withSchedules")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.ExtensionScheduleInput) => withSchedules(t0).runNow()))
    __obj.asInstanceOf[hasSchedulesBuilder[B]]
  }
}

