package typingsJapgolly.cucumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioResult extends js.Object {
  var duration: Double
  var exception: js.UndefOr[js.Error] = js.undefined
  var status: Status
}

object ScenarioResult {
  @scala.inline
  def apply(duration: Double, status: Status, exception: js.Error = null): ScenarioResult = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (exception != null) __obj.updateDynamic("exception")(exception.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenarioResult]
  }
}

