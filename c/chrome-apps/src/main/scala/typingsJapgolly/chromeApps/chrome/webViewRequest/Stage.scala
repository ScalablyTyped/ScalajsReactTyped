package typingsJapgolly.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.onBeforeRequest
  - typingsJapgolly.chromeApps.chromeAppsStrings.onBeforeSendHeaders
  - typingsJapgolly.chromeApps.chromeAppsStrings.onHeadersReceived
  - typingsJapgolly.chromeApps.chromeAppsStrings.onAuthRequired
*/
trait Stage extends js.Object

object Stage {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onAuthRequired: typingsJapgolly.chromeApps.chromeAppsStrings.onAuthRequired = this.cast("onAuthRequired")
  @scala.inline
  def onBeforeRequest: typingsJapgolly.chromeApps.chromeAppsStrings.onBeforeRequest = this.cast("onBeforeRequest")
  @scala.inline
  def onBeforeSendHeaders: typingsJapgolly.chromeApps.chromeAppsStrings.onBeforeSendHeaders = this.cast("onBeforeSendHeaders")
  @scala.inline
  def onHeadersReceived: typingsJapgolly.chromeApps.chromeAppsStrings.onHeadersReceived = this.cast("onHeadersReceived")
}

