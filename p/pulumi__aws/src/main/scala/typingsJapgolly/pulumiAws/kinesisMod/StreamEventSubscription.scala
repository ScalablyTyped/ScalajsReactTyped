package typingsJapgolly.pulumiAws.kinesisMod

import typingsJapgolly.pulumiAws.kinesisMixinsMod.StreamEventHandler
import typingsJapgolly.pulumiAws.kinesisMixinsMod.StreamEventSubscriptionArgs
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis", "StreamEventSubscription")
@js.native
class StreamEventSubscription protected ()
  extends typingsJapgolly.pulumiAws.kinesisMixinsMod.StreamEventSubscription {
  def this(
    name: String,
    stream: typingsJapgolly.pulumiAws.streamMod.Stream,
    handler: StreamEventHandler,
    args: StreamEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    stream: typingsJapgolly.pulumiAws.streamMod.Stream,
    handler: StreamEventHandler,
    args: StreamEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

