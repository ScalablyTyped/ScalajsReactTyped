package typingsJapgolly.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleResult extends js.Object {
  var conditions: TopLevelCondition
  var event: js.UndefOr[Event] = js.undefined
  var name: String
  var priority: js.UndefOr[Double] = js.undefined
  var result: js.Any
}

object RuleResult {
  @scala.inline
  def apply(
    conditions: TopLevelCondition,
    name: String,
    result: js.Any,
    event: Event = null,
    priority: Int | Double = null
  ): RuleResult = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleResult]
  }
}

