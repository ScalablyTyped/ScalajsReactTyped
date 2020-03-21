package typingsJapgolly.awsSdkClientLambdaNode.typesKmsnotfoundexceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSNotFoundException
  extends ServiceException[KMSNotFoundExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSNotFoundException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSNotFoundException = js.native
}

