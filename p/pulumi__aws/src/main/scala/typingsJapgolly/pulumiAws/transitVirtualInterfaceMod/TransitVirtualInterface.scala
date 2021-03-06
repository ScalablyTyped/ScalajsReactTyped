package typingsJapgolly.pulumiAws.transitVirtualInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/transitVirtualInterface", "TransitVirtualInterface")
@js.native
class TransitVirtualInterface protected () extends CustomResource {
  /**
    * Create a TransitVirtualInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TransitVirtualInterfaceArgs) = this()
  def this(name: String, args: TransitVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: Output_[String] = js.native
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
    */
  val amazonAddress: Output_[String] = js.native
  /**
    * The ARN of the virtual interface.
    */
  val arn: Output_[String] = js.native
  /**
    * The Direct Connect endpoint on which the virtual interface terminates.
    */
  val awsDevice: Output_[String] = js.native
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: Output_[Double] = js.native
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: Output_[String] = js.native
  /**
    * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
    */
  val connectionId: Output_[String] = js.native
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
    */
  val customerAddress: Output_[String] = js.native
  /**
    * The ID of the Direct Connect gateway to which to connect the virtual interface.
    */
  val dxGatewayId: Output_[String] = js.native
  /**
    * Indicates whether jumbo frames (8500 MTU) are supported.
    */
  val jumboFrameCapable: Output_[Boolean] = js.native
  /**
    * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
    * The MTU of a virtual transit interface can be either `1500` or `8500` (jumbo frames). Default is `1500`.
    */
  val mtu: Output_[js.UndefOr[Double]] = js.native
  /**
    * The name for the virtual interface.
    */
  val name: Output_[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The VLAN ID.
    */
  val vlan: Output_[Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directconnect/transitVirtualInterface", "TransitVirtualInterface")
@js.native
object TransitVirtualInterface extends js.Object {
  /**
    * Get an existing TransitVirtualInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): TransitVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: TransitVirtualInterfaceState): TransitVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: TransitVirtualInterfaceState, opts: CustomResourceOptions): TransitVirtualInterface = js.native
  /**
    * Returns true if the given object is an instance of TransitVirtualInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/transitVirtualInterface.TransitVirtualInterface */ Boolean = js.native
}

