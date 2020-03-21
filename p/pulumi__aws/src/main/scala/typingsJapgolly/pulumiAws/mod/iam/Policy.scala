package typingsJapgolly.pulumiAws.mod.iam

import typingsJapgolly.pulumiAws.iamPolicyMod.PolicyArgs
import typingsJapgolly.pulumiAws.iamPolicyMod.PolicyState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.Policy")
@js.native
class Policy protected ()
  extends typingsJapgolly.pulumiAws.iamMod.Policy {
  /**
    * Create a Policy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PolicyArgs) = this()
  def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "iam.Policy")
@js.native
object Policy extends js.Object {
  /**
    * Get an existing Policy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.iamPolicyMod.Policy = js.native
  def get(name: String, id: Input[ID], state: PolicyState): typingsJapgolly.pulumiAws.iamPolicyMod.Policy = js.native
  def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.iamPolicyMod.Policy = js.native
  /**
    * Returns true if the given object is an instance of Policy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/policy.Policy */ Boolean = js.native
}

