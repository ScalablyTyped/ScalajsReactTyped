package typingsJapgolly.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestedEventOptions extends StObject {
  
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String
  
  /** The unique identifier of this request. */
  var requestId: Double
}
object RequestedEventOptions {
  
  inline def apply(fileSystemId: String, requestId: Double): RequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestedEventOptions]
  }
  
  extension [Self <: RequestedEventOptions](x: Self) {
    
    inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
