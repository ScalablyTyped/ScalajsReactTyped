package typingsJapgolly.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.invokeAsyncExceptionsUnionMod.InvokeAsyncExceptionsUnion
import typingsJapgolly.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidRequestContentException
  extends ServiceException[InvalidRequestContentExceptionDetails]
     with InvokeAsyncExceptionsUnion
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidRequestContentException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRequestContentException = js.native
}

