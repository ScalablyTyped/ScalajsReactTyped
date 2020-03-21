package typingsJapgolly.firefoxWebextBrowser.browser.networkStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** If known, the type of network connection that is avialable. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.`2g`
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.`3g`
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.`4g`
*/
trait NetworkLinkInfoType extends js.Object

object NetworkLinkInfoType {
  @scala.inline
  def `2g`: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ethernet: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet = this.cast("ethernet")
  @scala.inline
  def unknown: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = this.cast("unknown")
  @scala.inline
  def usb: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb = this.cast("usb")
  @scala.inline
  def wifi: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi = this.cast("wifi")
  @scala.inline
  def wimax: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax = this.cast("wimax")
}

