package typingsJapgolly.chromeApps.chrome.fileSystemProvider

import typingsJapgolly.chromeApps.chrome.double
import typingsJapgolly.chromeApps.chrome.fileSystemProvider.internal.FilePathRequestedEventOptions
import typingsJapgolly.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TruncateRequestedEventOptions
  extends StObject
     with FilePathRequestedEventOptions {
  
  /** Number of bytes to be retained after the operation completes. */
  var length: double
}
object TruncateRequestedEventOptions {
  
  inline def apply(filePath: String, fileSystemId: String, length: double, requestId: integer): TruncateRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncateRequestedEventOptions]
  }
  
  extension [Self <: TruncateRequestedEventOptions](x: Self) {
    
    inline def setLength(value: double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
