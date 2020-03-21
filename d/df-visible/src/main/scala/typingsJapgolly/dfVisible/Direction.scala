package typingsJapgolly.dfVisible

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dfVisible.dfVisibleStrings.horizontal
  - typingsJapgolly.dfVisible.dfVisibleStrings.vertical
  - typingsJapgolly.dfVisible.dfVisibleStrings.both
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  def both: typingsJapgolly.dfVisible.dfVisibleStrings.both = this.cast("both")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typingsJapgolly.dfVisible.dfVisibleStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typingsJapgolly.dfVisible.dfVisibleStrings.vertical = this.cast("vertical")
}

