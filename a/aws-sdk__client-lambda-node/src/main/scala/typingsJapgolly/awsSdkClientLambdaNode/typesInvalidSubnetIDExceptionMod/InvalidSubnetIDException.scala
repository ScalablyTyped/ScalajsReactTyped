package typingsJapgolly.awsSdkClientLambdaNode.typesInvalidSubnetIDExceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidSubnetIDException
  extends ServiceException[InvalidSubnetIDExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidSubnetIDException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSubnetIDException = js.native
}

