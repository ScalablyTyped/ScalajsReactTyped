package typingsJapgolly.pulumiAws.mod.iam

import typingsJapgolly.pulumiAws.userLoginProfileMod.UserLoginProfileArgs
import typingsJapgolly.pulumiAws.userLoginProfileMod.UserLoginProfileState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.UserLoginProfile")
@js.native
class UserLoginProfile protected ()
  extends typingsJapgolly.pulumiAws.iamMod.UserLoginProfile {
  /**
    * Create a UserLoginProfile resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UserLoginProfileArgs) = this()
  def this(name: String, args: UserLoginProfileArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "iam.UserLoginProfile")
@js.native
object UserLoginProfile extends js.Object {
  /**
    * Get an existing UserLoginProfile resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.userLoginProfileMod.UserLoginProfile = js.native
  def get(name: String, id: Input[ID], state: UserLoginProfileState): typingsJapgolly.pulumiAws.userLoginProfileMod.UserLoginProfile = js.native
  def get(name: String, id: Input[ID], state: UserLoginProfileState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.userLoginProfileMod.UserLoginProfile = js.native
  /**
    * Returns true if the given object is an instance of UserLoginProfile.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userLoginProfile.UserLoginProfile */ Boolean = js.native
}

