package typingsJapgolly.cordovaPluginFileTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Optional parameters for download method. */
trait FileDownloadOptions extends StObject {
  
  /** A map of header name/header values. */
  var headers: js.UndefOr[js.Object] = js.undefined
}
object FileDownloadOptions {
  
  inline def apply(): FileDownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileDownloadOptions]
  }
  
  extension [Self <: FileDownloadOptions](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
  }
}
