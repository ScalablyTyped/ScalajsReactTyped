package typingsJapgolly.facebookJsSdk.facebook

import typingsJapgolly.facebookJsSdk.AnonName
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.app_non_users
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.app_users
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.apprequests
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.askfor
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.async
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.iframe
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.page
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.popup
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.send
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.turn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameRequestDialogParams extends DialogParams {
  var action_type: js.UndefOr[send | askfor | turn] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var exclude_ids: js.UndefOr[js.Array[String]] = js.undefined
  var filters: js.UndefOr[app_users | app_non_users | js.Array[AnonName]] = js.undefined
  var max_recipients: js.UndefOr[Double] = js.undefined
  var message: String
  var method: apprequests
  var object_id: js.UndefOr[String] = js.undefined
  var suggestions: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String | Double] = js.undefined
}

object GameRequestDialogParams {
  @scala.inline
  def apply(
    message: String,
    method: apprequests,
    action_type: send | askfor | turn = null,
    app_id: String = null,
    data: String = null,
    display: page | iframe | async | popup = null,
    exclude_ids: js.Array[String] = null,
    filters: app_users | app_non_users | js.Array[AnonName] = null,
    max_recipients: Int | Double = null,
    object_id: String = null,
    redirect_uri: String = null,
    suggestions: js.Array[String] = null,
    title: String = null,
    to: String | Double = null
  ): GameRequestDialogParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (action_type != null) __obj.updateDynamic("action_type")(action_type.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (exclude_ids != null) __obj.updateDynamic("exclude_ids")(exclude_ids.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (max_recipients != null) __obj.updateDynamic("max_recipients")(max_recipients.asInstanceOf[js.Any])
    if (object_id != null) __obj.updateDynamic("object_id")(object_id.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameRequestDialogParams]
  }
}

