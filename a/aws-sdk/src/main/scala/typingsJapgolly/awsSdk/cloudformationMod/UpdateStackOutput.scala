package typingsJapgolly.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStackOutput extends js.Object {
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.StackId] = js.native
}

object UpdateStackOutput {
  @scala.inline
  def apply(StackId: StackId = null): UpdateStackOutput = {
    val __obj = js.Dynamic.literal()
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStackOutput]
  }
}

