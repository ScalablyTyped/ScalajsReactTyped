package typingsJapgolly.pulumiAws.triggerMod

import typingsJapgolly.pulumiAws.outputMod.codecommit.TriggerTrigger
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codecommit/trigger", "Trigger")
@js.native
class Trigger protected () extends CustomResource {
  /**
    * Create a Trigger resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TriggerArgs) = this()
  def this(name: String, args: TriggerArgs, opts: CustomResourceOptions) = this()
  val configurationId: Output_[String] = js.native
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: Output_[String] = js.native
  val triggers: Output_[js.Array[TriggerTrigger]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/codecommit/trigger", "Trigger")
@js.native
object Trigger extends js.Object {
  /**
    * Get an existing Trigger resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Trigger = js.native
  def get(name: String, id: Input[ID], state: TriggerState): Trigger = js.native
  def get(name: String, id: Input[ID], state: TriggerState, opts: CustomResourceOptions): Trigger = js.native
  /**
    * Returns true if the given object is an instance of Trigger.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codecommit/trigger.Trigger */ Boolean = js.native
}

