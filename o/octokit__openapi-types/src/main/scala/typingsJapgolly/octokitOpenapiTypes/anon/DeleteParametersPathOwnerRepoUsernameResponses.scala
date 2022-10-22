package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOwnerRepoUsernameResponses extends StObject {
  
  var delete: ParametersPathOwnerRepoUsernameResponses
  
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * Team members will include the members of child teams.
    *
    * You must authenticate using an access token with the `read:org` and `repo` scopes with push access to use this
    * endpoint. GitHub Apps must have the `members` organization permission and `metadata` repository permission to use this
    * endpoint.
    */
  var get: ParametersPathOwnerRepoUsername
  
  /**
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    *
    * Adding an outside collaborator may be restricted by enterprise administrators. For more information, see "[Enforcing repository management policies in your enterprise](https://docs.github.com/enterprise-cloud@latest/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories)."
    *
    * For more information on permission levels, see "[Repository permission levels for an organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/repository-permission-levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)". There are restrictions on which permissions can be granted to organization members when an organization base role is in place. In this case, the permission being given must be equal to or higher than the org base permission. Otherwise, the request will fail with:
    *
    * ```
    * Cannot assign {member} permission of {role name}
    * ```
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    *
    * The invitee will receive a notification that they have been invited to the repository, which they must accept or decline. They may do this via the notifications page, the email they receive, or by using the [repository invitations API endpoints](https://docs.github.com/rest/reference/repos#invitations).
    *
    * **Updating an existing collaborator's permission level**
    *
    * The endpoint can also be used to change the permissions of an existing collaborator without first removing and re-adding the collaborator. To change the permissions, use the same endpoint and pass a different `permission` parameter. The response will be a `204`, with no other indication that the permission level changed.
    *
    * **Rate limits**
    *
    * You are limited to sending 50 invitations to a repository per 24 hour period. Note there is no limit if you are inviting organization members to an organization repository.
    */
  var put: Responses201Content464
}
object DeleteParametersPathOwnerRepoUsernameResponses {
  
  inline def apply(
    delete: ParametersPathOwnerRepoUsernameResponses,
    get: ParametersPathOwnerRepoUsername,
    put: Responses201Content464
  ): DeleteParametersPathOwnerRepoUsernameResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOwnerRepoUsernameResponses]
  }
  
  extension [Self <: DeleteParametersPathOwnerRepoUsernameResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathOwnerRepoUsernameResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathOwnerRepoUsername): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses201Content464): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
