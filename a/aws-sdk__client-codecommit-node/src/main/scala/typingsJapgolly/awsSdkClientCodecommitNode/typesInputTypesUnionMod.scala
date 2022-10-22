package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CLOSED
import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FAST_FORWARD_MERGE
import typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.OPEN
import typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryTriggerMod.RepositoryTrigger
import typingsJapgolly.awsSdkClientCodecommitNode.typesTargetMod.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientCodecommitNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesCreateBranchInputMod.CreateBranchInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesCreatePullRequestInputMod.CreatePullRequestInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesCreateRepositoryInputMod.CreateRepositoryInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteBranchInputMod.DeleteBranchInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteCommentContentInputMod.DeleteCommentContentInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteFileInputMod.DeleteFileInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteRepositoryInputMod.DeleteRepositoryInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesDescribePullRequestEventsInputMod.DescribePullRequestEventsInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetBlobInputMod.GetBlobInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetBranchInputMod.GetBranchInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentInputMod.GetCommentInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitInputMod.GetCommentsForComparedCommitInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestInputMod.GetCommentsForPullRequestInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommitInputMod.GetCommitInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetDifferencesInputMod.GetDifferencesInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetFileInputMod.GetFileInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetFolderInputMod.GetFolderInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetPullRequestInputMod.GetPullRequestInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryInputMod.GetRepositoryInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryTriggersInputMod.GetRepositoryTriggersInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesListBranchesInputMod.ListBranchesInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesListPullRequestsInputMod.ListPullRequestsInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesListRepositoriesInputMod.ListRepositoriesInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod.MergePullRequestByFastForwardInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitInputMod.PostCommentForComparedCommitInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForPullRequestInputMod.PostCommentForPullRequestInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentReplyInputMod.PostCommentReplyInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPutFileInputMod.PutFileInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPutRepositoryTriggersInputMod.PutRepositoryTriggersInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesTestRepositoryTriggersInputMod.TestRepositoryTriggersInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateCommentInputMod.UpdateCommentInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionInputMod.UpdatePullRequestDescriptionInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusInputMod.UpdatePullRequestStatusInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleInputMod.UpdatePullRequestTitleInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionInputMod.UpdateRepositoryDescriptionInput
    - typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryNameInputMod.UpdateRepositoryNameInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    inline def BatchGetRepositoriesInput(repositoryNames: js.Array[String] | js.Iterable[String]): typingsJapgolly.awsSdkClientCodecommitNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput = {
      val __obj = js.Dynamic.literal(repositoryNames = repositoryNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput]
    }
    
    inline def CreateBranchInput(branchName: String, commitId: String, repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesCreateBranchInputMod.CreateBranchInput = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesCreateBranchInputMod.CreateBranchInput]
    }
    
    inline def CreatePullRequestInput(targets: js.Array[Target] | js.Iterable[Target], title: String): typingsJapgolly.awsSdkClientCodecommitNode.typesCreatePullRequestInputMod.CreatePullRequestInput = {
      val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesCreatePullRequestInputMod.CreatePullRequestInput]
    }
    
    inline def CreateRepositoryInput(repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesCreateRepositoryInputMod.CreateRepositoryInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesCreateRepositoryInputMod.CreateRepositoryInput]
    }
    
    inline def DeleteBranchInput(branchName: String, repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteBranchInputMod.DeleteBranchInput = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteBranchInputMod.DeleteBranchInput]
    }
    
    inline def DeleteCommentContentInput(commentId: String): typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteCommentContentInputMod.DeleteCommentContentInput = {
      val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteCommentContentInputMod.DeleteCommentContentInput]
    }
    
    inline def DeleteFileInput(branchName: String, filePath: String, parentCommitId: String, repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteFileInputMod.DeleteFileInput = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], parentCommitId = parentCommitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteFileInputMod.DeleteFileInput]
    }
    
    inline def DeleteRepositoryInput(repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteRepositoryInputMod.DeleteRepositoryInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteRepositoryInputMod.DeleteRepositoryInput]
    }
    
    inline def DescribePullRequestEventsInput(pullRequestId: String): typingsJapgolly.awsSdkClientCodecommitNode.typesDescribePullRequestEventsInputMod.DescribePullRequestEventsInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesDescribePullRequestEventsInputMod.DescribePullRequestEventsInput]
    }
    
    inline def GetBlobInput(blobId: String, repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesGetBlobInputMod.GetBlobInput = {
      val __obj = js.Dynamic.literal(blobId = blobId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetBlobInputMod.GetBlobInput]
    }
    
    inline def GetBranchInput(): typingsJapgolly.awsSdkClientCodecommitNode.typesGetBranchInputMod.GetBranchInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetBranchInputMod.GetBranchInput]
    }
    
    inline def GetCommentInput(commentId: String): typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentInputMod.GetCommentInput = {
      val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentInputMod.GetCommentInput]
    }
    
    inline def GetCommentsForComparedCommitInput(afterCommitId: String, repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitInputMod.GetCommentsForComparedCommitInput = {
      val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitInputMod.GetCommentsForComparedCommitInput]
    }
    
    inline def GetCommentsForPullRequestInput(pullRequestId: String): typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestInputMod.GetCommentsForPullRequestInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestInputMod.GetCommentsForPullRequestInput]
    }
    
    inline def GetCommitInput(commitId: String, repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommitInputMod.GetCommitInput = {
      val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommitInputMod.GetCommitInput]
    }
    
    inline def GetDifferencesInput(afterCommitSpecifier: String, repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesGetDifferencesInputMod.GetDifferencesInput = {
      val __obj = js.Dynamic.literal(afterCommitSpecifier = afterCommitSpecifier.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetDifferencesInputMod.GetDifferencesInput]
    }
    
    inline def GetFileInput(filePath: String, repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesGetFileInputMod.GetFileInput = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetFileInputMod.GetFileInput]
    }
    
    inline def GetFolderInput(folderPath: String, repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesGetFolderInputMod.GetFolderInput = {
      val __obj = js.Dynamic.literal(folderPath = folderPath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetFolderInputMod.GetFolderInput]
    }
    
    inline def GetMergeConflictsInput(
      destinationCommitSpecifier: String,
      mergeOption: FAST_FORWARD_MERGE | String,
      repositoryName: String,
      sourceCommitSpecifier: String
    ): typingsJapgolly.awsSdkClientCodecommitNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput = {
      val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier.asInstanceOf[js.Any], mergeOption = mergeOption.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], sourceCommitSpecifier = sourceCommitSpecifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput]
    }
    
    inline def GetPullRequestInput(pullRequestId: String): typingsJapgolly.awsSdkClientCodecommitNode.typesGetPullRequestInputMod.GetPullRequestInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetPullRequestInputMod.GetPullRequestInput]
    }
    
    inline def GetRepositoryInput(repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryInputMod.GetRepositoryInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryInputMod.GetRepositoryInput]
    }
    
    inline def GetRepositoryTriggersInput(repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryTriggersInputMod.GetRepositoryTriggersInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesGetRepositoryTriggersInputMod.GetRepositoryTriggersInput]
    }
    
    inline def ListBranchesInput(repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesListBranchesInputMod.ListBranchesInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesListBranchesInputMod.ListBranchesInput]
    }
    
    inline def ListPullRequestsInput(repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesListPullRequestsInputMod.ListPullRequestsInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesListPullRequestsInputMod.ListPullRequestsInput]
    }
    
    inline def ListRepositoriesInput(): typingsJapgolly.awsSdkClientCodecommitNode.typesListRepositoriesInputMod.ListRepositoriesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesListRepositoriesInputMod.ListRepositoriesInput]
    }
    
    inline def MergePullRequestByFastForwardInput(pullRequestId: String, repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod.MergePullRequestByFastForwardInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod.MergePullRequestByFastForwardInput]
    }
    
    inline def PostCommentForComparedCommitInput(afterCommitId: String, content: String, repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitInputMod.PostCommentForComparedCommitInput = {
      val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitInputMod.PostCommentForComparedCommitInput]
    }
    
    inline def PostCommentForPullRequestInput(
      afterCommitId: String,
      beforeCommitId: String,
      content: String,
      pullRequestId: String,
      repositoryName: String
    ): typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForPullRequestInputMod.PostCommentForPullRequestInput = {
      val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], beforeCommitId = beforeCommitId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForPullRequestInputMod.PostCommentForPullRequestInput]
    }
    
    inline def PostCommentReplyInput(content: String, inReplyTo: String): typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentReplyInputMod.PostCommentReplyInput = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], inReplyTo = inReplyTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentReplyInputMod.PostCommentReplyInput]
    }
    
    inline def PutFileInput(
      branchName: String,
      fileContent: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      filePath: String,
      repositoryName: String
    ): typingsJapgolly.awsSdkClientCodecommitNode.typesPutFileInputMod.PutFileInput = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesPutFileInputMod.PutFileInput]
    }
    
    inline def PutRepositoryTriggersInput(repositoryName: String, triggers: js.Array[RepositoryTrigger] | js.Iterable[RepositoryTrigger]): typingsJapgolly.awsSdkClientCodecommitNode.typesPutRepositoryTriggersInputMod.PutRepositoryTriggersInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesPutRepositoryTriggersInputMod.PutRepositoryTriggersInput]
    }
    
    inline def TestRepositoryTriggersInput(repositoryName: String, triggers: js.Array[RepositoryTrigger] | js.Iterable[RepositoryTrigger]): typingsJapgolly.awsSdkClientCodecommitNode.typesTestRepositoryTriggersInputMod.TestRepositoryTriggersInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesTestRepositoryTriggersInputMod.TestRepositoryTriggersInput]
    }
    
    inline def UpdateCommentInput(commentId: String, content: String): typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateCommentInputMod.UpdateCommentInput = {
      val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateCommentInputMod.UpdateCommentInput]
    }
    
    inline def UpdateDefaultBranchInput(defaultBranchName: String, repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput = {
      val __obj = js.Dynamic.literal(defaultBranchName = defaultBranchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateDefaultBranchInputMod.UpdateDefaultBranchInput]
    }
    
    inline def UpdatePullRequestDescriptionInput(description: String, pullRequestId: String): typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionInputMod.UpdatePullRequestDescriptionInput = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionInputMod.UpdatePullRequestDescriptionInput]
    }
    
    inline def UpdatePullRequestStatusInput(pullRequestId: String, pullRequestStatus: OPEN | CLOSED | String): typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusInputMod.UpdatePullRequestStatusInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], pullRequestStatus = pullRequestStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusInputMod.UpdatePullRequestStatusInput]
    }
    
    inline def UpdatePullRequestTitleInput(pullRequestId: String, title: String): typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleInputMod.UpdatePullRequestTitleInput = {
      val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleInputMod.UpdatePullRequestTitleInput]
    }
    
    inline def UpdateRepositoryDescriptionInput(repositoryName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionInputMod.UpdateRepositoryDescriptionInput = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionInputMod.UpdateRepositoryDescriptionInput]
    }
    
    inline def UpdateRepositoryNameInput(newName: String, oldName: String): typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryNameInputMod.UpdateRepositoryNameInput = {
      val __obj = js.Dynamic.literal(newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryNameInputMod.UpdateRepositoryNameInput]
    }
  }
}
