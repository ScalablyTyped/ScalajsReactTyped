package typingsJapgolly.pulumiAws.s3Mod

import typingsJapgolly.pulumiAws.getBucketObjectsMod.GetBucketObjectsArgs
import typingsJapgolly.pulumiAws.getBucketObjectsMod.GetBucketObjectsResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3", "getBucketObjects")
@js.native
object getBucketObjects extends js.Object {
  def apply(args: GetBucketObjectsArgs): js.Promise[GetBucketObjectsResult] with GetBucketObjectsResult = js.native
  def apply(args: GetBucketObjectsArgs, opts: InvokeOptions): js.Promise[GetBucketObjectsResult] with GetBucketObjectsResult = js.native
}

