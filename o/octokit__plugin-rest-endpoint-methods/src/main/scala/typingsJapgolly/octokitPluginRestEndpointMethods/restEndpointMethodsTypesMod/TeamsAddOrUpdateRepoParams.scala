package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.admin
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.pull
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateRepoParams extends js.Object {
  var owner: String
  /**
    * The permission to grant the team on this repository. Can be one of:
    * \* `pull` - team members can pull, but not push to or administer this repository.
    * \* `push` - team members can pull and push, but not administer this repository.
    * \* `admin` - team members can pull, push and administer this repository.
    *
    * If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.
    */
  var permission: js.UndefOr[pull | push | admin] = js.undefined
  var repo: String
  var team_id: Double
}

object TeamsAddOrUpdateRepoParams {
  @scala.inline
  def apply(owner: String, repo: String, team_id: Double, permission: pull | push | admin = null): TeamsAddOrUpdateRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateRepoParams]
  }
}

