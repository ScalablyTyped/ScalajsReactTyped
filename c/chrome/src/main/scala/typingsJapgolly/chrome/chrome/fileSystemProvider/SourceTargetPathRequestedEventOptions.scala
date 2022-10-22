package typingsJapgolly.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceTargetPathRequestedEventOptions
  extends StObject
     with RequestedEventOptions {
  
  /** The source path for the operation. */
  var sourcePath: String
  
  /** The destination path for the operation. */
  var targetPath: String
}
object SourceTargetPathRequestedEventOptions {
  
  inline def apply(fileSystemId: String, requestId: Double, sourcePath: String, targetPath: String): SourceTargetPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTargetPathRequestedEventOptions]
  }
  
  extension [Self <: SourceTargetPathRequestedEventOptions](x: Self) {
    
    inline def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
    
    inline def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
  }
}
