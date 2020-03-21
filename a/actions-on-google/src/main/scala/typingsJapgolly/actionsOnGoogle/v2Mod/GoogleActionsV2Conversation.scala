package typingsJapgolly.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2Conversation extends js.Object {
  /**
    * Unique ID for the multi-turn conversation. It's assigned for the first
    * turn. After that it remains the same for subsequent conversation turns
    * until the conversation is terminated.
    */
  var conversationId: js.UndefOr[String] = js.undefined
  /**
    * Opaque token specified by the Action in the last conversation turn. It can
    * be used by an Action to track the conversation or to store conversation
    * related data.
    */
  var conversationToken: js.UndefOr[String] = js.undefined
  /**
    * Type indicates the state of the conversation in its lifecycle.
    */
  var `type`: js.UndefOr[GoogleActionsV2ConversationType] = js.undefined
}

object GoogleActionsV2Conversation {
  @scala.inline
  def apply(
    conversationId: String = null,
    conversationToken: String = null,
    `type`: GoogleActionsV2ConversationType = null
  ): GoogleActionsV2Conversation = {
    val __obj = js.Dynamic.literal()
    if (conversationId != null) __obj.updateDynamic("conversationId")(conversationId.asInstanceOf[js.Any])
    if (conversationToken != null) __obj.updateDynamic("conversationToken")(conversationToken.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2Conversation]
  }
}

