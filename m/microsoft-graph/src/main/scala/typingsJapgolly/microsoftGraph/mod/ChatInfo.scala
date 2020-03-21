package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatInfo extends js.Object {
  var messageId: js.UndefOr[String] = js.undefined
  var replyChainMessageId: js.UndefOr[String] = js.undefined
  var threadId: js.UndefOr[String] = js.undefined
}

object ChatInfo {
  @scala.inline
  def apply(messageId: String = null, replyChainMessageId: String = null, threadId: String = null): ChatInfo = {
    val __obj = js.Dynamic.literal()
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (replyChainMessageId != null) __obj.updateDynamic("replyChainMessageId")(replyChainMessageId.asInstanceOf[js.Any])
    if (threadId != null) __obj.updateDynamic("threadId")(threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatInfo]
  }
}

