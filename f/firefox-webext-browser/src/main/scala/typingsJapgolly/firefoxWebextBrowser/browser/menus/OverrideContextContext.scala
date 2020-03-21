package typingsJapgolly.firefoxWebextBrowser.browser.menus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark' and
  * 'tab' are supported. showDefaults cannot be used with this option.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
*/
trait OverrideContextContext extends js.Object

object OverrideContextContext {
  @scala.inline
  def bookmark: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark = this.cast("bookmark")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tab: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = this.cast("tab")
}

