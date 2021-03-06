package typingsJapgolly.pulumiAws.mod.ec2

import typingsJapgolly.pulumiAws.vpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociationArgs
import typingsJapgolly.pulumiAws.vpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociationState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.VpcIpv4CidrBlockAssociation")
@js.native
class VpcIpv4CidrBlockAssociation protected ()
  extends typingsJapgolly.pulumiAws.ec2Mod.VpcIpv4CidrBlockAssociation {
  /**
    * Create a VpcIpv4CidrBlockAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcIpv4CidrBlockAssociationArgs) = this()
  def this(name: String, args: VpcIpv4CidrBlockAssociationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ec2.VpcIpv4CidrBlockAssociation")
@js.native
object VpcIpv4CidrBlockAssociation extends js.Object {
  /**
    * Get an existing VpcIpv4CidrBlockAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.vpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociation = js.native
  def get(name: String, id: Input[ID], state: VpcIpv4CidrBlockAssociationState): typingsJapgolly.pulumiAws.vpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociation = js.native
  def get(name: String, id: Input[ID], state: VpcIpv4CidrBlockAssociationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.vpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociation = js.native
  /**
    * Returns true if the given object is an instance of VpcIpv4CidrBlockAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcIpv4CidrBlockAssociation.VpcIpv4CidrBlockAssociation */ Boolean = js.native
}

