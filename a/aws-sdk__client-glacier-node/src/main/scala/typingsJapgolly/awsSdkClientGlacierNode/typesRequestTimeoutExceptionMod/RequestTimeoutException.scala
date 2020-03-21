package typingsJapgolly.awsSdkClientGlacierNode.typesRequestTimeoutExceptionMod

import typingsJapgolly.awsSdkClientGlacierNode.uploadArchiveExceptionsUnionMod.UploadArchiveExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.uploadMultipartPartExceptionsUnionMod.UploadMultipartPartExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestTimeoutException
  extends ServiceException[RequestTimeoutExceptionDetails]
     with UploadArchiveExceptionsUnion
     with UploadMultipartPartExceptionsUnion {
  @JSName("name")
  var name_RequestTimeoutException: typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.RequestTimeoutException = js.native
}

