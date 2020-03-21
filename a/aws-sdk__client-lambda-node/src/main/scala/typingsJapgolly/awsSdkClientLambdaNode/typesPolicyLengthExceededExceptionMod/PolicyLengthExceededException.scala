package typingsJapgolly.awsSdkClientLambdaNode.typesPolicyLengthExceededExceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.addPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyLengthExceededException
  extends ServiceException[PolicyLengthExceededExceptionDetails]
     with AddPermissionExceptionsUnion {
  @JSName("name")
  var name_PolicyLengthExceededException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PolicyLengthExceededException = js.native
}

