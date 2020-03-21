package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ImportAgentRequest. */
trait IImportAgentRequest extends js.Object {
  /** ImportAgentRequest agentContent */
  var agentContent: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array | Null] = js.undefined
  /** ImportAgentRequest agentUri */
  var agentUri: js.UndefOr[String | Null] = js.undefined
  /** ImportAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IImportAgentRequest {
  @scala.inline
  def apply(
    agentContent: scala.scalajs.js.typedarray.Uint8Array = null,
    agentUri: String = null,
    parent: String = null
  ): IImportAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (agentContent != null) __obj.updateDynamic("agentContent")(agentContent.asInstanceOf[js.Any])
    if (agentUri != null) __obj.updateDynamic("agentUri")(agentUri.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImportAgentRequest]
  }
}

