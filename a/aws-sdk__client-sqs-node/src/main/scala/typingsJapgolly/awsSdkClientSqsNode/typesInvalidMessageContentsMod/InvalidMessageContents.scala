package typingsJapgolly.awsSdkClientSqsNode.typesInvalidMessageContentsMod

import typingsJapgolly.awsSdkClientSqsNode.sendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidMessageContents
  extends ServiceException[InvalidMessageContentsDetails]
     with SendMessageExceptionsUnion {
  @JSName("name")
  var name_InvalidMessageContents: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidMessageContents = js.native
}

