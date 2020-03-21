package typingsJapgolly.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the location the browserAction will appear by default. The default location is navbar. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.navbar
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.menupanel
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabstrip
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.personaltoolbar
*/
trait WebExtensionManifestBrowserActionDefaultArea extends js.Object

object WebExtensionManifestBrowserActionDefaultArea {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def menupanel: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.menupanel = this.cast("menupanel")
  @scala.inline
  def navbar: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.navbar = this.cast("navbar")
  @scala.inline
  def personaltoolbar: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.personaltoolbar = this.cast("personaltoolbar")
  @scala.inline
  def tabstrip: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabstrip = this.cast("tabstrip")
}

