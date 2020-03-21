package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.basic
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.enhanced
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.full
*/
trait DiagnosticDataSubmissionMode extends js.Object

object DiagnosticDataSubmissionMode {
  @scala.inline
  def basic: typingsJapgolly.microsoftGraph.microsoftGraphStrings.basic = this.cast("basic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enhanced: typingsJapgolly.microsoftGraph.microsoftGraphStrings.enhanced = this.cast("enhanced")
  @scala.inline
  def full: typingsJapgolly.microsoftGraph.microsoftGraphStrings.full = this.cast("full")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def userDefined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

