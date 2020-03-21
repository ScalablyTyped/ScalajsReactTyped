package typingsJapgolly.pulumiAws.inputMod.waf

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleGroupActivatedRuleAction extends js.Object {
  /**
    * The rule type, either [`REGULAR`](https://www.terraform.io/docs/providers/aws/r/waf_rule.html), [`RATE_BASED`](https://www.terraform.io/docs/providers/aws/r/waf_rate_based_rule.html), or `GROUP`. Defaults to `REGULAR`.
    */
  var `type`: Input[String] = js.native
}

object RuleGroupActivatedRuleAction {
  @scala.inline
  def apply(`type`: Input[String]): RuleGroupActivatedRuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupActivatedRuleAction]
  }
}

