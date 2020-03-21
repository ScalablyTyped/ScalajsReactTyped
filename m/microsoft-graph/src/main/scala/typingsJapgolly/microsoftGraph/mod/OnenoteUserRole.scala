package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.Owner
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.Contributor
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.Reader
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.None
*/
trait OnenoteUserRole extends js.Object

object OnenoteUserRole {
  @scala.inline
  def Contributor: typingsJapgolly.microsoftGraph.microsoftGraphStrings.Contributor = this.cast("Contributor")
  @scala.inline
  def None: typingsJapgolly.microsoftGraph.microsoftGraphStrings.None = this.cast("None")
  @scala.inline
  def Owner: typingsJapgolly.microsoftGraph.microsoftGraphStrings.Owner = this.cast("Owner")
  @scala.inline
  def Reader: typingsJapgolly.microsoftGraph.microsoftGraphStrings.Reader = this.cast("Reader")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

