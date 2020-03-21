package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.useDeviceSettings
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.afterDeviceRestart
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.whenDeviceLockedExceptOpenFiles
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.whenDeviceLocked
*/
trait ManagedAppDataEncryptionType extends js.Object

object ManagedAppDataEncryptionType {
  @scala.inline
  def afterDeviceRestart: typingsJapgolly.microsoftGraph.microsoftGraphStrings.afterDeviceRestart = this.cast("afterDeviceRestart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def useDeviceSettings: typingsJapgolly.microsoftGraph.microsoftGraphStrings.useDeviceSettings = this.cast("useDeviceSettings")
  @scala.inline
  def whenDeviceLocked: typingsJapgolly.microsoftGraph.microsoftGraphStrings.whenDeviceLocked = this.cast("whenDeviceLocked")
  @scala.inline
  def whenDeviceLockedExceptOpenFiles: typingsJapgolly.microsoftGraph.microsoftGraphStrings.whenDeviceLockedExceptOpenFiles = this.cast("whenDeviceLockedExceptOpenFiles")
}

