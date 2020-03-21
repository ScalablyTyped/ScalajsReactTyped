package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.viewer
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.sharer
*/
trait ScreenSharingRole extends js.Object

object ScreenSharingRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sharer: typingsJapgolly.microsoftGraph.microsoftGraphStrings.sharer = this.cast("sharer")
  @scala.inline
  def viewer: typingsJapgolly.microsoftGraph.microsoftGraphStrings.viewer = this.cast("viewer")
}

