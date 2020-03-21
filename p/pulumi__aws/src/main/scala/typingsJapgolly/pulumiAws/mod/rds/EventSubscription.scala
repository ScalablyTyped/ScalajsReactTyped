package typingsJapgolly.pulumiAws.mod.rds

import typingsJapgolly.pulumiAws.rdsEventSubscriptionMod.EventSubscriptionArgs
import typingsJapgolly.pulumiAws.rdsEventSubscriptionMod.EventSubscriptionState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "rds.EventSubscription")
@js.native
class EventSubscription protected ()
  extends typingsJapgolly.pulumiAws.rdsMod.EventSubscription {
  /**
    * Create a EventSubscription resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EventSubscriptionArgs) = this()
  def this(name: String, args: EventSubscriptionArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "rds.EventSubscription")
@js.native
object EventSubscription extends js.Object {
  /**
    * Get an existing EventSubscription resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.rdsEventSubscriptionMod.EventSubscription = js.native
  def get(name: String, id: Input[ID], state: EventSubscriptionState): typingsJapgolly.pulumiAws.rdsEventSubscriptionMod.EventSubscription = js.native
  def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.rdsEventSubscriptionMod.EventSubscription = js.native
  /**
    * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/eventSubscription.EventSubscription */ Boolean = js.native
}

