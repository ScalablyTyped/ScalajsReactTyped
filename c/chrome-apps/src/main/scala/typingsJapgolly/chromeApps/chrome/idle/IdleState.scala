package typingsJapgolly.chromeApps.chrome.idle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.active
  - typingsJapgolly.chromeApps.chromeAppsStrings.idle
  - typingsJapgolly.chromeApps.chromeAppsStrings.locked
*/
trait IdleState extends js.Object

object IdleState {
  @scala.inline
  def active: typingsJapgolly.chromeApps.chromeAppsStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def idle: typingsJapgolly.chromeApps.chromeAppsStrings.idle = this.cast("idle")
  @scala.inline
  def locked: typingsJapgolly.chromeApps.chromeAppsStrings.locked = this.cast("locked")
}

