package typingsJapgolly.awsSdkClientS3Node.typesBucketAlreadyOwnedByYouMod

import typingsJapgolly.awsSdkClientS3Node.createBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketAlreadyOwnedByYou
  extends ServiceException[BucketAlreadyOwnedByYouDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyOwnedByYou: typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyOwnedByYou = js.native
}

