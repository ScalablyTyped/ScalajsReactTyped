package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.noncompliant_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.compliant
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.noncompliant_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.conflict
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.error
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.inGracePeriod
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.configManager
*/
trait ComplianceState extends js.Object

object ComplianceState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compliant: typingsJapgolly.microsoftGraph.microsoftGraphStrings.compliant = this.cast("compliant")
  @scala.inline
  def configManager: typingsJapgolly.microsoftGraph.microsoftGraphStrings.configManager = this.cast("configManager")
  @scala.inline
  def conflict: typingsJapgolly.microsoftGraph.microsoftGraphStrings.conflict = this.cast("conflict")
  @scala.inline
  def error: typingsJapgolly.microsoftGraph.microsoftGraphStrings.error = this.cast("error")
  @scala.inline
  def inGracePeriod: typingsJapgolly.microsoftGraph.microsoftGraphStrings.inGracePeriod = this.cast("inGracePeriod")
  @scala.inline
  def noncompliant: noncompliant_ = this.cast("noncompliant")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

