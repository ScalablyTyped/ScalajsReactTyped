package typingsJapgolly.phosphorDragdrop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.phosphorDragdrop.phosphorDragdropStrings.none
  - typingsJapgolly.phosphorDragdrop.phosphorDragdropStrings.copy
  - typingsJapgolly.phosphorDragdrop.phosphorDragdropStrings.link
  - typingsJapgolly.phosphorDragdrop.phosphorDragdropStrings.move
*/
trait DropAction extends js.Object

object DropAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def copy: typingsJapgolly.phosphorDragdrop.phosphorDragdropStrings.copy = this.cast("copy")
  @scala.inline
  def link: typingsJapgolly.phosphorDragdrop.phosphorDragdropStrings.link = this.cast("link")
  @scala.inline
  def move: typingsJapgolly.phosphorDragdrop.phosphorDragdropStrings.move = this.cast("move")
  @scala.inline
  def none: typingsJapgolly.phosphorDragdrop.phosphorDragdropStrings.none = this.cast("none")
}

