package typingsJapgolly.fileServicesTypes

import typingsJapgolly.fileServicesTypes.distBaseApiAsyncMod.IBaseFileSystemCallbackActions
import typingsJapgolly.fileServicesTypes.distExtendedApiAsyncMod.IFileSystemPromiseActions
import typingsJapgolly.fileServicesTypes.distExtendedApiSyncMod.IFileSystemSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExtendedApiMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.fileServicesTypes.distPathMod.IFileSystemPath because Already inherited
  - typingsJapgolly.fileServicesTypes.distBaseApiAsyncMod.IBaseFileSystemAsync because var conflicts: caseSensitive, promises, watchService. Inlined 
  - typingsJapgolly.fileServicesTypes.distExtendedApiAsyncMod.IFileSystemAsync because var conflicts: caseSensitive, watchService. Inlined promises */ @js.native
  trait IFileSystem
    extends StObject
       with IFileSystemSync
       with IBaseFileSystemCallbackActions {
    
    var promises: IFileSystemPromiseActions = js.native
  }
}
