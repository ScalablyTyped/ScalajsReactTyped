package typingsJapgolly.pulumiAws.mod.iam

import typingsJapgolly.pulumiAws.rolePolicyMod.RolePolicyArgs
import typingsJapgolly.pulumiAws.rolePolicyMod.RolePolicyState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.RolePolicy")
@js.native
class RolePolicy protected ()
  extends typingsJapgolly.pulumiAws.iamMod.RolePolicy {
  /**
    * Create a RolePolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RolePolicyArgs) = this()
  def this(name: String, args: RolePolicyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "iam.RolePolicy")
@js.native
object RolePolicy extends js.Object {
  /**
    * Get an existing RolePolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.rolePolicyMod.RolePolicy = js.native
  def get(name: String, id: Input[ID], state: RolePolicyState): typingsJapgolly.pulumiAws.rolePolicyMod.RolePolicy = js.native
  def get(name: String, id: Input[ID], state: RolePolicyState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.rolePolicyMod.RolePolicy = js.native
  /**
    * Returns true if the given object is an instance of RolePolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/rolePolicy.RolePolicy */ Boolean = js.native
}

