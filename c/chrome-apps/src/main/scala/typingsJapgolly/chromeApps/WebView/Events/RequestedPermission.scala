package typingsJapgolly.chromeApps.WebView.Events

import typingsJapgolly.chromeApps.chromeAppsStrings.filesystem_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.media
  - typingsJapgolly.chromeApps.chromeAppsStrings.geolocation
  - typingsJapgolly.chromeApps.chromeAppsStrings.pointerLock
  - typingsJapgolly.chromeApps.chromeAppsStrings.download
  - typingsJapgolly.chromeApps.chromeAppsStrings.loadplugin
  - typingsJapgolly.chromeApps.chromeAppsStrings.filesystem_
  - typingsJapgolly.chromeApps.chromeAppsStrings.fullscreen
*/
trait RequestedPermission extends js.Object

object RequestedPermission {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def download: typingsJapgolly.chromeApps.chromeAppsStrings.download = this.cast("download")
  @scala.inline
  def filesystem: filesystem_ = this.cast("filesystem")
  @scala.inline
  def fullscreen: typingsJapgolly.chromeApps.chromeAppsStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def geolocation: typingsJapgolly.chromeApps.chromeAppsStrings.geolocation = this.cast("geolocation")
  @scala.inline
  def loadplugin: typingsJapgolly.chromeApps.chromeAppsStrings.loadplugin = this.cast("loadplugin")
  @scala.inline
  def media: typingsJapgolly.chromeApps.chromeAppsStrings.media = this.cast("media")
  @scala.inline
  def pointerLock: typingsJapgolly.chromeApps.chromeAppsStrings.pointerLock = this.cast("pointerLock")
}

