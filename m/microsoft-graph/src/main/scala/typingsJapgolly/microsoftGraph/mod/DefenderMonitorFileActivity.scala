package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.disable
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.monitorAllFiles
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.monitorIncomingFilesOnly
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.monitorOutgoingFilesOnly
*/
trait DefenderMonitorFileActivity extends js.Object

object DefenderMonitorFileActivity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disable: typingsJapgolly.microsoftGraph.microsoftGraphStrings.disable = this.cast("disable")
  @scala.inline
  def monitorAllFiles: typingsJapgolly.microsoftGraph.microsoftGraphStrings.monitorAllFiles = this.cast("monitorAllFiles")
  @scala.inline
  def monitorIncomingFilesOnly: typingsJapgolly.microsoftGraph.microsoftGraphStrings.monitorIncomingFilesOnly = this.cast("monitorIncomingFilesOnly")
  @scala.inline
  def monitorOutgoingFilesOnly: typingsJapgolly.microsoftGraph.microsoftGraphStrings.monitorOutgoingFilesOnly = this.cast("monitorOutgoingFilesOnly")
  @scala.inline
  def userDefined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

