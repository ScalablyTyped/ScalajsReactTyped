package typingsJapgolly.typedGithubApi.webHookMod

import typingsJapgolly.typedGithubApi.interfacesIssueMod.Issue
import typingsJapgolly.typedGithubApi.interfacesUserMod.UserSummary
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

trait IssueWebHookData extends WebHookData {
  @JSName("action")
  var action_IssueWebHookData: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
  var issue: Issue
}

object IssueWebHookData {
  @scala.inline
  def apply(
    action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
    event: String,
    id: String,
    issue: Issue,
    sender: UserSummary
  ): IssueWebHookData = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssueWebHookData]
  }
}

