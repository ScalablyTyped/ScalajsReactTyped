package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RestoreAgentRequest. */
trait IRestoreAgentRequest extends js.Object {
  /** RestoreAgentRequest agentContent */
  var agentContent: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array | Null] = js.undefined
  /** RestoreAgentRequest agentUri */
  var agentUri: js.UndefOr[String | Null] = js.undefined
  /** RestoreAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IRestoreAgentRequest {
  @scala.inline
  def apply(
    agentContent: scala.scalajs.js.typedarray.Uint8Array = null,
    agentUri: String = null,
    parent: String = null
  ): IRestoreAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (agentContent != null) __obj.updateDynamic("agentContent")(agentContent.asInstanceOf[js.Any])
    if (agentUri != null) __obj.updateDynamic("agentUri")(agentUri.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestoreAgentRequest]
  }
}

