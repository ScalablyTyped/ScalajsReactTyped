package typingsJapgolly.awsSdkClientLambdaNode.typesUnsupportedMediaTypeExceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsupportedMediaTypeException
  extends ServiceException[UnsupportedMediaTypeExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_UnsupportedMediaTypeException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.UnsupportedMediaTypeException = js.native
}

