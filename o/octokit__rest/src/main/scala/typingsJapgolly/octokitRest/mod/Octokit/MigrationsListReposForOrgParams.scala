package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsListReposForOrgParams extends js.Object {
  var migration_id: Double
  var org: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
}

object MigrationsListReposForOrgParams {
  @scala.inline
  def apply(migration_id: Double, org: String, page: Int | Double = null, per_page: Int | Double = null): MigrationsListReposForOrgParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsListReposForOrgParams]
  }
}

