package typingsJapgolly.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.invokeAsyncExceptionsUnionMod.InvokeAsyncExceptionsUnion
import typingsJapgolly.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidRuntimeException
  extends ServiceException[InvalidRuntimeExceptionDetails]
     with InvokeAsyncExceptionsUnion
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidRuntimeException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRuntimeException = js.native
}

