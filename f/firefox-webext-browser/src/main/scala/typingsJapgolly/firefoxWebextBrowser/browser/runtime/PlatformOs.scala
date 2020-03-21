package typingsJapgolly.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The operating system the browser is running on. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.mac
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.win
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.android
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.cros
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.linux
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.openbsd
*/
trait PlatformOs extends js.Object

object PlatformOs {
  @scala.inline
  def android: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cros: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.cros = this.cast("cros")
  @scala.inline
  def linux: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.linux = this.cast("linux")
  @scala.inline
  def mac: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.mac = this.cast("mac")
  @scala.inline
  def openbsd: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.openbsd = this.cast("openbsd")
  @scala.inline
  def win: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.win = this.cast("win")
}

