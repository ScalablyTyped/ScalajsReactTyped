package typingsJapgolly.azureSb.ruleresultMod.Azure.ServiceBus.Results

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.azureSb.mod.Azure.ServiceBus.CreateRuleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleResult extends js.Object {
  def parse(xml: js.Object): js.Object | js.Array[js.Object]
  def serialize(rule: CreateRuleOptions): String
}

object RuleResult {
  @scala.inline
  def apply(
    parse: js.Object => CallbackTo[js.Object | js.Array[js.Object]],
    serialize: CreateRuleOptions => CallbackTo[String]
  ): RuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: js.Object) => parse(t0).runNow()))
    __obj.updateDynamic("serialize")(js.Any.fromFunction1((t0: typingsJapgolly.azureSb.mod.Azure.ServiceBus.CreateRuleOptions) => serialize(t0).runNow()))
    __obj.asInstanceOf[RuleResult]
  }
}

