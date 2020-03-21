package typingsJapgolly.blessed.mod.Widgets.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.blessed.blessedStrings.left
  - typingsJapgolly.blessed.blessedStrings.center
  - typingsJapgolly.blessed.blessedStrings.right
*/
trait TAlign extends js.Object

object TAlign {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typingsJapgolly.blessed.blessedStrings.center = this.cast("center")
  @scala.inline
  def left: typingsJapgolly.blessed.blessedStrings.left = this.cast("left")
  @scala.inline
  def right: typingsJapgolly.blessed.blessedStrings.right = this.cast("right")
}

