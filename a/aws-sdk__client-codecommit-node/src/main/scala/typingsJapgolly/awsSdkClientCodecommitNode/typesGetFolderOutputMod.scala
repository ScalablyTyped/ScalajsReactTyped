package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesFileMod.UnmarshalledFile
import typingsJapgolly.awsSdkClientCodecommitNode.typesFolderMod.UnmarshalledFolder
import typingsJapgolly.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesSubModuleMod.UnmarshalledSubModule
import typingsJapgolly.awsSdkClientCodecommitNode.typesSymbolicLinkMod.UnmarshalledSymbolicLink
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetFolderOutputMod {
  
  trait GetFolderOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The full commit ID used as a reference for which version of the folder content is returned.</p>
      */
    var commitId: String
    
    /**
      * <p>The list of files that exist in the specified folder, if any.</p>
      */
    var files: js.UndefOr[js.Array[UnmarshalledFile]] = js.undefined
    
    /**
      * <p>The fully-qualified path of the folder whose contents are returned.</p>
      */
    var folderPath: String
    
    /**
      * <p>The list of folders that exist beneath the specified folder, if any.</p>
      */
    var subFolders: js.UndefOr[js.Array[UnmarshalledFolder]] = js.undefined
    
    /**
      * <p>The list of submodules that exist in the specified folder, if any.</p>
      */
    var subModules: js.UndefOr[js.Array[UnmarshalledSubModule]] = js.undefined
    
    /**
      * <p>The list of symbolic links to other files and folders that exist in the specified folder, if any.</p>
      */
    var symbolicLinks: js.UndefOr[js.Array[UnmarshalledSymbolicLink]] = js.undefined
    
    /**
      * <p>The full SHA-1 pointer of the tree information for the commit that contains the folder.</p>
      */
    var treeId: js.UndefOr[String] = js.undefined
  }
  object GetFolderOutput {
    
    inline def apply($metadata: ResponseMetadata, commitId: String, folderPath: String): GetFolderOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFolderOutput]
    }
    
    extension [Self <: GetFolderOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: js.Array[UnmarshalledFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: UnmarshalledFile*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFolderPath(value: String): Self = StObject.set(x, "folderPath", value.asInstanceOf[js.Any])
      
      inline def setSubFolders(value: js.Array[UnmarshalledFolder]): Self = StObject.set(x, "subFolders", value.asInstanceOf[js.Any])
      
      inline def setSubFoldersUndefined: Self = StObject.set(x, "subFolders", js.undefined)
      
      inline def setSubFoldersVarargs(value: UnmarshalledFolder*): Self = StObject.set(x, "subFolders", js.Array(value*))
      
      inline def setSubModules(value: js.Array[UnmarshalledSubModule]): Self = StObject.set(x, "subModules", value.asInstanceOf[js.Any])
      
      inline def setSubModulesUndefined: Self = StObject.set(x, "subModules", js.undefined)
      
      inline def setSubModulesVarargs(value: UnmarshalledSubModule*): Self = StObject.set(x, "subModules", js.Array(value*))
      
      inline def setSymbolicLinks(value: js.Array[UnmarshalledSymbolicLink]): Self = StObject.set(x, "symbolicLinks", value.asInstanceOf[js.Any])
      
      inline def setSymbolicLinksUndefined: Self = StObject.set(x, "symbolicLinks", js.undefined)
      
      inline def setSymbolicLinksVarargs(value: UnmarshalledSymbolicLink*): Self = StObject.set(x, "symbolicLinks", js.Array(value*))
      
      inline def setTreeId(value: String): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
      
      inline def setTreeIdUndefined: Self = StObject.set(x, "treeId", js.undefined)
    }
  }
}
