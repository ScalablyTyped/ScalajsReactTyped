package typingsJapgolly.awsSdkClientLambdaNode.typesKmsinvalidstateexceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSInvalidStateException
  extends ServiceException[KMSInvalidStateExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSInvalidStateException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSInvalidStateException = js.native
}

