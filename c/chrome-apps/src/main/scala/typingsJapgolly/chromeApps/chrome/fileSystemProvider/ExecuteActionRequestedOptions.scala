package typingsJapgolly.chromeApps.chrome.fileSystemProvider

import typingsJapgolly.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since Chrome 45. */
trait ExecuteActionRequestedOptions extends StObject {
  
  /** The identifier of the action to be executed. */
  var actionId: String
  
  /** The path of the entry to be used for the action. */
  var entryPath: String
  
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String
  
  /** The unique identifier of this request. */
  var requestId: integer
}
object ExecuteActionRequestedOptions {
  
  inline def apply(actionId: String, entryPath: String, fileSystemId: String, requestId: integer): ExecuteActionRequestedOptions = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteActionRequestedOptions]
  }
  
  extension [Self <: ExecuteActionRequestedOptions](x: Self) {
    
    inline def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setEntryPath(value: String): Self = StObject.set(x, "entryPath", value.asInstanceOf[js.Any])
    
    inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: integer): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
