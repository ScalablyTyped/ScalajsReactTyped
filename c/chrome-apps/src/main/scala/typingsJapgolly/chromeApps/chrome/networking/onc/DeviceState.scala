package typingsJapgolly.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The current state of the device. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.Uninitialized
  - typingsJapgolly.chromeApps.chromeAppsStrings.Disabled
  - typingsJapgolly.chromeApps.chromeAppsStrings.Enabling
  - typingsJapgolly.chromeApps.chromeAppsStrings.Enabled
  - typingsJapgolly.chromeApps.chromeAppsStrings.Prohibited
*/
trait DeviceState extends js.Object

object DeviceState {
  @scala.inline
  def Disabled: typingsJapgolly.chromeApps.chromeAppsStrings.Disabled = this.cast("Disabled")
  @scala.inline
  def Enabled: typingsJapgolly.chromeApps.chromeAppsStrings.Enabled = this.cast("Enabled")
  @scala.inline
  def Enabling: typingsJapgolly.chromeApps.chromeAppsStrings.Enabling = this.cast("Enabling")
  @scala.inline
  def Prohibited: typingsJapgolly.chromeApps.chromeAppsStrings.Prohibited = this.cast("Prohibited")
  @scala.inline
  def Uninitialized: typingsJapgolly.chromeApps.chromeAppsStrings.Uninitialized = this.cast("Uninitialized")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

