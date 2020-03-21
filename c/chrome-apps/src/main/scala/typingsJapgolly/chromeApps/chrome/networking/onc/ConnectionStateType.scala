package typingsJapgolly.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.Connected
  - typingsJapgolly.chromeApps.chromeAppsStrings.Connecting
  - typingsJapgolly.chromeApps.chromeAppsStrings.NotConnected
*/
trait ConnectionStateType extends js.Object

object ConnectionStateType {
  @scala.inline
  def Connected: typingsJapgolly.chromeApps.chromeAppsStrings.Connected = this.cast("Connected")
  @scala.inline
  def Connecting: typingsJapgolly.chromeApps.chromeAppsStrings.Connecting = this.cast("Connecting")
  @scala.inline
  def NotConnected: typingsJapgolly.chromeApps.chromeAppsStrings.NotConnected = this.cast("NotConnected")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

