package typingsJapgolly.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.managed
  - typingsJapgolly.chromeApps.chromeAppsStrings.unmanaged
*/
trait ManagedObject extends js.Object

object ManagedObject {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def managed: typingsJapgolly.chromeApps.chromeAppsStrings.managed = this.cast("managed")
  @scala.inline
  def unmanaged: typingsJapgolly.chromeApps.chromeAppsStrings.unmanaged = this.cast("unmanaged")
}

