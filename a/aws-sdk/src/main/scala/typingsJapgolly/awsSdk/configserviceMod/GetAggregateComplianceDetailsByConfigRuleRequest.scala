package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAggregateComplianceDetailsByConfigRuleRequest extends js.Object {
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: typingsJapgolly.awsSdk.configserviceMod.AccountId = js.native
  /**
    * The source region from where the data is aggregated.
    */
  var AwsRegion: typingsJapgolly.awsSdk.configserviceMod.AwsRegion = js.native
  /**
    * The resource compliance status.  For the GetAggregateComplianceDetailsByConfigRuleRequest data type, AWS Config supports only the COMPLIANT and NON_COMPLIANT. AWS Config does not support the NOT_APPLICABLE and INSUFFICIENT_DATA values. 
    */
  var ComplianceType: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.ComplianceType] = js.native
  /**
    * The name of the AWS Config rule for which you want compliance information.
    */
  var ConfigRuleName: typingsJapgolly.awsSdk.configserviceMod.ConfigRuleName = js.native
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typingsJapgolly.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
  /**
    * The maximum number of evaluation results returned on each page. The default is 50. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.Limit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.NextToken] = js.native
}

object GetAggregateComplianceDetailsByConfigRuleRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    AwsRegion: AwsRegion,
    ConfigRuleName: ConfigRuleName,
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    ComplianceType: ComplianceType = null,
    Limit: Int | Double = null,
    NextToken: NextToken = null
  ): GetAggregateComplianceDetailsByConfigRuleRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], AwsRegion = AwsRegion.asInstanceOf[js.Any], ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateComplianceDetailsByConfigRuleRequest]
  }
}

