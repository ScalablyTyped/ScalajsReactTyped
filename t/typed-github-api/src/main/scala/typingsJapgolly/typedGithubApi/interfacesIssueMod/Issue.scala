package typingsJapgolly.typedGithubApi.interfacesIssueMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.moment.mod.Duration_
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.typedGithubApi.interfacesLabelMod.Label
import typingsJapgolly.typedGithubApi.interfacesMilestoneMod.Milestone
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.Repository
import typingsJapgolly.typedGithubApi.interfacesUserMod.UserSummary
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.closed
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends IssueRef {
  val age: Duration_
  var assignee: js.UndefOr[UserSummary] = js.undefined
  var assignees: js.Array[UserSummary]
  var body: String
  var closed: js.UndefOr[Moment] = js.undefined
  var closedBy: js.UndefOr[UserSummary] = js.undefined
  var comments: Double
  var created: Moment
  var createdBy: UserSummary
  var htmlUri: String
  var id: Double
  val isOpen: Boolean
  var isPullRequest: Boolean
  var labels: js.Array[Label]
  var locked: Boolean
  var milestone: js.UndefOr[Milestone] = js.undefined
  var state: open | closed
  var title: String
  var updated: Moment
  def wasOpen(when: Moment): Boolean
}

object Issue {
  @scala.inline
  def apply(
    age: Duration_,
    assignees: js.Array[UserSummary],
    body: String,
    comments: Double,
    created: Moment,
    createdBy: UserSummary,
    htmlUri: String,
    id: Double,
    isOpen: Boolean,
    isPullRequest: Boolean,
    labels: js.Array[Label],
    loadAsync: CallbackTo[js.Promise[Issue | Null]],
    loadRepositoryAsync: CallbackTo[js.Promise[Repository]],
    locked: Boolean,
    number: Double,
    state: open | closed,
    title: String,
    updated: Moment,
    wasOpen: Moment => CallbackTo[Boolean],
    assignee: UserSummary = null,
    closed: Moment = null,
    closedBy: UserSummary = null,
    milestone: Milestone = null
  ): Issue = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPullRequest = isPullRequest.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.updateDynamic("loadAsync")(loadAsync.toJsFn)
    __obj.updateDynamic("loadRepositoryAsync")(loadRepositoryAsync.toJsFn)
    __obj.updateDynamic("wasOpen")(js.Any.fromFunction1((t0: typingsJapgolly.moment.mod.Moment) => wasOpen(t0).runNow()))
    if (assignee != null) __obj.updateDynamic("assignee")(assignee.asInstanceOf[js.Any])
    if (closed != null) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (closedBy != null) __obj.updateDynamic("closedBy")(closedBy.asInstanceOf[js.Any])
    if (milestone != null) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issue]
  }
}

