package typingsJapgolly.awsSdkClientCodecommitNode.typesFileDoesNotExistExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileDoesNotExistException
  extends ServiceException[FileDoesNotExistExceptionDetails]
     with DeleteFileExceptionsUnion
     with GetFileExceptionsUnion {
  @JSName("name")
  var name_FileDoesNotExistException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileDoesNotExistException = js.native
}

