package typingsJapgolly.awsSdkClientLambdaNode.typesKmsaccessdeniedexceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSAccessDeniedException
  extends ServiceException[KMSAccessDeniedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSAccessDeniedException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSAccessDeniedException = js.native
}

