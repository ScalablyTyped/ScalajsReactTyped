package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrgReponame extends js.Object {
  var migration_id: AnonRequired
  var org: AnonRequired
  var repo_name: AnonRequired
}

object AnonOrgReponame {
  @scala.inline
  def apply(migration_id: AnonRequired, org: AnonRequired, repo_name: AnonRequired): AnonOrgReponame = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrgReponame]
  }
}

