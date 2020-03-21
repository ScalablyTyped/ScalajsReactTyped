package typingsJapgolly.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnownUser extends js.Object {
  var isCurrentUser: js.UndefOr[Boolean] = js.undefined
  var personName: js.UndefOr[String] = js.undefined
}

object KnownUser {
  @scala.inline
  def apply(isCurrentUser: js.UndefOr[Boolean] = js.undefined, personName: String = null): KnownUser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCurrentUser)) __obj.updateDynamic("isCurrentUser")(isCurrentUser.asInstanceOf[js.Any])
    if (personName != null) __obj.updateDynamic("personName")(personName.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownUser]
  }
}

