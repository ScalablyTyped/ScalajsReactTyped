package typingsJapgolly.octokitPluginRestEndpointMethods

import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AnyResponse
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.InteractionsAddOrUpdateRestrictionsForOrgParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.InteractionsAddOrUpdateRestrictionsForRepoParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.InteractionsGetRestrictionsForOrgParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.InteractionsGetRestrictionsForRepoParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.InteractionsRemoveRestrictionsForOrgParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.InteractionsRemoveRestrictionsForRepoParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddOrUpdateRestrictionsForRepo extends js.Object {
  /**
    * Temporarily restricts interactions to certain GitHub users in any public repository in the given organization. You must be an organization owner to set these restrictions.
    */
  @JSName("addOrUpdateRestrictionsForOrg")
  var addOrUpdateRestrictionsForOrg_Original: Anon137 = js.native
  /**
    * Temporarily restricts interactions to certain GitHub users within the given repository. You must have owner or admin access to set restrictions.
    */
  @JSName("addOrUpdateRestrictionsForRepo")
  var addOrUpdateRestrictionsForRepo_Original: Anon138 = js.native
  /**
    * Shows which group of GitHub users can interact with this organization and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  @JSName("getRestrictionsForOrg")
  var getRestrictionsForOrg_Original: Anon139 = js.native
  /**
    * Shows which group of GitHub users can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  @JSName("getRestrictionsForRepo")
  var getRestrictionsForRepo_Original: Anon140 = js.native
  /**
    * Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.
    */
  @JSName("removeRestrictionsForOrg")
  var removeRestrictionsForOrg_Original: Anon141 = js.native
  /**
    * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions.
    */
  @JSName("removeRestrictionsForRepo")
  var removeRestrictionsForRepo_Original: Anon142 = js.native
  /**
    * Temporarily restricts interactions to certain GitHub users in any public repository in the given organization. You must be an organization owner to set these restrictions.
    */
  def addOrUpdateRestrictionsForOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<InteractionsAddOrUpdateRestrictionsForOrgResponse> */ _
  ] = js.native
  def addOrUpdateRestrictionsForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with InteractionsAddOrUpdateRestrictionsForOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<InteractionsAddOrUpdateRestrictionsForOrgResponse> */ _
  ] = js.native
  /**
    * Temporarily restricts interactions to certain GitHub users within the given repository. You must have owner or admin access to set restrictions.
    */
  def addOrUpdateRestrictionsForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<InteractionsAddOrUpdateRestrictionsForRepoResponse> */ _
  ] = js.native
  def addOrUpdateRestrictionsForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with InteractionsAddOrUpdateRestrictionsForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<InteractionsAddOrUpdateRestrictionsForRepoResponse> */ _
  ] = js.native
  /**
    * Shows which group of GitHub users can interact with this organization and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  def getRestrictionsForOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<InteractionsGetRestrictionsForOrgResponse> */ _
  ] = js.native
  def getRestrictionsForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with InteractionsGetRestrictionsForOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<InteractionsGetRestrictionsForOrgResponse> */ _
  ] = js.native
  /**
    * Shows which group of GitHub users can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  def getRestrictionsForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<InteractionsGetRestrictionsForRepoResponse> */ _
  ] = js.native
  def getRestrictionsForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with InteractionsGetRestrictionsForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<InteractionsGetRestrictionsForRepoResponse> */ _
  ] = js.native
  /**
    * Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.
    */
  def removeRestrictionsForOrg(): js.Promise[AnyResponse] = js.native
  def removeRestrictionsForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with InteractionsRemoveRestrictionsForOrgParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions.
    */
  def removeRestrictionsForRepo(): js.Promise[AnyResponse] = js.native
  def removeRestrictionsForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with InteractionsRemoveRestrictionsForRepoParams
  ): js.Promise[AnyResponse] = js.native
}

