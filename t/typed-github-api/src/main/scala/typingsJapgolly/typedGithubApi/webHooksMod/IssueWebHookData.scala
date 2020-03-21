package typingsJapgolly.typedGithubApi.webHooksMod

import typingsJapgolly.typedGithubApi.issueMod.Issue
import typingsJapgolly.typedGithubApi.repositoryMod.Repository
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
import typingsJapgolly.typedGithubApi.userMod.OrganizationSummary
import typingsJapgolly.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.typedGithubApi.webHooksMod.Event because Already inherited
- typingsJapgolly.typedGithubApi.webHooksMod.WebHookData because var conflicts: action. Inlined sender, organization, repository */ trait IssueWebHookData extends IssueEvent {
  var organization: js.UndefOr[OrganizationSummary] = js.undefined
  var repository: js.UndefOr[Repository] = js.undefined
  var sender: UserSummary
}

object IssueWebHookData {
  @scala.inline
  def apply(
    action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
    issue: Issue,
    sender: UserSummary,
    organization: OrganizationSummary = null,
    repository: Repository = null
  ): IssueWebHookData = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueWebHookData]
  }
}

