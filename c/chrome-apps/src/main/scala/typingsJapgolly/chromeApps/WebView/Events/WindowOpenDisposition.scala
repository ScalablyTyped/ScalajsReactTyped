package typingsJapgolly.chromeApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The requested disposition of the new window. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.ignore
  - typingsJapgolly.chromeApps.chromeAppsStrings.save_to_disk
  - typingsJapgolly.chromeApps.chromeAppsStrings.current_tab
  - typingsJapgolly.chromeApps.chromeAppsStrings.new_background_tab
  - typingsJapgolly.chromeApps.chromeAppsStrings.new_foreground_tab
  - typingsJapgolly.chromeApps.chromeAppsStrings.new_window
  - typingsJapgolly.chromeApps.chromeAppsStrings.new_popup
*/
trait WindowOpenDisposition extends js.Object

object WindowOpenDisposition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def current_tab: typingsJapgolly.chromeApps.chromeAppsStrings.current_tab = this.cast("current_tab")
  @scala.inline
  def ignore: typingsJapgolly.chromeApps.chromeAppsStrings.ignore = this.cast("ignore")
  @scala.inline
  def new_background_tab: typingsJapgolly.chromeApps.chromeAppsStrings.new_background_tab = this.cast("new_background_tab")
  @scala.inline
  def new_foreground_tab: typingsJapgolly.chromeApps.chromeAppsStrings.new_foreground_tab = this.cast("new_foreground_tab")
  @scala.inline
  def new_popup: typingsJapgolly.chromeApps.chromeAppsStrings.new_popup = this.cast("new_popup")
  @scala.inline
  def new_window: typingsJapgolly.chromeApps.chromeAppsStrings.new_window = this.cast("new_window")
  @scala.inline
  def save_to_disk: typingsJapgolly.chromeApps.chromeAppsStrings.save_to_disk = this.cast("save_to_disk")
}

