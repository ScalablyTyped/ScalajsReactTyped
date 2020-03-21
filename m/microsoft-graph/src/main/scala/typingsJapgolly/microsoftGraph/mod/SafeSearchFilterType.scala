package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.strict
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.moderate
*/
trait SafeSearchFilterType extends js.Object

object SafeSearchFilterType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def moderate: typingsJapgolly.microsoftGraph.microsoftGraphStrings.moderate = this.cast("moderate")
  @scala.inline
  def strict: typingsJapgolly.microsoftGraph.microsoftGraphStrings.strict = this.cast("strict")
  @scala.inline
  def userDefined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

