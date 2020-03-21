package typingsJapgolly.typedGithubApi.webHooksMod

import typingsJapgolly.typedGithubApi.issueMod.Issue
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.assigned
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.unassigned
import typingsJapgolly.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueAssignedEvent extends IssueEvent {
  @JSName("action")
  var action_IssueAssignedEvent: assigned | unassigned
  var assignee: UserSummary
}

object IssueAssignedEvent {
  @scala.inline
  def apply(action: assigned | unassigned, assignee: UserSummary, issue: Issue): IssueAssignedEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssueAssignedEvent]
  }
}

