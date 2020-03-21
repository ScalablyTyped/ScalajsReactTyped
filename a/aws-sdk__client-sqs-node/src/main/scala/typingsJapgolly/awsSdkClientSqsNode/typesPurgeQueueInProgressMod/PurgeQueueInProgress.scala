package typingsJapgolly.awsSdkClientSqsNode.typesPurgeQueueInProgressMod

import typingsJapgolly.awsSdkClientSqsNode.purgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurgeQueueInProgress
  extends ServiceException[PurgeQueueInProgressDetails]
     with PurgeQueueExceptionsUnion {
  @JSName("name")
  var name_PurgeQueueInProgress: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.PurgeQueueInProgress = js.native
}

