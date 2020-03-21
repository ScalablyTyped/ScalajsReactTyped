package typingsJapgolly.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organization extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an organization. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[OrganizationArn] = js.native
  /**
    * A list of policy types that are enabled for this organization. For example, if your organization has all features enabled, then service control policies (SCPs) are included in the list.  Even if a policy type is shown as available in the organization, you can separately enable and disable them at the root level by using EnablePolicyType and DisablePolicyType. Use ListRoots to see the status of a policy type in that root. 
    */
  var AvailablePolicyTypes: js.UndefOr[PolicyTypes] = js.native
  /**
    * Specifies the functionality that currently is available to the organization. If set to "ALL", then all features are enabled and policies can be applied to accounts in the organization. If set to "CONSOLIDATED_BILLING", then only consolidated billing functionality is available. For more information, see Enabling All Features in Your Organization in the AWS Organizations User Guide.
    */
  var FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.native
  /**
    * The unique identifier (ID) of an organization. The regex pattern for an organization ID string requires "o-" followed by from 10 to 32 lower-case letters or digits.
    */
  var Id: js.UndefOr[OrganizationId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var MasterAccountArn: js.UndefOr[AccountArn] = js.native
  /**
    * The email address that is associated with the AWS account that is designated as the master account for the organization.
    */
  var MasterAccountEmail: js.UndefOr[Email] = js.native
  /**
    * The unique identifier (ID) of the master account of an organization. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var MasterAccountId: js.UndefOr[AccountId] = js.native
}

object Organization {
  @scala.inline
  def apply(
    Arn: OrganizationArn = null,
    AvailablePolicyTypes: PolicyTypes = null,
    FeatureSet: OrganizationFeatureSet = null,
    Id: OrganizationId = null,
    MasterAccountArn: AccountArn = null,
    MasterAccountEmail: Email = null,
    MasterAccountId: AccountId = null
  ): Organization = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (AvailablePolicyTypes != null) __obj.updateDynamic("AvailablePolicyTypes")(AvailablePolicyTypes.asInstanceOf[js.Any])
    if (FeatureSet != null) __obj.updateDynamic("FeatureSet")(FeatureSet.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (MasterAccountArn != null) __obj.updateDynamic("MasterAccountArn")(MasterAccountArn.asInstanceOf[js.Any])
    if (MasterAccountEmail != null) __obj.updateDynamic("MasterAccountEmail")(MasterAccountEmail.asInstanceOf[js.Any])
    if (MasterAccountId != null) __obj.updateDynamic("MasterAccountId")(MasterAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organization]
  }
}

