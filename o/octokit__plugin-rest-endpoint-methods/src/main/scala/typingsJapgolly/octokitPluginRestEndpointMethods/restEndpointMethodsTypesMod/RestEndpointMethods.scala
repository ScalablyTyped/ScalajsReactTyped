package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typingsJapgolly.octokitPluginRestEndpointMethods.AnonAddDeployKey
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonAddLabels
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonAddMemberLegacy
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonAddOrUpdateRestrictionsForRepo
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonBlock
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonBlockUser
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonCheckAccountIsAssociatedWithAny
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonCheckWatchingRepoLegacy
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonCreateAuthorization
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonCreateCard
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonCreateComment
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonCreateCommentReply
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonCreateCommit
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonCreateForIssue
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonCreateOrUpdateSecretForRepo
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonCreateSuite
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonDeleteArchiveForAuthenticatedUser
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonEmailLegacy
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonGetAnon29
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonGetAnon88
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonList
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonListConductCodes
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonListTemplates
import typingsJapgolly.octokitPluginRestEndpointMethods.AnonRenderRaw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestEndpointMethods extends js.Object {
  var actions: AnonCreateOrUpdateSecretForRepo
  var activity: AnonCheckWatchingRepoLegacy
  var apps: AnonCheckAccountIsAssociatedWithAny
  var checks: AnonCreateSuite
  var codesOfConduct: AnonListConductCodes
  var emojis: AnonGetAnon88
  var gists: AnonCreateComment
  var git: AnonCreateCommit
  var gitignore: AnonListTemplates
  var interactions: AnonAddOrUpdateRestrictionsForRepo
  var issues: AnonAddLabels
  var licenses: AnonList
  var markdown: AnonRenderRaw
  var meta: AnonGetAnon29
  var migrations: AnonDeleteArchiveForAuthenticatedUser
  var oauthAuthorizations: AnonCreateAuthorization
  var orgs: AnonBlockUser
  var projects: AnonCreateCard
  var pulls: AnonCreateCommentReply
  var rateLimit: AnonGetAnon29
  var reactions: AnonCreateForIssue
  var repos: AnonAddDeployKey
  var search: AnonEmailLegacy
  var teams: AnonAddMemberLegacy
  var users: AnonBlock
}

object RestEndpointMethods {
  @scala.inline
  def apply(
    actions: AnonCreateOrUpdateSecretForRepo,
    activity: AnonCheckWatchingRepoLegacy,
    apps: AnonCheckAccountIsAssociatedWithAny,
    checks: AnonCreateSuite,
    codesOfConduct: AnonListConductCodes,
    emojis: AnonGetAnon88,
    gists: AnonCreateComment,
    git: AnonCreateCommit,
    gitignore: AnonListTemplates,
    interactions: AnonAddOrUpdateRestrictionsForRepo,
    issues: AnonAddLabels,
    licenses: AnonList,
    markdown: AnonRenderRaw,
    meta: AnonGetAnon29,
    migrations: AnonDeleteArchiveForAuthenticatedUser,
    oauthAuthorizations: AnonCreateAuthorization,
    orgs: AnonBlockUser,
    projects: AnonCreateCard,
    pulls: AnonCreateCommentReply,
    rateLimit: AnonGetAnon29,
    reactions: AnonCreateForIssue,
    repos: AnonAddDeployKey,
    search: AnonEmailLegacy,
    teams: AnonAddMemberLegacy,
    users: AnonBlock
  ): RestEndpointMethods = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], oauthAuthorizations = oauthAuthorizations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RestEndpointMethods]
  }
}

