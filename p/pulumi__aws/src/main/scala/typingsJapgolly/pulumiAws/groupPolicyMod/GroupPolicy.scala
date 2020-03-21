package typingsJapgolly.pulumiAws.groupPolicyMod

import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/groupPolicy", "GroupPolicy")
@js.native
class GroupPolicy protected () extends CustomResource {
  /**
    * Create a GroupPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GroupPolicyArgs) = this()
  def this(name: String, args: GroupPolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * The IAM group to attach to the policy.
    */
  val group: Output_[String] = js.native
  /**
    * The name of the policy. If omitted, this provider will
    * assign a random, unique name.
    */
  val name: Output_[String] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: Output_[js.UndefOr[String]] = js.native
  val policy: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/groupPolicy", "GroupPolicy")
@js.native
object GroupPolicy extends js.Object {
  /**
    * Get an existing GroupPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): GroupPolicy = js.native
  def get(name: String, id: Input[ID], state: GroupPolicyState): GroupPolicy = js.native
  def get(name: String, id: Input[ID], state: GroupPolicyState, opts: CustomResourceOptions): GroupPolicy = js.native
  /**
    * Returns true if the given object is an instance of GroupPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/groupPolicy.GroupPolicy */ Boolean = js.native
}

