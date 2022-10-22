package typingsJapgolly.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDescribeMergeConflictsInput extends StObject {
  
  /**
    * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is considered not mergeable if the same file in both branches has differences on the same line.
    */
  var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined
  
  /**
    * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation is successful.
    */
  var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined
  
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var destinationCommitSpecifier: CommitName
  
  /**
    * The path of the target files used to describe the conflicts. If not specified, the default is all conflict files.
    */
  var filePaths: js.UndefOr[FilePaths] = js.undefined
  
  /**
    * The maximum number of files to include in the output.
    */
  var maxConflictFiles: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The maximum number of merge hunks to include in the output.
    */
  var maxMergeHunks: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The merge option or strategy you want to use to merge the code.
    */
  var mergeOption: MergeOptionTypeEnum
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The name of the repository that contains the merge conflicts you want to review.
    */
  var repositoryName: RepositoryName
  
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var sourceCommitSpecifier: CommitName
}
object BatchDescribeMergeConflictsInput {
  
  inline def apply(
    destinationCommitSpecifier: CommitName,
    mergeOption: MergeOptionTypeEnum,
    repositoryName: RepositoryName,
    sourceCommitSpecifier: CommitName
  ): BatchDescribeMergeConflictsInput = {
    val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier.asInstanceOf[js.Any], mergeOption = mergeOption.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], sourceCommitSpecifier = sourceCommitSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeMergeConflictsInput]
  }
  
  extension [Self <: BatchDescribeMergeConflictsInput](x: Self) {
    
    inline def setConflictDetailLevel(value: ConflictDetailLevelTypeEnum): Self = StObject.set(x, "conflictDetailLevel", value.asInstanceOf[js.Any])
    
    inline def setConflictDetailLevelUndefined: Self = StObject.set(x, "conflictDetailLevel", js.undefined)
    
    inline def setConflictResolutionStrategy(value: ConflictResolutionStrategyTypeEnum): Self = StObject.set(x, "conflictResolutionStrategy", value.asInstanceOf[js.Any])
    
    inline def setConflictResolutionStrategyUndefined: Self = StObject.set(x, "conflictResolutionStrategy", js.undefined)
    
    inline def setDestinationCommitSpecifier(value: CommitName): Self = StObject.set(x, "destinationCommitSpecifier", value.asInstanceOf[js.Any])
    
    inline def setFilePaths(value: FilePaths): Self = StObject.set(x, "filePaths", value.asInstanceOf[js.Any])
    
    inline def setFilePathsUndefined: Self = StObject.set(x, "filePaths", js.undefined)
    
    inline def setFilePathsVarargs(value: Path*): Self = StObject.set(x, "filePaths", js.Array(value*))
    
    inline def setMaxConflictFiles(value: MaxResults): Self = StObject.set(x, "maxConflictFiles", value.asInstanceOf[js.Any])
    
    inline def setMaxConflictFilesUndefined: Self = StObject.set(x, "maxConflictFiles", js.undefined)
    
    inline def setMaxMergeHunks(value: MaxResults): Self = StObject.set(x, "maxMergeHunks", value.asInstanceOf[js.Any])
    
    inline def setMaxMergeHunksUndefined: Self = StObject.set(x, "maxMergeHunks", js.undefined)
    
    inline def setMergeOption(value: MergeOptionTypeEnum): Self = StObject.set(x, "mergeOption", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setSourceCommitSpecifier(value: CommitName): Self = StObject.set(x, "sourceCommitSpecifier", value.asInstanceOf[js.Any])
  }
}
