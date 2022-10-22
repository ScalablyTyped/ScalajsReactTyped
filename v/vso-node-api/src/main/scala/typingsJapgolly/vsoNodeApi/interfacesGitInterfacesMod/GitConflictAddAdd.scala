package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitConflictAddAdd
  extends StObject
     with GitConflict {
  
  var resolution: GitResolutionMergeContent
  
  var sourceBlob: GitBlobRef
  
  var targetBlob: GitBlobRef
}
object GitConflictAddAdd {
  
  inline def apply(
    _links: Any,
    conflictId: Double,
    conflictPath: String,
    conflictType: GitConflictType,
    mergeBaseCommit: GitCommitRef,
    mergeOrigin: GitMergeOriginRef,
    mergeSourceCommit: GitCommitRef,
    mergeTargetCommit: GitCommitRef,
    resolution: GitResolutionMergeContent,
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: IdentityRef,
    resolvedDate: js.Date,
    sourceBlob: GitBlobRef,
    targetBlob: GitBlobRef,
    url: String
  ): GitConflictAddAdd = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], conflictId = conflictId.asInstanceOf[js.Any], conflictPath = conflictPath.asInstanceOf[js.Any], conflictType = conflictType.asInstanceOf[js.Any], mergeBaseCommit = mergeBaseCommit.asInstanceOf[js.Any], mergeOrigin = mergeOrigin.asInstanceOf[js.Any], mergeSourceCommit = mergeSourceCommit.asInstanceOf[js.Any], mergeTargetCommit = mergeTargetCommit.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], resolutionError = resolutionError.asInstanceOf[js.Any], resolutionStatus = resolutionStatus.asInstanceOf[js.Any], resolvedBy = resolvedBy.asInstanceOf[js.Any], resolvedDate = resolvedDate.asInstanceOf[js.Any], sourceBlob = sourceBlob.asInstanceOf[js.Any], targetBlob = targetBlob.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConflictAddAdd]
  }
  
  extension [Self <: GitConflictAddAdd](x: Self) {
    
    inline def setResolution(value: GitResolutionMergeContent): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setSourceBlob(value: GitBlobRef): Self = StObject.set(x, "sourceBlob", value.asInstanceOf[js.Any])
    
    inline def setTargetBlob(value: GitBlobRef): Self = StObject.set(x, "targetBlob", value.asInstanceOf[js.Any])
  }
}
