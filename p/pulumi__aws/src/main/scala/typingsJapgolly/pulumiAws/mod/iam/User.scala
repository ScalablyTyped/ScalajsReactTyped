package typingsJapgolly.pulumiAws.mod.iam

import typingsJapgolly.pulumiAws.userMod.UserArgs
import typingsJapgolly.pulumiAws.userMod.UserState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.User")
@js.native
class User protected ()
  extends typingsJapgolly.pulumiAws.iamMod.User {
  /**
    * Create a User resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: UserArgs) = this()
  def this(name: String, args: UserArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "iam.User")
@js.native
object User extends js.Object {
  /**
    * Get an existing User resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.userMod.User = js.native
  def get(name: String, id: Input[ID], state: UserState): typingsJapgolly.pulumiAws.userMod.User = js.native
  def get(name: String, id: Input[ID], state: UserState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.userMod.User = js.native
  /**
    * Returns true if the given object is an instance of User.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/user.User */ Boolean = js.native
}

