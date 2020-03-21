package typingsJapgolly.awsSdkClientSqsNode.typesUnsupportedOperationMod

import typingsJapgolly.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typingsJapgolly.awsSdkClientSqsNode.sendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsupportedOperation
  extends ServiceException[UnsupportedOperationDetails]
     with SendMessageBatchExceptionsUnion
     with SendMessageExceptionsUnion {
  @JSName("name")
  var name_UnsupportedOperation: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.UnsupportedOperation = js.native
}

