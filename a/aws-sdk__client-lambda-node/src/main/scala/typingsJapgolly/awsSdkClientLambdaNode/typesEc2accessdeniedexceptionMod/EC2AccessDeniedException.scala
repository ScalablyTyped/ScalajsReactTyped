package typingsJapgolly.awsSdkClientLambdaNode.typesEc2accessdeniedexceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2AccessDeniedException
  extends ServiceException[EC2AccessDeniedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_EC2AccessDeniedException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2AccessDeniedException = js.native
}

