package typingsJapgolly.pulumiAws.resourceAssociationMod

import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ram/resourceAssociation", "ResourceAssociation")
@js.native
class ResourceAssociation protected () extends CustomResource {
  /**
    * Create a ResourceAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResourceAssociationArgs) = this()
  def this(name: String, args: ResourceAssociationArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
    */
  val resourceArn: Output_[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the RAM Resource Share.
    */
  val resourceShareArn: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ram/resourceAssociation", "ResourceAssociation")
@js.native
object ResourceAssociation extends js.Object {
  /**
    * Get an existing ResourceAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ResourceAssociation = js.native
  def get(name: String, id: Input[ID], state: ResourceAssociationState): ResourceAssociation = js.native
  def get(name: String, id: Input[ID], state: ResourceAssociationState, opts: CustomResourceOptions): ResourceAssociation = js.native
  /**
    * Returns true if the given object is an instance of ResourceAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceAssociation.ResourceAssociation */ Boolean = js.native
}

