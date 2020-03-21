package typingsJapgolly.awsSdkClientLambdaNode.typesCodeStorageExceededExceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.createFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typingsJapgolly.awsSdkClientLambdaNode.publishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typingsJapgolly.awsSdkClientLambdaNode.updateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeStorageExceededException
  extends ServiceException[CodeStorageExceededExceptionDetails]
     with CreateFunctionExceptionsUnion
     with PublishVersionExceptionsUnion
     with UpdateFunctionCodeExceptionsUnion {
  @JSName("name")
  var name_CodeStorageExceededException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CodeStorageExceededException = js.native
}

