package typingsJapgolly.vsoNodeApi

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.JsonPatchDocument
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.WebApiCreateTagRequestData
import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.WebApiTagDefinition
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.AssociatedWorkItem
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.Attachment
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.Comment
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitAnnotatedTag
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitAsyncRefOperationParameters
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitBlobRef
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitBranchStats
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitCherryPick
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitCommit
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitCommitChanges
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitCommitRef
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitConflict
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitConflictUpdateResult
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitDeletedRepository
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitForkSyncRequest
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitForkSyncRequestParameters
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitImportRequest
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitItem
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitItemRequestData
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitPullRequest
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitPullRequestCommentThread
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitPullRequestIteration
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitPullRequestIterationChanges
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitPullRequestQuery
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitPullRequestSearchCriteria
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitPullRequestStatus
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitPush
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitPushSearchCriteria
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitQueryBranchStatsCriteria
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitQueryCommitsCriteria
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRef
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefFavorite
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdate
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateResult
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRepository
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRepositoryCreateOptions
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRepositoryRef
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRevert
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitStatus
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitSuggestion
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitTreeRef
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitVersionDescriptor
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.IdentityRefWithVote
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.ShareNotificationContext
import typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlRecursionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitApiMod {
  
  @JSImport("vso-node-api/GitApi", "GitApi")
  @js.native
  open class GitApi protected () extends IGitApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  /* static members */
  object GitApi {
    
    @JSImport("vso-node-api/GitApi", "GitApi.RESOURCE_AREA_ID")
    @js.native
    val RESOURCE_AREA_ID: String = js.native
  }
  
  @js.native
  trait IGitApi extends ClientApiBase {
    
    def createAnnotatedTag(tagObject: GitAnnotatedTag, project: String, repositoryId: String): js.Promise[GitAnnotatedTag] = js.native
    
    def createAttachment(
      customHeaders: Any,
      contentStream: ReadableStream,
      fileName: String,
      repositoryId: String,
      pullRequestId: Double
    ): js.Promise[Attachment] = js.native
    def createAttachment(
      customHeaders: Any,
      contentStream: ReadableStream,
      fileName: String,
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[Attachment] = js.native
    
    def createCherryPick(cherryPickToCreate: GitAsyncRefOperationParameters, project: String, repositoryId: String): js.Promise[GitCherryPick] = js.native
    
    def createComment(comment: Comment, repositoryId: String, pullRequestId: Double, threadId: Double): js.Promise[Comment] = js.native
    def createComment(comment: Comment, repositoryId: String, pullRequestId: Double, threadId: Double, project: String): js.Promise[Comment] = js.native
    
    def createCommitStatus(gitCommitStatusToCreate: GitStatus, commitId: String, repositoryId: String): js.Promise[GitStatus] = js.native
    def createCommitStatus(gitCommitStatusToCreate: GitStatus, commitId: String, repositoryId: String, project: String): js.Promise[GitStatus] = js.native
    
    def createFavorite(favorite: GitRefFavorite, project: String): js.Promise[GitRefFavorite] = js.native
    
    def createForkSyncRequest(syncParams: GitForkSyncRequestParameters, repositoryNameOrId: String): js.Promise[GitForkSyncRequest] = js.native
    def createForkSyncRequest(syncParams: GitForkSyncRequestParameters, repositoryNameOrId: String, project: String): js.Promise[GitForkSyncRequest] = js.native
    def createForkSyncRequest(
      syncParams: GitForkSyncRequestParameters,
      repositoryNameOrId: String,
      project: String,
      includeLinks: Boolean
    ): js.Promise[GitForkSyncRequest] = js.native
    def createForkSyncRequest(
      syncParams: GitForkSyncRequestParameters,
      repositoryNameOrId: String,
      project: Unit,
      includeLinks: Boolean
    ): js.Promise[GitForkSyncRequest] = js.native
    
    def createImportRequest(importRequest: GitImportRequest, project: String, repositoryId: String): js.Promise[GitImportRequest] = js.native
    
    def createLike(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double): js.Promise[Unit] = js.native
    def createLike(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double, project: String): js.Promise[Unit] = js.native
    
    def createPullRequest(gitPullRequestToCreate: GitPullRequest, repositoryId: String): js.Promise[GitPullRequest] = js.native
    def createPullRequest(gitPullRequestToCreate: GitPullRequest, repositoryId: String, project: String): js.Promise[GitPullRequest] = js.native
    def createPullRequest(
      gitPullRequestToCreate: GitPullRequest,
      repositoryId: String,
      project: String,
      supportsIterations: Boolean
    ): js.Promise[GitPullRequest] = js.native
    def createPullRequest(
      gitPullRequestToCreate: GitPullRequest,
      repositoryId: String,
      project: Unit,
      supportsIterations: Boolean
    ): js.Promise[GitPullRequest] = js.native
    
    def createPullRequestIterationStatus(status: GitPullRequestStatus, repositoryId: String, pullRequestId: Double, iterationId: Double): js.Promise[GitPullRequestStatus] = js.native
    def createPullRequestIterationStatus(
      status: GitPullRequestStatus,
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: String
    ): js.Promise[GitPullRequestStatus] = js.native
    
    def createPullRequestLabel(label: WebApiCreateTagRequestData, repositoryId: String, pullRequestId: Double): js.Promise[WebApiTagDefinition] = js.native
    def createPullRequestLabel(label: WebApiCreateTagRequestData, repositoryId: String, pullRequestId: Double, project: String): js.Promise[WebApiTagDefinition] = js.native
    def createPullRequestLabel(
      label: WebApiCreateTagRequestData,
      repositoryId: String,
      pullRequestId: Double,
      project: String,
      projectId: String
    ): js.Promise[WebApiTagDefinition] = js.native
    def createPullRequestLabel(
      label: WebApiCreateTagRequestData,
      repositoryId: String,
      pullRequestId: Double,
      project: Unit,
      projectId: String
    ): js.Promise[WebApiTagDefinition] = js.native
    
    def createPullRequestReviewer(reviewer: IdentityRefWithVote, repositoryId: String, pullRequestId: Double, reviewerId: String): js.Promise[IdentityRefWithVote] = js.native
    def createPullRequestReviewer(
      reviewer: IdentityRefWithVote,
      repositoryId: String,
      pullRequestId: Double,
      reviewerId: String,
      project: String
    ): js.Promise[IdentityRefWithVote] = js.native
    
    def createPullRequestReviewers(reviewers: js.Array[IdentityRef], repositoryId: String, pullRequestId: Double): js.Promise[js.Array[IdentityRefWithVote]] = js.native
    def createPullRequestReviewers(reviewers: js.Array[IdentityRef], repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[IdentityRefWithVote]] = js.native
    
    def createPullRequestStatus(status: GitPullRequestStatus, repositoryId: String, pullRequestId: Double): js.Promise[GitPullRequestStatus] = js.native
    def createPullRequestStatus(status: GitPullRequestStatus, repositoryId: String, pullRequestId: Double, project: String): js.Promise[GitPullRequestStatus] = js.native
    
    def createPush(push: GitPush, repositoryId: String): js.Promise[GitPush] = js.native
    def createPush(push: GitPush, repositoryId: String, project: String): js.Promise[GitPush] = js.native
    
    def createRepository(gitRepositoryToCreate: GitRepositoryCreateOptions): js.Promise[GitRepository] = js.native
    def createRepository(gitRepositoryToCreate: GitRepositoryCreateOptions, project: String): js.Promise[GitRepository] = js.native
    def createRepository(gitRepositoryToCreate: GitRepositoryCreateOptions, project: String, sourceRef: String): js.Promise[GitRepository] = js.native
    def createRepository(gitRepositoryToCreate: GitRepositoryCreateOptions, project: Unit, sourceRef: String): js.Promise[GitRepository] = js.native
    
    def createRevert(revertToCreate: GitAsyncRefOperationParameters, project: String, repositoryId: String): js.Promise[GitRevert] = js.native
    
    def createThread(commentThread: GitPullRequestCommentThread, repositoryId: String, pullRequestId: Double): js.Promise[GitPullRequestCommentThread] = js.native
    def createThread(
      commentThread: GitPullRequestCommentThread,
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[GitPullRequestCommentThread] = js.native
    
    def deleteAttachment(fileName: String, repositoryId: String, pullRequestId: Double): js.Promise[Unit] = js.native
    def deleteAttachment(fileName: String, repositoryId: String, pullRequestId: Double, project: String): js.Promise[Unit] = js.native
    
    def deleteComment(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double): js.Promise[Unit] = js.native
    def deleteComment(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double, project: String): js.Promise[Unit] = js.native
    
    def deleteLike(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double): js.Promise[Unit] = js.native
    def deleteLike(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double, project: String): js.Promise[Unit] = js.native
    
    def deletePullRequestIterationStatus(repositoryId: String, pullRequestId: Double, iterationId: Double, statusId: Double): js.Promise[Unit] = js.native
    def deletePullRequestIterationStatus(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      statusId: Double,
      project: String
    ): js.Promise[Unit] = js.native
    
    def deletePullRequestLabels(repositoryId: String, pullRequestId: Double, labelIdOrName: String): js.Promise[Unit] = js.native
    def deletePullRequestLabels(repositoryId: String, pullRequestId: Double, labelIdOrName: String, project: String): js.Promise[Unit] = js.native
    def deletePullRequestLabels(
      repositoryId: String,
      pullRequestId: Double,
      labelIdOrName: String,
      project: String,
      projectId: String
    ): js.Promise[Unit] = js.native
    def deletePullRequestLabels(
      repositoryId: String,
      pullRequestId: Double,
      labelIdOrName: String,
      project: Unit,
      projectId: String
    ): js.Promise[Unit] = js.native
    
    def deletePullRequestReviewer(repositoryId: String, pullRequestId: Double, reviewerId: String): js.Promise[Unit] = js.native
    def deletePullRequestReviewer(repositoryId: String, pullRequestId: Double, reviewerId: String, project: String): js.Promise[Unit] = js.native
    
    def deletePullRequestStatus(repositoryId: String, pullRequestId: Double, statusId: Double): js.Promise[Unit] = js.native
    def deletePullRequestStatus(repositoryId: String, pullRequestId: Double, statusId: Double, project: String): js.Promise[Unit] = js.native
    
    def deleteRefFavorite(project: String, favoriteId: Double): js.Promise[Unit] = js.native
    
    def deleteRepository(repositoryId: String): js.Promise[Unit] = js.native
    def deleteRepository(repositoryId: String, project: String): js.Promise[Unit] = js.native
    
    def getAnnotatedTag(project: String, repositoryId: String, objectId: String): js.Promise[GitAnnotatedTag] = js.native
    
    def getAttachmentContent(fileName: String, repositoryId: String, pullRequestId: Double): js.Promise[ReadableStream] = js.native
    def getAttachmentContent(fileName: String, repositoryId: String, pullRequestId: Double, project: String): js.Promise[ReadableStream] = js.native
    
    def getAttachmentZip(fileName: String, repositoryId: String, pullRequestId: Double): js.Promise[ReadableStream] = js.native
    def getAttachmentZip(fileName: String, repositoryId: String, pullRequestId: Double, project: String): js.Promise[ReadableStream] = js.native
    
    def getAttachments(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[Attachment]] = js.native
    def getAttachments(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[Attachment]] = js.native
    
    def getBlob(repositoryId: String, sha1: String): js.Promise[GitBlobRef] = js.native
    def getBlob(repositoryId: String, sha1: String, project: String): js.Promise[GitBlobRef] = js.native
    def getBlob(repositoryId: String, sha1: String, project: String, download: Boolean): js.Promise[GitBlobRef] = js.native
    def getBlob(repositoryId: String, sha1: String, project: String, download: Boolean, fileName: String): js.Promise[GitBlobRef] = js.native
    def getBlob(repositoryId: String, sha1: String, project: String, download: Unit, fileName: String): js.Promise[GitBlobRef] = js.native
    def getBlob(repositoryId: String, sha1: String, project: Unit, download: Boolean): js.Promise[GitBlobRef] = js.native
    def getBlob(repositoryId: String, sha1: String, project: Unit, download: Boolean, fileName: String): js.Promise[GitBlobRef] = js.native
    def getBlob(repositoryId: String, sha1: String, project: Unit, download: Unit, fileName: String): js.Promise[GitBlobRef] = js.native
    
    def getBlobContent(repositoryId: String, sha1: String): js.Promise[ReadableStream] = js.native
    def getBlobContent(repositoryId: String, sha1: String, project: String): js.Promise[ReadableStream] = js.native
    def getBlobContent(repositoryId: String, sha1: String, project: String, download: Boolean): js.Promise[ReadableStream] = js.native
    def getBlobContent(repositoryId: String, sha1: String, project: String, download: Boolean, fileName: String): js.Promise[ReadableStream] = js.native
    def getBlobContent(repositoryId: String, sha1: String, project: String, download: Unit, fileName: String): js.Promise[ReadableStream] = js.native
    def getBlobContent(repositoryId: String, sha1: String, project: Unit, download: Boolean): js.Promise[ReadableStream] = js.native
    def getBlobContent(repositoryId: String, sha1: String, project: Unit, download: Boolean, fileName: String): js.Promise[ReadableStream] = js.native
    def getBlobContent(repositoryId: String, sha1: String, project: Unit, download: Unit, fileName: String): js.Promise[ReadableStream] = js.native
    
    def getBlobZip(repositoryId: String, sha1: String): js.Promise[ReadableStream] = js.native
    def getBlobZip(repositoryId: String, sha1: String, project: String): js.Promise[ReadableStream] = js.native
    def getBlobZip(repositoryId: String, sha1: String, project: String, download: Boolean): js.Promise[ReadableStream] = js.native
    def getBlobZip(repositoryId: String, sha1: String, project: String, download: Boolean, fileName: String): js.Promise[ReadableStream] = js.native
    def getBlobZip(repositoryId: String, sha1: String, project: String, download: Unit, fileName: String): js.Promise[ReadableStream] = js.native
    def getBlobZip(repositoryId: String, sha1: String, project: Unit, download: Boolean): js.Promise[ReadableStream] = js.native
    def getBlobZip(repositoryId: String, sha1: String, project: Unit, download: Boolean, fileName: String): js.Promise[ReadableStream] = js.native
    def getBlobZip(repositoryId: String, sha1: String, project: Unit, download: Unit, fileName: String): js.Promise[ReadableStream] = js.native
    
    def getBlobsZip(blobIds: js.Array[String], repositoryId: String): js.Promise[ReadableStream] = js.native
    def getBlobsZip(blobIds: js.Array[String], repositoryId: String, project: String): js.Promise[ReadableStream] = js.native
    def getBlobsZip(blobIds: js.Array[String], repositoryId: String, project: String, filename: String): js.Promise[ReadableStream] = js.native
    def getBlobsZip(blobIds: js.Array[String], repositoryId: String, project: Unit, filename: String): js.Promise[ReadableStream] = js.native
    
    def getBranch(repositoryId: String, name: String): js.Promise[GitBranchStats] = js.native
    def getBranch(repositoryId: String, name: String, project: String): js.Promise[GitBranchStats] = js.native
    def getBranch(repositoryId: String, name: String, project: String, baseVersionDescriptor: GitVersionDescriptor): js.Promise[GitBranchStats] = js.native
    def getBranch(repositoryId: String, name: String, project: Unit, baseVersionDescriptor: GitVersionDescriptor): js.Promise[GitBranchStats] = js.native
    
    def getBranchStatsBatch(searchCriteria: GitQueryBranchStatsCriteria, repositoryId: String): js.Promise[js.Array[GitBranchStats]] = js.native
    def getBranchStatsBatch(searchCriteria: GitQueryBranchStatsCriteria, repositoryId: String, project: String): js.Promise[js.Array[GitBranchStats]] = js.native
    
    def getBranches(repositoryId: String): js.Promise[js.Array[GitBranchStats]] = js.native
    def getBranches(repositoryId: String, project: String): js.Promise[js.Array[GitBranchStats]] = js.native
    def getBranches(repositoryId: String, project: String, baseVersionDescriptor: GitVersionDescriptor): js.Promise[js.Array[GitBranchStats]] = js.native
    def getBranches(repositoryId: String, project: Unit, baseVersionDescriptor: GitVersionDescriptor): js.Promise[js.Array[GitBranchStats]] = js.native
    
    def getChanges(commitId: String, repositoryId: String): js.Promise[GitCommitChanges] = js.native
    def getChanges(commitId: String, repositoryId: String, project: String): js.Promise[GitCommitChanges] = js.native
    def getChanges(commitId: String, repositoryId: String, project: String, top: Double): js.Promise[GitCommitChanges] = js.native
    def getChanges(commitId: String, repositoryId: String, project: String, top: Double, skip: Double): js.Promise[GitCommitChanges] = js.native
    def getChanges(commitId: String, repositoryId: String, project: String, top: Unit, skip: Double): js.Promise[GitCommitChanges] = js.native
    def getChanges(commitId: String, repositoryId: String, project: Unit, top: Double): js.Promise[GitCommitChanges] = js.native
    def getChanges(commitId: String, repositoryId: String, project: Unit, top: Double, skip: Double): js.Promise[GitCommitChanges] = js.native
    def getChanges(commitId: String, repositoryId: String, project: Unit, top: Unit, skip: Double): js.Promise[GitCommitChanges] = js.native
    
    def getCherryPick(project: String, cherryPickId: Double, repositoryId: String): js.Promise[GitCherryPick] = js.native
    
    def getCherryPickForRefName(project: String, repositoryId: String, refName: String): js.Promise[GitCherryPick] = js.native
    
    def getCherryPickRelationships(repositoryNameOrId: String, commitId: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCherryPickRelationships(repositoryNameOrId: String, commitId: String, project: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCherryPickRelationships(repositoryNameOrId: String, commitId: String, project: String, includeLinks: Boolean): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCherryPickRelationships(repositoryNameOrId: String, commitId: String, project: Unit, includeLinks: Boolean): js.Promise[js.Array[GitCommitRef]] = js.native
    
    def getComment(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double): js.Promise[Comment] = js.native
    def getComment(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double, project: String): js.Promise[Comment] = js.native
    
    def getComments(repositoryId: String, pullRequestId: Double, threadId: Double): js.Promise[js.Array[Comment]] = js.native
    def getComments(repositoryId: String, pullRequestId: Double, threadId: Double, project: String): js.Promise[js.Array[Comment]] = js.native
    
    def getCommit(commitId: String, repositoryId: String): js.Promise[GitCommit] = js.native
    def getCommit(commitId: String, repositoryId: String, project: String): js.Promise[GitCommit] = js.native
    def getCommit(commitId: String, repositoryId: String, project: String, changeCount: Double): js.Promise[GitCommit] = js.native
    def getCommit(commitId: String, repositoryId: String, project: Unit, changeCount: Double): js.Promise[GitCommit] = js.native
    
    def getCommits(repositoryId: String, searchCriteria: GitQueryCommitsCriteria): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommits(repositoryId: String, searchCriteria: GitQueryCommitsCriteria, project: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommits(repositoryId: String, searchCriteria: GitQueryCommitsCriteria, project: String, skip: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommits(
      repositoryId: String,
      searchCriteria: GitQueryCommitsCriteria,
      project: String,
      skip: Double,
      top: Double
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommits(
      repositoryId: String,
      searchCriteria: GitQueryCommitsCriteria,
      project: String,
      skip: Unit,
      top: Double
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommits(repositoryId: String, searchCriteria: GitQueryCommitsCriteria, project: Unit, skip: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommits(
      repositoryId: String,
      searchCriteria: GitQueryCommitsCriteria,
      project: Unit,
      skip: Double,
      top: Double
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommits(
      repositoryId: String,
      searchCriteria: GitQueryCommitsCriteria,
      project: Unit,
      skip: Unit,
      top: Double
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    
    def getCommitsBatch(searchCriteria: GitQueryCommitsCriteria, repositoryId: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(searchCriteria: GitQueryCommitsCriteria, repositoryId: String, project: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(searchCriteria: GitQueryCommitsCriteria, repositoryId: String, project: String, skip: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(
      searchCriteria: GitQueryCommitsCriteria,
      repositoryId: String,
      project: String,
      skip: Double,
      top: Double
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(
      searchCriteria: GitQueryCommitsCriteria,
      repositoryId: String,
      project: String,
      skip: Double,
      top: Double,
      includeStatuses: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(
      searchCriteria: GitQueryCommitsCriteria,
      repositoryId: String,
      project: String,
      skip: Double,
      top: Unit,
      includeStatuses: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(
      searchCriteria: GitQueryCommitsCriteria,
      repositoryId: String,
      project: String,
      skip: Unit,
      top: Double
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(
      searchCriteria: GitQueryCommitsCriteria,
      repositoryId: String,
      project: String,
      skip: Unit,
      top: Double,
      includeStatuses: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(
      searchCriteria: GitQueryCommitsCriteria,
      repositoryId: String,
      project: String,
      skip: Unit,
      top: Unit,
      includeStatuses: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(searchCriteria: GitQueryCommitsCriteria, repositoryId: String, project: Unit, skip: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(
      searchCriteria: GitQueryCommitsCriteria,
      repositoryId: String,
      project: Unit,
      skip: Double,
      top: Double
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(
      searchCriteria: GitQueryCommitsCriteria,
      repositoryId: String,
      project: Unit,
      skip: Double,
      top: Double,
      includeStatuses: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(
      searchCriteria: GitQueryCommitsCriteria,
      repositoryId: String,
      project: Unit,
      skip: Double,
      top: Unit,
      includeStatuses: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(
      searchCriteria: GitQueryCommitsCriteria,
      repositoryId: String,
      project: Unit,
      skip: Unit,
      top: Double
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(
      searchCriteria: GitQueryCommitsCriteria,
      repositoryId: String,
      project: Unit,
      skip: Unit,
      top: Double,
      includeStatuses: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(
      searchCriteria: GitQueryCommitsCriteria,
      repositoryId: String,
      project: Unit,
      skip: Unit,
      top: Unit,
      includeStatuses: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    
    def getDeletedRepositories(project: String): js.Promise[js.Array[GitDeletedRepository]] = js.native
    
    def getForkSyncRequest(repositoryNameOrId: String, forkSyncOperationId: Double): js.Promise[GitForkSyncRequest] = js.native
    def getForkSyncRequest(repositoryNameOrId: String, forkSyncOperationId: Double, project: String): js.Promise[GitForkSyncRequest] = js.native
    def getForkSyncRequest(repositoryNameOrId: String, forkSyncOperationId: Double, project: String, includeLinks: Boolean): js.Promise[GitForkSyncRequest] = js.native
    def getForkSyncRequest(repositoryNameOrId: String, forkSyncOperationId: Double, project: Unit, includeLinks: Boolean): js.Promise[GitForkSyncRequest] = js.native
    
    def getForkSyncRequests(repositoryNameOrId: String): js.Promise[js.Array[GitForkSyncRequest]] = js.native
    def getForkSyncRequests(repositoryNameOrId: String, project: String): js.Promise[js.Array[GitForkSyncRequest]] = js.native
    def getForkSyncRequests(repositoryNameOrId: String, project: String, includeAbandoned: Boolean): js.Promise[js.Array[GitForkSyncRequest]] = js.native
    def getForkSyncRequests(repositoryNameOrId: String, project: String, includeAbandoned: Boolean, includeLinks: Boolean): js.Promise[js.Array[GitForkSyncRequest]] = js.native
    def getForkSyncRequests(repositoryNameOrId: String, project: String, includeAbandoned: Unit, includeLinks: Boolean): js.Promise[js.Array[GitForkSyncRequest]] = js.native
    def getForkSyncRequests(repositoryNameOrId: String, project: Unit, includeAbandoned: Boolean): js.Promise[js.Array[GitForkSyncRequest]] = js.native
    def getForkSyncRequests(repositoryNameOrId: String, project: Unit, includeAbandoned: Boolean, includeLinks: Boolean): js.Promise[js.Array[GitForkSyncRequest]] = js.native
    def getForkSyncRequests(repositoryNameOrId: String, project: Unit, includeAbandoned: Unit, includeLinks: Boolean): js.Promise[js.Array[GitForkSyncRequest]] = js.native
    
    def getForks(repositoryNameOrId: String, collectionId: String): js.Promise[js.Array[GitRepositoryRef]] = js.native
    def getForks(repositoryNameOrId: String, collectionId: String, project: String): js.Promise[js.Array[GitRepositoryRef]] = js.native
    def getForks(repositoryNameOrId: String, collectionId: String, project: String, includeLinks: Boolean): js.Promise[js.Array[GitRepositoryRef]] = js.native
    def getForks(repositoryNameOrId: String, collectionId: String, project: Unit, includeLinks: Boolean): js.Promise[js.Array[GitRepositoryRef]] = js.native
    
    def getImportRequest(project: String, repositoryId: String, importRequestId: Double): js.Promise[GitImportRequest] = js.native
    
    def getItem(
      repositoryId: String,
      path: String,
      project: js.UndefOr[String],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      includeContentMetadata: js.UndefOr[Boolean],
      latestProcessedChange: js.UndefOr[Boolean],
      download: js.UndefOr[Boolean],
      versionDescriptor: js.UndefOr[GitVersionDescriptor]
    ): js.Promise[GitItem] = js.native
    
    def getItemContent(
      repositoryId: String,
      path: String,
      project: js.UndefOr[String],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      includeContentMetadata: js.UndefOr[Boolean],
      latestProcessedChange: js.UndefOr[Boolean],
      download: js.UndefOr[Boolean],
      versionDescriptor: js.UndefOr[GitVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    
    def getItemText(
      repositoryId: String,
      path: String,
      project: js.UndefOr[String],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      includeContentMetadata: js.UndefOr[Boolean],
      latestProcessedChange: js.UndefOr[Boolean],
      download: js.UndefOr[Boolean],
      versionDescriptor: js.UndefOr[GitVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    
    def getItemZip(
      repositoryId: String,
      path: String,
      project: js.UndefOr[String],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      includeContentMetadata: js.UndefOr[Boolean],
      latestProcessedChange: js.UndefOr[Boolean],
      download: js.UndefOr[Boolean],
      versionDescriptor: js.UndefOr[GitVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    
    def getItems(
      repositoryId: String,
      project: js.UndefOr[String],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      includeContentMetadata: js.UndefOr[Boolean],
      latestProcessedChange: js.UndefOr[Boolean],
      download: js.UndefOr[Boolean],
      includeLinks: js.UndefOr[Boolean],
      versionDescriptor: js.UndefOr[GitVersionDescriptor]
    ): js.Promise[js.Array[GitItem]] = js.native
    
    def getItemsBatch(requestData: GitItemRequestData, repositoryId: String): js.Promise[js.Array[js.Array[GitItem]]] = js.native
    def getItemsBatch(requestData: GitItemRequestData, repositoryId: String, project: String): js.Promise[js.Array[js.Array[GitItem]]] = js.native
    
    def getLikes(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double): js.Promise[js.Array[IdentityRef]] = js.native
    def getLikes(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double, project: String): js.Promise[js.Array[IdentityRef]] = js.native
    
    def getMergeBases(repositoryNameOrId: String, commitId: String, otherCommitId: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getMergeBases(repositoryNameOrId: String, commitId: String, otherCommitId: String, project: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getMergeBases(
      repositoryNameOrId: String,
      commitId: String,
      otherCommitId: String,
      project: String,
      otherCollectionId: String
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getMergeBases(
      repositoryNameOrId: String,
      commitId: String,
      otherCommitId: String,
      project: String,
      otherCollectionId: String,
      otherRepositoryId: String
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getMergeBases(
      repositoryNameOrId: String,
      commitId: String,
      otherCommitId: String,
      project: String,
      otherCollectionId: Unit,
      otherRepositoryId: String
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getMergeBases(
      repositoryNameOrId: String,
      commitId: String,
      otherCommitId: String,
      project: Unit,
      otherCollectionId: String
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getMergeBases(
      repositoryNameOrId: String,
      commitId: String,
      otherCommitId: String,
      project: Unit,
      otherCollectionId: String,
      otherRepositoryId: String
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getMergeBases(
      repositoryNameOrId: String,
      commitId: String,
      otherCommitId: String,
      project: Unit,
      otherCollectionId: Unit,
      otherRepositoryId: String
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    
    def getPullRequest(
      repositoryId: String,
      pullRequestId: Double,
      project: js.UndefOr[String],
      maxCommentLength: js.UndefOr[Double],
      skip: js.UndefOr[Double],
      top: js.UndefOr[Double],
      includeCommits: js.UndefOr[Boolean],
      includeWorkItemRefs: js.UndefOr[Boolean]
    ): js.Promise[GitPullRequest] = js.native
    
    def getPullRequestById(pullRequestId: Double): js.Promise[GitPullRequest] = js.native
    
    def getPullRequestCommits(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPullRequestCommits(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[GitCommitRef]] = js.native
    
    def getPullRequestConflict(repositoryId: String, pullRequestId: Double, conflictId: Double): js.Promise[GitConflict] = js.native
    def getPullRequestConflict(repositoryId: String, pullRequestId: Double, conflictId: Double, project: String): js.Promise[GitConflict] = js.native
    
    def getPullRequestConflicts(
      repositoryId: String,
      pullRequestId: Double,
      project: js.UndefOr[String],
      skip: js.UndefOr[Double],
      top: js.UndefOr[Double],
      includeObsolete: js.UndefOr[Boolean],
      excludeResolved: js.UndefOr[Boolean],
      onlyResolved: js.UndefOr[Boolean]
    ): js.Promise[js.Array[GitConflict]] = js.native
    
    def getPullRequestIteration(repositoryId: String, pullRequestId: Double, iterationId: Double): js.Promise[GitPullRequestIteration] = js.native
    def getPullRequestIteration(repositoryId: String, pullRequestId: Double, iterationId: Double, project: String): js.Promise[GitPullRequestIteration] = js.native
    
    def getPullRequestIterationChanges(repositoryId: String, pullRequestId: Double, iterationId: Double): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(repositoryId: String, pullRequestId: Double, iterationId: Double, project: String): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(repositoryId: String, pullRequestId: Double, iterationId: Double, project: String, top: Double): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: String,
      top: Double,
      skip: Double
    ): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: String,
      top: Double,
      skip: Double,
      compareTo: Double
    ): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: String,
      top: Double,
      skip: Unit,
      compareTo: Double
    ): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: String,
      top: Unit,
      skip: Double
    ): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: String,
      top: Unit,
      skip: Double,
      compareTo: Double
    ): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: String,
      top: Unit,
      skip: Unit,
      compareTo: Double
    ): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(repositoryId: String, pullRequestId: Double, iterationId: Double, project: Unit, top: Double): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: Unit,
      top: Double,
      skip: Double
    ): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: Unit,
      top: Double,
      skip: Double,
      compareTo: Double
    ): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: Unit,
      top: Double,
      skip: Unit,
      compareTo: Double
    ): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: Unit,
      top: Unit,
      skip: Double
    ): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: Unit,
      top: Unit,
      skip: Double,
      compareTo: Double
    ): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: Unit,
      top: Unit,
      skip: Unit,
      compareTo: Double
    ): js.Promise[GitPullRequestIterationChanges] = js.native
    
    def getPullRequestIterationCommits(repositoryId: String, pullRequestId: Double, iterationId: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPullRequestIterationCommits(repositoryId: String, pullRequestId: Double, iterationId: Double, project: String): js.Promise[js.Array[GitCommitRef]] = js.native
    
    def getPullRequestIterationStatus(repositoryId: String, pullRequestId: Double, iterationId: Double, statusId: Double): js.Promise[GitPullRequestStatus] = js.native
    def getPullRequestIterationStatus(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      statusId: Double,
      project: String
    ): js.Promise[GitPullRequestStatus] = js.native
    
    def getPullRequestIterationStatuses(repositoryId: String, pullRequestId: Double, iterationId: Double): js.Promise[js.Array[GitPullRequestStatus]] = js.native
    def getPullRequestIterationStatuses(repositoryId: String, pullRequestId: Double, iterationId: Double, project: String): js.Promise[js.Array[GitPullRequestStatus]] = js.native
    
    def getPullRequestIterations(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[GitPullRequestIteration]] = js.native
    def getPullRequestIterations(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[GitPullRequestIteration]] = js.native
    def getPullRequestIterations(repositoryId: String, pullRequestId: Double, project: String, includeCommits: Boolean): js.Promise[js.Array[GitPullRequestIteration]] = js.native
    def getPullRequestIterations(repositoryId: String, pullRequestId: Double, project: Unit, includeCommits: Boolean): js.Promise[js.Array[GitPullRequestIteration]] = js.native
    
    def getPullRequestLabel(repositoryId: String, pullRequestId: Double, labelIdOrName: String): js.Promise[WebApiTagDefinition] = js.native
    def getPullRequestLabel(repositoryId: String, pullRequestId: Double, labelIdOrName: String, project: String): js.Promise[WebApiTagDefinition] = js.native
    def getPullRequestLabel(
      repositoryId: String,
      pullRequestId: Double,
      labelIdOrName: String,
      project: String,
      projectId: String
    ): js.Promise[WebApiTagDefinition] = js.native
    def getPullRequestLabel(
      repositoryId: String,
      pullRequestId: Double,
      labelIdOrName: String,
      project: Unit,
      projectId: String
    ): js.Promise[WebApiTagDefinition] = js.native
    
    def getPullRequestLabels(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[WebApiTagDefinition]] = js.native
    def getPullRequestLabels(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[WebApiTagDefinition]] = js.native
    def getPullRequestLabels(repositoryId: String, pullRequestId: Double, project: String, projectId: String): js.Promise[js.Array[WebApiTagDefinition]] = js.native
    def getPullRequestLabels(repositoryId: String, pullRequestId: Double, project: Unit, projectId: String): js.Promise[js.Array[WebApiTagDefinition]] = js.native
    
    def getPullRequestProperties(repositoryId: String, pullRequestId: Double): js.Promise[Any] = js.native
    def getPullRequestProperties(repositoryId: String, pullRequestId: Double, project: String): js.Promise[Any] = js.native
    
    def getPullRequestQuery(queries: GitPullRequestQuery, repositoryId: String): js.Promise[GitPullRequestQuery] = js.native
    def getPullRequestQuery(queries: GitPullRequestQuery, repositoryId: String, project: String): js.Promise[GitPullRequestQuery] = js.native
    
    def getPullRequestReviewer(repositoryId: String, pullRequestId: Double, reviewerId: String): js.Promise[IdentityRefWithVote] = js.native
    def getPullRequestReviewer(repositoryId: String, pullRequestId: Double, reviewerId: String, project: String): js.Promise[IdentityRefWithVote] = js.native
    
    def getPullRequestReviewers(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[IdentityRefWithVote]] = js.native
    def getPullRequestReviewers(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[IdentityRefWithVote]] = js.native
    
    def getPullRequestStatus(repositoryId: String, pullRequestId: Double, statusId: Double): js.Promise[GitPullRequestStatus] = js.native
    def getPullRequestStatus(repositoryId: String, pullRequestId: Double, statusId: Double, project: String): js.Promise[GitPullRequestStatus] = js.native
    
    def getPullRequestStatuses(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[GitPullRequestStatus]] = js.native
    def getPullRequestStatuses(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[GitPullRequestStatus]] = js.native
    
    def getPullRequestThread(repositoryId: String, pullRequestId: Double, threadId: Double): js.Promise[GitPullRequestCommentThread] = js.native
    def getPullRequestThread(repositoryId: String, pullRequestId: Double, threadId: Double, project: String): js.Promise[GitPullRequestCommentThread] = js.native
    def getPullRequestThread(repositoryId: String, pullRequestId: Double, threadId: Double, project: String, iteration: Double): js.Promise[GitPullRequestCommentThread] = js.native
    def getPullRequestThread(
      repositoryId: String,
      pullRequestId: Double,
      threadId: Double,
      project: String,
      iteration: Double,
      baseIteration: Double
    ): js.Promise[GitPullRequestCommentThread] = js.native
    def getPullRequestThread(
      repositoryId: String,
      pullRequestId: Double,
      threadId: Double,
      project: String,
      iteration: Unit,
      baseIteration: Double
    ): js.Promise[GitPullRequestCommentThread] = js.native
    def getPullRequestThread(repositoryId: String, pullRequestId: Double, threadId: Double, project: Unit, iteration: Double): js.Promise[GitPullRequestCommentThread] = js.native
    def getPullRequestThread(
      repositoryId: String,
      pullRequestId: Double,
      threadId: Double,
      project: Unit,
      iteration: Double,
      baseIteration: Double
    ): js.Promise[GitPullRequestCommentThread] = js.native
    def getPullRequestThread(
      repositoryId: String,
      pullRequestId: Double,
      threadId: Double,
      project: Unit,
      iteration: Unit,
      baseIteration: Double
    ): js.Promise[GitPullRequestCommentThread] = js.native
    
    def getPullRequestWorkItems(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[AssociatedWorkItem]] = js.native
    def getPullRequestWorkItems(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[AssociatedWorkItem]] = js.native
    
    def getPullRequests(repositoryId: String, searchCriteria: GitPullRequestSearchCriteria): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(repositoryId: String, searchCriteria: GitPullRequestSearchCriteria, project: String): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: String,
      maxCommentLength: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: String,
      maxCommentLength: Double,
      skip: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: String,
      maxCommentLength: Double,
      skip: Double,
      top: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: String,
      maxCommentLength: Double,
      skip: Unit,
      top: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: String,
      maxCommentLength: Unit,
      skip: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: String,
      maxCommentLength: Unit,
      skip: Double,
      top: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: String,
      maxCommentLength: Unit,
      skip: Unit,
      top: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: Unit,
      maxCommentLength: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: Unit,
      maxCommentLength: Double,
      skip: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: Unit,
      maxCommentLength: Double,
      skip: Double,
      top: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: Unit,
      maxCommentLength: Double,
      skip: Unit,
      top: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: Unit,
      maxCommentLength: Unit,
      skip: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: Unit,
      maxCommentLength: Unit,
      skip: Double,
      top: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: Unit,
      maxCommentLength: Unit,
      skip: Unit,
      top: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    
    def getPullRequestsByProject(project: String, searchCriteria: GitPullRequestSearchCriteria): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequestsByProject(project: String, searchCriteria: GitPullRequestSearchCriteria, maxCommentLength: Double): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequestsByProject(
      project: String,
      searchCriteria: GitPullRequestSearchCriteria,
      maxCommentLength: Double,
      skip: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequestsByProject(
      project: String,
      searchCriteria: GitPullRequestSearchCriteria,
      maxCommentLength: Double,
      skip: Double,
      top: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequestsByProject(
      project: String,
      searchCriteria: GitPullRequestSearchCriteria,
      maxCommentLength: Double,
      skip: Unit,
      top: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequestsByProject(
      project: String,
      searchCriteria: GitPullRequestSearchCriteria,
      maxCommentLength: Unit,
      skip: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequestsByProject(
      project: String,
      searchCriteria: GitPullRequestSearchCriteria,
      maxCommentLength: Unit,
      skip: Double,
      top: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequestsByProject(
      project: String,
      searchCriteria: GitPullRequestSearchCriteria,
      maxCommentLength: Unit,
      skip: Unit,
      top: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    
    def getPush(repositoryId: String, pushId: Double): js.Promise[GitPush] = js.native
    def getPush(repositoryId: String, pushId: Double, project: String): js.Promise[GitPush] = js.native
    def getPush(repositoryId: String, pushId: Double, project: String, includeCommits: Double): js.Promise[GitPush] = js.native
    def getPush(
      repositoryId: String,
      pushId: Double,
      project: String,
      includeCommits: Double,
      includeRefUpdates: Boolean
    ): js.Promise[GitPush] = js.native
    def getPush(
      repositoryId: String,
      pushId: Double,
      project: String,
      includeCommits: Unit,
      includeRefUpdates: Boolean
    ): js.Promise[GitPush] = js.native
    def getPush(repositoryId: String, pushId: Double, project: Unit, includeCommits: Double): js.Promise[GitPush] = js.native
    def getPush(
      repositoryId: String,
      pushId: Double,
      project: Unit,
      includeCommits: Double,
      includeRefUpdates: Boolean
    ): js.Promise[GitPush] = js.native
    def getPush(
      repositoryId: String,
      pushId: Double,
      project: Unit,
      includeCommits: Unit,
      includeRefUpdates: Boolean
    ): js.Promise[GitPush] = js.native
    
    def getPushCommits(repositoryId: String, pushId: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(repositoryId: String, pushId: Double, project: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(repositoryId: String, pushId: Double, project: String, top: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(repositoryId: String, pushId: Double, project: String, top: Double, skip: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(
      repositoryId: String,
      pushId: Double,
      project: String,
      top: Double,
      skip: Double,
      includeLinks: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(
      repositoryId: String,
      pushId: Double,
      project: String,
      top: Double,
      skip: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(repositoryId: String, pushId: Double, project: String, top: Unit, skip: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(
      repositoryId: String,
      pushId: Double,
      project: String,
      top: Unit,
      skip: Double,
      includeLinks: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(
      repositoryId: String,
      pushId: Double,
      project: String,
      top: Unit,
      skip: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(repositoryId: String, pushId: Double, project: Unit, top: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(repositoryId: String, pushId: Double, project: Unit, top: Double, skip: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(
      repositoryId: String,
      pushId: Double,
      project: Unit,
      top: Double,
      skip: Double,
      includeLinks: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(
      repositoryId: String,
      pushId: Double,
      project: Unit,
      top: Double,
      skip: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(repositoryId: String, pushId: Double, project: Unit, top: Unit, skip: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(
      repositoryId: String,
      pushId: Double,
      project: Unit,
      top: Unit,
      skip: Double,
      includeLinks: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(repositoryId: String, pushId: Double, project: Unit, top: Unit, skip: Unit, includeLinks: Boolean): js.Promise[js.Array[GitCommitRef]] = js.native
    
    def getPushes(repositoryId: String): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(repositoryId: String, project: String): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(repositoryId: String, project: String, skip: Double): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(repositoryId: String, project: String, skip: Double, top: Double): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(
      repositoryId: String,
      project: String,
      skip: Double,
      top: Double,
      searchCriteria: GitPushSearchCriteria
    ): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(
      repositoryId: String,
      project: String,
      skip: Double,
      top: Unit,
      searchCriteria: GitPushSearchCriteria
    ): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(repositoryId: String, project: String, skip: Unit, top: Double): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(
      repositoryId: String,
      project: String,
      skip: Unit,
      top: Double,
      searchCriteria: GitPushSearchCriteria
    ): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(
      repositoryId: String,
      project: String,
      skip: Unit,
      top: Unit,
      searchCriteria: GitPushSearchCriteria
    ): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(repositoryId: String, project: Unit, skip: Double): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(repositoryId: String, project: Unit, skip: Double, top: Double): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(
      repositoryId: String,
      project: Unit,
      skip: Double,
      top: Double,
      searchCriteria: GitPushSearchCriteria
    ): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(
      repositoryId: String,
      project: Unit,
      skip: Double,
      top: Unit,
      searchCriteria: GitPushSearchCriteria
    ): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(repositoryId: String, project: Unit, skip: Unit, top: Double): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(
      repositoryId: String,
      project: Unit,
      skip: Unit,
      top: Double,
      searchCriteria: GitPushSearchCriteria
    ): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(repositoryId: String, project: Unit, skip: Unit, top: Unit, searchCriteria: GitPushSearchCriteria): js.Promise[js.Array[GitPush]] = js.native
    
    def getRefFavorite(project: String, favoriteId: Double): js.Promise[GitRefFavorite] = js.native
    
    def getRefFavorites(project: String): js.Promise[js.Array[GitRefFavorite]] = js.native
    def getRefFavorites(project: String, repositoryId: String): js.Promise[js.Array[GitRefFavorite]] = js.native
    def getRefFavorites(project: String, repositoryId: String, identityId: String): js.Promise[js.Array[GitRefFavorite]] = js.native
    def getRefFavorites(project: String, repositoryId: Unit, identityId: String): js.Promise[js.Array[GitRefFavorite]] = js.native
    
    def getRefs(repositoryId: String): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(repositoryId: String, project: String): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(repositoryId: String, project: String, filter: String): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(repositoryId: String, project: String, filter: String, includeLinks: Boolean): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(
      repositoryId: String,
      project: String,
      filter: String,
      includeLinks: Boolean,
      latestStatusesOnly: Boolean
    ): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(
      repositoryId: String,
      project: String,
      filter: String,
      includeLinks: Unit,
      latestStatusesOnly: Boolean
    ): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(repositoryId: String, project: String, filter: Unit, includeLinks: Boolean): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(
      repositoryId: String,
      project: String,
      filter: Unit,
      includeLinks: Boolean,
      latestStatusesOnly: Boolean
    ): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(
      repositoryId: String,
      project: String,
      filter: Unit,
      includeLinks: Unit,
      latestStatusesOnly: Boolean
    ): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(repositoryId: String, project: Unit, filter: String): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(repositoryId: String, project: Unit, filter: String, includeLinks: Boolean): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(
      repositoryId: String,
      project: Unit,
      filter: String,
      includeLinks: Boolean,
      latestStatusesOnly: Boolean
    ): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(
      repositoryId: String,
      project: Unit,
      filter: String,
      includeLinks: Unit,
      latestStatusesOnly: Boolean
    ): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(repositoryId: String, project: Unit, filter: Unit, includeLinks: Boolean): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(
      repositoryId: String,
      project: Unit,
      filter: Unit,
      includeLinks: Boolean,
      latestStatusesOnly: Boolean
    ): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(repositoryId: String, project: Unit, filter: Unit, includeLinks: Unit, latestStatusesOnly: Boolean): js.Promise[js.Array[GitRef]] = js.native
    
    def getRepositories(): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: String): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: String, includeLinks: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: String, includeLinks: Boolean, includeAllUrls: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: String, includeLinks: Boolean, includeAllUrls: Boolean, includeHidden: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: String, includeLinks: Boolean, includeAllUrls: Unit, includeHidden: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: String, includeLinks: Unit, includeAllUrls: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: String, includeLinks: Unit, includeAllUrls: Boolean, includeHidden: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: String, includeLinks: Unit, includeAllUrls: Unit, includeHidden: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: Unit, includeLinks: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: Unit, includeLinks: Boolean, includeAllUrls: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: Unit, includeLinks: Boolean, includeAllUrls: Boolean, includeHidden: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: Unit, includeLinks: Boolean, includeAllUrls: Unit, includeHidden: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: Unit, includeLinks: Unit, includeAllUrls: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: Unit, includeLinks: Unit, includeAllUrls: Boolean, includeHidden: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: Unit, includeLinks: Unit, includeAllUrls: Unit, includeHidden: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    
    def getRepository(repositoryId: String): js.Promise[GitRepository] = js.native
    def getRepository(repositoryId: String, project: String): js.Promise[GitRepository] = js.native
    def getRepository(repositoryId: String, project: String, includeParent: Boolean): js.Promise[GitRepository] = js.native
    def getRepository(repositoryId: String, project: Unit, includeParent: Boolean): js.Promise[GitRepository] = js.native
    
    def getRevert(project: String, revertId: Double, repositoryId: String): js.Promise[GitRevert] = js.native
    
    def getRevertForRefName(project: String, repositoryId: String, refName: String): js.Promise[GitRevert] = js.native
    
    def getStatuses(commitId: String, repositoryId: String): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(commitId: String, repositoryId: String, project: String): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(commitId: String, repositoryId: String, project: String, top: Double): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(commitId: String, repositoryId: String, project: String, top: Double, skip: Double): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(
      commitId: String,
      repositoryId: String,
      project: String,
      top: Double,
      skip: Double,
      latestOnly: Boolean
    ): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(
      commitId: String,
      repositoryId: String,
      project: String,
      top: Double,
      skip: Unit,
      latestOnly: Boolean
    ): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(commitId: String, repositoryId: String, project: String, top: Unit, skip: Double): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(
      commitId: String,
      repositoryId: String,
      project: String,
      top: Unit,
      skip: Double,
      latestOnly: Boolean
    ): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(
      commitId: String,
      repositoryId: String,
      project: String,
      top: Unit,
      skip: Unit,
      latestOnly: Boolean
    ): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(commitId: String, repositoryId: String, project: Unit, top: Double): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(commitId: String, repositoryId: String, project: Unit, top: Double, skip: Double): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(
      commitId: String,
      repositoryId: String,
      project: Unit,
      top: Double,
      skip: Double,
      latestOnly: Boolean
    ): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(
      commitId: String,
      repositoryId: String,
      project: Unit,
      top: Double,
      skip: Unit,
      latestOnly: Boolean
    ): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(commitId: String, repositoryId: String, project: Unit, top: Unit, skip: Double): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(
      commitId: String,
      repositoryId: String,
      project: Unit,
      top: Unit,
      skip: Double,
      latestOnly: Boolean
    ): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(commitId: String, repositoryId: String, project: Unit, top: Unit, skip: Unit, latestOnly: Boolean): js.Promise[js.Array[GitStatus]] = js.native
    
    def getSuggestions(repositoryId: String): js.Promise[js.Array[GitSuggestion]] = js.native
    def getSuggestions(repositoryId: String, project: String): js.Promise[js.Array[GitSuggestion]] = js.native
    
    def getThreads(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[GitPullRequestCommentThread]] = js.native
    def getThreads(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[GitPullRequestCommentThread]] = js.native
    def getThreads(repositoryId: String, pullRequestId: Double, project: String, iteration: Double): js.Promise[js.Array[GitPullRequestCommentThread]] = js.native
    def getThreads(
      repositoryId: String,
      pullRequestId: Double,
      project: String,
      iteration: Double,
      baseIteration: Double
    ): js.Promise[js.Array[GitPullRequestCommentThread]] = js.native
    def getThreads(
      repositoryId: String,
      pullRequestId: Double,
      project: String,
      iteration: Unit,
      baseIteration: Double
    ): js.Promise[js.Array[GitPullRequestCommentThread]] = js.native
    def getThreads(repositoryId: String, pullRequestId: Double, project: Unit, iteration: Double): js.Promise[js.Array[GitPullRequestCommentThread]] = js.native
    def getThreads(
      repositoryId: String,
      pullRequestId: Double,
      project: Unit,
      iteration: Double,
      baseIteration: Double
    ): js.Promise[js.Array[GitPullRequestCommentThread]] = js.native
    def getThreads(repositoryId: String, pullRequestId: Double, project: Unit, iteration: Unit, baseIteration: Double): js.Promise[js.Array[GitPullRequestCommentThread]] = js.native
    
    def getTree(repositoryId: String, sha1: String): js.Promise[GitTreeRef] = js.native
    def getTree(repositoryId: String, sha1: String, project: String): js.Promise[GitTreeRef] = js.native
    def getTree(repositoryId: String, sha1: String, project: String, projectId: String): js.Promise[GitTreeRef] = js.native
    def getTree(repositoryId: String, sha1: String, project: String, projectId: String, recursive: Boolean): js.Promise[GitTreeRef] = js.native
    def getTree(
      repositoryId: String,
      sha1: String,
      project: String,
      projectId: String,
      recursive: Boolean,
      fileName: String
    ): js.Promise[GitTreeRef] = js.native
    def getTree(
      repositoryId: String,
      sha1: String,
      project: String,
      projectId: String,
      recursive: Unit,
      fileName: String
    ): js.Promise[GitTreeRef] = js.native
    def getTree(repositoryId: String, sha1: String, project: String, projectId: Unit, recursive: Boolean): js.Promise[GitTreeRef] = js.native
    def getTree(
      repositoryId: String,
      sha1: String,
      project: String,
      projectId: Unit,
      recursive: Boolean,
      fileName: String
    ): js.Promise[GitTreeRef] = js.native
    def getTree(
      repositoryId: String,
      sha1: String,
      project: String,
      projectId: Unit,
      recursive: Unit,
      fileName: String
    ): js.Promise[GitTreeRef] = js.native
    def getTree(repositoryId: String, sha1: String, project: Unit, projectId: String): js.Promise[GitTreeRef] = js.native
    def getTree(repositoryId: String, sha1: String, project: Unit, projectId: String, recursive: Boolean): js.Promise[GitTreeRef] = js.native
    def getTree(
      repositoryId: String,
      sha1: String,
      project: Unit,
      projectId: String,
      recursive: Boolean,
      fileName: String
    ): js.Promise[GitTreeRef] = js.native
    def getTree(
      repositoryId: String,
      sha1: String,
      project: Unit,
      projectId: String,
      recursive: Unit,
      fileName: String
    ): js.Promise[GitTreeRef] = js.native
    def getTree(repositoryId: String, sha1: String, project: Unit, projectId: Unit, recursive: Boolean): js.Promise[GitTreeRef] = js.native
    def getTree(
      repositoryId: String,
      sha1: String,
      project: Unit,
      projectId: Unit,
      recursive: Boolean,
      fileName: String
    ): js.Promise[GitTreeRef] = js.native
    def getTree(
      repositoryId: String,
      sha1: String,
      project: Unit,
      projectId: Unit,
      recursive: Unit,
      fileName: String
    ): js.Promise[GitTreeRef] = js.native
    
    def getTreeZip(repositoryId: String, sha1: String): js.Promise[ReadableStream] = js.native
    def getTreeZip(repositoryId: String, sha1: String, project: String): js.Promise[ReadableStream] = js.native
    def getTreeZip(repositoryId: String, sha1: String, project: String, projectId: String): js.Promise[ReadableStream] = js.native
    def getTreeZip(repositoryId: String, sha1: String, project: String, projectId: String, recursive: Boolean): js.Promise[ReadableStream] = js.native
    def getTreeZip(
      repositoryId: String,
      sha1: String,
      project: String,
      projectId: String,
      recursive: Boolean,
      fileName: String
    ): js.Promise[ReadableStream] = js.native
    def getTreeZip(
      repositoryId: String,
      sha1: String,
      project: String,
      projectId: String,
      recursive: Unit,
      fileName: String
    ): js.Promise[ReadableStream] = js.native
    def getTreeZip(repositoryId: String, sha1: String, project: String, projectId: Unit, recursive: Boolean): js.Promise[ReadableStream] = js.native
    def getTreeZip(
      repositoryId: String,
      sha1: String,
      project: String,
      projectId: Unit,
      recursive: Boolean,
      fileName: String
    ): js.Promise[ReadableStream] = js.native
    def getTreeZip(
      repositoryId: String,
      sha1: String,
      project: String,
      projectId: Unit,
      recursive: Unit,
      fileName: String
    ): js.Promise[ReadableStream] = js.native
    def getTreeZip(repositoryId: String, sha1: String, project: Unit, projectId: String): js.Promise[ReadableStream] = js.native
    def getTreeZip(repositoryId: String, sha1: String, project: Unit, projectId: String, recursive: Boolean): js.Promise[ReadableStream] = js.native
    def getTreeZip(
      repositoryId: String,
      sha1: String,
      project: Unit,
      projectId: String,
      recursive: Boolean,
      fileName: String
    ): js.Promise[ReadableStream] = js.native
    def getTreeZip(
      repositoryId: String,
      sha1: String,
      project: Unit,
      projectId: String,
      recursive: Unit,
      fileName: String
    ): js.Promise[ReadableStream] = js.native
    def getTreeZip(repositoryId: String, sha1: String, project: Unit, projectId: Unit, recursive: Boolean): js.Promise[ReadableStream] = js.native
    def getTreeZip(
      repositoryId: String,
      sha1: String,
      project: Unit,
      projectId: Unit,
      recursive: Boolean,
      fileName: String
    ): js.Promise[ReadableStream] = js.native
    def getTreeZip(
      repositoryId: String,
      sha1: String,
      project: Unit,
      projectId: Unit,
      recursive: Unit,
      fileName: String
    ): js.Promise[ReadableStream] = js.native
    
    def queryImportRequests(project: String, repositoryId: String): js.Promise[js.Array[GitImportRequest]] = js.native
    def queryImportRequests(project: String, repositoryId: String, includeAbandoned: Boolean): js.Promise[js.Array[GitImportRequest]] = js.native
    
    def sharePullRequest(userMessage: ShareNotificationContext, repositoryId: String, pullRequestId: Double): js.Promise[Unit] = js.native
    def sharePullRequest(
      userMessage: ShareNotificationContext,
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[Unit] = js.native
    
    def updateComment(comment: Comment, repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double): js.Promise[Comment] = js.native
    def updateComment(
      comment: Comment,
      repositoryId: String,
      pullRequestId: Double,
      threadId: Double,
      commentId: Double,
      project: String
    ): js.Promise[Comment] = js.native
    
    def updateImportRequest(
      importRequestToUpdate: GitImportRequest,
      project: String,
      repositoryId: String,
      importRequestId: Double
    ): js.Promise[GitImportRequest] = js.native
    
    def updatePullRequest(gitPullRequestToUpdate: GitPullRequest, repositoryId: String, pullRequestId: Double): js.Promise[GitPullRequest] = js.native
    def updatePullRequest(
      gitPullRequestToUpdate: GitPullRequest,
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[GitPullRequest] = js.native
    
    def updatePullRequestConflict(conflict: GitConflict, repositoryId: String, pullRequestId: Double, conflictId: Double): js.Promise[GitConflict] = js.native
    def updatePullRequestConflict(
      conflict: GitConflict,
      repositoryId: String,
      pullRequestId: Double,
      conflictId: Double,
      project: String
    ): js.Promise[GitConflict] = js.native
    
    def updatePullRequestConflicts(conflictUpdates: js.Array[GitConflict], repositoryId: String, pullRequestId: Double): js.Promise[js.Array[GitConflictUpdateResult]] = js.native
    def updatePullRequestConflicts(
      conflictUpdates: js.Array[GitConflict],
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[js.Array[GitConflictUpdateResult]] = js.native
    
    def updatePullRequestIterationStatuses(
      customHeaders: Any,
      patchDocument: JsonPatchDocument,
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double
    ): js.Promise[Unit] = js.native
    def updatePullRequestIterationStatuses(
      customHeaders: Any,
      patchDocument: JsonPatchDocument,
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: String
    ): js.Promise[Unit] = js.native
    
    def updatePullRequestProperties(customHeaders: Any, patchDocument: JsonPatchDocument, repositoryId: String, pullRequestId: Double): js.Promise[Any] = js.native
    def updatePullRequestProperties(
      customHeaders: Any,
      patchDocument: JsonPatchDocument,
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[Any] = js.native
    
    def updatePullRequestReviewers(patchVotes: js.Array[IdentityRefWithVote], repositoryId: String, pullRequestId: Double): js.Promise[Unit] = js.native
    def updatePullRequestReviewers(
      patchVotes: js.Array[IdentityRefWithVote],
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[Unit] = js.native
    
    def updatePullRequestStatuses(customHeaders: Any, patchDocument: JsonPatchDocument, repositoryId: String, pullRequestId: Double): js.Promise[Unit] = js.native
    def updatePullRequestStatuses(
      customHeaders: Any,
      patchDocument: JsonPatchDocument,
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[Unit] = js.native
    
    def updateRef(newRefInfo: GitRefUpdate, repositoryId: String, filter: String): js.Promise[GitRef] = js.native
    def updateRef(newRefInfo: GitRefUpdate, repositoryId: String, filter: String, project: String): js.Promise[GitRef] = js.native
    def updateRef(newRefInfo: GitRefUpdate, repositoryId: String, filter: String, project: String, projectId: String): js.Promise[GitRef] = js.native
    def updateRef(newRefInfo: GitRefUpdate, repositoryId: String, filter: String, project: Unit, projectId: String): js.Promise[GitRef] = js.native
    
    def updateRefs(refUpdates: js.Array[GitRefUpdate], repositoryId: String): js.Promise[js.Array[GitRefUpdateResult]] = js.native
    def updateRefs(refUpdates: js.Array[GitRefUpdate], repositoryId: String, project: String): js.Promise[js.Array[GitRefUpdateResult]] = js.native
    def updateRefs(refUpdates: js.Array[GitRefUpdate], repositoryId: String, project: String, projectId: String): js.Promise[js.Array[GitRefUpdateResult]] = js.native
    def updateRefs(refUpdates: js.Array[GitRefUpdate], repositoryId: String, project: Unit, projectId: String): js.Promise[js.Array[GitRefUpdateResult]] = js.native
    
    def updateRepository(newRepositoryInfo: GitRepository, repositoryId: String): js.Promise[GitRepository] = js.native
    def updateRepository(newRepositoryInfo: GitRepository, repositoryId: String, project: String): js.Promise[GitRepository] = js.native
    
    def updateThread(
      commentThread: GitPullRequestCommentThread,
      repositoryId: String,
      pullRequestId: Double,
      threadId: Double
    ): js.Promise[GitPullRequestCommentThread] = js.native
    def updateThread(
      commentThread: GitPullRequestCommentThread,
      repositoryId: String,
      pullRequestId: Double,
      threadId: Double,
      project: String
    ): js.Promise[GitPullRequestCommentThread] = js.native
  }
}
