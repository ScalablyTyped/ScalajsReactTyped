package typingsJapgolly.pulumiAws.kinesisMixinsMod

import typingsJapgolly.pulumiAws.lambdaMod.EventSourceMapping
import typingsJapgolly.pulumiAws.lambdaMod.EventSubscription
import typingsJapgolly.pulumiAws.streamMod.Stream
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis/kinesisMixins", "StreamEventSubscription")
@js.native
class StreamEventSubscription protected () extends EventSubscription {
  def this(name: String, stream: Stream, handler: StreamEventHandler, args: StreamEventSubscriptionArgs) = this()
  def this(
    name: String,
    stream: Stream,
    handler: StreamEventHandler,
    args: StreamEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  val eventSourceMapping: EventSourceMapping = js.native
  val stream: Stream = js.native
}

