package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.Replace
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.Append
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.Delete
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.Insert
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.Prepend
*/
trait OnenotePatchActionType extends js.Object

object OnenotePatchActionType {
  @scala.inline
  def Append: typingsJapgolly.microsoftGraph.microsoftGraphStrings.Append = this.cast("Append")
  @scala.inline
  def Delete: typingsJapgolly.microsoftGraph.microsoftGraphStrings.Delete = this.cast("Delete")
  @scala.inline
  def Insert: typingsJapgolly.microsoftGraph.microsoftGraphStrings.Insert = this.cast("Insert")
  @scala.inline
  def Prepend: typingsJapgolly.microsoftGraph.microsoftGraphStrings.Prepend = this.cast("Prepend")
  @scala.inline
  def Replace: typingsJapgolly.microsoftGraph.microsoftGraphStrings.Replace = this.cast("Replace")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

