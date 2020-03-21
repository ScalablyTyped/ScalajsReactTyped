package typingsJapgolly.firefoxWebextBrowser.browser.menus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of menu item. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.checkbox
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.radio
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator
*/
trait ItemType extends js.Object

object ItemType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checkbox: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.checkbox = this.cast("checkbox")
  @scala.inline
  def normal: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def radio: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.radio = this.cast("radio")
  @scala.inline
  def separator: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator = this.cast("separator")
}

