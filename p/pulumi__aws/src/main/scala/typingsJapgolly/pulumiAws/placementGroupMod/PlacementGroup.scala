package typingsJapgolly.pulumiAws.placementGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.placementStrategyMod.PlacementStrategy
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/placementGroup", "PlacementGroup")
@js.native
class PlacementGroup protected () extends CustomResource {
  /**
    * Create a PlacementGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PlacementGroupArgs) = this()
  def this(name: String, args: PlacementGroupArgs, opts: CustomResourceOptions) = this()
  /**
    * The name of the placement group.
    */
  val name: Output_[String] = js.native
  /**
    * The ID of the placement group.
    */
  val placementGroupId: Output_[String] = js.native
  /**
    * The placement strategy.
    */
  val strategy: Output_[PlacementStrategy] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/placementGroup", "PlacementGroup")
@js.native
object PlacementGroup extends js.Object {
  /**
    * Get an existing PlacementGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): PlacementGroup = js.native
  def get(name: String, id: Input[ID], state: PlacementGroupState): PlacementGroup = js.native
  def get(name: String, id: Input[ID], state: PlacementGroupState, opts: CustomResourceOptions): PlacementGroup = js.native
  /**
    * Returns true if the given object is an instance of PlacementGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/placementGroup.PlacementGroup */ Boolean = js.native
}

