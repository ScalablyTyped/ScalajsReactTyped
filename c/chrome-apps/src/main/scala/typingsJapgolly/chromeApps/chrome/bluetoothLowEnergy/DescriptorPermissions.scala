package typingsJapgolly.chromeApps.chrome.bluetoothLowEnergy

import typingsJapgolly.chromeApps.chromeAppsStrings.read_
import typingsJapgolly.chromeApps.chromeAppsStrings.write_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.read_
  - typingsJapgolly.chromeApps.chromeAppsStrings.write_
  - typingsJapgolly.chromeApps.chromeAppsStrings.encryptedRead
  - typingsJapgolly.chromeApps.chromeAppsStrings.encryptedWrite
  - typingsJapgolly.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead
  - typingsJapgolly.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite
*/
trait DescriptorPermissions extends js.Object

object DescriptorPermissions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def encryptedAuthenticatedRead: typingsJapgolly.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead = this.cast("encryptedAuthenticatedRead")
  @scala.inline
  def encryptedAuthenticatedWrite: typingsJapgolly.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite = this.cast("encryptedAuthenticatedWrite")
  @scala.inline
  def encryptedRead: typingsJapgolly.chromeApps.chromeAppsStrings.encryptedRead = this.cast("encryptedRead")
  @scala.inline
  def encryptedWrite: typingsJapgolly.chromeApps.chromeAppsStrings.encryptedWrite = this.cast("encryptedWrite")
  @scala.inline
  def read: read_ = this.cast("read")
  @scala.inline
  def write: write_ = this.cast("write")
}

