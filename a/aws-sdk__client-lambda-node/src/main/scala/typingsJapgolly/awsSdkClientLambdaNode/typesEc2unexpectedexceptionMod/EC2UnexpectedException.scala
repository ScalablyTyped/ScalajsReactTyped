package typingsJapgolly.awsSdkClientLambdaNode.typesEc2unexpectedexceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2UnexpectedException
  extends ServiceException[EC2UnexpectedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_EC2UnexpectedException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2UnexpectedException = js.native
}

