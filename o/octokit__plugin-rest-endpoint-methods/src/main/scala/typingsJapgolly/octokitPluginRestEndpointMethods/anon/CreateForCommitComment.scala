package typingsJapgolly.octokitPluginRestEndpointMethods.anon

import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsJapgolly.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateForCommitComment extends StObject {
  
  /**
    * Create a reaction to a [commit comment](https://docs.github.com/rest/reference/repos#comments). A response with an HTTP `200` status means that you already added the reaction type to this commit comment.
    */
  def createForCommitComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/comments/{comment_id}/reactions']['response'] */ js.Any
  ]
  def createForCommitComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/comments/{comment_id}/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/comments/{comment_id}/reactions']['response'] */ js.Any
  ]
  /**
    * Create a reaction to a [commit comment](https://docs.github.com/rest/reference/repos#comments). A response with an HTTP `200` status means that you already added the reaction type to this commit comment.
    */
  @JSName("createForCommitComment")
  var createForCommitComment_Original: `509`
  
  /**
    * Create a reaction to an [issue](https://docs.github.com/rest/reference/issues/). A response with an HTTP `200` status means that you already added the reaction type to this issue.
    */
  def createForIssue(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/{issue_number}/reactions']['response'] */ js.Any
  ]
  def createForIssue(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/{issue_number}/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/{issue_number}/reactions']['response'] */ js.Any
  ]
  
  /**
    * Create a reaction to an [issue comment](https://docs.github.com/rest/reference/issues#comments). A response with an HTTP `200` status means that you already added the reaction type to this issue comment.
    */
  def createForIssueComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions']['response'] */ js.Any
  ]
  def createForIssueComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions']['response'] */ js.Any
  ]
  /**
    * Create a reaction to an [issue comment](https://docs.github.com/rest/reference/issues#comments). A response with an HTTP `200` status means that you already added the reaction type to this issue comment.
    */
  @JSName("createForIssueComment")
  var createForIssueComment_Original: `511`
  
  /**
    * Create a reaction to an [issue](https://docs.github.com/rest/reference/issues/). A response with an HTTP `200` status means that you already added the reaction type to this issue.
    */
  @JSName("createForIssue")
  var createForIssue_Original: `510`
  
  /**
    * Create a reaction to a [pull request review comment](https://docs.github.com/rest/reference/pulls#comments). A response with an HTTP `200` status means that you already added the reaction type to this pull request review comment.
    */
  def createForPullRequestReviewComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions']['response'] */ js.Any
  ]
  def createForPullRequestReviewComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions']['response'] */ js.Any
  ]
  /**
    * Create a reaction to a [pull request review comment](https://docs.github.com/rest/reference/pulls#comments). A response with an HTTP `200` status means that you already added the reaction type to this pull request review comment.
    */
  @JSName("createForPullRequestReviewComment")
  var createForPullRequestReviewComment_Original: `512`
  
  /**
    * Create a reaction to a [release](https://docs.github.com/rest/reference/repos#releases). A response with a `Status: 200 OK` means that you already added the reaction type to this release.
    */
  def createForRelease(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/releases/{release_id}/reactions']['response'] */ js.Any
  ]
  def createForRelease(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/releases/{release_id}/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/releases/{release_id}/reactions']['response'] */ js.Any
  ]
  /**
    * Create a reaction to a [release](https://docs.github.com/rest/reference/repos#releases). A response with a `Status: 200 OK` means that you already added the reaction type to this release.
    */
  @JSName("createForRelease")
  var createForRelease_Original: `513`
  
  /**
    * Create a reaction to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP `200` status means that you already added the reaction type to this team discussion comment.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  def createForTeamDiscussionCommentInOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions']['response'] */ js.Any
  ]
  def createForTeamDiscussionCommentInOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions']['response'] */ js.Any
  ]
  /**
    * Create a reaction to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP `200` status means that you already added the reaction type to this team discussion comment.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  @JSName("createForTeamDiscussionCommentInOrg")
  var createForTeamDiscussionCommentInOrg_Original: `514`
  
  /**
    * Create a reaction to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP `200` status means that you already added the reaction type to this team discussion.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  def createForTeamDiscussionInOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions']['response'] */ js.Any
  ]
  def createForTeamDiscussionInOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions']['response'] */ js.Any
  ]
  /**
    * Create a reaction to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP `200` status means that you already added the reaction type to this team discussion.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  @JSName("createForTeamDiscussionInOrg")
  var createForTeamDiscussionInOrg_Original: `515`
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/comments/:comment_id/reactions/:reaction_id`.
    *
    * Delete a reaction to a [commit comment](https://docs.github.com/rest/reference/repos#comments).
    */
  def deleteForCommitComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/comments/{comment_id}/reactions/{reaction_id}']['response'] */ js.Any
  ]
  def deleteForCommitComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/comments/{comment_id}/reactions/{reaction_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/comments/{comment_id}/reactions/{reaction_id}']['response'] */ js.Any
  ]
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/comments/:comment_id/reactions/:reaction_id`.
    *
    * Delete a reaction to a [commit comment](https://docs.github.com/rest/reference/repos#comments).
    */
  @JSName("deleteForCommitComment")
  var deleteForCommitComment_Original: `516`
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/issues/:issue_number/reactions/:reaction_id`.
    *
    * Delete a reaction to an [issue](https://docs.github.com/rest/reference/issues/).
    */
  def deleteForIssue(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/reactions/{reaction_id}']['response'] */ js.Any
  ]
  def deleteForIssue(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/reactions/{reaction_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/{issue_number}/reactions/{reaction_id}']['response'] */ js.Any
  ]
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE delete /repositories/:repository_id/issues/comments/:comment_id/reactions/:reaction_id`.
    *
    * Delete a reaction to an [issue comment](https://docs.github.com/rest/reference/issues#comments).
    */
  def deleteForIssueComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions/{reaction_id}']['response'] */ js.Any
  ]
  def deleteForIssueComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions/{reaction_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions/{reaction_id}']['response'] */ js.Any
  ]
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE delete /repositories/:repository_id/issues/comments/:comment_id/reactions/:reaction_id`.
    *
    * Delete a reaction to an [issue comment](https://docs.github.com/rest/reference/issues#comments).
    */
  @JSName("deleteForIssueComment")
  var deleteForIssueComment_Original: `518`
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/issues/:issue_number/reactions/:reaction_id`.
    *
    * Delete a reaction to an [issue](https://docs.github.com/rest/reference/issues/).
    */
  @JSName("deleteForIssue")
  var deleteForIssue_Original: `517`
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/pulls/comments/:comment_id/reactions/:reaction_id.`
    *
    * Delete a reaction to a [pull request review comment](https://docs.github.com/rest/reference/pulls#review-comments).
    */
  def deleteForPullRequestComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions/{reaction_id}']['response'] */ js.Any
  ]
  def deleteForPullRequestComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions/{reaction_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions/{reaction_id}']['response'] */ js.Any
  ]
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/pulls/comments/:comment_id/reactions/:reaction_id.`
    *
    * Delete a reaction to a [pull request review comment](https://docs.github.com/rest/reference/pulls#review-comments).
    */
  @JSName("deleteForPullRequestComment")
  var deleteForPullRequestComment_Original: `519`
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE delete /repositories/:repository_id/releases/:release_id/reactions/:reaction_id`.
    *
    * Delete a reaction to a [release](https://docs.github.com/rest/reference/repos#releases).
    */
  def deleteForRelease(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/releases/{release_id}/reactions/{reaction_id}']['response'] */ js.Any
  ]
  def deleteForRelease(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/releases/{release_id}/reactions/{reaction_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/releases/{release_id}/reactions/{reaction_id}']['response'] */ js.Any
  ]
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE delete /repositories/:repository_id/releases/:release_id/reactions/:reaction_id`.
    *
    * Delete a reaction to a [release](https://docs.github.com/rest/reference/repos#releases).
    */
  @JSName("deleteForRelease")
  var deleteForRelease_Original: `520`
  
  /**
    * **Note:** You can also specify a team or organization with `team_id` and `org_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions/:reaction_id`.
    *
    * Delete a reaction to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteForTeamDiscussion(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions/{reaction_id}']['response'] */ js.Any
  ]
  def deleteForTeamDiscussion(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions/{reaction_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions/{reaction_id}']['response'] */ js.Any
  ]
  
  /**
    * **Note:** You can also specify a team or organization with `team_id` and `org_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions/:reaction_id`.
    *
    * Delete a reaction to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteForTeamDiscussionComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions/{reaction_id}']['response'] */ js.Any
  ]
  def deleteForTeamDiscussionComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions/{reaction_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions/{reaction_id}']['response'] */ js.Any
  ]
  /**
    * **Note:** You can also specify a team or organization with `team_id` and `org_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions/:reaction_id`.
    *
    * Delete a reaction to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deleteForTeamDiscussionComment")
  var deleteForTeamDiscussionComment_Original: `522`
  
  /**
    * **Note:** You can also specify a team or organization with `team_id` and `org_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions/:reaction_id`.
    *
    * Delete a reaction to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deleteForTeamDiscussion")
  var deleteForTeamDiscussion_Original: `521`
  
  /**
    * List the reactions to a [commit comment](https://docs.github.com/rest/reference/repos#comments).
    */
  def listForCommitComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/comments/{comment_id}/reactions']['response'] */ js.Any
  ]
  def listForCommitComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/comments/{comment_id}/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/comments/{comment_id}/reactions']['response'] */ js.Any
  ]
  /**
    * List the reactions to a [commit comment](https://docs.github.com/rest/reference/repos#comments).
    */
  @JSName("listForCommitComment")
  var listForCommitComment_Original: `523`
  
  /**
    * List the reactions to an [issue](https://docs.github.com/rest/reference/issues).
    */
  def listForIssue(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/reactions']['response'] */ js.Any
  ]
  def listForIssue(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/{issue_number}/reactions']['response'] */ js.Any
  ]
  
  /**
    * List the reactions to an [issue comment](https://docs.github.com/rest/reference/issues#comments).
    */
  def listForIssueComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions']['response'] */ js.Any
  ]
  def listForIssueComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions']['response'] */ js.Any
  ]
  /**
    * List the reactions to an [issue comment](https://docs.github.com/rest/reference/issues#comments).
    */
  @JSName("listForIssueComment")
  var listForIssueComment_Original: `525`
  
  /**
    * List the reactions to an [issue](https://docs.github.com/rest/reference/issues).
    */
  @JSName("listForIssue")
  var listForIssue_Original: `524`
  
  /**
    * List the reactions to a [pull request review comment](https://docs.github.com/rest/reference/pulls#review-comments).
    */
  def listForPullRequestReviewComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions']['response'] */ js.Any
  ]
  def listForPullRequestReviewComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions']['response'] */ js.Any
  ]
  /**
    * List the reactions to a [pull request review comment](https://docs.github.com/rest/reference/pulls#review-comments).
    */
  @JSName("listForPullRequestReviewComment")
  var listForPullRequestReviewComment_Original: `526`
  
  /**
    * List the reactions to a [release](https://docs.github.com/rest/reference/repos#releases).
    */
  def listForRelease(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/{release_id}/reactions']['response'] */ js.Any
  ]
  def listForRelease(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/{release_id}/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/releases/{release_id}/reactions']['response'] */ js.Any
  ]
  /**
    * List the reactions to a [release](https://docs.github.com/rest/reference/repos#releases).
    */
  @JSName("listForRelease")
  var listForRelease_Original: `527`
  
  /**
    * List the reactions to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments/). OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  def listForTeamDiscussionCommentInOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions']['response'] */ js.Any
  ]
  def listForTeamDiscussionCommentInOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions']['response'] */ js.Any
  ]
  /**
    * List the reactions to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments/). OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  @JSName("listForTeamDiscussionCommentInOrg")
  var listForTeamDiscussionCommentInOrg_Original: `528`
  
  /**
    * List the reactions to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  def listForTeamDiscussionInOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions']['response'] */ js.Any
  ]
  def listForTeamDiscussionInOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions']['response'] */ js.Any
  ]
  /**
    * List the reactions to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  @JSName("listForTeamDiscussionInOrg")
  var listForTeamDiscussionInOrg_Original: `529`
}
object CreateForCommitComment {
  
  inline def apply(
    createForCommitComment: `509`,
    createForIssue: `510`,
    createForIssueComment: `511`,
    createForPullRequestReviewComment: `512`,
    createForRelease: `513`,
    createForTeamDiscussionCommentInOrg: `514`,
    createForTeamDiscussionInOrg: `515`,
    deleteForCommitComment: `516`,
    deleteForIssue: `517`,
    deleteForIssueComment: `518`,
    deleteForPullRequestComment: `519`,
    deleteForRelease: `520`,
    deleteForTeamDiscussion: `521`,
    deleteForTeamDiscussionComment: `522`,
    listForCommitComment: `523`,
    listForIssue: `524`,
    listForIssueComment: `525`,
    listForPullRequestReviewComment: `526`,
    listForRelease: `527`,
    listForTeamDiscussionCommentInOrg: `528`,
    listForTeamDiscussionInOrg: `529`
  ): CreateForCommitComment = {
    val __obj = js.Dynamic.literal(createForCommitComment = createForCommitComment.asInstanceOf[js.Any], createForIssue = createForIssue.asInstanceOf[js.Any], createForIssueComment = createForIssueComment.asInstanceOf[js.Any], createForPullRequestReviewComment = createForPullRequestReviewComment.asInstanceOf[js.Any], createForRelease = createForRelease.asInstanceOf[js.Any], createForTeamDiscussionCommentInOrg = createForTeamDiscussionCommentInOrg.asInstanceOf[js.Any], createForTeamDiscussionInOrg = createForTeamDiscussionInOrg.asInstanceOf[js.Any], deleteForCommitComment = deleteForCommitComment.asInstanceOf[js.Any], deleteForIssue = deleteForIssue.asInstanceOf[js.Any], deleteForIssueComment = deleteForIssueComment.asInstanceOf[js.Any], deleteForPullRequestComment = deleteForPullRequestComment.asInstanceOf[js.Any], deleteForRelease = deleteForRelease.asInstanceOf[js.Any], deleteForTeamDiscussion = deleteForTeamDiscussion.asInstanceOf[js.Any], deleteForTeamDiscussionComment = deleteForTeamDiscussionComment.asInstanceOf[js.Any], listForCommitComment = listForCommitComment.asInstanceOf[js.Any], listForIssue = listForIssue.asInstanceOf[js.Any], listForIssueComment = listForIssueComment.asInstanceOf[js.Any], listForPullRequestReviewComment = listForPullRequestReviewComment.asInstanceOf[js.Any], listForRelease = listForRelease.asInstanceOf[js.Any], listForTeamDiscussionCommentInOrg = listForTeamDiscussionCommentInOrg.asInstanceOf[js.Any], listForTeamDiscussionInOrg = listForTeamDiscussionInOrg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateForCommitComment]
  }
  
  extension [Self <: CreateForCommitComment](x: Self) {
    
    inline def setCreateForCommitComment(value: `509`): Self = StObject.set(x, "createForCommitComment", value.asInstanceOf[js.Any])
    
    inline def setCreateForIssue(value: `510`): Self = StObject.set(x, "createForIssue", value.asInstanceOf[js.Any])
    
    inline def setCreateForIssueComment(value: `511`): Self = StObject.set(x, "createForIssueComment", value.asInstanceOf[js.Any])
    
    inline def setCreateForPullRequestReviewComment(value: `512`): Self = StObject.set(x, "createForPullRequestReviewComment", value.asInstanceOf[js.Any])
    
    inline def setCreateForRelease(value: `513`): Self = StObject.set(x, "createForRelease", value.asInstanceOf[js.Any])
    
    inline def setCreateForTeamDiscussionCommentInOrg(value: `514`): Self = StObject.set(x, "createForTeamDiscussionCommentInOrg", value.asInstanceOf[js.Any])
    
    inline def setCreateForTeamDiscussionInOrg(value: `515`): Self = StObject.set(x, "createForTeamDiscussionInOrg", value.asInstanceOf[js.Any])
    
    inline def setDeleteForCommitComment(value: `516`): Self = StObject.set(x, "deleteForCommitComment", value.asInstanceOf[js.Any])
    
    inline def setDeleteForIssue(value: `517`): Self = StObject.set(x, "deleteForIssue", value.asInstanceOf[js.Any])
    
    inline def setDeleteForIssueComment(value: `518`): Self = StObject.set(x, "deleteForIssueComment", value.asInstanceOf[js.Any])
    
    inline def setDeleteForPullRequestComment(value: `519`): Self = StObject.set(x, "deleteForPullRequestComment", value.asInstanceOf[js.Any])
    
    inline def setDeleteForRelease(value: `520`): Self = StObject.set(x, "deleteForRelease", value.asInstanceOf[js.Any])
    
    inline def setDeleteForTeamDiscussion(value: `521`): Self = StObject.set(x, "deleteForTeamDiscussion", value.asInstanceOf[js.Any])
    
    inline def setDeleteForTeamDiscussionComment(value: `522`): Self = StObject.set(x, "deleteForTeamDiscussionComment", value.asInstanceOf[js.Any])
    
    inline def setListForCommitComment(value: `523`): Self = StObject.set(x, "listForCommitComment", value.asInstanceOf[js.Any])
    
    inline def setListForIssue(value: `524`): Self = StObject.set(x, "listForIssue", value.asInstanceOf[js.Any])
    
    inline def setListForIssueComment(value: `525`): Self = StObject.set(x, "listForIssueComment", value.asInstanceOf[js.Any])
    
    inline def setListForPullRequestReviewComment(value: `526`): Self = StObject.set(x, "listForPullRequestReviewComment", value.asInstanceOf[js.Any])
    
    inline def setListForRelease(value: `527`): Self = StObject.set(x, "listForRelease", value.asInstanceOf[js.Any])
    
    inline def setListForTeamDiscussionCommentInOrg(value: `528`): Self = StObject.set(x, "listForTeamDiscussionCommentInOrg", value.asInstanceOf[js.Any])
    
    inline def setListForTeamDiscussionInOrg(value: `529`): Self = StObject.set(x, "listForTeamDiscussionInOrg", value.asInstanceOf[js.Any])
  }
}
