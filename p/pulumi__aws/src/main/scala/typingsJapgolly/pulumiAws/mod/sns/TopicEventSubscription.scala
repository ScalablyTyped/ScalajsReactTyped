package typingsJapgolly.pulumiAws.mod.sns

import typingsJapgolly.pulumiAws.snsMixinsMod.TopicEventHandler
import typingsJapgolly.pulumiAws.snsMixinsMod.TopicEventSubscriptionArgs
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sns.TopicEventSubscription")
@js.native
class TopicEventSubscription protected ()
  extends typingsJapgolly.pulumiAws.snsMod.TopicEventSubscription {
  def this(name: String, topic: typingsJapgolly.pulumiAws.topicMod.Topic, handler: TopicEventHandler) = this()
  def this(
    name: String,
    topic: typingsJapgolly.pulumiAws.topicMod.Topic,
    handler: TopicEventHandler,
    args: TopicEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    topic: typingsJapgolly.pulumiAws.topicMod.Topic,
    handler: TopicEventHandler,
    args: TopicEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

