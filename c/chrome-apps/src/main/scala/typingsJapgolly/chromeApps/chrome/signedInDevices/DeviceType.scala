package typingsJapgolly.chromeApps.chrome.signedInDevices

import typingsJapgolly.chromeApps.chromeAppsStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.desktop_or_laptop
  - typingsJapgolly.chromeApps.chromeAppsStrings.phone
  - typingsJapgolly.chromeApps.chromeAppsStrings.tablet
  - typingsJapgolly.chromeApps.chromeAppsStrings.unknown_
*/
trait DeviceType extends js.Object

object DeviceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desktop_or_laptop: typingsJapgolly.chromeApps.chromeAppsStrings.desktop_or_laptop = this.cast("desktop_or_laptop")
  @scala.inline
  def phone: typingsJapgolly.chromeApps.chromeAppsStrings.phone = this.cast("phone")
  @scala.inline
  def tablet: typingsJapgolly.chromeApps.chromeAppsStrings.tablet = this.cast("tablet")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

