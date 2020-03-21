package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.noAction
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notification
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.block
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.retire
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.wipe
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.removeResourceAccessProfiles
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.pushNotification
*/
trait DeviceComplianceActionType extends js.Object

object DeviceComplianceActionType {
  @scala.inline
  def block: typingsJapgolly.microsoftGraph.microsoftGraphStrings.block = this.cast("block")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def noAction: typingsJapgolly.microsoftGraph.microsoftGraphStrings.noAction = this.cast("noAction")
  @scala.inline
  def notification: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notification = this.cast("notification")
  @scala.inline
  def pushNotification: typingsJapgolly.microsoftGraph.microsoftGraphStrings.pushNotification = this.cast("pushNotification")
  @scala.inline
  def removeResourceAccessProfiles: typingsJapgolly.microsoftGraph.microsoftGraphStrings.removeResourceAccessProfiles = this.cast("removeResourceAccessProfiles")
  @scala.inline
  def retire: typingsJapgolly.microsoftGraph.microsoftGraphStrings.retire = this.cast("retire")
  @scala.inline
  def wipe: typingsJapgolly.microsoftGraph.microsoftGraphStrings.wipe = this.cast("wipe")
}

