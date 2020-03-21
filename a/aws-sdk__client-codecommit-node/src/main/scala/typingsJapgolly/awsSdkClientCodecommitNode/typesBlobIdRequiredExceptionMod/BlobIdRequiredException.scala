package typingsJapgolly.awsSdkClientCodecommitNode.typesBlobIdRequiredExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlobIdRequiredException
  extends ServiceException[BlobIdRequiredExceptionDetails]
     with GetBlobExceptionsUnion {
  @JSName("name")
  var name_BlobIdRequiredException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BlobIdRequiredException = js.native
}

