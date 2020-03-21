package typingsJapgolly.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskRoutingConfigurationOptions extends js.Object {
  var defaultFilter: js.UndefOr[WorkflowRuleOptions] = js.undefined
  var default_filter: js.UndefOr[WorkflowRuleOptions] = js.undefined
  var filters: js.Array[WorkflowRuleOptions]
}

object TaskRoutingConfigurationOptions {
  @scala.inline
  def apply(
    filters: js.Array[WorkflowRuleOptions],
    defaultFilter: WorkflowRuleOptions = null,
    default_filter: WorkflowRuleOptions = null
  ): TaskRoutingConfigurationOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    if (defaultFilter != null) __obj.updateDynamic("defaultFilter")(defaultFilter.asInstanceOf[js.Any])
    if (default_filter != null) __obj.updateDynamic("default_filter")(default_filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRoutingConfigurationOptions]
  }
}

