package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.UserRolePermissionGroup
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.UserRolePermissionGroupsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionGroupsCollection extends js.Object {
  // Gets one user role permission group by ID.
  def get(profileId: String, id: String): UserRolePermissionGroup
  // Gets a list of all supported user role permission groups.
  def list(profileId: String): UserRolePermissionGroupsListResponse
}

object UserRolePermissionGroupsCollection {
  @scala.inline
  def apply(
    get: (String, String) => CallbackTo[UserRolePermissionGroup],
    list: String => CallbackTo[UserRolePermissionGroupsListResponse]
  ): UserRolePermissionGroupsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[UserRolePermissionGroupsCollection]
  }
}

