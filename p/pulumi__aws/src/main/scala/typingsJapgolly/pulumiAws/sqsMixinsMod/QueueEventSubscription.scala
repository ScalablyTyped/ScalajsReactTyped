package typingsJapgolly.pulumiAws.sqsMixinsMod

import typingsJapgolly.pulumiAws.lambdaMod.EventSourceMapping
import typingsJapgolly.pulumiAws.lambdaMod.EventSubscription
import typingsJapgolly.pulumiAws.sqsQueueMod.Queue
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sqs/sqsMixins", "QueueEventSubscription")
@js.native
class QueueEventSubscription protected () extends EventSubscription {
  def this(name: String, queue: Queue, handler: QueueEventHandler) = this()
  def this(name: String, queue: Queue, handler: QueueEventHandler, args: QueueEventSubscriptionArgs) = this()
  def this(
    name: String,
    queue: Queue,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  /**
    * The underlying sns object created for the subscription.
    */
  val eventSourceMapping: EventSourceMapping = js.native
  val queue: Queue = js.native
}

