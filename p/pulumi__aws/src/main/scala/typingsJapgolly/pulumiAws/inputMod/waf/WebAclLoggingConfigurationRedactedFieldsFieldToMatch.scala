package typingsJapgolly.pulumiAws.inputMod.waf

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAclLoggingConfigurationRedactedFieldsFieldToMatch extends js.Object {
  /**
    * When the value of `type` is `HEADER`, enter the name of the header that you want the WAF to search, for example, `User-Agent` or `Referer`. If the value of `type` is any other value, omit `data`.
    */
  var data: js.UndefOr[Input[String]] = js.native
  /**
    * The rule type, either `REGULAR`, as defined by [Rule](http://docs.aws.amazon.com/waf/latest/APIReference/API_Rule.html), `RATE_BASED`, as defined by [RateBasedRule](http://docs.aws.amazon.com/waf/latest/APIReference/API_RateBasedRule.html), or `GROUP`, as defined by [RuleGroup](https://docs.aws.amazon.com/waf/latest/APIReference/API_RuleGroup.html). The default is REGULAR. If you add a RATE_BASED rule, you need to set `type` as `RATE_BASED`. If you add a GROUP rule, you need to set `type` as `GROUP`.
    */
  var `type`: Input[String] = js.native
}

object WebAclLoggingConfigurationRedactedFieldsFieldToMatch {
  @scala.inline
  def apply(`type`: Input[String], data: Input[String] = null): WebAclLoggingConfigurationRedactedFieldsFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]
  }
}

