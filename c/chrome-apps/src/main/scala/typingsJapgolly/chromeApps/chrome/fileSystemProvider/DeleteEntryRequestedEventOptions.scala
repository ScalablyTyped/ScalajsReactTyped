package typingsJapgolly.chromeApps.chrome.fileSystemProvider

import typingsJapgolly.chromeApps.chrome.fileSystemProvider.internal.EntryPathRequestedEventOptions
import typingsJapgolly.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEntryRequestedEventOptions
  extends StObject
     with EntryPathRequestedEventOptions {
  
  /** Whether the operation is recursive (for directories only). */
  var recursive: Boolean
}
object DeleteEntryRequestedEventOptions {
  
  inline def apply(entryPath: String, fileSystemId: String, recursive: Boolean, requestId: integer): DeleteEntryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEntryRequestedEventOptions]
  }
  
  extension [Self <: DeleteEntryRequestedEventOptions](x: Self) {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
