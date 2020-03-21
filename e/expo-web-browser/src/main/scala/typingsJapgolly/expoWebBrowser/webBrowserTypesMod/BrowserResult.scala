package typingsJapgolly.expoWebBrowser.webBrowserTypesMod

import typingsJapgolly.expoWebBrowser.expoWebBrowserStrings.cancel
import typingsJapgolly.expoWebBrowser.expoWebBrowserStrings.dismiss
import typingsJapgolly.expoWebBrowser.expoWebBrowserStrings.opened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserResult extends AuthSessionResult {
  var `type`: cancel | dismiss | opened
}

object BrowserResult {
  @scala.inline
  def apply(`type`: cancel | dismiss | opened): BrowserResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserResult]
  }
}

