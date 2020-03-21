package typingsJapgolly.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the object returned from a
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#listUsers `listUsers()`} operation. Contains the list
  * of users for the current batch and the next page token if available.
  */
trait ListUsersResult extends js.Object {
  /**
    * The next page token if available. This is needed for the next batch download.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The list of {@link admin.auth.UserRecord `UserRecord`} objects for the
    * current downloaded batch.
    */
  var users: js.Array[UserRecord]
}

object ListUsersResult {
  @scala.inline
  def apply(users: js.Array[UserRecord], pageToken: String = null): ListUsersResult = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersResult]
  }
}

