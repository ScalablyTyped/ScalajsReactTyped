package typingsJapgolly.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetainContextWhenHidden extends StObject {
  
  /**
    * Controls if the webview element itself (iframe) is kept around even when the view
    * is no longer visible.
    *
    * Normally the webview's html context is created when the view becomes visible
    * and destroyed when it is hidden. Extensions that have complex state
    * or UI can set the `retainContextWhenHidden` to make the editor keep the webview
    * context around, even when the webview moves to a background tab. When a webview using
    * `retainContextWhenHidden` becomes hidden, its scripts and other dynamic content are suspended.
    * When the view becomes visible again, the context is automatically restored
    * in the exact same state it was in originally. You cannot send messages to a
    * hidden webview, even with `retainContextWhenHidden` enabled.
    *
    * `retainContextWhenHidden` has a high memory overhead and should only be used if
    * your view's context cannot be quickly saved and restored.
    */
  val retainContextWhenHidden: js.UndefOr[Boolean] = js.undefined
}
object RetainContextWhenHidden {
  
  inline def apply(): RetainContextWhenHidden = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetainContextWhenHidden]
  }
  
  extension [Self <: RetainContextWhenHidden](x: Self) {
    
    inline def setRetainContextWhenHidden(value: Boolean): Self = StObject.set(x, "retainContextWhenHidden", value.asInstanceOf[js.Any])
    
    inline def setRetainContextWhenHiddenUndefined: Self = StObject.set(x, "retainContextWhenHidden", js.undefined)
  }
}
