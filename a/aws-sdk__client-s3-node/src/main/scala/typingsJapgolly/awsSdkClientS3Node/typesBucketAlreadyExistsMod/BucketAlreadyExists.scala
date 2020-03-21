package typingsJapgolly.awsSdkClientS3Node.typesBucketAlreadyExistsMod

import typingsJapgolly.awsSdkClientS3Node.createBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketAlreadyExists
  extends ServiceException[BucketAlreadyExistsDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyExists: typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyExists = js.native
}

