package typingsJapgolly.awsSdkClientCodecommitNode.typesParentCommitDoesNotExistExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentCommitDoesNotExistException
  extends ServiceException[ParentCommitDoesNotExistExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_ParentCommitDoesNotExistException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitDoesNotExistException = js.native
}

