package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComplianceDetailsByConfigRuleRequest extends js.Object {
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE.
    */
  var ComplianceTypes: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.ComplianceTypes] = js.native
  /**
    * The name of the AWS Config rule for which you want compliance information.
    */
  var ConfigRuleName: StringWithCharLimit64 = js.native
  /**
    * The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.Limit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.NextToken] = js.native
}

object GetComplianceDetailsByConfigRuleRequest {
  @scala.inline
  def apply(
    ConfigRuleName: StringWithCharLimit64,
    ComplianceTypes: ComplianceTypes = null,
    Limit: Int | Double = null,
    NextToken: NextToken = null
  ): GetComplianceDetailsByConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    if (ComplianceTypes != null) __obj.updateDynamic("ComplianceTypes")(ComplianceTypes.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComplianceDetailsByConfigRuleRequest]
  }
}

