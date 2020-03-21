package typingsJapgolly.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkflowResponse extends js.Object {
  /**
    * The name of the workflow which was specified in input.
    */
  var Name: js.UndefOr[NameString] = js.native
}

object UpdateWorkflowResponse {
  @scala.inline
  def apply(Name: NameString = null): UpdateWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkflowResponse]
  }
}

