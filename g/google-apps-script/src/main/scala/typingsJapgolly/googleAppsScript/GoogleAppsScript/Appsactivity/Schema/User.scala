package typingsJapgolly.googleAppsScript.GoogleAppsScript.Appsactivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var isDeleted: js.UndefOr[Boolean] = js.undefined
  var isMe: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var permissionId: js.UndefOr[String] = js.undefined
  var photo: js.UndefOr[Photo] = js.undefined
}

object User {
  @scala.inline
  def apply(
    isDeleted: js.UndefOr[Boolean] = js.undefined,
    isMe: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    permissionId: String = null,
    photo: Photo = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDeleted)) __obj.updateDynamic("isDeleted")(isDeleted.asInstanceOf[js.Any])
    if (!js.isUndefined(isMe)) __obj.updateDynamic("isMe")(isMe.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

