package typingsJapgolly.pulumiAws.resourceGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/inspector/resourceGroup", "ResourceGroup")
@js.native
class ResourceGroup protected () extends CustomResource {
  /**
    * Create a ResourceGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResourceGroupArgs) = this()
  def this(name: String, args: ResourceGroupArgs, opts: CustomResourceOptions) = this()
  /**
    * The resource group ARN.
    */
  val arn: Output_[String] = js.native
  /**
    * Key-value map of tags that are used to select the EC2 instances to be included in an [Amazon Inspector assessment target](https://www.terraform.io/docs/providers/aws/r/inspector_assessment_target.html).
    */
  val tags: Output_[StringDictionary[_]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/inspector/resourceGroup", "ResourceGroup")
@js.native
object ResourceGroup extends js.Object {
  /**
    * Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ResourceGroup = js.native
  def get(name: String, id: Input[ID], state: ResourceGroupState): ResourceGroup = js.native
  def get(name: String, id: Input[ID], state: ResourceGroupState, opts: CustomResourceOptions): ResourceGroup = js.native
  /**
    * Returns true if the given object is an instance of ResourceGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/resourceGroup.ResourceGroup */ Boolean = js.native
}

