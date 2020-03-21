package typingsJapgolly.pulumiAws.ec2Mod

import typingsJapgolly.pulumiAws.vpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepterArgs
import typingsJapgolly.pulumiAws.vpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepterState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "VpcPeeringConnectionAccepter")
@js.native
class VpcPeeringConnectionAccepter protected ()
  extends typingsJapgolly.pulumiAws.vpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter {
  /**
    * Create a VpcPeeringConnectionAccepter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcPeeringConnectionAccepterArgs) = this()
  def this(name: String, args: VpcPeeringConnectionAccepterArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "VpcPeeringConnectionAccepter")
@js.native
object VpcPeeringConnectionAccepter extends js.Object {
  /**
    * Get an existing VpcPeeringConnectionAccepter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.vpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter = js.native
  def get(name: String, id: Input[ID], state: VpcPeeringConnectionAccepterState): typingsJapgolly.pulumiAws.vpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter = js.native
  def get(name: String, id: Input[ID], state: VpcPeeringConnectionAccepterState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.vpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter = js.native
  /**
    * Returns true if the given object is an instance of VpcPeeringConnectionAccepter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcPeeringConnectionAccepter.VpcPeeringConnectionAccepter */ Boolean = js.native
}

