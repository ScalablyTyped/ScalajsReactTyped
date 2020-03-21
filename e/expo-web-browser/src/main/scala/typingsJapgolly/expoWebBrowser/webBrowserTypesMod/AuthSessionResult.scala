package typingsJapgolly.expoWebBrowser.webBrowserTypesMod

import typingsJapgolly.expoWebBrowser.expoWebBrowserStrings.cancel
import typingsJapgolly.expoWebBrowser.expoWebBrowserStrings.dismiss
import typingsJapgolly.expoWebBrowser.expoWebBrowserStrings.opened
import typingsJapgolly.expoWebBrowser.expoWebBrowserStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.expoWebBrowser.webBrowserTypesMod.RedirectResult
  - typingsJapgolly.expoWebBrowser.webBrowserTypesMod.BrowserResult
*/
trait AuthSessionResult extends js.Object

object AuthSessionResult {
  @scala.inline
  def RedirectResult(`type`: success, url: String): AuthSessionResult = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSessionResult]
  }
  @scala.inline
  def BrowserResult(`type`: cancel | dismiss | opened): AuthSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSessionResult]
  }
}

