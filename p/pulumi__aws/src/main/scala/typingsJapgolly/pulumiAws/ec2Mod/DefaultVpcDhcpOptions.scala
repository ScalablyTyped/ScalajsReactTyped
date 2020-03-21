package typingsJapgolly.pulumiAws.ec2Mod

import typingsJapgolly.pulumiAws.defaultVpcDhcpOptionsMod.DefaultVpcDhcpOptionsArgs
import typingsJapgolly.pulumiAws.defaultVpcDhcpOptionsMod.DefaultVpcDhcpOptionsState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "DefaultVpcDhcpOptions")
@js.native
class DefaultVpcDhcpOptions protected ()
  extends typingsJapgolly.pulumiAws.defaultVpcDhcpOptionsMod.DefaultVpcDhcpOptions {
  /**
    * Create a DefaultVpcDhcpOptions resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: DefaultVpcDhcpOptionsArgs) = this()
  def this(name: String, args: DefaultVpcDhcpOptionsArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "DefaultVpcDhcpOptions")
@js.native
object DefaultVpcDhcpOptions extends js.Object {
  /**
    * Get an existing DefaultVpcDhcpOptions resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.defaultVpcDhcpOptionsMod.DefaultVpcDhcpOptions = js.native
  def get(name: String, id: Input[ID], state: DefaultVpcDhcpOptionsState): typingsJapgolly.pulumiAws.defaultVpcDhcpOptionsMod.DefaultVpcDhcpOptions = js.native
  def get(name: String, id: Input[ID], state: DefaultVpcDhcpOptionsState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.defaultVpcDhcpOptionsMod.DefaultVpcDhcpOptions = js.native
  /**
    * Returns true if the given object is an instance of DefaultVpcDhcpOptions.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultVpcDhcpOptions.DefaultVpcDhcpOptions */ Boolean = js.native
}

