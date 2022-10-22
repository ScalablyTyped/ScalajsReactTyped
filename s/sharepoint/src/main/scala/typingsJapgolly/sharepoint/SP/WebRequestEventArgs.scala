package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.microsoftAjax.Sys.EventArgs
import typingsJapgolly.microsoftAjax.Sys.Net.WebRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebRequestEventArgs
  extends StObject
     with EventArgs {
  
  def get_webRequest(): WebRequest
}
object WebRequestEventArgs {
  
  inline def apply(Empty: EventArgs, get_webRequest: CallbackTo[WebRequest]): WebRequestEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_webRequest = get_webRequest.toJsFn)
    __obj.asInstanceOf[WebRequestEventArgs]
  }
  
  extension [Self <: WebRequestEventArgs](x: Self) {
    
    inline def setGet_webRequest(value: CallbackTo[WebRequest]): Self = StObject.set(x, "get_webRequest", value.toJsFn)
  }
}
