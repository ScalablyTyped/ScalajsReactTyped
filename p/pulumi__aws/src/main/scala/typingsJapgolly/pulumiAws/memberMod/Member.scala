package typingsJapgolly.pulumiAws.memberMod

import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty/member", "Member")
@js.native
class Member protected () extends CustomResource {
  /**
    * Create a Member resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MemberArgs) = this()
  def this(name: String, args: MemberArgs, opts: CustomResourceOptions) = this()
  /**
    * AWS account ID for member account.
    */
  val accountId: Output_[String] = js.native
  /**
    * The detector ID of the GuardDuty account where you want to create member accounts.
    */
  val detectorId: Output_[String] = js.native
  /**
    * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
    */
  val disableEmailNotification: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Email address for member account.
    */
  val email: Output_[String] = js.native
  /**
    * Message for invitation.
    */
  val invitationMessage: Output_[js.UndefOr[String]] = js.native
  /**
    * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationshipStatus` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
    */
  val invite: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The status of the relationship between the member account and its master account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
    */
  val relationshipStatus: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/guardduty/member", "Member")
@js.native
object Member extends js.Object {
  /**
    * Get an existing Member resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Member = js.native
  def get(name: String, id: Input[ID], state: MemberState): Member = js.native
  def get(name: String, id: Input[ID], state: MemberState, opts: CustomResourceOptions): Member = js.native
  /**
    * Returns true if the given object is an instance of Member.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/member.Member */ Boolean = js.native
}

