package typingsJapgolly.awsSdkClientSqsNode.typesInvalidIdFormatMod

import typingsJapgolly.awsSdkClientSqsNode.deleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidIdFormat
  extends ServiceException[InvalidIdFormatDetails]
     with DeleteMessageExceptionsUnion {
  @JSName("name")
  var name_InvalidIdFormat: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat = js.native
}

