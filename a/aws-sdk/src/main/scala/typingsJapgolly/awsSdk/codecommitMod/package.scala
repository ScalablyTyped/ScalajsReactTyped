package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codecommitMod {
  type AccountId = java.lang.String
  type AdditionalData = java.lang.String
  type ApprovalList = js.Array[typingsJapgolly.awsSdk.codecommitMod.Approval]
  type ApprovalRuleContent = java.lang.String
  type ApprovalRuleId = java.lang.String
  type ApprovalRuleName = java.lang.String
  type ApprovalRuleTemplateContent = java.lang.String
  type ApprovalRuleTemplateDescription = java.lang.String
  type ApprovalRuleTemplateId = java.lang.String
  type ApprovalRuleTemplateName = java.lang.String
  type ApprovalRuleTemplateNameList = js.Array[typingsJapgolly.awsSdk.codecommitMod.ApprovalRuleTemplateName]
  type ApprovalRulesList = js.Array[typingsJapgolly.awsSdk.codecommitMod.ApprovalRule]
  type ApprovalRulesNotSatisfiedList = js.Array[typingsJapgolly.awsSdk.codecommitMod.ApprovalRuleName]
  type ApprovalRulesSatisfiedList = js.Array[typingsJapgolly.awsSdk.codecommitMod.ApprovalRuleName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.APPROVE
    - typingsJapgolly.awsSdk.awsSdkStrings.REVOKE
    - java.lang.String
  */
  type ApprovalState = typingsJapgolly.awsSdk.codecommitMod._ApprovalState | java.lang.String
  type Approved = scala.Boolean
  type Arn = java.lang.String
  type BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList = js.Array[
    typingsJapgolly.awsSdk.codecommitMod.BatchAssociateApprovalRuleTemplateWithRepositoriesError
  ]
  type BatchDescribeMergeConflictsErrors = js.Array[typingsJapgolly.awsSdk.codecommitMod.BatchDescribeMergeConflictsError]
  type BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList = js.Array[
    typingsJapgolly.awsSdk.codecommitMod.BatchDisassociateApprovalRuleTemplateFromRepositoriesError
  ]
  type BatchGetCommitsErrorsList = js.Array[typingsJapgolly.awsSdk.codecommitMod.BatchGetCommitsError]
  type BranchName = java.lang.String
  type BranchNameList = js.Array[typingsJapgolly.awsSdk.codecommitMod.BranchName]
  type CapitalBoolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.A
    - typingsJapgolly.awsSdk.awsSdkStrings.M
    - typingsJapgolly.awsSdk.awsSdkStrings.D
    - java.lang.String
  */
  type ChangeTypeEnum = typingsJapgolly.awsSdk.codecommitMod._ChangeTypeEnum | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.codecommitMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CloneUrlHttp = java.lang.String
  type CloneUrlSsh = java.lang.String
  type CommentId = java.lang.String
  type Comments = js.Array[typingsJapgolly.awsSdk.codecommitMod.Comment]
  type CommentsForComparedCommitData = js.Array[typingsJapgolly.awsSdk.codecommitMod.CommentsForComparedCommit]
  type CommentsForPullRequestData = js.Array[typingsJapgolly.awsSdk.codecommitMod.CommentsForPullRequest]
  type CommitId = java.lang.String
  type CommitIdsInputList = js.Array[typingsJapgolly.awsSdk.codecommitMod.ObjectId]
  type CommitName = java.lang.String
  type CommitObjectsList = js.Array[typingsJapgolly.awsSdk.codecommitMod.Commit]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FILE_LEVEL
    - typingsJapgolly.awsSdk.awsSdkStrings.LINE_LEVEL
    - java.lang.String
  */
  type ConflictDetailLevelTypeEnum = typingsJapgolly.awsSdk.codecommitMod._ConflictDetailLevelTypeEnum | java.lang.String
  type ConflictMetadataList = js.Array[typingsJapgolly.awsSdk.codecommitMod.ConflictMetadata]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCEPT_SOURCE
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCEPT_DESTINATION
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMERGE
    - java.lang.String
  */
  type ConflictResolutionStrategyTypeEnum = typingsJapgolly.awsSdk.codecommitMod._ConflictResolutionStrategyTypeEnum | java.lang.String
  type Conflicts = js.Array[typingsJapgolly.awsSdk.codecommitMod.Conflict]
  type Content = java.lang.String
  type CreationDate = js.Date
  type Date = java.lang.String
  type DeleteFileEntries = js.Array[typingsJapgolly.awsSdk.codecommitMod.DeleteFileEntry]
  type Description = java.lang.String
  type DifferenceList = js.Array[typingsJapgolly.awsSdk.codecommitMod.Difference]
  type Email = java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type EventDate = js.Date
  type ExceptionName = java.lang.String
  type FileContent = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.codecommitMod.Blob_ | java.lang.String
  type FileList = js.Array[typingsJapgolly.awsSdk.codecommitMod.File]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.NORMAL
    - typingsJapgolly.awsSdk.awsSdkStrings.SYMLINK
    - java.lang.String
  */
  type FileModeTypeEnum = typingsJapgolly.awsSdk.codecommitMod._FileModeTypeEnum | java.lang.String
  type FilePaths = js.Array[typingsJapgolly.awsSdk.codecommitMod.Path]
  type FileSize = scala.Double
  type FilesMetadata = js.Array[typingsJapgolly.awsSdk.codecommitMod.FileMetadata]
  type FolderList = js.Array[typingsJapgolly.awsSdk.codecommitMod.Folder]
  type HunkContent = java.lang.String
  type IsCommentDeleted = scala.Boolean
  type IsContentConflict = scala.Boolean
  type IsFileModeConflict = scala.Boolean
  type IsHunkConflict = scala.Boolean
  type IsMergeable = scala.Boolean
  type IsMerged = scala.Boolean
  type IsMove = scala.Boolean
  type IsObjectTypeConflict = scala.Boolean
  type KeepEmptyFolders = scala.Boolean
  type LastModifiedDate = js.Date
  type Limit = scala.Double
  type LineNumber = scala.Double
  type MaxResults = scala.Double
  type MergeHunks = js.Array[typingsJapgolly.awsSdk.codecommitMod.MergeHunk]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FAST_FORWARD_MERGE
    - typingsJapgolly.awsSdk.awsSdkStrings.SQUASH_MERGE
    - typingsJapgolly.awsSdk.awsSdkStrings.THREE_WAY_MERGE
    - java.lang.String
  */
  type MergeOptionTypeEnum = typingsJapgolly.awsSdk.codecommitMod._MergeOptionTypeEnum | java.lang.String
  type MergeOptions = js.Array[typingsJapgolly.awsSdk.codecommitMod.MergeOptionTypeEnum]
  type Message = java.lang.String
  type Mode = java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type NumberOfConflicts = scala.Double
  type ObjectId = java.lang.String
  type ObjectSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FILE
    - typingsJapgolly.awsSdk.awsSdkStrings.DIRECTORY
    - typingsJapgolly.awsSdk.awsSdkStrings.GIT_LINK
    - typingsJapgolly.awsSdk.awsSdkStrings.SYMBOLIC_LINK
    - java.lang.String
  */
  type ObjectTypeEnum = typingsJapgolly.awsSdk.codecommitMod._ObjectTypeEnum | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ascending__
    - typingsJapgolly.awsSdk.awsSdkStrings.descending__
    - java.lang.String
  */
  type OrderEnum = typingsJapgolly.awsSdk.codecommitMod._OrderEnum | java.lang.String
  type Overridden = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OVERRIDE
    - typingsJapgolly.awsSdk.awsSdkStrings.REVOKE
    - java.lang.String
  */
  type OverrideStatus = typingsJapgolly.awsSdk.codecommitMod._OverrideStatus | java.lang.String
  type ParentList = js.Array[typingsJapgolly.awsSdk.codecommitMod.ObjectId]
  type Path = java.lang.String
  type Position = scala.Double
  type PullRequestEventList = js.Array[typingsJapgolly.awsSdk.codecommitMod.PullRequestEvent]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PULL_REQUEST_CREATED
    - typingsJapgolly.awsSdk.awsSdkStrings.PULL_REQUEST_STATUS_CHANGED
    - typingsJapgolly.awsSdk.awsSdkStrings.PULL_REQUEST_SOURCE_REFERENCE_UPDATED
    - typingsJapgolly.awsSdk.awsSdkStrings.PULL_REQUEST_MERGE_STATE_CHANGED
    - typingsJapgolly.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_RULE_CREATED
    - typingsJapgolly.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_RULE_UPDATED
    - typingsJapgolly.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_RULE_DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN
    - typingsJapgolly.awsSdk.awsSdkStrings.PULL_REQUEST_APPROVAL_STATE_CHANGED
    - java.lang.String
  */
  type PullRequestEventType = typingsJapgolly.awsSdk.codecommitMod._PullRequestEventType | java.lang.String
  type PullRequestId = java.lang.String
  type PullRequestIdList = js.Array[typingsJapgolly.awsSdk.codecommitMod.PullRequestId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OPEN
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type PullRequestStatusEnum = typingsJapgolly.awsSdk.codecommitMod._PullRequestStatusEnum | java.lang.String
  type PullRequestTargetList = js.Array[typingsJapgolly.awsSdk.codecommitMod.PullRequestTarget]
  type PutFileEntries = js.Array[typingsJapgolly.awsSdk.codecommitMod.PutFileEntry]
  type ReferenceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BEFORE
    - typingsJapgolly.awsSdk.awsSdkStrings.AFTER
    - java.lang.String
  */
  type RelativeFileVersionEnum = typingsJapgolly.awsSdk.codecommitMod._RelativeFileVersionEnum | java.lang.String
  type ReplaceContentEntries = js.Array[typingsJapgolly.awsSdk.codecommitMod.ReplaceContentEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.KEEP_BASE
    - typingsJapgolly.awsSdk.awsSdkStrings.KEEP_SOURCE
    - typingsJapgolly.awsSdk.awsSdkStrings.KEEP_DESTINATION
    - typingsJapgolly.awsSdk.awsSdkStrings.USE_NEW_CONTENT
    - java.lang.String
  */
  type ReplacementTypeEnum = typingsJapgolly.awsSdk.codecommitMod._ReplacementTypeEnum | java.lang.String
  type RepositoryDescription = java.lang.String
  type RepositoryId = java.lang.String
  type RepositoryMetadataList = js.Array[typingsJapgolly.awsSdk.codecommitMod.RepositoryMetadata]
  type RepositoryName = java.lang.String
  type RepositoryNameIdPairList = js.Array[typingsJapgolly.awsSdk.codecommitMod.RepositoryNameIdPair]
  type RepositoryNameList = js.Array[typingsJapgolly.awsSdk.codecommitMod.RepositoryName]
  type RepositoryNotFoundList = js.Array[typingsJapgolly.awsSdk.codecommitMod.RepositoryName]
  type RepositoryTriggerCustomData = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.all__
    - typingsJapgolly.awsSdk.awsSdkStrings.updateReference
    - typingsJapgolly.awsSdk.awsSdkStrings.createReference
    - typingsJapgolly.awsSdk.awsSdkStrings.deleteReference
    - java.lang.String
  */
  type RepositoryTriggerEventEnum = typingsJapgolly.awsSdk.codecommitMod._RepositoryTriggerEventEnum | java.lang.String
  type RepositoryTriggerEventList = js.Array[typingsJapgolly.awsSdk.codecommitMod.RepositoryTriggerEventEnum]
  type RepositoryTriggerExecutionFailureList = js.Array[typingsJapgolly.awsSdk.codecommitMod.RepositoryTriggerExecutionFailure]
  type RepositoryTriggerExecutionFailureMessage = java.lang.String
  type RepositoryTriggerName = java.lang.String
  type RepositoryTriggerNameList = js.Array[typingsJapgolly.awsSdk.codecommitMod.RepositoryTriggerName]
  type RepositoryTriggersConfigurationId = java.lang.String
  type RepositoryTriggersList = js.Array[typingsJapgolly.awsSdk.codecommitMod.RepositoryTrigger]
  type ResourceArn = java.lang.String
  type RevisionId = java.lang.String
  type RuleContentSha256 = java.lang.String
  type SetFileModeEntries = js.Array[typingsJapgolly.awsSdk.codecommitMod.SetFileModeEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.repositoryName
    - typingsJapgolly.awsSdk.awsSdkStrings.lastModifiedDate_
    - java.lang.String
  */
  type SortByEnum = typingsJapgolly.awsSdk.codecommitMod._SortByEnum | java.lang.String
  type SubModuleList = js.Array[typingsJapgolly.awsSdk.codecommitMod.SubModule]
  type SymbolicLinkList = js.Array[typingsJapgolly.awsSdk.codecommitMod.SymbolicLink]
  type TagKey = java.lang.String
  type TagKeysList = js.Array[typingsJapgolly.awsSdk.codecommitMod.TagKey]
  type TagValue = java.lang.String
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.codecommitMod.TagValue]
  type TargetList = js.Array[typingsJapgolly.awsSdk.codecommitMod.Target]
  type Title = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-04-13`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.codecommitMod._apiVersion | java.lang.String
  type blob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.codecommitMod.Blob_ | java.lang.String
}
