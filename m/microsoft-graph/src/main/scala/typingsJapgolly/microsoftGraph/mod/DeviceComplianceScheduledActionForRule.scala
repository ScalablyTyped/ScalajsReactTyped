package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceComplianceScheduledActionForRule extends Entity {
  // Name of the rule which this scheduled action applies to.
  var ruleName: js.UndefOr[String] = js.undefined
  // The list of scheduled action configurations for this compliance policy.
  var scheduledActionConfigurations: js.UndefOr[js.Array[DeviceComplianceActionItem]] = js.undefined
}

object DeviceComplianceScheduledActionForRule {
  @scala.inline
  def apply(
    id: String = null,
    ruleName: String = null,
    scheduledActionConfigurations: js.Array[DeviceComplianceActionItem] = null
  ): DeviceComplianceScheduledActionForRule = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ruleName != null) __obj.updateDynamic("ruleName")(ruleName.asInstanceOf[js.Any])
    if (scheduledActionConfigurations != null) __obj.updateDynamic("scheduledActionConfigurations")(scheduledActionConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceComplianceScheduledActionForRule]
  }
}

