package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListWatchedReposForAuthenticatedUserResponseItemPermissions extends js.Object {
  var admin: Boolean
  var pull: Boolean
  var push: Boolean
}

object ActivityListWatchedReposForAuthenticatedUserResponseItemPermissions {
  @scala.inline
  def apply(admin: Boolean, pull: Boolean, push: Boolean): ActivityListWatchedReposForAuthenticatedUserResponseItemPermissions = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivityListWatchedReposForAuthenticatedUserResponseItemPermissions]
  }
}

