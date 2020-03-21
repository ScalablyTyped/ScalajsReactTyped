package typingsJapgolly.firefoxWebextBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state of this browser window. Under some circumstances a Window may not be assigned state property, for
  * example when querying closed windows from the `sessions` API.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked
*/
trait WindowState extends js.Object

object WindowState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def docked: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked = this.cast("docked")
  @scala.inline
  def fullscreen: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def maximized: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized = this.cast("maximized")
  @scala.inline
  def minimized: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized = this.cast("minimized")
  @scala.inline
  def normal: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
}

