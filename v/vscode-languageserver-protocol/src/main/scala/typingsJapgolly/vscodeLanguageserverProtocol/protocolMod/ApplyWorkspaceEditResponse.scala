package typingsJapgolly.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyWorkspaceEditResponse extends js.Object {
  /**
    * Indicates whether the edit was applied or not.
    */
  var applied: Boolean
  /**
    * Depending on the client's failure handling strategy `failedChange` might
    * contain the index of the change that failed. This property is only available
    * if the client signals a `failureHandlingStrategy` in its client capabilities.
    */
  var failedChange: js.UndefOr[Double] = js.undefined
}

object ApplyWorkspaceEditResponse {
  @scala.inline
  def apply(applied: Boolean, failedChange: Int | Double = null): ApplyWorkspaceEditResponse = {
    val __obj = js.Dynamic.literal(applied = applied.asInstanceOf[js.Any])
    if (failedChange != null) __obj.updateDynamic("failedChange")(failedChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyWorkspaceEditResponse]
  }
}

