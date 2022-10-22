package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebviewPanelOptions extends StObject {
  
  /**
    * Controls if the find widget is enabled in the panel.
    *
    * Defaults to `false`.
    */
  val enableFindWidget: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls if the webview panel's content (iframe) is kept around even when the panel
    * is no longer visible.
    *
    * Normally the webview panel's html context is created when the panel becomes visible
    * and destroyed when it is hidden. Extensions that have complex state
    * or UI can set the `retainContextWhenHidden` to make the editor keep the webview
    * context around, even when the webview moves to a background tab. When a webview using
    * `retainContextWhenHidden` becomes hidden, its scripts and other dynamic content are suspended.
    * When the panel becomes visible again, the context is automatically restored
    * in the exact same state it was in originally. You cannot send messages to a
    * hidden webview, even with `retainContextWhenHidden` enabled.
    *
    * `retainContextWhenHidden` has a high memory overhead and should only be used if
    * your panel's context cannot be quickly saved and restored.
    */
  val retainContextWhenHidden: js.UndefOr[Boolean] = js.undefined
}
object WebviewPanelOptions {
  
  inline def apply(): WebviewPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebviewPanelOptions]
  }
  
  extension [Self <: WebviewPanelOptions](x: Self) {
    
    inline def setEnableFindWidget(value: Boolean): Self = StObject.set(x, "enableFindWidget", value.asInstanceOf[js.Any])
    
    inline def setEnableFindWidgetUndefined: Self = StObject.set(x, "enableFindWidget", js.undefined)
    
    inline def setRetainContextWhenHidden(value: Boolean): Self = StObject.set(x, "retainContextWhenHidden", value.asInstanceOf[js.Any])
    
    inline def setRetainContextWhenHiddenUndefined: Self = StObject.set(x, "retainContextWhenHidden", js.undefined)
  }
}
