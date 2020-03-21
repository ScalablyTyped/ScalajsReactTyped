package typingsJapgolly.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccountRequest extends js.Object {
  /**
    * The friendly name of the member account.
    */
  var AccountName: typingsJapgolly.awsSdk.organizationsMod.AccountName = js.native
  /**
    * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account. You must use a valid email address to complete account creation. You can't access the root user of the account or remove an account that was created with an invalid email address.
    */
  var Email: typingsJapgolly.awsSdk.organizationsMod.Email = js.native
  /**
    * If set to ALLOW, the new account enables IAM users to access account billing information if they have the required permissions. If set to DENY, only the root user of the new account can access account billing information. For more information, see Activating Access to the Billing and Cost Management Console in the AWS Billing and Cost Management User Guide. If you don't specify this parameter, the value defaults to ALLOW. This value allows IAM users and roles with the required permissions to access billing information for the new account.
    */
  var IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling] = js.native
  /**
    * (Optional) The name of an IAM role that AWS Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. If you don't specify this parameter, the role name defaults to OrganizationAccountAccessRole. For more information about how to use this role to access the member account, see Accessing and Administering the Member Accounts in Your Organization in the AWS Organizations User Guide. Also see steps 2 and 3 in Tutorial: Delegate Access Across AWS Accounts Using IAM Roles in the IAM User Guide.  The regex pattern that is used to validate this parameter. The pattern can include uppercase letters, lowercase letters, digits with no spaces, and any of the following characters: =,.@-
    */
  var RoleName: js.UndefOr[typingsJapgolly.awsSdk.organizationsMod.RoleName] = js.native
}

object CreateAccountRequest {
  @scala.inline
  def apply(
    AccountName: AccountName,
    Email: Email,
    IamUserAccessToBilling: IAMUserAccessToBilling = null,
    RoleName: RoleName = null
  ): CreateAccountRequest = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any])
    if (IamUserAccessToBilling != null) __obj.updateDynamic("IamUserAccessToBilling")(IamUserAccessToBilling.asInstanceOf[js.Any])
    if (RoleName != null) __obj.updateDynamic("RoleName")(RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountRequest]
  }
}

