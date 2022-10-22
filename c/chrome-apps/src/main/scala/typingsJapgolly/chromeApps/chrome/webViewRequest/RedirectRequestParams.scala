package typingsJapgolly.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectRequestParams extends StObject {
  
  /** Destination to where the request is redirected. */
  var redirectUrl: String
}
object RedirectRequestParams {
  
  inline def apply(redirectUrl: String): RedirectRequestParams = {
    val __obj = js.Dynamic.literal(redirectUrl = redirectUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRequestParams]
  }
  
  extension [Self <: RedirectRequestParams](x: Self) {
    
    inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
  }
}
