package typingsJapgolly.octokitRest.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.octokitRest.AnonAcceptInvitation
import typingsJapgolly.octokitRest.AnonAddAssignees
import typingsJapgolly.octokitRest.AnonAddCollaborator
import typingsJapgolly.octokitRest.AnonAddEmails
import typingsJapgolly.octokitRest.AnonAddMember
import typingsJapgolly.octokitRest.AnonAddOrUpdateMembership
import typingsJapgolly.octokitRest.AnonAddOrUpdateRestrictionsForOrg
import typingsJapgolly.octokitRest.AnonAddRepoToInstallation
import typingsJapgolly.octokitRest.AnonAfter
import typingsJapgolly.octokitRest.AnonCancelImport
import typingsJapgolly.octokitRest.AnonCancelWorkflowRun
import typingsJapgolly.octokitRest.AnonCheckAuthorization
import typingsJapgolly.octokitRest.AnonCheckIfMerged
import typingsJapgolly.octokitRest.AnonCheckIsStarred
import typingsJapgolly.octokitRest.AnonCheckStarringRepo
import typingsJapgolly.octokitRest.AnonCode
import typingsJapgolly.octokitRest.AnonCreate
import typingsJapgolly.octokitRest.AnonCreateBlob
import typingsJapgolly.octokitRest.AnonCreateForCommitComment
import typingsJapgolly.octokitRest.AnonGet
import typingsJapgolly.octokitRest.AnonGetAnon191
import typingsJapgolly.octokitRest.AnonGetAnon319
import typingsJapgolly.octokitRest.AnonGetConductCode
import typingsJapgolly.octokitRest.AnonGetForRepo
import typingsJapgolly.octokitRest.AnonGetTemplate
import typingsJapgolly.octokitRest.AnonRender
import typingsJapgolly.octokitRest.mod.Octokit.AnyResponse
import typingsJapgolly.octokitRest.mod.Octokit.AuthBasic
import typingsJapgolly.octokitRest.mod.Octokit.AuthJWT
import typingsJapgolly.octokitRest.mod.Octokit.AuthOAuthSecret
import typingsJapgolly.octokitRest.mod.Octokit.AuthOAuthToken
import typingsJapgolly.octokitRest.mod.Octokit.AuthUserToken
import typingsJapgolly.octokitRest.mod.Octokit.EndpointOptions
import typingsJapgolly.octokitRest.mod.Octokit.Log
import typingsJapgolly.octokitRest.mod.Octokit.Options
import typingsJapgolly.octokitRest.mod.Octokit.Paginate
import typingsJapgolly.octokitRest.mod.Octokit.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/rest", "Octokit")
@js.native
class Octokit_ () extends js.Object {
  def this(options: Options) = this()
  var actions: AnonCancelWorkflowRun = js.native
  var activity: AnonCheckStarringRepo = js.native
  var apps: AnonAddRepoToInstallation = js.native
  var checks: AnonCreate = js.native
  var codesOfConduct: AnonGetConductCode = js.native
  var emojis: AnonGet = js.native
  var gists: AnonCheckIsStarred = js.native
  var git: AnonCreateBlob = js.native
  var gitignore: AnonGetTemplate = js.native
  var hook: AnonAfter = js.native
  var interactions: AnonAddOrUpdateRestrictionsForOrg = js.native
  var issues: AnonAddAssignees = js.native
  var licenses: AnonGetForRepo = js.native
  var log: Log = js.native
  var markdown: AnonRender = js.native
  var meta: AnonGetAnon191 = js.native
  var migrations: AnonCancelImport = js.native
  var oauthAuthorizations: AnonCheckAuthorization = js.native
  var orgs: AnonAddOrUpdateMembership = js.native
  @JSName("paginate")
  var paginate_Original: Paginate = js.native
  var projects: AnonAddCollaborator = js.native
  var pulls: AnonCheckIfMerged = js.native
  var rateLimit: AnonGetAnon319 = js.native
  var reactions: AnonCreateForCommitComment = js.native
  var repos: AnonAcceptInvitation = js.native
  @JSName("request")
  var request_Original: Request = js.native
  var search: AnonCode = js.native
  var teams: AnonAddMember = js.native
  var users: AnonAddEmails = js.native
  def authenticate(auth: AuthBasic): Unit = js.native
  def authenticate(auth: AuthJWT): Unit = js.native
  def authenticate(auth: AuthOAuthSecret): Unit = js.native
  def authenticate(auth: AuthOAuthToken): Unit = js.native
  def authenticate(auth: AuthUserToken): Unit = js.native
  def paginate(EndpointOptions: EndpointOptions): js.Promise[js.Array[_]] = js.native
  def paginate(
    EndpointOptions: EndpointOptions,
    callback: js.Function2[/* response */ AnyResponse, /* done */ js.Function0[Unit], _]
  ): js.Promise[js.Array[_]] = js.native
  def paginate(Route: String): js.Promise[js.Array[_]] = js.native
  def paginate(Route: String, EndpointOptions: EndpointOptions): js.Promise[js.Array[_]] = js.native
  def paginate(
    Route: String,
    EndpointOptions: EndpointOptions,
    callback: js.Function2[/* response */ AnyResponse, /* done */ js.Function0[Unit], _]
  ): js.Promise[js.Array[_]] = js.native
  def registerEndpoints(endpoints: StringDictionary[EndpointOptions]): Unit = js.native
  def request(EndpointOptions: EndpointOptions): js.Promise[AnyResponse] = js.native
  def request(Route: String): js.Promise[AnyResponse] = js.native
  def request(Route: String, EndpointOptions: EndpointOptions): js.Promise[AnyResponse] = js.native
}

