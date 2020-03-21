package typingsJapgolly.firefoxWebextBrowser.browser.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of proxy to use. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.none
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoDetect
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.system
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoConfig
*/
trait ProxyConfigProxyType extends js.Object

object ProxyConfigProxyType {
  @scala.inline
  def autoConfig: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoConfig = this.cast("autoConfig")
  @scala.inline
  def autoDetect: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoDetect = this.cast("autoDetect")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manual: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual = this.cast("manual")
  @scala.inline
  def none: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.none = this.cast("none")
  @scala.inline
  def system: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.system = this.cast("system")
}

