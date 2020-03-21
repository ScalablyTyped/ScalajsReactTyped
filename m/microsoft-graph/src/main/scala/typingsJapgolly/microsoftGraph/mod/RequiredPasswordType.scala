package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.alphanumeric
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.numeric
*/
trait RequiredPasswordType extends js.Object

object RequiredPasswordType {
  @scala.inline
  def alphanumeric: typingsJapgolly.microsoftGraph.microsoftGraphStrings.alphanumeric = this.cast("alphanumeric")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def numeric: typingsJapgolly.microsoftGraph.microsoftGraphStrings.numeric = this.cast("numeric")
}

