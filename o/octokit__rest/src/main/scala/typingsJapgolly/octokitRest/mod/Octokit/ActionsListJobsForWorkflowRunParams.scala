package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListJobsForWorkflowRunParams extends js.Object {
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  var run_id: Double
}

object ActionsListJobsForWorkflowRunParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    run_id: Double,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ActionsListJobsForWorkflowRunParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListJobsForWorkflowRunParams]
  }
}

