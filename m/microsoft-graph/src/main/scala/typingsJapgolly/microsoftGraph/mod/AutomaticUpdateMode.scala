package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notifyDownload
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.autoInstallAtMaintenanceTime
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootAtMaintenanceTime
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootAtScheduledTime
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootWithoutEndUserControl
*/
trait AutomaticUpdateMode extends js.Object

object AutomaticUpdateMode {
  @scala.inline
  def autoInstallAndRebootAtMaintenanceTime: typingsJapgolly.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootAtMaintenanceTime = this.cast("autoInstallAndRebootAtMaintenanceTime")
  @scala.inline
  def autoInstallAndRebootAtScheduledTime: typingsJapgolly.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootAtScheduledTime = this.cast("autoInstallAndRebootAtScheduledTime")
  @scala.inline
  def autoInstallAndRebootWithoutEndUserControl: typingsJapgolly.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootWithoutEndUserControl = this.cast("autoInstallAndRebootWithoutEndUserControl")
  @scala.inline
  def autoInstallAtMaintenanceTime: typingsJapgolly.microsoftGraph.microsoftGraphStrings.autoInstallAtMaintenanceTime = this.cast("autoInstallAtMaintenanceTime")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notifyDownload: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notifyDownload = this.cast("notifyDownload")
  @scala.inline
  def userDefined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

