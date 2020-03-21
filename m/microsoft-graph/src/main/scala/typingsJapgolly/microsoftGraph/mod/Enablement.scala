package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notConfigured
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.enabled
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.disabled
*/
trait Enablement extends js.Object

object Enablement {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typingsJapgolly.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def enabled: typingsJapgolly.microsoftGraph.microsoftGraphStrings.enabled = this.cast("enabled")
  @scala.inline
  def notConfigured: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notConfigured = this.cast("notConfigured")
}

