package typingsJapgolly.pulumiAws.mod.sqs

import typingsJapgolly.pulumiAws.sqsMixinsMod.QueueEventHandler
import typingsJapgolly.pulumiAws.sqsMixinsMod.QueueEventSubscriptionArgs
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sqs.QueueEventSubscription")
@js.native
class QueueEventSubscription protected ()
  extends typingsJapgolly.pulumiAws.sqsMod.QueueEventSubscription {
  def this(name: String, queue: typingsJapgolly.pulumiAws.sqsQueueMod.Queue, handler: QueueEventHandler) = this()
  def this(
    name: String,
    queue: typingsJapgolly.pulumiAws.sqsQueueMod.Queue,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    queue: typingsJapgolly.pulumiAws.sqsQueueMod.Queue,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

