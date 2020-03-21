package typingsJapgolly.typedGithubApi.interfacesPullRequestMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.typedGithubApi.interfacesBranchMod.BranchSummary
import typingsJapgolly.typedGithubApi.interfacesBranchMod.BranchSummaryWithRepository
import typingsJapgolly.typedGithubApi.interfacesIssueMod.Issue
import typingsJapgolly.typedGithubApi.interfacesMilestoneMod.Milestone
import typingsJapgolly.typedGithubApi.interfacesUserMod.UserSummary
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.closed
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequest extends PullRequestRef {
  var assignee: UserSummary | Null
  var assignees: js.Array[UserSummary]
  var base: BranchSummaryWithRepository
  var body: String
  var closedAt: js.UndefOr[Moment] = js.undefined
  var createdAt: Moment
  var createdBy: UserSummary
  var head: BranchSummary
  var htmlUri: String
  var id: Double
  var locked: Boolean
  var mergedAt: js.UndefOr[Moment] = js.undefined
  var milestone: Milestone | Null
  var state: open | closed
  var title: String
  var updatedAt: Moment
  def loadIssueAsync(): js.Promise[Issue]
  def loadReviewCommentsAsync(): js.Promise[js.Array[ReviewComment]]
  def loadReviewRequestsAsync(): js.Promise[ReviewRequests]
  def loadReviewsAsync(): js.Promise[js.Array[Review]]
}

object PullRequest {
  @scala.inline
  def apply(
    assignees: js.Array[UserSummary],
    base: BranchSummaryWithRepository,
    body: String,
    createdAt: Moment,
    createdBy: UserSummary,
    head: BranchSummary,
    htmlUri: String,
    id: Double,
    loadAsync: CallbackTo[js.Promise[PullRequest | Null]],
    loadIssueAsync: CallbackTo[js.Promise[Issue]],
    loadReviewCommentsAsync: CallbackTo[js.Promise[js.Array[ReviewComment]]],
    loadReviewRequestsAsync: CallbackTo[js.Promise[ReviewRequests]],
    loadReviewsAsync: CallbackTo[js.Promise[js.Array[Review]]],
    locked: Boolean,
    number: Double,
    state: open | closed,
    title: String,
    updatedAt: Moment,
    assignee: UserSummary = null,
    closedAt: Moment = null,
    mergedAt: Moment = null,
    milestone: Milestone = null
  ): PullRequest = {
    val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("loadAsync")(loadAsync.toJsFn)
    __obj.updateDynamic("loadIssueAsync")(loadIssueAsync.toJsFn)
    __obj.updateDynamic("loadReviewCommentsAsync")(loadReviewCommentsAsync.toJsFn)
    __obj.updateDynamic("loadReviewRequestsAsync")(loadReviewRequestsAsync.toJsFn)
    __obj.updateDynamic("loadReviewsAsync")(loadReviewsAsync.toJsFn)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee.asInstanceOf[js.Any])
    if (closedAt != null) __obj.updateDynamic("closedAt")(closedAt.asInstanceOf[js.Any])
    if (mergedAt != null) __obj.updateDynamic("mergedAt")(mergedAt.asInstanceOf[js.Any])
    if (milestone != null) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequest]
  }
}

