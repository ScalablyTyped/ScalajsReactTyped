package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Collection.GroupsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminGroupsSettings_ extends js.Object {
  var Groups: js.UndefOr[GroupsCollection] = js.undefined
  // Create a new instance of Groups
  def newGroups(): typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
}

object AdminGroupsSettings_ {
  @scala.inline
  def apply(
    newGroups: CallbackTo[
      typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
    ],
    Groups: GroupsCollection = null
  ): AdminGroupsSettings_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newGroups")(newGroups.toJsFn)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminGroupsSettings_]
  }
}

