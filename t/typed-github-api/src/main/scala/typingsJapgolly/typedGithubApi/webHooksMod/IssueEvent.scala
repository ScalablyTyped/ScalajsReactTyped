package typingsJapgolly.typedGithubApi.webHooksMod

import typingsJapgolly.typedGithubApi.issueMod.Issue
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.assigned
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.closed
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.demilestoned
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.edited
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.labeled
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.milestoned
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.opened
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.reopened
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.unassigned
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.unlabeled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueEvent extends Event {
  @JSName("action")
  var action_IssueEvent: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
  var issue: Issue
}

object IssueEvent {
  @scala.inline
  def apply(
    action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
    issue: Issue
  ): IssueEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssueEvent]
  }
}

