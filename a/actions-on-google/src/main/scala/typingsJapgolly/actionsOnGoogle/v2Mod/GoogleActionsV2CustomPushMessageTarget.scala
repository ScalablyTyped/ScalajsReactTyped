package typingsJapgolly.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2CustomPushMessageTarget extends js.Object {
  /**
    * The argument to target for an intent. For V1, only one Argument is
    * supported.
    */
  var argument: js.UndefOr[GoogleActionsV2Argument] = js.undefined
  /**
    * The intent to target.
    */
  var intent: js.UndefOr[String] = js.undefined
  /**
    * The locale to target. Follows IETF BCP-47 language code.
    * Can be used by a multi-lingual app to target a user on a specified
    * localized app. If not specified, it will default to en-US.
    */
  var locale: js.UndefOr[String] = js.undefined
  /**
    * The user to target.
    */
  var userId: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2CustomPushMessageTarget {
  @scala.inline
  def apply(
    argument: GoogleActionsV2Argument = null,
    intent: String = null,
    locale: String = null,
    userId: String = null
  ): GoogleActionsV2CustomPushMessageTarget = {
    val __obj = js.Dynamic.literal()
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2CustomPushMessageTarget]
  }
}

