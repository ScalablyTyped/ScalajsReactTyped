package typingsJapgolly.awsSdkClientCodecommitNode.typesBranchNameExistsExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.createBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BranchNameExistsException
  extends ServiceException[BranchNameExistsExceptionDetails]
     with CreateBranchExceptionsUnion {
  @JSName("name")
  var name_BranchNameExistsException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameExistsException = js.native
}

