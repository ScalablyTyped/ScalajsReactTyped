package typingsJapgolly.pulumiAws.mod.sns

import typingsJapgolly.pulumiAws.topicSubscriptionMod.TopicSubscriptionArgs
import typingsJapgolly.pulumiAws.topicSubscriptionMod.TopicSubscriptionState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sns.TopicSubscription")
@js.native
class TopicSubscription protected ()
  extends typingsJapgolly.pulumiAws.snsMod.TopicSubscription {
  /**
    * Create a TopicSubscription resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TopicSubscriptionArgs) = this()
  def this(name: String, args: TopicSubscriptionArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "sns.TopicSubscription")
@js.native
object TopicSubscription extends js.Object {
  /**
    * Get an existing TopicSubscription resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.topicSubscriptionMod.TopicSubscription = js.native
  def get(name: String, id: Input[ID], state: TopicSubscriptionState): typingsJapgolly.pulumiAws.topicSubscriptionMod.TopicSubscription = js.native
  def get(name: String, id: Input[ID], state: TopicSubscriptionState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.topicSubscriptionMod.TopicSubscription = js.native
  /**
    * Returns true if the given object is an instance of TopicSubscription.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topicSubscription.TopicSubscription */ Boolean = js.native
}

