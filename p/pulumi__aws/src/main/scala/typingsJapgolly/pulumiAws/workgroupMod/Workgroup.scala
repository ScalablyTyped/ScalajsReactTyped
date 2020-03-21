package typingsJapgolly.pulumiAws.workgroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.outputMod.athena.WorkgroupConfiguration
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/athena/workgroup", "Workgroup")
@js.native
class Workgroup protected () extends CustomResource {
  /**
    * Create a Workgroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: WorkgroupArgs) = this()
  def this(name: String, args: WorkgroupArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the workgroup
    */
  val arn: Output_[String] = js.native
  /**
    * Configuration block with various settings for the workgroup. Documented below.
    */
  val configuration: Output_[js.UndefOr[WorkgroupConfiguration]] = js.native
  /**
    * Description of the workgroup.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * Name of the workgroup.
    */
  val name: Output_[String] = js.native
  /**
    * State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
    */
  val state: Output_[js.UndefOr[String]] = js.native
  /**
    * Key-value mapping of resource tags for the workgroup.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/athena/workgroup", "Workgroup")
@js.native
object Workgroup extends js.Object {
  /**
    * Get an existing Workgroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Workgroup = js.native
  def get(name: String, id: Input[ID], state: WorkgroupState): Workgroup = js.native
  def get(name: String, id: Input[ID], state: WorkgroupState, opts: CustomResourceOptions): Workgroup = js.native
  /**
    * Returns true if the given object is an instance of Workgroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/workgroup.Workgroup */ Boolean = js.native
}

