package typingsJapgolly.chromeApps.chrome.fileSystemProvider

import typingsJapgolly.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typingsJapgolly.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetActionsRequestedEventOptions
  extends StObject
     with RequestedEventOptions {
  
  /** The path of the entry to which this operation is related to. */
  var entryPaths: js.Array[String]
}
object GetActionsRequestedEventOptions {
  
  inline def apply(entryPaths: js.Array[String], fileSystemId: String, requestId: integer): GetActionsRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPaths = entryPaths.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActionsRequestedEventOptions]
  }
  
  extension [Self <: GetActionsRequestedEventOptions](x: Self) {
    
    inline def setEntryPaths(value: js.Array[String]): Self = StObject.set(x, "entryPaths", value.asInstanceOf[js.Any])
    
    inline def setEntryPathsVarargs(value: String*): Self = StObject.set(x, "entryPaths", js.Array(value*))
  }
}
