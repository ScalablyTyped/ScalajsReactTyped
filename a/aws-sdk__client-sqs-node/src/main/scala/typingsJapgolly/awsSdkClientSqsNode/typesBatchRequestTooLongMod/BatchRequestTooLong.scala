package typingsJapgolly.awsSdkClientSqsNode.typesBatchRequestTooLongMod

import typingsJapgolly.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRequestTooLong
  extends ServiceException[BatchRequestTooLongDetails]
     with SendMessageBatchExceptionsUnion {
  @JSName("name")
  var name_BatchRequestTooLong: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong = js.native
}

