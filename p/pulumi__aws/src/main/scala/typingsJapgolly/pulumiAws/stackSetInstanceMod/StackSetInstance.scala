package typingsJapgolly.pulumiAws.stackSetInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudformation/stackSetInstance", "StackSetInstance")
@js.native
class StackSetInstance protected () extends CustomResource {
  /**
    * Create a StackSetInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: StackSetInstanceArgs) = this()
  def this(name: String, args: StackSetInstanceArgs, opts: CustomResourceOptions) = this()
  /**
    * Target AWS Account ID to create a Stack based on the Stack Set. Defaults to current account.
    */
  val accountId: Output_[String] = js.native
  /**
    * Key-value map of input parameters to override from the Stack Set for this Instance.
    */
  val parameterOverrides: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * Target AWS Region to create a Stack based on the Stack Set. Defaults to current region.
    */
  val region: Output_[String] = js.native
  /**
    * During resource destroy, remove Instance from Stack Set while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new Stack Set. Defaults to `false`.
    */
  val retainStack: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Stack identifier
    */
  val stackId: Output_[String] = js.native
  /**
    * Name of the Stack Set.
    */
  val stackSetName: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudformation/stackSetInstance", "StackSetInstance")
@js.native
object StackSetInstance extends js.Object {
  /**
    * Get an existing StackSetInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): StackSetInstance = js.native
  def get(name: String, id: Input[ID], state: StackSetInstanceState): StackSetInstance = js.native
  def get(name: String, id: Input[ID], state: StackSetInstanceState, opts: CustomResourceOptions): StackSetInstance = js.native
  /**
    * Returns true if the given object is an instance of StackSetInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSetInstance.StackSetInstance */ Boolean = js.native
}

