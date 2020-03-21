package typingsJapgolly.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod

import typingsJapgolly.awsSdkClientSqsNode.changeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typingsJapgolly.awsSdkClientSqsNode.deleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptHandleIsInvalid
  extends ServiceException[ReceiptHandleIsInvalidDetails]
     with ChangeMessageVisibilityExceptionsUnion
     with DeleteMessageExceptionsUnion {
  @JSName("name")
  var name_ReceiptHandleIsInvalid: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid = js.native
}

