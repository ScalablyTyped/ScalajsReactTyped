package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region webview组件控制 https://docs.alipay.com/mini/api/webview-context
trait WebViewContext extends StObject {
  
  def postMessage(param: Any): Unit
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
