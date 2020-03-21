package typingsJapgolly.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod

import typingsJapgolly.awsSdkClientSqsNode.createQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueDeletedRecently
  extends ServiceException[QueueDeletedRecentlyDetails]
     with CreateQueueExceptionsUnion {
  @JSName("name")
  var name_QueueDeletedRecently: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDeletedRecently = js.native
}

