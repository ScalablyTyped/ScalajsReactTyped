package typingsJapgolly.awsSdkClientCodecommitNode.typesBlobIdDoesNotExistExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlobIdDoesNotExistException
  extends ServiceException[BlobIdDoesNotExistExceptionDetails]
     with GetBlobExceptionsUnion {
  @JSName("name")
  var name_BlobIdDoesNotExistException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BlobIdDoesNotExistException = js.native
}

