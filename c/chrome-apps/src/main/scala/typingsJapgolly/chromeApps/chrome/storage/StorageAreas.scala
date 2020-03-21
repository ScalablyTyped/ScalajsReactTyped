package typingsJapgolly.chromeApps.chrome.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.local
  - typingsJapgolly.chromeApps.chromeAppsStrings.sync
  - typingsJapgolly.chromeApps.chromeAppsStrings.managed
*/
trait StorageAreas extends js.Object

object StorageAreas {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def local: typingsJapgolly.chromeApps.chromeAppsStrings.local = this.cast("local")
  @scala.inline
  def managed: typingsJapgolly.chromeApps.chromeAppsStrings.managed = this.cast("managed")
  @scala.inline
  def sync: typingsJapgolly.chromeApps.chromeAppsStrings.sync = this.cast("sync")
}

