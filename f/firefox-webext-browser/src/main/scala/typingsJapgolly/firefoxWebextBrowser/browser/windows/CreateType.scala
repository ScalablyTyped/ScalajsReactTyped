package typingsJapgolly.firefoxWebextBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup unless
  * the '--enable-panels' flag is set.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.detached_panel
*/
trait CreateType extends js.Object

object CreateType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def detached_panel: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.detached_panel = this.cast("detached_panel")
  @scala.inline
  def normal: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def panel: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel = this.cast("panel")
  @scala.inline
  def popup: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = this.cast("popup")
}

