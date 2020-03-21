package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.s3Mod.BucketName
import typingsJapgolly.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/s3.HeadBucketRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait HeadBucketRequestwaiterWa extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
}

