package typingsJapgolly.awsSdkClientLambdaNode.typesRequestTooLargeExceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestTooLargeException
  extends ServiceException[RequestTooLargeExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_RequestTooLargeException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.RequestTooLargeException = js.native
}

