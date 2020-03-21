package typingsJapgolly.awsSdkClientSqsNode.typesQueueNameExistsMod

import typingsJapgolly.awsSdkClientSqsNode.createQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueNameExists
  extends ServiceException[QueueNameExistsDetails]
     with CreateQueueExceptionsUnion {
  @JSName("name")
  var name_QueueNameExists: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists = js.native
}

