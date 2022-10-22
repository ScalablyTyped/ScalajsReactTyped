package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebFacade
  extends StObject
     with WebViewElement {
  
  /**
    * Gets the webview element as a testing element.
    * @param matcher a simple view matcher for the webview element in th UI hierarchy.
    * If there is only ONE webview element in the UI hierarchy, its NOT a must to supply it.
    * If there are MORE then one webview element in the UI hierarchy you MUST supply are view matcher.
    */
  def apply(): WebViewElement = js.native
  def apply(matcher: NativeMatcher): WebViewElement = js.native
}
