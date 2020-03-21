package typingsJapgolly.chromeApps.chrome.signedInDevices

import typingsJapgolly.chromeApps.chromeAppsStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.win
  - typingsJapgolly.chromeApps.chromeAppsStrings.mac
  - typingsJapgolly.chromeApps.chromeAppsStrings.linux
  - typingsJapgolly.chromeApps.chromeAppsStrings.chrome_os
  - typingsJapgolly.chromeApps.chromeAppsStrings.android
  - typingsJapgolly.chromeApps.chromeAppsStrings.ios
  - typingsJapgolly.chromeApps.chromeAppsStrings.unknown_
*/
trait OS extends js.Object

object OS {
  @scala.inline
  def android: typingsJapgolly.chromeApps.chromeAppsStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chrome_os: typingsJapgolly.chromeApps.chromeAppsStrings.chrome_os = this.cast("chrome_os")
  @scala.inline
  def ios: typingsJapgolly.chromeApps.chromeAppsStrings.ios = this.cast("ios")
  @scala.inline
  def linux: typingsJapgolly.chromeApps.chromeAppsStrings.linux = this.cast("linux")
  @scala.inline
  def mac: typingsJapgolly.chromeApps.chromeAppsStrings.mac = this.cast("mac")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def win: typingsJapgolly.chromeApps.chromeAppsStrings.win = this.cast("win")
}

