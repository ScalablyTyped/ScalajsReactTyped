package typingsJapgolly.pulumiAws.mod.s3

import typingsJapgolly.pulumiAws.s3MixinsMod.BucketEventHandler
import typingsJapgolly.pulumiAws.s3MixinsMod.BucketEventSubscriptionArgs
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "s3.BucketEventSubscription")
@js.native
class BucketEventSubscription protected ()
  extends typingsJapgolly.pulumiAws.s3Mod.BucketEventSubscription {
  def this(
    name: String,
    bucket: typingsJapgolly.pulumiAws.bucketMod.Bucket,
    handler: BucketEventHandler,
    args: BucketEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    bucket: typingsJapgolly.pulumiAws.bucketMod.Bucket,
    handler: BucketEventHandler,
    args: BucketEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

