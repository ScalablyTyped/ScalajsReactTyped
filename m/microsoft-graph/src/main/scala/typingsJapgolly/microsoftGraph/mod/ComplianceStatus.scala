package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notApplicable
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.compliant
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.remediated
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.nonCompliant
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.error
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.conflict
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notAssigned
*/
trait ComplianceStatus extends js.Object

object ComplianceStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compliant: typingsJapgolly.microsoftGraph.microsoftGraphStrings.compliant = this.cast("compliant")
  @scala.inline
  def conflict: typingsJapgolly.microsoftGraph.microsoftGraphStrings.conflict = this.cast("conflict")
  @scala.inline
  def error: typingsJapgolly.microsoftGraph.microsoftGraphStrings.error = this.cast("error")
  @scala.inline
  def nonCompliant: typingsJapgolly.microsoftGraph.microsoftGraphStrings.nonCompliant = this.cast("nonCompliant")
  @scala.inline
  def notApplicable: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notApplicable = this.cast("notApplicable")
  @scala.inline
  def notAssigned: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notAssigned = this.cast("notAssigned")
  @scala.inline
  def remediated: typingsJapgolly.microsoftGraph.microsoftGraphStrings.remediated = this.cast("remediated")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

