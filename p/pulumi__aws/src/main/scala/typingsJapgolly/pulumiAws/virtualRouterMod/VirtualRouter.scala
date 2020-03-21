package typingsJapgolly.pulumiAws.virtualRouterMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.outputMod.appmesh.VirtualRouterSpec
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appmesh/virtualRouter", "VirtualRouter")
@js.native
class VirtualRouter protected () extends CustomResource {
  /**
    * Create a VirtualRouter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VirtualRouterArgs) = this()
  def this(name: String, args: VirtualRouterArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the virtual router.
    */
  val arn: Output_[String] = js.native
  /**
    * The creation date of the virtual router.
    */
  val createdDate: Output_[String] = js.native
  /**
    * The last update date of the virtual router.
    */
  val lastUpdatedDate: Output_[String] = js.native
  /**
    * The name of the service mesh in which to create the virtual router.
    */
  val meshName: Output_[String] = js.native
  /**
    * The name to use for the virtual router.
    */
  val name: Output_[String] = js.native
  /**
    * The virtual router specification to apply.
    */
  val spec: Output_[VirtualRouterSpec] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appmesh/virtualRouter", "VirtualRouter")
@js.native
object VirtualRouter extends js.Object {
  /**
    * Get an existing VirtualRouter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): VirtualRouter = js.native
  def get(name: String, id: Input[ID], state: VirtualRouterState): VirtualRouter = js.native
  def get(name: String, id: Input[ID], state: VirtualRouterState, opts: CustomResourceOptions): VirtualRouter = js.native
  /**
    * Returns true if the given object is an instance of VirtualRouter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualRouter.VirtualRouter */ Boolean = js.native
}

