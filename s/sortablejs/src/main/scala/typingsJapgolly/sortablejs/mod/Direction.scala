package typingsJapgolly.sortablejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sortablejs.sortablejsStrings.vertical
  - typingsJapgolly.sortablejs.sortablejsStrings.horizontal
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typingsJapgolly.sortablejs.sortablejsStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typingsJapgolly.sortablejs.sortablejsStrings.vertical = this.cast("vertical")
}

