package typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Collection.ContactGroups

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.ModifyContactGroupMembersRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.ModifyContactGroupMembersResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersCollection extends js.Object {
  // Modify the members of a contact group owned by the authenticated user.
  // <br>
  // The only system contact groups that can have members added are
  // `contactGroups/myContacts` and `contactGroups/starred`. Other system
  // contact groups are deprecated and can only have contacts removed.
  def modify(resource: ModifyContactGroupMembersRequest, resourceName: String): ModifyContactGroupMembersResponse
}

object MembersCollection {
  @scala.inline
  def apply(
    modify: (ModifyContactGroupMembersRequest, String) => CallbackTo[ModifyContactGroupMembersResponse]
  ): MembersCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("modify")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.ModifyContactGroupMembersRequest, t1: java.lang.String) => modify(t0, t1).runNow()))
    __obj.asInstanceOf[MembersCollection]
  }
}

