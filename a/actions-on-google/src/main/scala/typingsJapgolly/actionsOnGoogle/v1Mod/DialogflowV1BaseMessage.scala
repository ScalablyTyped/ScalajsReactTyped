package typingsJapgolly.actionsOnGoogle.v1Mod

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

trait DialogflowV1BaseMessage[TType /* <: Double */] extends js.Object {
  var platform: js.UndefOr[facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_] = js.undefined
  var `type`: js.UndefOr[TType] = js.undefined
}

object DialogflowV1BaseMessage {
  @scala.inline
  def apply[TType /* <: Double */](
    platform: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_ = null,
    `type`: TType = null
  ): DialogflowV1BaseMessage[TType] = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1BaseMessage[TType]]
  }
}

