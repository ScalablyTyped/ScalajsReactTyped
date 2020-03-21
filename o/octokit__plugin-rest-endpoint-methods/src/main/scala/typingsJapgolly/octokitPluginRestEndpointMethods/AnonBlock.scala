package typingsJapgolly.octokitPluginRestEndpointMethods

import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AnyResponse
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.EmptyParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersAddEmailsParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersBlockParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersCheckBlockedParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersCheckFollowingForUserParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersCheckFollowingParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersCreateGpgKeyParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersCreatePublicKeyParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersDeleteEmailsParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersDeleteGpgKeyParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersDeletePublicKeyParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersFollowParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersGetByUsernameParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersGetContextForUserParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersGetGpgKeyParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersGetPublicKeyParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersListEmailsParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersListFollowersForAuthenticatedUserParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersListFollowersForUserParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersListFollowingForAuthenticatedUserParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersListFollowingForUserParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersListGpgKeysForUserParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersListGpgKeysParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersListParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersListPublicEmailsParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersListPublicKeysForUserParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersListPublicKeysParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersTogglePrimaryEmailVisibilityParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersUnblockParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersUnfollowParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.UsersUpdateAuthenticatedParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlock extends js.Object {
  /**
    * This endpoint is accessible with the `user` scope.
    */
  @JSName("addEmails")
  var addEmails_Original: Anon585 = js.native
  @JSName("block")
  var block_Original: Anon586 = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  @JSName("checkBlocked")
  var checkBlocked_Original: Anon587 = js.native
  @JSName("checkFollowingForUser")
  var checkFollowingForUser_Original: Anon589 = js.native
  @JSName("checkFollowing")
  var checkFollowing_Original: Anon588 = js.native
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("createGpgKey")
  var createGpgKey_Original: Anon590 = js.native
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("createPublicKey")
  var createPublicKey_Original: Anon591 = js.native
  /**
    * This endpoint is accessible with the `user` scope.
    */
  @JSName("deleteEmails")
  var deleteEmails_Original: Anon592 = js.native
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deleteGpgKey")
  var deleteGpgKey_Original: Anon593 = js.native
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deletePublicKey")
  var deletePublicKey_Original: Anon594 = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  @JSName("follow")
  var follow_Original: Anon595 = js.native
  /**
    * Lists public and private profile information when authenticated through basic auth or OAuth with the `user` scope.
    *
    * Lists public profile information when authenticated through OAuth without the `user` scope.
    */
  @JSName("getAuthenticated")
  var getAuthenticated_Original: Anon29 = js.native
  /**
    * Provides publicly available information about someone with a GitHub account.
    *
    * GitHub Apps with the `Plan` user permission can use this endpoint to retrieve information about a user's GitHub plan. The GitHub App must be authenticated as a user. See "[Identifying and authorizing users for GitHub Apps](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/)" for details about authentication. For an example response, see "[Response with GitHub plan information](https://developer.github.com/v3/users/#response-with-github-plan-information)."
    *
    * The `email` key in the following response is the publicly visible email address from your GitHub [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for `email`, then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub. For more information, see [Authentication](https://developer.github.com/v3/#authentication).
    *
    * The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see "[Emails API](https://developer.github.com/v3/users/emails/)".
    */
  @JSName("getByUsername")
  var getByUsername_Original: Anon596 = js.native
  /**
    * Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.
    *
    * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:
    */
  @JSName("getContextForUser")
  var getContextForUser_Original: Anon597 = js.native
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getGpgKey")
  var getGpgKey_Original: Anon598 = js.native
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getPublicKey")
  var getPublicKey_Original: Anon599 = js.native
  /**
    * List the users you've blocked on your personal account.
    */
  @JSName("listBlocked")
  var listBlocked_Original: Anon29 = js.native
  /**
    * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    */
  @JSName("listEmails")
  var listEmails_Original: Anon601 = js.native
  @JSName("listFollowersForAuthenticatedUser")
  var listFollowersForAuthenticatedUser_Original: Anon602 = js.native
  @JSName("listFollowersForUser")
  var listFollowersForUser_Original: Anon603 = js.native
  @JSName("listFollowingForAuthenticatedUser")
  var listFollowingForAuthenticatedUser_Original: Anon604 = js.native
  @JSName("listFollowingForUser")
  var listFollowingForUser_Original: Anon605 = js.native
  /**
    * Lists the GPG keys for a user. This information is accessible by anyone.
    */
  @JSName("listGpgKeysForUser")
  var listGpgKeysForUser_Original: Anon607 = js.native
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listGpgKeys")
  var listGpgKeys_Original: Anon606 = js.native
  /**
    * Lists your publicly visible email address, which you can set with the [Toggle primary email visibility](https://developer.github.com/v3/users/emails/#toggle-primary-email-visibility) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  @JSName("listPublicEmails")
  var listPublicEmails_Original: Anon608 = js.native
  /**
    * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  @JSName("listPublicKeysForUser")
  var listPublicKeysForUser_Original: Anon610 = js.native
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listPublicKeys")
  var listPublicKeys_Original: Anon609 = js.native
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of users.
    */
  @JSName("list")
  var list_Original: Anon600 = js.native
  /**
    * Sets the visibility for your primary email addresses.
    */
  @JSName("togglePrimaryEmailVisibility")
  var togglePrimaryEmailVisibility_Original: Anon611 = js.native
  @JSName("unblock")
  var unblock_Original: Anon612 = js.native
  /**
    * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  @JSName("unfollow")
  var unfollow_Original: Anon613 = js.native
  /**
    * **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
    */
  @JSName("updateAuthenticated")
  var updateAuthenticated_Original: Anon614 = js.native
  /**
    * This endpoint is accessible with the `user` scope.
    */
  def addEmails(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersAddEmailsResponse> */ _
  ] = js.native
  def addEmails(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersAddEmailsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersAddEmailsResponse> */ _
  ] = js.native
  def block(): js.Promise[AnyResponse] = js.native
  def block(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersBlockParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  def checkBlocked(): js.Promise[AnyResponse] = js.native
  def checkBlocked(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersCheckBlockedParams
  ): js.Promise[AnyResponse] = js.native
  def checkFollowing(): js.Promise[AnyResponse] = js.native
  def checkFollowing(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersCheckFollowingParams
  ): js.Promise[AnyResponse] = js.native
  def checkFollowingForUser(): js.Promise[AnyResponse] = js.native
  def checkFollowingForUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersCheckFollowingForUserParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def createGpgKey(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersCreateGpgKeyResponse> */ _
  ] = js.native
  def createGpgKey(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersCreateGpgKeyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersCreateGpgKeyResponse> */ _
  ] = js.native
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def createPublicKey(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersCreatePublicKeyResponse> */ _
  ] = js.native
  def createPublicKey(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersCreatePublicKeyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersCreatePublicKeyResponse> */ _
  ] = js.native
  /**
    * This endpoint is accessible with the `user` scope.
    */
  def deleteEmails(): js.Promise[AnyResponse] = js.native
  def deleteEmails(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersDeleteEmailsParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteGpgKey(): js.Promise[AnyResponse] = js.native
  def deleteGpgKey(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersDeleteGpgKeyParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deletePublicKey(): js.Promise[AnyResponse] = js.native
  def deletePublicKey(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersDeletePublicKeyParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  def follow(): js.Promise[AnyResponse] = js.native
  def follow(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersFollowParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Lists public and private profile information when authenticated through basic auth or OAuth with the `user` scope.
    *
    * Lists public profile information when authenticated through OAuth without the `user` scope.
    */
  def getAuthenticated(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  def getAuthenticated(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with EmptyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  /**
    * Provides publicly available information about someone with a GitHub account.
    *
    * GitHub Apps with the `Plan` user permission can use this endpoint to retrieve information about a user's GitHub plan. The GitHub App must be authenticated as a user. See "[Identifying and authorizing users for GitHub Apps](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/)" for details about authentication. For an example response, see "[Response with GitHub plan information](https://developer.github.com/v3/users/#response-with-github-plan-information)."
    *
    * The `email` key in the following response is the publicly visible email address from your GitHub [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for `email`, then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub. For more information, see [Authentication](https://developer.github.com/v3/#authentication).
    *
    * The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see "[Emails API](https://developer.github.com/v3/users/emails/)".
    */
  def getByUsername(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersGetByUsernameResponse> */ _
  ] = js.native
  def getByUsername(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersGetByUsernameParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersGetByUsernameResponse> */ _
  ] = js.native
  /**
    * Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.
    *
    * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:
    */
  def getContextForUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersGetContextForUserResponse> */ _
  ] = js.native
  def getContextForUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersGetContextForUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersGetContextForUserResponse> */ _
  ] = js.native
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getGpgKey(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersGetGpgKeyResponse> */ _
  ] = js.native
  def getGpgKey(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersGetGpgKeyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersGetGpgKeyResponse> */ _
  ] = js.native
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getPublicKey(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersGetPublicKeyResponse> */ _
  ] = js.native
  def getPublicKey(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersGetPublicKeyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersGetPublicKeyResponse> */ _
  ] = js.native
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of users.
    */
  def list(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListResponse> */ _
  ] = js.native
  def list(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersListParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListResponse> */ _
  ] = js.native
  /**
    * List the users you've blocked on your personal account.
    */
  def listBlocked(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  def listBlocked(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with EmptyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  /**
    * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    */
  def listEmails(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListEmailsResponse> */ _
  ] = js.native
  def listEmails(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersListEmailsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListEmailsResponse> */ _
  ] = js.native
  def listFollowersForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListFollowersForAuthenticatedUserResponse> */ _
  ] = js.native
  def listFollowersForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersListFollowersForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListFollowersForAuthenticatedUserResponse> */ _
  ] = js.native
  def listFollowersForUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListFollowersForUserResponse> */ _
  ] = js.native
  def listFollowersForUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersListFollowersForUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListFollowersForUserResponse> */ _
  ] = js.native
  def listFollowingForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListFollowingForAuthenticatedUserResponse> */ _
  ] = js.native
  def listFollowingForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersListFollowingForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListFollowingForAuthenticatedUserResponse> */ _
  ] = js.native
  def listFollowingForUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListFollowingForUserResponse> */ _
  ] = js.native
  def listFollowingForUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersListFollowingForUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListFollowingForUserResponse> */ _
  ] = js.native
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listGpgKeys(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListGpgKeysResponse> */ _
  ] = js.native
  def listGpgKeys(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersListGpgKeysParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListGpgKeysResponse> */ _
  ] = js.native
  /**
    * Lists the GPG keys for a user. This information is accessible by anyone.
    */
  def listGpgKeysForUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListGpgKeysForUserResponse> */ _
  ] = js.native
  def listGpgKeysForUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersListGpgKeysForUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListGpgKeysForUserResponse> */ _
  ] = js.native
  /**
    * Lists your publicly visible email address, which you can set with the [Toggle primary email visibility](https://developer.github.com/v3/users/emails/#toggle-primary-email-visibility) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  def listPublicEmails(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListPublicEmailsResponse> */ _
  ] = js.native
  def listPublicEmails(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersListPublicEmailsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListPublicEmailsResponse> */ _
  ] = js.native
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listPublicKeys(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListPublicKeysResponse> */ _
  ] = js.native
  def listPublicKeys(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersListPublicKeysParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListPublicKeysResponse> */ _
  ] = js.native
  /**
    * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  def listPublicKeysForUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListPublicKeysForUserResponse> */ _
  ] = js.native
  def listPublicKeysForUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersListPublicKeysForUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListPublicKeysForUserResponse> */ _
  ] = js.native
  /**
    * Sets the visibility for your primary email addresses.
    */
  def togglePrimaryEmailVisibility(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersTogglePrimaryEmailVisibilityResponse> */ _
  ] = js.native
  def togglePrimaryEmailVisibility(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersTogglePrimaryEmailVisibilityParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersTogglePrimaryEmailVisibilityResponse> */ _
  ] = js.native
  def unblock(): js.Promise[AnyResponse] = js.native
  def unblock(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersUnblockParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  def unfollow(): js.Promise[AnyResponse] = js.native
  def unfollow(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersUnfollowParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
    */
  def updateAuthenticated(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersUpdateAuthenticatedResponse> */ _
  ] = js.native
  def updateAuthenticated(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with UsersUpdateAuthenticatedParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersUpdateAuthenticatedResponse> */ _
  ] = js.native
}

