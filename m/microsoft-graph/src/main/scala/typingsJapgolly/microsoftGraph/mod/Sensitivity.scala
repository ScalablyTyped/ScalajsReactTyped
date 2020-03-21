package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.normal
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.personal
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.`private`
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.confidential
*/
trait Sensitivity extends js.Object

object Sensitivity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confidential: typingsJapgolly.microsoftGraph.microsoftGraphStrings.confidential = this.cast("confidential")
  @scala.inline
  def normal: typingsJapgolly.microsoftGraph.microsoftGraphStrings.normal = this.cast("normal")
  @scala.inline
  def personal: typingsJapgolly.microsoftGraph.microsoftGraphStrings.personal = this.cast("personal")
  @scala.inline
  def `private`: typingsJapgolly.microsoftGraph.microsoftGraphStrings.`private` = this.cast("private")
}

