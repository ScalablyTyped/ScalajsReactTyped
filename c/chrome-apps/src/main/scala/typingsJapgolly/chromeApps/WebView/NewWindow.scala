package typingsJapgolly.chromeApps.WebView

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.HTMLWebViewElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewWindow extends StObject {
  
  /**
    * Attach the requested target page to an existing webview element.
    * @param webview The webview element to which the target page should be attached.
    */
  def attach(webview: HTMLWebViewElement): Unit
  
  /**
    * Cancel the new window request.
    */
  def discard(): Unit
}
object NewWindow {
  
  inline def apply(attach: HTMLWebViewElement => Callback, discard: Callback): NewWindow = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1((t0: HTMLWebViewElement) => attach(t0).runNow()), discard = discard.toJsFn)
    __obj.asInstanceOf[NewWindow]
  }
  
  extension [Self <: NewWindow](x: Self) {
    
    inline def setAttach(value: HTMLWebViewElement => Callback): Self = StObject.set(x, "attach", js.Any.fromFunction1((t0: HTMLWebViewElement) => value(t0).runNow()))
    
    inline def setDiscard(value: Callback): Self = StObject.set(x, "discard", value.toJsFn)
  }
}
