package typingsJapgolly.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionContext extends js.Object {
  /**
    * The system-generated unique ID that corresponds to an action's execution.
    */
  var actionExecutionId: js.UndefOr[ActionExecutionId] = js.native
  /**
    * The name of the action in the context of a job.
    */
  var name: js.UndefOr[ActionName] = js.native
}

object ActionContext {
  @scala.inline
  def apply(actionExecutionId: ActionExecutionId = null, name: ActionName = null): ActionContext = {
    val __obj = js.Dynamic.literal()
    if (actionExecutionId != null) __obj.updateDynamic("actionExecutionId")(actionExecutionId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionContext]
  }
}

