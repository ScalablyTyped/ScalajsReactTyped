package typingsJapgolly.googleAppsScript.GoogleAppsScript.Groups

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class provides access to Google Groups information. It can be used to query information such
  * as a group's email address, or the list of groups in which the user is a direct member.
  *
  * Here's an example that shows how many groups the current user is a member of:
  *
  *     var groups = GroupsApp.getGroups();
  *     Logger.log('You belong to ' + groups.length + ' groups.');
  */
trait GroupsApp extends js.Object {
  var Role: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Role */ js.Any
  def getGroupByEmail(email: String): Group
  def getGroups(): js.Array[Group]
}

object GroupsApp {
  @scala.inline
  def apply(
    Role: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Role */ js.Any,
    getGroupByEmail: String => CallbackTo[Group],
    getGroups: CallbackTo[js.Array[Group]]
  ): GroupsApp = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any])
    __obj.updateDynamic("getGroupByEmail")(js.Any.fromFunction1((t0: java.lang.String) => getGroupByEmail(t0).runNow()))
    __obj.updateDynamic("getGroups")(getGroups.toJsFn)
    __obj.asInstanceOf[GroupsApp]
  }
}

