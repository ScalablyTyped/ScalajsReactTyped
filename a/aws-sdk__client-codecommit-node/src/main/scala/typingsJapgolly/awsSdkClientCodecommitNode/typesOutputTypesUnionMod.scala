package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EXECUTABLE
import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NORMAL
import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SYMLINK
import typingsJapgolly.awsSdkClientCodecommitNode.typesCommitMod.UnmarshalledCommit
import typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestEventMod.UnmarshalledPullRequestEvent
import typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestMod.UnmarshalledPullRequest
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOutputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesCreateBranchOutputMod.CreateBranchOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesCreatePullRequestOutputMod.CreatePullRequestOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod.CreateRepositoryOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod.DeleteBranchOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteCommentContentOutputMod.DeleteCommentContentOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteFileOutputMod.DeleteFileOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteRepositoryOutputMod.DeleteRepositoryOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesDescribePullRequestEventsOutputMod.DescribePullRequestEventsOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetBlobOutputMod.GetBlobOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetBranchOutputMod.GetBranchOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentOutputMod.GetCommentOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitOutputMod.GetCommentsForComparedCommitOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod.GetCommentsForPullRequestOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommitOutputMod.GetCommitOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod.GetDifferencesOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetFileOutputMod.GetFileOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetFolderOutputMod.GetFolderOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetPullRequestOutputMod.GetPullRequestOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod.GetRepositoryOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryTriggersOutputMod.GetRepositoryTriggersOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesListBranchesOutputMod.ListBranchesOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesListPullRequestsOutputMod.ListPullRequestsOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesListRepositoriesOutputMod.ListRepositoriesOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardOutputMod.MergePullRequestByFastForwardOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod.PostCommentForComparedCommitOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod.PostCommentForPullRequestOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentReplyOutputMod.PostCommentReplyOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPutFileOutputMod.PutFileOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPutRepositoryTriggersOutputMod.PutRepositoryTriggersOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod.TestRepositoryTriggersOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateCommentOutputMod.UpdateCommentOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionOutputMod.UpdatePullRequestDescriptionOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusOutputMod.UpdatePullRequestStatusOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleOutputMod.UpdatePullRequestTitleOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionOutputMod.UpdateRepositoryDescriptionOutput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryNameOutputMod.UpdateRepositoryNameOutput
  */
  trait OutputTypesUnion extends StObject
  object OutputTypesUnion {
    
    inline def BatchGetRepositoriesOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput]
    }
    
    inline def CreateBranchOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesCreateBranchOutputMod.CreateBranchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesCreateBranchOutputMod.CreateBranchOutput]
    }
    
    inline def CreatePullRequestOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typingsJapgolly.awsSdkClientCodecommitNode.typesCreatePullRequestOutputMod.CreatePullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesCreatePullRequestOutputMod.CreatePullRequestOutput]
    }
    
    inline def CreateRepositoryOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod.CreateRepositoryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod.CreateRepositoryOutput]
    }
    
    inline def DeleteBranchOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod.DeleteBranchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod.DeleteBranchOutput]
    }
    
    inline def DeleteCommentContentOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteCommentContentOutputMod.DeleteCommentContentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteCommentContentOutputMod.DeleteCommentContentOutput]
    }
    
    inline def DeleteFileOutput($metadata: ResponseMetadata, blobId: String, commitId: String, filePath: String, treeId: String): typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteFileOutputMod.DeleteFileOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteFileOutputMod.DeleteFileOutput]
    }
    
    inline def DeleteRepositoryOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteRepositoryOutputMod.DeleteRepositoryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteRepositoryOutputMod.DeleteRepositoryOutput]
    }
    
    inline def DescribePullRequestEventsOutput($metadata: ResponseMetadata, pullRequestEvents: js.Array[UnmarshalledPullRequestEvent]): typingsJapgolly.awsSdkClientCodecommitNode.typesDescribePullRequestEventsOutputMod.DescribePullRequestEventsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequestEvents = pullRequestEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesDescribePullRequestEventsOutputMod.DescribePullRequestEventsOutput]
    }
    
    inline def GetBlobOutput($metadata: ResponseMetadata, content: js.typedarray.Uint8Array): typingsJapgolly.awsSdkClientCodecommitNode.typesGetBlobOutputMod.GetBlobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetBlobOutputMod.GetBlobOutput]
    }
    
    inline def GetBranchOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesGetBranchOutputMod.GetBranchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetBranchOutputMod.GetBranchOutput]
    }
    
    inline def GetCommentOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentOutputMod.GetCommentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentOutputMod.GetCommentOutput]
    }
    
    inline def GetCommentsForComparedCommitOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitOutputMod.GetCommentsForComparedCommitOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitOutputMod.GetCommentsForComparedCommitOutput]
    }
    
    inline def GetCommentsForPullRequestOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod.GetCommentsForPullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod.GetCommentsForPullRequestOutput]
    }
    
    inline def GetCommitOutput($metadata: ResponseMetadata, commit: UnmarshalledCommit): typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommitOutputMod.GetCommitOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommitOutputMod.GetCommitOutput]
    }
    
    inline def GetDifferencesOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod.GetDifferencesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod.GetDifferencesOutput]
    }
    
    inline def GetFileOutput(
      $metadata: ResponseMetadata,
      blobId: String,
      commitId: String,
      fileContent: js.typedarray.Uint8Array,
      fileMode: EXECUTABLE | NORMAL | SYMLINK | String,
      filePath: String,
      fileSize: Double
    ): typingsJapgolly.awsSdkClientCodecommitNode.typesGetFileOutputMod.GetFileOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], fileMode = fileMode.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetFileOutputMod.GetFileOutput]
    }
    
    inline def GetFolderOutput($metadata: ResponseMetadata, commitId: String, folderPath: String): typingsJapgolly.awsSdkClientCodecommitNode.typesGetFolderOutputMod.GetFolderOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetFolderOutputMod.GetFolderOutput]
    }
    
    inline def GetMergeConflictsOutput(
      $metadata: ResponseMetadata,
      destinationCommitId: String,
      mergeable: Boolean,
      sourceCommitId: String
    ): typingsJapgolly.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput]
    }
    
    inline def GetPullRequestOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typingsJapgolly.awsSdkClientCodecommitNode.typesGetPullRequestOutputMod.GetPullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetPullRequestOutputMod.GetPullRequestOutput]
    }
    
    inline def GetRepositoryOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod.GetRepositoryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod.GetRepositoryOutput]
    }
    
    inline def GetRepositoryTriggersOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryTriggersOutputMod.GetRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryTriggersOutputMod.GetRepositoryTriggersOutput]
    }
    
    inline def ListBranchesOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesListBranchesOutputMod.ListBranchesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesListBranchesOutputMod.ListBranchesOutput]
    }
    
    inline def ListPullRequestsOutput($metadata: ResponseMetadata, pullRequestIds: js.Array[String]): typingsJapgolly.awsSdkClientCodecommitNode.typesListPullRequestsOutputMod.ListPullRequestsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequestIds = pullRequestIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesListPullRequestsOutputMod.ListPullRequestsOutput]
    }
    
    inline def ListRepositoriesOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesListRepositoriesOutputMod.ListRepositoriesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesListRepositoriesOutputMod.ListRepositoriesOutput]
    }
    
    inline def MergePullRequestByFastForwardOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardOutputMod.MergePullRequestByFastForwardOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardOutputMod.MergePullRequestByFastForwardOutput]
    }
    
    inline def PostCommentForComparedCommitOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod.PostCommentForComparedCommitOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod.PostCommentForComparedCommitOutput]
    }
    
    inline def PostCommentForPullRequestOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod.PostCommentForPullRequestOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod.PostCommentForPullRequestOutput]
    }
    
    inline def PostCommentReplyOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentReplyOutputMod.PostCommentReplyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentReplyOutputMod.PostCommentReplyOutput]
    }
    
    inline def PutFileOutput($metadata: ResponseMetadata, blobId: String, commitId: String, treeId: String): typingsJapgolly.awsSdkClientCodecommitNode.typesPutFileOutputMod.PutFileOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesPutFileOutputMod.PutFileOutput]
    }
    
    inline def PutRepositoryTriggersOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesPutRepositoryTriggersOutputMod.PutRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesPutRepositoryTriggersOutputMod.PutRepositoryTriggersOutput]
    }
    
    inline def TestRepositoryTriggersOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod.TestRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod.TestRepositoryTriggersOutput]
    }
    
    inline def UpdateCommentOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateCommentOutputMod.UpdateCommentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateCommentOutputMod.UpdateCommentOutput]
    }
    
    inline def UpdateDefaultBranchOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateDefaultBranchOutputMod.UpdateDefaultBranchOutput]
    }
    
    inline def UpdatePullRequestDescriptionOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionOutputMod.UpdatePullRequestDescriptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionOutputMod.UpdatePullRequestDescriptionOutput]
    }
    
    inline def UpdatePullRequestStatusOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusOutputMod.UpdatePullRequestStatusOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusOutputMod.UpdatePullRequestStatusOutput]
    }
    
    inline def UpdatePullRequestTitleOutput($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleOutputMod.UpdatePullRequestTitleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleOutputMod.UpdatePullRequestTitleOutput]
    }
    
    inline def UpdateRepositoryDescriptionOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionOutputMod.UpdateRepositoryDescriptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionOutputMod.UpdateRepositoryDescriptionOutput]
    }
    
    inline def UpdateRepositoryNameOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryNameOutputMod.UpdateRepositoryNameOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryNameOutputMod.UpdateRepositoryNameOutput]
    }
  }
}
