package typingsJapgolly.awsSdkClientCodecommitNode.typesFileTooLargeExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTooLargeException
  extends ServiceException[FileTooLargeExceptionDetails]
     with GetBlobExceptionsUnion
     with GetFileExceptionsUnion {
  @JSName("name")
  var name_FileTooLargeException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileTooLargeException = js.native
}

