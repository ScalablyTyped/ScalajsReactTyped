package typingsJapgolly.octokitRest

import typingsJapgolly.octokitRest.mod.Octokit.AnyResponse
import typingsJapgolly.octokitRest.mod.Octokit.InteractionsAddOrUpdateRestrictionsForOrgParams
import typingsJapgolly.octokitRest.mod.Octokit.InteractionsAddOrUpdateRestrictionsForOrgResponse
import typingsJapgolly.octokitRest.mod.Octokit.InteractionsAddOrUpdateRestrictionsForRepoParams
import typingsJapgolly.octokitRest.mod.Octokit.InteractionsAddOrUpdateRestrictionsForRepoResponse
import typingsJapgolly.octokitRest.mod.Octokit.InteractionsGetRestrictionsForOrgParams
import typingsJapgolly.octokitRest.mod.Octokit.InteractionsGetRestrictionsForOrgResponse
import typingsJapgolly.octokitRest.mod.Octokit.InteractionsGetRestrictionsForRepoParams
import typingsJapgolly.octokitRest.mod.Octokit.InteractionsGetRestrictionsForRepoResponse
import typingsJapgolly.octokitRest.mod.Octokit.InteractionsRemoveRestrictionsForOrgParams
import typingsJapgolly.octokitRest.mod.Octokit.InteractionsRemoveRestrictionsForRepoParams
import typingsJapgolly.octokitRest.mod.Octokit.RequestOptions
import typingsJapgolly.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddOrUpdateRestrictionsForOrg extends js.Object {
  /**
    * Temporarily restricts interactions to certain GitHub users in any public repository in the given organization. You must be an organization owner to set these restrictions.
    */
  @JSName("addOrUpdateRestrictionsForOrg")
  var addOrUpdateRestrictionsForOrg_Original: Anon140 = js.native
  /**
    * Temporarily restricts interactions to certain GitHub users within the given repository. You must have owner or admin access to set restrictions.
    */
  @JSName("addOrUpdateRestrictionsForRepo")
  var addOrUpdateRestrictionsForRepo_Original: Anon141 = js.native
  /**
    * Shows which group of GitHub users can interact with this organization and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  @JSName("getRestrictionsForOrg")
  var getRestrictionsForOrg_Original: Anon142 = js.native
  /**
    * Shows which group of GitHub users can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  @JSName("getRestrictionsForRepo")
  var getRestrictionsForRepo_Original: Anon143 = js.native
  /**
    * Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.
    */
  @JSName("removeRestrictionsForOrg")
  var removeRestrictionsForOrg_Original: Anon144 = js.native
  /**
    * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions.
    */
  @JSName("removeRestrictionsForRepo")
  var removeRestrictionsForRepo_Original: Anon145 = js.native
  /**
    * Temporarily restricts interactions to certain GitHub users in any public repository in the given organization. You must be an organization owner to set these restrictions.
    */
  def addOrUpdateRestrictionsForOrg(): js.Promise[Response[InteractionsAddOrUpdateRestrictionsForOrgResponse]] = js.native
  def addOrUpdateRestrictionsForOrg(params: RequestOptions with InteractionsAddOrUpdateRestrictionsForOrgParams): js.Promise[Response[InteractionsAddOrUpdateRestrictionsForOrgResponse]] = js.native
  /**
    * Temporarily restricts interactions to certain GitHub users within the given repository. You must have owner or admin access to set restrictions.
    */
  def addOrUpdateRestrictionsForRepo(): js.Promise[Response[InteractionsAddOrUpdateRestrictionsForRepoResponse]] = js.native
  def addOrUpdateRestrictionsForRepo(params: RequestOptions with InteractionsAddOrUpdateRestrictionsForRepoParams): js.Promise[Response[InteractionsAddOrUpdateRestrictionsForRepoResponse]] = js.native
  /**
    * Shows which group of GitHub users can interact with this organization and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  def getRestrictionsForOrg(): js.Promise[Response[InteractionsGetRestrictionsForOrgResponse]] = js.native
  def getRestrictionsForOrg(params: RequestOptions with InteractionsGetRestrictionsForOrgParams): js.Promise[Response[InteractionsGetRestrictionsForOrgResponse]] = js.native
  /**
    * Shows which group of GitHub users can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  def getRestrictionsForRepo(): js.Promise[Response[InteractionsGetRestrictionsForRepoResponse]] = js.native
  def getRestrictionsForRepo(params: RequestOptions with InteractionsGetRestrictionsForRepoParams): js.Promise[Response[InteractionsGetRestrictionsForRepoResponse]] = js.native
  /**
    * Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.
    */
  def removeRestrictionsForOrg(): js.Promise[AnyResponse] = js.native
  def removeRestrictionsForOrg(params: RequestOptions with InteractionsRemoveRestrictionsForOrgParams): js.Promise[AnyResponse] = js.native
  /**
    * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions.
    */
  def removeRestrictionsForRepo(): js.Promise[AnyResponse] = js.native
  def removeRestrictionsForRepo(params: RequestOptions with InteractionsRemoveRestrictionsForRepoParams): js.Promise[AnyResponse] = js.native
}

