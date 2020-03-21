package typingsJapgolly.awsSdkClientLambdaNode.typesEc2throttledexceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2ThrottledException
  extends ServiceException[EC2ThrottledExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_EC2ThrottledException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2ThrottledException = js.native
}

