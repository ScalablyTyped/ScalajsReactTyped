package typingsJapgolly.pulumiAws.sesMod

import typingsJapgolly.pulumiAws.eventDestinationMod.EventDestinationArgs
import typingsJapgolly.pulumiAws.eventDestinationMod.EventDestinationState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses", "EventDestination")
@js.native
class EventDestination protected ()
  extends typingsJapgolly.pulumiAws.eventDestinationMod.EventDestination {
  /**
    * Create a EventDestination resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EventDestinationArgs) = this()
  def this(name: String, args: EventDestinationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ses", "EventDestination")
@js.native
object EventDestination extends js.Object {
  /**
    * Get an existing EventDestination resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.eventDestinationMod.EventDestination = js.native
  def get(name: String, id: Input[ID], state: EventDestinationState): typingsJapgolly.pulumiAws.eventDestinationMod.EventDestination = js.native
  def get(name: String, id: Input[ID], state: EventDestinationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.eventDestinationMod.EventDestination = js.native
  /**
    * Returns true if the given object is an instance of EventDestination.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/eventDestination.EventDestination */ Boolean = js.native
}

