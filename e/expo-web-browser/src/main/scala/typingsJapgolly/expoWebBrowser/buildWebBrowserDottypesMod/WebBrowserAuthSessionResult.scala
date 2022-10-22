package typingsJapgolly.expoWebBrowser.buildWebBrowserDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserRedirectResult
  - typingsJapgolly.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserResult
*/
trait WebBrowserAuthSessionResult extends StObject
object WebBrowserAuthSessionResult {
  
  inline def WebBrowserRedirectResult(url: String): typingsJapgolly.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserRedirectResult = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("success")
    __obj.asInstanceOf[typingsJapgolly.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserRedirectResult]
  }
  
  inline def WebBrowserResult(`type`: WebBrowserResultType): typingsJapgolly.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserResult]
  }
}
