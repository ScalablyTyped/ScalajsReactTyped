package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsCollection extends js.Object {
  // Gets one resource by id.
  def get(groupUniqueId: String): Groups
  // Updates an existing resource. This method supports patch semantics.
  def patch(resource: Groups, groupUniqueId: String): Groups
  // Updates an existing resource.
  def update(resource: Groups, groupUniqueId: String): Groups
}

object GroupsCollection {
  @scala.inline
  def apply(
    get: String => CallbackTo[Groups],
    patch: (Groups, String) => CallbackTo[Groups],
    update: (Groups, String) => CallbackTo[Groups]
  ): GroupsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups, t1: java.lang.String) => patch(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups, t1: java.lang.String) => update(t0, t1).runNow()))
    __obj.asInstanceOf[GroupsCollection]
  }
}

