package typingsJapgolly.miniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebViewContext extends StObject {
  
  /**
    * `webViewContext` is bound with a `web-view` component via webviewId to
    * implement some functions. List of `webViewContext` object methods:
    */
  def postMessage(msg: Any): Unit
}
object WebViewContext {
  
  inline def apply(postMessage: Any => Callback): WebViewContext = {
    val __obj = js.Dynamic.literal(postMessage = js.Any.fromFunction1((t0: Any) => postMessage(t0).runNow()))
    __obj.asInstanceOf[WebViewContext]
  }
  
  extension [Self <: WebViewContext](x: Self) {
    
    inline def setPostMessage(value: Any => Callback): Self = StObject.set(x, "postMessage", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
