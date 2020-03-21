package typingsJapgolly.awsSdkClientCodecommitNode.typesBranchDoesNotExistExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.getBranchExceptionsUnionMod.GetBranchExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.updateDefaultBranchExceptionsUnionMod.UpdateDefaultBranchExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BranchDoesNotExistException
  extends ServiceException[BranchDoesNotExistExceptionDetails]
     with DeleteFileExceptionsUnion
     with GetBranchExceptionsUnion
     with PutFileExceptionsUnion
     with UpdateDefaultBranchExceptionsUnion {
  @JSName("name")
  var name_BranchDoesNotExistException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchDoesNotExistException = js.native
}

