package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTasks extends js.Object {
  var tasks: js.UndefOr[disabled | enabled] = js.undefined
}

object AnonTasks {
  @scala.inline
  def apply(tasks: disabled | enabled = null): AnonTasks = {
    val __obj = js.Dynamic.literal()
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTasks]
  }
}

