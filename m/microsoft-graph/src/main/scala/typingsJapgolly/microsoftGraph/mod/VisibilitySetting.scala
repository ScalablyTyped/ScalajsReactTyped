package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notConfigured
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.hide
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.show
*/
trait VisibilitySetting extends js.Object

object VisibilitySetting {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hide: typingsJapgolly.microsoftGraph.microsoftGraphStrings.hide = this.cast("hide")
  @scala.inline
  def notConfigured: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notConfigured = this.cast("notConfigured")
  @scala.inline
  def show: typingsJapgolly.microsoftGraph.microsoftGraphStrings.show = this.cast("show")
}

