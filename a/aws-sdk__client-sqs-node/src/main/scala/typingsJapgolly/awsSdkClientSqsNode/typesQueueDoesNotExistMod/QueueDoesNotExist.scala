package typingsJapgolly.awsSdkClientSqsNode.typesQueueDoesNotExistMod

import typingsJapgolly.awsSdkClientSqsNode.purgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueDoesNotExist
  extends ServiceException[QueueDoesNotExistDetails]
     with PurgeQueueExceptionsUnion {
  @JSName("name")
  var name_QueueDoesNotExist: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist = js.native
}

