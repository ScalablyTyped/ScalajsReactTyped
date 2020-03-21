package typingsJapgolly.actionsOnGoogle.v1Mod

import typingsJapgolly.actionsOnGoogle.actionsOnGoogleNumbers.`2`
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.facebook_
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.kik_
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.line_
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.skype_
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.slack_
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.telegram_
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.viber_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageQuickReplies
  extends DialogflowV1BaseMessage[`2`]
     with DialogflowV1Message {
  var replies: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageQuickReplies {
  @scala.inline
  def apply(
    platform: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_ = null,
    replies: js.Array[String] = null,
    title: String = null,
    `type`: `2` = null
  ): DialogflowV1MessageQuickReplies = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageQuickReplies]
  }
}

