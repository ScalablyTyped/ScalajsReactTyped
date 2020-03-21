package typingsJapgolly.firefoxWebextBrowser.browser.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * How the extension was installed. One of
  * `development`: The extension was loaded unpacked in developer mode,
  * `normal`: The extension was installed normally via an .xpi file,
  * `sideload`: The extension was installed by other software on the machine,
  * `other`: The extension was installed by other means.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.development
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.sideload
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.other
*/
trait ExtensionInstallType extends js.Object

object ExtensionInstallType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def development: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.development = this.cast("development")
  @scala.inline
  def normal: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def other: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.other = this.cast("other")
  @scala.inline
  def sideload: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.sideload = this.cast("sideload")
}

