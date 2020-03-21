package typingsJapgolly.awsSdkClientSqsNode.typesMessageNotInflightMod

import typingsJapgolly.awsSdkClientSqsNode.changeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageNotInflight
  extends ServiceException[MessageNotInflightDetails]
     with ChangeMessageVisibilityExceptionsUnion {
  @JSName("name")
  var name_MessageNotInflight: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight = js.native
}

