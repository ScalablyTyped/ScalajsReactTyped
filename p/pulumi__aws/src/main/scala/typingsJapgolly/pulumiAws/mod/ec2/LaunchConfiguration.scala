package typingsJapgolly.pulumiAws.mod.ec2

import typingsJapgolly.pulumiAws.launchConfigurationMod.LaunchConfigurationArgs
import typingsJapgolly.pulumiAws.launchConfigurationMod.LaunchConfigurationState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.LaunchConfiguration")
@js.native
class LaunchConfiguration protected ()
  extends typingsJapgolly.pulumiAws.ec2Mod.LaunchConfiguration {
  /**
    * Create a LaunchConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LaunchConfigurationArgs) = this()
  def this(name: String, args: LaunchConfigurationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ec2.LaunchConfiguration")
@js.native
object LaunchConfiguration extends js.Object {
  /**
    * Get an existing LaunchConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.launchConfigurationMod.LaunchConfiguration = js.native
  def get(name: String, id: Input[ID], state: LaunchConfigurationState): typingsJapgolly.pulumiAws.launchConfigurationMod.LaunchConfiguration = js.native
  def get(name: String, id: Input[ID], state: LaunchConfigurationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.launchConfigurationMod.LaunchConfiguration = js.native
  /**
    * Returns true if the given object is an instance of LaunchConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/launchConfiguration.LaunchConfiguration */ Boolean = js.native
}

