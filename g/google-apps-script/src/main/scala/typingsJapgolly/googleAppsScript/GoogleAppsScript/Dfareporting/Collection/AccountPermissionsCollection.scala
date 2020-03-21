package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AccountPermission
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AccountPermissionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionsCollection extends js.Object {
  // Gets one account permission by ID.
  def get(profileId: String, id: String): AccountPermission
  // Retrieves the list of account permissions.
  def list(profileId: String): AccountPermissionsListResponse
}

object AccountPermissionsCollection {
  @scala.inline
  def apply(
    get: (String, String) => CallbackTo[AccountPermission],
    list: String => CallbackTo[AccountPermissionsListResponse]
  ): AccountPermissionsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[AccountPermissionsCollection]
  }
}

