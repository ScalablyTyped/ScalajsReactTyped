package typingsJapgolly.pulumiAws.mod.s3

import typingsJapgolly.pulumiAws.getBucketObjectMod.GetBucketObjectArgs
import typingsJapgolly.pulumiAws.getBucketObjectMod.GetBucketObjectResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "s3.getBucketObject")
@js.native
object getBucketObject extends js.Object {
  def apply(args: GetBucketObjectArgs): js.Promise[GetBucketObjectResult] with GetBucketObjectResult = js.native
  def apply(args: GetBucketObjectArgs, opts: InvokeOptions): js.Promise[GetBucketObjectResult] with GetBucketObjectResult = js.native
}

