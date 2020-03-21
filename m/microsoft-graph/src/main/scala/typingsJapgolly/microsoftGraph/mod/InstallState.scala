package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.failed_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notApplicable
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.installed
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.failed_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notInstalled
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.uninstallFailed
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
*/
trait InstallState extends js.Object

object InstallState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def installed: typingsJapgolly.microsoftGraph.microsoftGraphStrings.installed = this.cast("installed")
  @scala.inline
  def notApplicable: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notApplicable = this.cast("notApplicable")
  @scala.inline
  def notInstalled: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notInstalled = this.cast("notInstalled")
  @scala.inline
  def uninstallFailed: typingsJapgolly.microsoftGraph.microsoftGraphStrings.uninstallFailed = this.cast("uninstallFailed")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

