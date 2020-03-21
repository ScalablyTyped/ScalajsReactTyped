package typingsJapgolly.jsonRulesEngine.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleProperties extends js.Object {
  var conditions: TopLevelCondition
  var event: Event
  var name: js.UndefOr[String] = js.undefined
  var onFailure: js.UndefOr[EventHandler] = js.undefined
  var onSuccess: js.UndefOr[EventHandler] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
}

object RuleProperties {
  @scala.inline
  def apply(
    conditions: TopLevelCondition,
    event: Event,
    name: String = null,
    onFailure: (/* event */ Event, /* almanac */ Almanac, /* ruleResult */ RuleResult) => Callback = null,
    onSuccess: (/* event */ Event, /* almanac */ Almanac, /* ruleResult */ RuleResult) => Callback = null,
    priority: Int | Double = null
  ): RuleProperties = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction3((t0: /* event */ typingsJapgolly.jsonRulesEngine.mod.Event, t1: /* almanac */ typingsJapgolly.jsonRulesEngine.mod.Almanac, t2: /* ruleResult */ typingsJapgolly.jsonRulesEngine.mod.RuleResult) => onFailure(t0, t1, t2).runNow()))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction3((t0: /* event */ typingsJapgolly.jsonRulesEngine.mod.Event, t1: /* almanac */ typingsJapgolly.jsonRulesEngine.mod.Almanac, t2: /* ruleResult */ typingsJapgolly.jsonRulesEngine.mod.RuleResult) => onSuccess(t0, t1, t2).runNow()))
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleProperties]
  }
}

