package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitItem
  extends StObject
     with ItemModel {
  
  /**
    * SHA1 of commit item was fetched at
    */
  var commitId: String
  
  /**
    * Type of object (Commit, Tree, Blob, Tag, ...)
    */
  var gitObjectType: GitObjectType
  
  /**
    * Shallow ref to commit that last changed this item Only populated if latestProcessedChange is requested May not be accurate if latest change is not yet cached
    */
  var latestProcessedChange: GitCommitRef
  
  /**
    * Git object id
    */
  var objectId: String
  
  /**
    * Git object id
    */
  var originalObjectId: String
}
object GitItem {
  
  inline def apply(
    _links: Any,
    commitId: String,
    contentMetadata: FileContentMetadata,
    gitObjectType: GitObjectType,
    isFolder: Boolean,
    isSymLink: Boolean,
    latestProcessedChange: GitCommitRef,
    objectId: String,
    originalObjectId: String,
    path: String,
    url: String
  ): GitItem = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], contentMetadata = contentMetadata.asInstanceOf[js.Any], gitObjectType = gitObjectType.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], isSymLink = isSymLink.asInstanceOf[js.Any], latestProcessedChange = latestProcessedChange.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], originalObjectId = originalObjectId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitItem]
  }
  
  extension [Self <: GitItem](x: Self) {
    
    inline def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setGitObjectType(value: GitObjectType): Self = StObject.set(x, "gitObjectType", value.asInstanceOf[js.Any])
    
    inline def setLatestProcessedChange(value: GitCommitRef): Self = StObject.set(x, "latestProcessedChange", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setOriginalObjectId(value: String): Self = StObject.set(x, "originalObjectId", value.asInstanceOf[js.Any])
  }
}
