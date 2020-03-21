package typingsJapgolly.pulumiAws.ec2Mod

import typingsJapgolly.pulumiAws.vpnConnectionMod.VpnConnectionArgs
import typingsJapgolly.pulumiAws.vpnConnectionMod.VpnConnectionState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "VpnConnection")
@js.native
class VpnConnection protected ()
  extends typingsJapgolly.pulumiAws.vpnConnectionMod.VpnConnection {
  /**
    * Create a VpnConnection resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpnConnectionArgs) = this()
  def this(name: String, args: VpnConnectionArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "VpnConnection")
@js.native
object VpnConnection extends js.Object {
  /**
    * Get an existing VpnConnection resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.vpnConnectionMod.VpnConnection = js.native
  def get(name: String, id: Input[ID], state: VpnConnectionState): typingsJapgolly.pulumiAws.vpnConnectionMod.VpnConnection = js.native
  def get(name: String, id: Input[ID], state: VpnConnectionState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.vpnConnectionMod.VpnConnection = js.native
  /**
    * Returns true if the given object is an instance of VpnConnection.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnConnection.VpnConnection */ Boolean = js.native
}

