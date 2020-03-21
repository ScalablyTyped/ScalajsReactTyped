package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComplianceSummaryByConfigRuleResponse extends js.Object {
  /**
    * The number of AWS Config rules that are compliant and the number that are noncompliant, up to a maximum of 25 for each.
    */
  var ComplianceSummary: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.ComplianceSummary] = js.native
}

object GetComplianceSummaryByConfigRuleResponse {
  @scala.inline
  def apply(ComplianceSummary: ComplianceSummary = null): GetComplianceSummaryByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ComplianceSummary != null) __obj.updateDynamic("ComplianceSummary")(ComplianceSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComplianceSummaryByConfigRuleResponse]
  }
}

