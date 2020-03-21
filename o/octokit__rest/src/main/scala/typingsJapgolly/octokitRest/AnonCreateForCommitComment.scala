package typingsJapgolly.octokitRest

import typingsJapgolly.octokitRest.mod.Octokit.AnyResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForCommitCommentParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForCommitCommentResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForIssueCommentParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForIssueCommentResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForIssueParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForIssueParamsDeprecatedNumber
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForIssueResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForPullRequestReviewCommentParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForPullRequestReviewCommentResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForTeamDiscussionCommentInOrgParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForTeamDiscussionCommentInOrgResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForTeamDiscussionCommentLegacyParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForTeamDiscussionCommentLegacyResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForTeamDiscussionCommentParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForTeamDiscussionCommentResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForTeamDiscussionInOrgParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForTeamDiscussionInOrgResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForTeamDiscussionLegacyParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForTeamDiscussionLegacyResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForTeamDiscussionParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsCreateForTeamDiscussionResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsDeleteParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForCommitCommentParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForCommitCommentResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForIssueCommentParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForIssueCommentResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForIssueParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForIssueParamsDeprecatedNumber
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForIssueResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForPullRequestReviewCommentParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForPullRequestReviewCommentResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentInOrgParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentInOrgResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentLegacyParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentLegacyResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionInOrgParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionInOrgResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionLegacyParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionLegacyResponse
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionParams
import typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionResponse
import typingsJapgolly.octokitRest.mod.Octokit.RequestOptions
import typingsJapgolly.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreateForCommitComment extends js.Object {
  /**
    * Create a reaction to a [commit comment](https://developer.github.com/v3/repos/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this commit comment.
    */
  @JSName("createForCommitComment")
  var createForCommitComment_Original: Anon320 = js.native
  /**
    * Create a reaction to an [issue comment](https://developer.github.com/v3/issues/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue comment.
    */
  @JSName("createForIssueComment")
  var createForIssueComment_Original: Anon322 = js.native
  /**
    * Create a reaction to an [issue](https://developer.github.com/v3/issues/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue.
    */
  @JSName("createForIssue")
  var createForIssue_Original: Anon321 = js.native
  /**
    * Create a reaction to a [pull request review comment](https://developer.github.com/v3/pulls/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this pull request review comment.
    */
  @JSName("createForPullRequestReviewComment")
  var createForPullRequestReviewComment_Original: Anon323 = js.native
  /**
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  @JSName("createForTeamDiscussionCommentInOrg")
  var createForTeamDiscussionCommentInOrg_Original: Anon326 = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion comment`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment) endpoint.
    *
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    * @deprecated octokit.reactions.createForTeamDiscussionCommentLegacy() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment-legacy
    */
  @JSName("createForTeamDiscussionCommentLegacy")
  var createForTeamDiscussionCommentLegacy_Original: Anon327 = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion comment`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment) endpoint.
    *
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    * @deprecated octokit.reactions.createForTeamDiscussionComment() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment-legacy
    */
  @JSName("createForTeamDiscussionComment")
  var createForTeamDiscussionComment_Original: Anon325 = js.native
  /**
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  @JSName("createForTeamDiscussionInOrg")
  var createForTeamDiscussionInOrg_Original: Anon328 = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion) endpoint.
    *
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    * @deprecated octokit.reactions.createForTeamDiscussionLegacy() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-legacy
    */
  @JSName("createForTeamDiscussionLegacy")
  var createForTeamDiscussionLegacy_Original: Anon329 = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion) endpoint.
    *
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    * @deprecated octokit.reactions.createForTeamDiscussion() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-legacy
    */
  @JSName("createForTeamDiscussion")
  var createForTeamDiscussion_Original: Anon324 = js.native
  /**
    * OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), when deleting a [team discussion](https://developer.github.com/v3/teams/discussions/) or [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/).
    */
  @JSName("delete")
  var delete_Original: Anon330 = js.native
  /**
    * List the reactions to a [commit comment](https://developer.github.com/v3/repos/comments/).
    */
  @JSName("listForCommitComment")
  var listForCommitComment_Original: Anon331 = js.native
  /**
    * List the reactions to an [issue comment](https://developer.github.com/v3/issues/comments/).
    */
  @JSName("listForIssueComment")
  var listForIssueComment_Original: Anon333 = js.native
  /**
    * List the reactions to an [issue](https://developer.github.com/v3/issues/).
    */
  @JSName("listForIssue")
  var listForIssue_Original: Anon332 = js.native
  /**
    * List the reactions to a [pull request review comment](https://developer.github.com/v3/pulls/comments/).
    */
  @JSName("listForPullRequestReviewComment")
  var listForPullRequestReviewComment_Original: Anon334 = js.native
  /**
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  @JSName("listForTeamDiscussionCommentInOrg")
  var listForTeamDiscussionCommentInOrg_Original: Anon337 = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion comment`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment) endpoint.
    *
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussionCommentLegacy() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment-legacy
    */
  @JSName("listForTeamDiscussionCommentLegacy")
  var listForTeamDiscussionCommentLegacy_Original: Anon338 = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion comment`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment) endpoint.
    *
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussionComment() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment-legacy
    */
  @JSName("listForTeamDiscussionComment")
  var listForTeamDiscussionComment_Original: Anon336 = js.native
  /**
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  @JSName("listForTeamDiscussionInOrg")
  var listForTeamDiscussionInOrg_Original: Anon339 = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion) endpoint.
    *
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussionLegacy() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-legacy
    */
  @JSName("listForTeamDiscussionLegacy")
  var listForTeamDiscussionLegacy_Original: Anon340 = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion) endpoint.
    *
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussion() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-legacy
    */
  @JSName("listForTeamDiscussion")
  var listForTeamDiscussion_Original: Anon335 = js.native
  /**
    * Create a reaction to a [commit comment](https://developer.github.com/v3/repos/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this commit comment.
    */
  def createForCommitComment(): js.Promise[Response[ReactionsCreateForCommitCommentResponse]] = js.native
  def createForCommitComment(params: RequestOptions with ReactionsCreateForCommitCommentParams): js.Promise[Response[ReactionsCreateForCommitCommentResponse]] = js.native
  /**
    * Create a reaction to an [issue](https://developer.github.com/v3/issues/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue.
    */
  def createForIssue(): js.Promise[Response[ReactionsCreateForIssueResponse]] = js.native
  def createForIssue(
    params: RequestOptions with ReactionsCreateForIssueParamsDeprecatedNumber with ReactionsCreateForIssueParams
  ): js.Promise[Response[ReactionsCreateForIssueResponse]] = js.native
  /**
    * Create a reaction to an [issue comment](https://developer.github.com/v3/issues/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue comment.
    */
  def createForIssueComment(): js.Promise[Response[ReactionsCreateForIssueCommentResponse]] = js.native
  def createForIssueComment(params: RequestOptions with ReactionsCreateForIssueCommentParams): js.Promise[Response[ReactionsCreateForIssueCommentResponse]] = js.native
  /**
    * Create a reaction to a [pull request review comment](https://developer.github.com/v3/pulls/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this pull request review comment.
    */
  def createForPullRequestReviewComment(): js.Promise[Response[ReactionsCreateForPullRequestReviewCommentResponse]] = js.native
  def createForPullRequestReviewComment(params: RequestOptions with ReactionsCreateForPullRequestReviewCommentParams): js.Promise[Response[ReactionsCreateForPullRequestReviewCommentResponse]] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion) endpoint.
    *
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    * @deprecated octokit.reactions.createForTeamDiscussion() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-legacy
    */
  def createForTeamDiscussion(): js.Promise[Response[ReactionsCreateForTeamDiscussionResponse]] = js.native
  def createForTeamDiscussion(params: RequestOptions with ReactionsCreateForTeamDiscussionParams): js.Promise[Response[ReactionsCreateForTeamDiscussionResponse]] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion comment`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment) endpoint.
    *
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    * @deprecated octokit.reactions.createForTeamDiscussionComment() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment-legacy
    */
  def createForTeamDiscussionComment(): js.Promise[Response[ReactionsCreateForTeamDiscussionCommentResponse]] = js.native
  def createForTeamDiscussionComment(params: RequestOptions with ReactionsCreateForTeamDiscussionCommentParams): js.Promise[Response[ReactionsCreateForTeamDiscussionCommentResponse]] = js.native
  /**
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  def createForTeamDiscussionCommentInOrg(): js.Promise[Response[ReactionsCreateForTeamDiscussionCommentInOrgResponse]] = js.native
  def createForTeamDiscussionCommentInOrg(params: RequestOptions with ReactionsCreateForTeamDiscussionCommentInOrgParams): js.Promise[Response[ReactionsCreateForTeamDiscussionCommentInOrgResponse]] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion comment`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment) endpoint.
    *
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    * @deprecated octokit.reactions.createForTeamDiscussionCommentLegacy() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment-legacy
    */
  def createForTeamDiscussionCommentLegacy(): js.Promise[Response[ReactionsCreateForTeamDiscussionCommentLegacyResponse]] = js.native
  def createForTeamDiscussionCommentLegacy(params: RequestOptions with ReactionsCreateForTeamDiscussionCommentLegacyParams): js.Promise[Response[ReactionsCreateForTeamDiscussionCommentLegacyResponse]] = js.native
  /**
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  def createForTeamDiscussionInOrg(): js.Promise[Response[ReactionsCreateForTeamDiscussionInOrgResponse]] = js.native
  def createForTeamDiscussionInOrg(params: RequestOptions with ReactionsCreateForTeamDiscussionInOrgParams): js.Promise[Response[ReactionsCreateForTeamDiscussionInOrgResponse]] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion) endpoint.
    *
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    * @deprecated octokit.reactions.createForTeamDiscussionLegacy() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-legacy
    */
  def createForTeamDiscussionLegacy(): js.Promise[Response[ReactionsCreateForTeamDiscussionLegacyResponse]] = js.native
  def createForTeamDiscussionLegacy(params: RequestOptions with ReactionsCreateForTeamDiscussionLegacyParams): js.Promise[Response[ReactionsCreateForTeamDiscussionLegacyResponse]] = js.native
  /**
    * OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), when deleting a [team discussion](https://developer.github.com/v3/teams/discussions/) or [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/).
    */
  def delete(): js.Promise[AnyResponse] = js.native
  def delete(params: RequestOptions with ReactionsDeleteParams): js.Promise[AnyResponse] = js.native
  /**
    * List the reactions to a [commit comment](https://developer.github.com/v3/repos/comments/).
    */
  def listForCommitComment(): js.Promise[Response[ReactionsListForCommitCommentResponse]] = js.native
  def listForCommitComment(params: RequestOptions with ReactionsListForCommitCommentParams): js.Promise[Response[ReactionsListForCommitCommentResponse]] = js.native
  /**
    * List the reactions to an [issue](https://developer.github.com/v3/issues/).
    */
  def listForIssue(): js.Promise[Response[ReactionsListForIssueResponse]] = js.native
  def listForIssue(
    params: RequestOptions with ReactionsListForIssueParamsDeprecatedNumber with ReactionsListForIssueParams
  ): js.Promise[Response[ReactionsListForIssueResponse]] = js.native
  /**
    * List the reactions to an [issue comment](https://developer.github.com/v3/issues/comments/).
    */
  def listForIssueComment(): js.Promise[Response[ReactionsListForIssueCommentResponse]] = js.native
  def listForIssueComment(params: RequestOptions with ReactionsListForIssueCommentParams): js.Promise[Response[ReactionsListForIssueCommentResponse]] = js.native
  /**
    * List the reactions to a [pull request review comment](https://developer.github.com/v3/pulls/comments/).
    */
  def listForPullRequestReviewComment(): js.Promise[Response[ReactionsListForPullRequestReviewCommentResponse]] = js.native
  def listForPullRequestReviewComment(params: RequestOptions with ReactionsListForPullRequestReviewCommentParams): js.Promise[Response[ReactionsListForPullRequestReviewCommentResponse]] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion) endpoint.
    *
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussion() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-legacy
    */
  def listForTeamDiscussion(): js.Promise[Response[ReactionsListForTeamDiscussionResponse]] = js.native
  def listForTeamDiscussion(params: RequestOptions with ReactionsListForTeamDiscussionParams): js.Promise[Response[ReactionsListForTeamDiscussionResponse]] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion comment`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment) endpoint.
    *
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussionComment() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment-legacy
    */
  def listForTeamDiscussionComment(): js.Promise[Response[ReactionsListForTeamDiscussionCommentResponse]] = js.native
  def listForTeamDiscussionComment(params: RequestOptions with ReactionsListForTeamDiscussionCommentParams): js.Promise[Response[ReactionsListForTeamDiscussionCommentResponse]] = js.native
  /**
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  def listForTeamDiscussionCommentInOrg(): js.Promise[Response[ReactionsListForTeamDiscussionCommentInOrgResponse]] = js.native
  def listForTeamDiscussionCommentInOrg(params: RequestOptions with ReactionsListForTeamDiscussionCommentInOrgParams): js.Promise[Response[ReactionsListForTeamDiscussionCommentInOrgResponse]] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion comment`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment) endpoint.
    *
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussionCommentLegacy() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment-legacy
    */
  def listForTeamDiscussionCommentLegacy(): js.Promise[Response[ReactionsListForTeamDiscussionCommentLegacyResponse]] = js.native
  def listForTeamDiscussionCommentLegacy(params: RequestOptions with ReactionsListForTeamDiscussionCommentLegacyParams): js.Promise[Response[ReactionsListForTeamDiscussionCommentLegacyResponse]] = js.native
  /**
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  def listForTeamDiscussionInOrg(): js.Promise[Response[ReactionsListForTeamDiscussionInOrgResponse]] = js.native
  def listForTeamDiscussionInOrg(params: RequestOptions with ReactionsListForTeamDiscussionInOrgParams): js.Promise[Response[ReactionsListForTeamDiscussionInOrgResponse]] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion) endpoint.
    *
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussionLegacy() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-legacy
    */
  def listForTeamDiscussionLegacy(): js.Promise[Response[ReactionsListForTeamDiscussionLegacyResponse]] = js.native
  def listForTeamDiscussionLegacy(params: RequestOptions with ReactionsListForTeamDiscussionLegacyParams): js.Promise[Response[ReactionsListForTeamDiscussionLegacyResponse]] = js.native
}

