package typingsJapgolly.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Octokit {
  type ActionsListDownloadsForSelfHostedRunnerApplicationResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ActionsListDownloadsForSelfHostedRunnerApplicationResponseItem
  ]
  type ActionsListSelfHostedRunnersForRepoResponse = js.Array[
    js.Array[
      typingsJapgolly.octokitRest.mod.Octokit.ActionsListSelfHostedRunnersForRepoResponseItemItem
    ]
  ]
  type ActivityListNotificationsForRepoResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ActivityListNotificationsForRepoResponseItem
  ]
  type ActivityListNotificationsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ActivityListNotificationsResponseItem]
  type ActivityListReposStarredByAuthenticatedUserResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ActivityListReposStarredByAuthenticatedUserResponseItem
  ]
  type ActivityListReposStarredByUserResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ActivityListReposStarredByUserResponseItem
  ]
  type ActivityListReposWatchedByUserResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ActivityListReposWatchedByUserResponseItem
  ]
  type ActivityListStargazersForRepoResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ActivityListStargazersForRepoResponseItem
  ]
  type ActivityListWatchedReposForAuthenticatedUserResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ActivityListWatchedReposForAuthenticatedUserResponseItem
  ]
  type ActivityListWatchersForRepoResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ActivityListWatchersForRepoResponseItem]
  type AnyResponse = typingsJapgolly.octokitRest.mod.Octokit.Response[js.Any]
  type AppsCreateInstallationTokenParamsPermissions = js.Object
  type AppsListAccountsUserOrOrgOnPlanResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.AppsListAccountsUserOrOrgOnPlanResponseItem
  ]
  type AppsListAccountsUserOrOrgOnPlanStubbedResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.AppsListAccountsUserOrOrgOnPlanStubbedResponseItem
  ]
  type AppsListInstallationsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.AppsListInstallationsResponseItem]
  type AppsListMarketplacePurchasesForAuthenticatedUserResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.AppsListMarketplacePurchasesForAuthenticatedUserResponseItem
  ]
  type AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItem
  ]
  type AppsListPlansResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.AppsListPlansResponseItem]
  type AppsListPlansStubbedResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.AppsListPlansStubbedResponseItem]
  type Callback[T] = js.Function2[/* error */ js.Error | scala.Null, /* result */ T, js.Any]
  type ChecksListAnnotationsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ChecksListAnnotationsResponseItem]
  type CodesOfConductListConductCodesResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.CodesOfConductListConductCodesResponseItem
  ]
  type GistsListCommentsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.GistsListCommentsResponseItem]
  type GistsListCommitsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.GistsListCommitsResponseItem]
  type GistsListForksResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.GistsListForksResponseItem]
  type GistsListPublicForUserResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.GistsListPublicForUserResponseItem]
  type GistsListPublicResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.GistsListPublicResponseItem]
  type GistsListResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.GistsListResponseItem]
  type GistsListStarredResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.GistsListStarredResponseItem]
  type GitListMatchingRefsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.GitListMatchingRefsResponseItem]
  type GitignoreListTemplatesResponse = js.Array[java.lang.String]
  type IssuesAddLabelsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesAddLabelsResponseItem]
  type IssuesListAssigneesResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesListAssigneesResponseItem]
  type IssuesListCommentsForRepoResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesListCommentsForRepoResponseItem]
  type IssuesListCommentsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesListCommentsResponseItem]
  type IssuesListEventsForRepoResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesListEventsForRepoResponseItem]
  type IssuesListEventsForTimelineResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesListEventsForTimelineResponseItem]
  type IssuesListEventsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesListEventsResponseItem]
  type IssuesListForAuthenticatedUserResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.IssuesListForAuthenticatedUserResponseItem
  ]
  type IssuesListForOrgResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesListForOrgResponseItem]
  type IssuesListForRepoResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesListForRepoResponseItem]
  type IssuesListLabelsForMilestoneResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesListLabelsForMilestoneResponseItem]
  type IssuesListLabelsForRepoResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesListLabelsForRepoResponseItem]
  type IssuesListLabelsOnIssueResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesListLabelsOnIssueResponseItem]
  type IssuesListMilestonesForRepoResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesListMilestonesForRepoResponseItem]
  type IssuesListResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesListResponseItem]
  type IssuesRemoveLabelResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesRemoveLabelResponseItem]
  type IssuesReplaceLabelsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.IssuesReplaceLabelsResponseItem]
  type LicensesListCommonlyUsedResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.LicensesListCommonlyUsedResponseItem]
  type LicensesListResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.LicensesListResponseItem]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.octokitRest.AnonLink
    - typingsJapgolly.octokitRest.AnonHeaders
    - java.lang.String
  */
  type Link = typingsJapgolly.octokitRest.mod.Octokit._Link | java.lang.String
  type MigrationsGetCommitAuthorsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.MigrationsGetCommitAuthorsResponseItem]
  type MigrationsGetLargeFilesResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.MigrationsGetLargeFilesResponseItem]
  type MigrationsListForAuthenticatedUserResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.MigrationsListForAuthenticatedUserResponseItem
  ]
  type MigrationsListForOrgResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.MigrationsListForOrgResponseItem]
  type MigrationsListReposForOrgResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.MigrationsListReposForOrgResponseItem]
  type MigrationsListReposForUserResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.MigrationsListReposForUserResponseItem]
  type OauthAuthorizationsListAuthorizationsResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.OauthAuthorizationsListAuthorizationsResponseItem
  ]
  type OauthAuthorizationsListGrantsResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.OauthAuthorizationsListGrantsResponseItem
  ]
  type OrgsListBlockedUsersResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.OrgsListBlockedUsersResponseItem]
  type OrgsListForAuthenticatedUserResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.OrgsListForAuthenticatedUserResponseItem]
  type OrgsListForUserResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.OrgsListForUserResponseItem]
  type OrgsListHooksResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.OrgsListHooksResponseItem]
  type OrgsListInvitationTeamsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.OrgsListInvitationTeamsResponseItem]
  type OrgsListMembersResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.OrgsListMembersResponseItem]
  type OrgsListMembershipsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.OrgsListMembershipsResponseItem]
  type OrgsListOutsideCollaboratorsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.OrgsListOutsideCollaboratorsResponseItem]
  type OrgsListPendingInvitationsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.OrgsListPendingInvitationsResponseItem]
  type OrgsListPublicMembersResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.OrgsListPublicMembersResponseItem]
  type OrgsListResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.OrgsListResponseItem]
  type Plugin = js.Function2[
    /* octokit */ typingsJapgolly.octokitRest.mod.Octokit, 
    /* options */ typingsJapgolly.octokitRest.mod.Octokit.Options, 
    scala.Unit
  ]
  type ProjectsListCardsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ProjectsListCardsResponseItem]
  type ProjectsListCollaboratorsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ProjectsListCollaboratorsResponseItem]
  type ProjectsListColumnsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ProjectsListColumnsResponseItem]
  type ProjectsListForOrgResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ProjectsListForOrgResponseItem]
  type ProjectsListForRepoResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ProjectsListForRepoResponseItem]
  type ProjectsListForUserResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ProjectsListForUserResponseItem]
  type PullsGetCommentsForReviewResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.PullsGetCommentsForReviewResponseItem]
  type PullsListCommentsForRepoResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.PullsListCommentsForRepoResponseItem]
  type PullsListCommentsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.PullsListCommentsResponseItem]
  type PullsListCommitsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.PullsListCommitsResponseItem]
  type PullsListFilesResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.PullsListFilesResponseItem]
  type PullsListResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.PullsListResponseItem]
  type PullsListReviewsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.PullsListReviewsResponseItem]
  type ReactionsListForCommitCommentResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForCommitCommentResponseItem
  ]
  type ReactionsListForIssueCommentResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForIssueCommentResponseItem]
  type ReactionsListForIssueResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForIssueResponseItem]
  type ReactionsListForPullRequestReviewCommentResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForPullRequestReviewCommentResponseItem
  ]
  type ReactionsListForTeamDiscussionCommentInOrgResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentInOrgResponseItem
  ]
  type ReactionsListForTeamDiscussionCommentLegacyResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentLegacyResponseItem
  ]
  type ReactionsListForTeamDiscussionCommentResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentResponseItem
  ]
  type ReactionsListForTeamDiscussionInOrgResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionInOrgResponseItem
  ]
  type ReactionsListForTeamDiscussionLegacyResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionLegacyResponseItem
  ]
  type ReactionsListForTeamDiscussionResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionResponseItem
  ]
  type ReposAddProtectedBranchAppRestrictionsResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposAddProtectedBranchAppRestrictionsResponseItem
  ]
  type ReposAddProtectedBranchRequiredStatusChecksContextsResponse = js.Array[java.lang.String]
  type ReposAddProtectedBranchTeamRestrictionsResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposAddProtectedBranchTeamRestrictionsResponseItem
  ]
  type ReposAddProtectedBranchUserRestrictionsResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposAddProtectedBranchUserRestrictionsResponseItem
  ]
  type ReposCreateDispatchEventParamsClientPayload = js.Object
  type ReposGetAppsWithAccessToProtectedBranchResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposGetAppsWithAccessToProtectedBranchResponseItem
  ]
  type ReposGetCodeFrequencyStatsResponse = js.Array[js.Array[scala.Double]]
  type ReposGetCommitActivityStatsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposGetCommitActivityStatsResponseItem]
  type ReposGetContentsResponse = typingsJapgolly.octokitRest.AnonContent | js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposGetContentsResponseItem]
  type ReposGetContributorsStatsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposGetContributorsStatsResponseItem]
  type ReposGetPunchCardStatsResponse = js.Array[js.Array[scala.Double]]
  type ReposGetTeamsWithAccessToProtectedBranchResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposGetTeamsWithAccessToProtectedBranchResponseItem
  ]
  type ReposGetTopPathsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposGetTopPathsResponseItem]
  type ReposGetTopReferrersResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposGetTopReferrersResponseItem]
  type ReposGetUsersWithAccessToProtectedBranchResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposGetUsersWithAccessToProtectedBranchResponseItem
  ]
  type ReposListAppsWithAccessToProtectedBranchResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposListAppsWithAccessToProtectedBranchResponseItem
  ]
  type ReposListAssetsForReleaseResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListAssetsForReleaseResponseItem]
  type ReposListBranchesForHeadCommitResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposListBranchesForHeadCommitResponseItem
  ]
  type ReposListBranchesResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListBranchesResponseItem]
  type ReposListCollaboratorsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListCollaboratorsResponseItem]
  type ReposListCommentsForCommitResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListCommentsForCommitResponseItem]
  type ReposListCommitCommentsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListCommitCommentsResponseItem]
  type ReposListCommitsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListCommitsResponseItem]
  type ReposListContributorsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListContributorsResponseItem]
  type ReposListDeployKeysResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListDeployKeysResponseItem]
  type ReposListDeploymentStatusesResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListDeploymentStatusesResponseItem]
  type ReposListDeploymentsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListDeploymentsResponseItem]
  type ReposListDownloadsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListDownloadsResponseItem]
  type ReposListForOrgResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListForOrgResponseItem]
  type ReposListForksResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListForksResponseItem]
  type ReposListHooksResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListHooksResponseItem]
  type ReposListInvitationsForAuthenticatedUserResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposListInvitationsForAuthenticatedUserResponseItem
  ]
  type ReposListInvitationsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListInvitationsResponseItem]
  type ReposListPagesBuildsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListPagesBuildsResponseItem]
  type ReposListProtectedBranchRequiredStatusChecksContextsResponse = js.Array[java.lang.String]
  type ReposListProtectedBranchTeamRestrictionsResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposListProtectedBranchTeamRestrictionsResponseItem
  ]
  type ReposListProtectedBranchUserRestrictionsResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposListProtectedBranchUserRestrictionsResponseItem
  ]
  type ReposListPublicResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListPublicResponseItem]
  type ReposListPullRequestsAssociatedWithCommitResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposListPullRequestsAssociatedWithCommitResponseItem
  ]
  type ReposListReleasesResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListReleasesResponseItem]
  type ReposListStatusesForRefResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListStatusesForRefResponseItem]
  type ReposListTagsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListTagsResponseItem]
  type ReposListTeamsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.ReposListTeamsResponseItem]
  type ReposListTeamsWithAccessToProtectedBranchResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposListTeamsWithAccessToProtectedBranchResponseItem
  ]
  type ReposListUsersWithAccessToProtectedBranchResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposListUsersWithAccessToProtectedBranchResponseItem
  ]
  type ReposRemoveProtectedBranchAppRestrictionsResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposRemoveProtectedBranchAppRestrictionsResponseItem
  ]
  type ReposRemoveProtectedBranchRequiredStatusChecksContextsResponse = js.Array[java.lang.String]
  type ReposRemoveProtectedBranchTeamRestrictionsResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposRemoveProtectedBranchTeamRestrictionsResponseItem
  ]
  type ReposRemoveProtectedBranchUserRestrictionsResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposRemoveProtectedBranchUserRestrictionsResponseItem
  ]
  type ReposReplaceProtectedBranchAppRestrictionsResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposReplaceProtectedBranchAppRestrictionsResponseItem
  ]
  type ReposReplaceProtectedBranchRequiredStatusChecksContextsResponse = js.Array[java.lang.String]
  type ReposReplaceProtectedBranchTeamRestrictionsResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposReplaceProtectedBranchTeamRestrictionsResponseItem
  ]
  type ReposReplaceProtectedBranchUserRestrictionsResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.ReposReplaceProtectedBranchUserRestrictionsResponseItem
  ]
  type TeamsListChildInOrgResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListChildInOrgResponseItem]
  type TeamsListChildLegacyResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListChildLegacyResponseItem]
  type TeamsListChildResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListChildResponseItem]
  type TeamsListDiscussionCommentsInOrgResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.TeamsListDiscussionCommentsInOrgResponseItem
  ]
  type TeamsListDiscussionCommentsLegacyResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.TeamsListDiscussionCommentsLegacyResponseItem
  ]
  type TeamsListDiscussionCommentsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListDiscussionCommentsResponseItem]
  type TeamsListDiscussionsInOrgResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListDiscussionsInOrgResponseItem]
  type TeamsListDiscussionsLegacyResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListDiscussionsLegacyResponseItem]
  type TeamsListDiscussionsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListDiscussionsResponseItem]
  type TeamsListForAuthenticatedUserResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.TeamsListForAuthenticatedUserResponseItem
  ]
  type TeamsListMembersInOrgResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListMembersInOrgResponseItem]
  type TeamsListMembersLegacyResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListMembersLegacyResponseItem]
  type TeamsListMembersResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListMembersResponseItem]
  type TeamsListPendingInvitationsInOrgResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.TeamsListPendingInvitationsInOrgResponseItem
  ]
  type TeamsListPendingInvitationsLegacyResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.TeamsListPendingInvitationsLegacyResponseItem
  ]
  type TeamsListPendingInvitationsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListPendingInvitationsResponseItem]
  type TeamsListProjectsInOrgResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListProjectsInOrgResponseItem]
  type TeamsListProjectsLegacyResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListProjectsLegacyResponseItem]
  type TeamsListProjectsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListProjectsResponseItem]
  type TeamsListReposInOrgResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListReposInOrgResponseItem]
  type TeamsListReposLegacyResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListReposLegacyResponseItem]
  type TeamsListReposResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListReposResponseItem]
  type TeamsListResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.TeamsListResponseItem]
  type UsersAddEmailsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.UsersAddEmailsResponseItem]
  type UsersListBlockedResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.UsersListBlockedResponseItem]
  type UsersListEmailsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.UsersListEmailsResponseItem]
  type UsersListFollowersForAuthenticatedUserResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.UsersListFollowersForAuthenticatedUserResponseItem
  ]
  type UsersListFollowersForUserResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.UsersListFollowersForUserResponseItem]
  type UsersListFollowingForAuthenticatedUserResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.UsersListFollowingForAuthenticatedUserResponseItem
  ]
  type UsersListFollowingForUserResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.UsersListFollowingForUserResponseItem]
  type UsersListGpgKeysForUserResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.UsersListGpgKeysForUserResponseItem]
  type UsersListGpgKeysResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.UsersListGpgKeysResponseItem]
  type UsersListPublicEmailsResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.UsersListPublicEmailsResponseItem]
  type UsersListPublicKeysForUserResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.UsersListPublicKeysForUserResponseItem]
  type UsersListPublicKeysResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.UsersListPublicKeysResponseItem]
  type UsersListResponse = js.Array[typingsJapgolly.octokitRest.mod.Octokit.UsersListResponseItem]
  type UsersTogglePrimaryEmailVisibilityResponse = js.Array[
    typingsJapgolly.octokitRest.mod.Octokit.UsersTogglePrimaryEmailVisibilityResponseItem
  ]
  type date = java.lang.String
  type json = js.Any
}
