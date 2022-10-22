package typingsJapgolly.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePathRequestedEventOptions
  extends StObject
     with RequestedEventOptions {
  
  /** The path of the entry for the operation */
  var filePath: String
}
object FilePathRequestedEventOptions {
  
  inline def apply(filePath: String, fileSystemId: String, requestId: Double): FilePathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePathRequestedEventOptions]
  }
  
  extension [Self <: FilePathRequestedEventOptions](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
