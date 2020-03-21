package typingsJapgolly.pulumiAws.directconnectMod

import typingsJapgolly.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptorArgs
import typingsJapgolly.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptorState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterfaceAcceptor")
@js.native
class HostedTransitVirtualInterfaceAcceptor protected ()
  extends typingsJapgolly.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor {
  /**
    * Create a HostedTransitVirtualInterfaceAcceptor resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HostedTransitVirtualInterfaceAcceptorArgs) = this()
  def this(name: String, args: HostedTransitVirtualInterfaceAcceptorArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterfaceAcceptor")
@js.native
object HostedTransitVirtualInterfaceAcceptor extends js.Object {
  /**
    * Get an existing HostedTransitVirtualInterfaceAcceptor resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor = js.native
  def get(name: String, id: Input[ID], state: HostedTransitVirtualInterfaceAcceptorState): typingsJapgolly.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor = js.native
  def get(
    name: String,
    id: Input[ID],
    state: HostedTransitVirtualInterfaceAcceptorState,
    opts: CustomResourceOptions
  ): typingsJapgolly.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor = js.native
  /**
    * Returns true if the given object is an instance of HostedTransitVirtualInterfaceAcceptor.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor.HostedTransitVirtualInterfaceAcceptor */ Boolean = js.native
}

