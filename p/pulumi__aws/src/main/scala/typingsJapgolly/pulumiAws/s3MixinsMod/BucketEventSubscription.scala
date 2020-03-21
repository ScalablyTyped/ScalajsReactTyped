package typingsJapgolly.pulumiAws.s3MixinsMod

import typingsJapgolly.pulumiAws.bucketMod.Bucket
import typingsJapgolly.pulumiAws.lambdaMod.EventSubscription
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3/s3Mixins", "BucketEventSubscription")
@js.native
class BucketEventSubscription protected () extends EventSubscription {
  def this(name: String, bucket: Bucket, handler: BucketEventHandler, args: BucketEventSubscriptionArgs) = this()
  def this(
    name: String,
    bucket: Bucket,
    handler: BucketEventHandler,
    args: BucketEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  val bucket: Bucket = js.native
}

