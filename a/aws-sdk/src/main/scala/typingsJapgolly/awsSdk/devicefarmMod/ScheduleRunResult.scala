package typingsJapgolly.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleRunResult extends js.Object {
  /**
    * Information about the scheduled run.
    */
  var run: js.UndefOr[Run] = js.native
}

object ScheduleRunResult {
  @scala.inline
  def apply(run: Run = null): ScheduleRunResult = {
    val __obj = js.Dynamic.literal()
    if (run != null) __obj.updateDynamic("run")(run.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleRunResult]
  }
}

