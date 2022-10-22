package typingsJapgolly.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetActionsRequestedOptions extends StObject {
  
  /** The path of the entry to return the list of actions for. */
  var entryPath: String
  
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String
  
  /** The unique identifier of this request. */
  var requestId: Double
}
object GetActionsRequestedOptions {
  
  inline def apply(entryPath: String, fileSystemId: String, requestId: Double): GetActionsRequestedOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActionsRequestedOptions]
  }
  
  extension [Self <: GetActionsRequestedOptions](x: Self) {
    
    inline def setEntryPath(value: String): Self = StObject.set(x, "entryPath", value.asInstanceOf[js.Any])
    
    inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
