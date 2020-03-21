package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationConfigRule extends js.Object {
  /**
    * A comma-separated list of accounts excluded from organization config rule.
    */
  var ExcludedAccounts: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.ExcludedAccounts] = js.native
  /**
    * The timestamp of the last update.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.native
  /**
    * Amazon Resource Name (ARN) of organization config rule.
    */
  var OrganizationConfigRuleArn: StringWithCharLimit256 = js.native
  /**
    * The name that you assign to organization config rule.
    */
  var OrganizationConfigRuleName: typingsJapgolly.awsSdk.configserviceMod.OrganizationConfigRuleName = js.native
  /**
    * An OrganizationCustomRuleMetadata object.
    */
  var OrganizationCustomRuleMetadata: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.OrganizationCustomRuleMetadata] = js.native
  /**
    * An OrganizationManagedRuleMetadata object.
    */
  var OrganizationManagedRuleMetadata: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.OrganizationManagedRuleMetadata] = js.native
}

object OrganizationConfigRule {
  @scala.inline
  def apply(
    OrganizationConfigRuleArn: StringWithCharLimit256,
    OrganizationConfigRuleName: OrganizationConfigRuleName,
    ExcludedAccounts: ExcludedAccounts = null,
    LastUpdateTime: js.Date = null,
    OrganizationCustomRuleMetadata: OrganizationCustomRuleMetadata = null,
    OrganizationManagedRuleMetadata: OrganizationManagedRuleMetadata = null
  ): OrganizationConfigRule = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleArn = OrganizationConfigRuleArn.asInstanceOf[js.Any], OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    if (ExcludedAccounts != null) __obj.updateDynamic("ExcludedAccounts")(ExcludedAccounts.asInstanceOf[js.Any])
    if (LastUpdateTime != null) __obj.updateDynamic("LastUpdateTime")(LastUpdateTime.asInstanceOf[js.Any])
    if (OrganizationCustomRuleMetadata != null) __obj.updateDynamic("OrganizationCustomRuleMetadata")(OrganizationCustomRuleMetadata.asInstanceOf[js.Any])
    if (OrganizationManagedRuleMetadata != null) __obj.updateDynamic("OrganizationManagedRuleMetadata")(OrganizationManagedRuleMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConfigRule]
  }
}

