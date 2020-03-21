package typingsJapgolly.chromeApps.chrome.contextMenus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.image
  - typingsJapgolly.chromeApps.chromeAppsStrings.video
  - typingsJapgolly.chromeApps.chromeAppsStrings.audio
*/
trait MediaType extends js.Object

object MediaType {
  @scala.inline
  def audio: typingsJapgolly.chromeApps.chromeAppsStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def image: typingsJapgolly.chromeApps.chromeAppsStrings.image = this.cast("image")
  @scala.inline
  def video: typingsJapgolly.chromeApps.chromeAppsStrings.video = this.cast("video")
}

