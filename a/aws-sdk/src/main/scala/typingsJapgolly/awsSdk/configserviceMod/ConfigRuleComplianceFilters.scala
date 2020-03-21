package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigRuleComplianceFilters extends js.Object {
  /**
    * The 12-digit account ID of the source account. 
    */
  var AccountId: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.AccountId] = js.native
  /**
    * The source region where the data is aggregated. 
    */
  var AwsRegion: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.AwsRegion] = js.native
  /**
    * The rule compliance status. For the ConfigRuleComplianceFilters data type, AWS Config supports only COMPLIANT and NON_COMPLIANT. AWS Config does not support the NOT_APPLICABLE and the INSUFFICIENT_DATA values.
    */
  var ComplianceType: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.ComplianceType] = js.native
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.ConfigRuleName] = js.native
}

object ConfigRuleComplianceFilters {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    AwsRegion: AwsRegion = null,
    ComplianceType: ComplianceType = null,
    ConfigRuleName: ConfigRuleName = null
  ): ConfigRuleComplianceFilters = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (AwsRegion != null) __obj.updateDynamic("AwsRegion")(AwsRegion.asInstanceOf[js.Any])
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType.asInstanceOf[js.Any])
    if (ConfigRuleName != null) __obj.updateDynamic("ConfigRuleName")(ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigRuleComplianceFilters]
  }
}

