package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AccountPermissionGroup
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AccountPermissionGroupsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionGroupsCollection extends js.Object {
  // Gets one account permission group by ID.
  def get(profileId: String, id: String): AccountPermissionGroup
  // Retrieves the list of account permission groups.
  def list(profileId: String): AccountPermissionGroupsListResponse
}

object AccountPermissionGroupsCollection {
  @scala.inline
  def apply(
    get: (String, String) => CallbackTo[AccountPermissionGroup],
    list: String => CallbackTo[AccountPermissionGroupsListResponse]
  ): AccountPermissionGroupsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[AccountPermissionGroupsCollection]
  }
}

