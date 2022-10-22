package typingsJapgolly.tampermonkey.Tampermonkey

import typingsJapgolly.tampermonkey.tampermonkeyStrings.not_enabled
import typingsJapgolly.tampermonkey.tampermonkeyStrings.not_permitted
import typingsJapgolly.tampermonkey.tampermonkeyStrings.not_succeeded
import typingsJapgolly.tampermonkey.tampermonkeyStrings.not_supported
import typingsJapgolly.tampermonkey.tampermonkeyStrings.not_whitelisted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadErrorResponse extends StObject {
  
  /** Detail about that error */
  var details: js.UndefOr[String] = js.undefined
  
  /**
    * Error reason
    * - `not_enabled` - the download feature isn't enabled by the user
    * - `not_whitelisted` - the requested file extension is not
    * whitelisted
    * - `not_permitted` - the user enabled the download feature, but did
    * not give the downloads permission
    * - `not_supported` - the download feature isn't supported by the
    * browser/version
    * - `not_succeeded` - the download wasn't started or failed, the
    * details attribute may provide more information
    */
  var error: not_enabled | not_whitelisted | not_permitted | not_supported | not_succeeded
}
object DownloadErrorResponse {
  
  inline def apply(error: not_enabled | not_whitelisted | not_permitted | not_supported | not_succeeded): DownloadErrorResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadErrorResponse]
  }
  
  extension [Self <: DownloadErrorResponse](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setError(value: not_enabled | not_whitelisted | not_permitted | not_supported | not_succeeded): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
