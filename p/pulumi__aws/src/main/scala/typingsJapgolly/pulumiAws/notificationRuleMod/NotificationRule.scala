package typingsJapgolly.pulumiAws.notificationRuleMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.outputMod.codestarnotifications.NotificationRuleTarget
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codestarnotifications/notificationRule", "NotificationRule")
@js.native
class NotificationRule protected () extends CustomResource {
  /**
    * Create a NotificationRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NotificationRuleArgs) = this()
  def this(name: String, args: NotificationRuleArgs, opts: CustomResourceOptions) = this()
  /**
    * The codestar notification rule ARN.
    */
  val arn: Output_[String] = js.native
  /**
    * The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
    */
  val detailType: Output_[String] = js.native
  /**
    * A list of event types associated with this notification rule.
    * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
    */
  val eventTypeIds: Output_[js.Array[String]] = js.native
  /**
    * The name of notification rule.
    */
  val name: Output_[String] = js.native
  /**
    * The ARN of the resource to associate with the notification rule.
    */
  val resource: Output_[String] = js.native
  /**
    * The status of the notification rule. Possible balues are `ENABLED` and `DISABLED`, default is `ENABLED`.
    */
  val status: Output_[js.UndefOr[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
    */
  val targets: Output_[js.UndefOr[js.Array[NotificationRuleTarget]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/codestarnotifications/notificationRule", "NotificationRule")
@js.native
object NotificationRule extends js.Object {
  /**
    * Get an existing NotificationRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): NotificationRule = js.native
  def get(name: String, id: Input[ID], state: NotificationRuleState): NotificationRule = js.native
  def get(name: String, id: Input[ID], state: NotificationRuleState, opts: CustomResourceOptions): NotificationRule = js.native
  /**
    * Returns true if the given object is an instance of NotificationRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codestarnotifications/notificationRule.NotificationRule */ Boolean = js.native
}

