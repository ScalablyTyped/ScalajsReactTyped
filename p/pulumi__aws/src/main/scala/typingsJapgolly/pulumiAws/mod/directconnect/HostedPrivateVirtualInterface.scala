package typingsJapgolly.pulumiAws.mod.directconnect

import typingsJapgolly.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterfaceArgs
import typingsJapgolly.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterfaceState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "directconnect.HostedPrivateVirtualInterface")
@js.native
class HostedPrivateVirtualInterface protected ()
  extends typingsJapgolly.pulumiAws.directconnectMod.HostedPrivateVirtualInterface {
  /**
    * Create a HostedPrivateVirtualInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HostedPrivateVirtualInterfaceArgs) = this()
  def this(name: String, args: HostedPrivateVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "directconnect.HostedPrivateVirtualInterface")
@js.native
object HostedPrivateVirtualInterface extends js.Object {
  /**
    * Get an existing HostedPrivateVirtualInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: HostedPrivateVirtualInterfaceState): typingsJapgolly.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
  def get(
    name: String,
    id: Input[ID],
    state: HostedPrivateVirtualInterfaceState,
    opts: CustomResourceOptions
  ): typingsJapgolly.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
  /**
    * Returns true if the given object is an instance of HostedPrivateVirtualInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPrivateVirtualInterface.HostedPrivateVirtualInterface */ Boolean = js.native
}

