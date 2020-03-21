package typingsJapgolly.grommet.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extracting types for common properties among components
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.top
  - typingsJapgolly.grommet.grommetStrings.left
  - typingsJapgolly.grommet.grommetStrings.bottom
  - typingsJapgolly.grommet.grommetStrings.right
  - typingsJapgolly.grommet.grommetStrings.horizontal
  - typingsJapgolly.grommet.grommetStrings.vertical
  - typingsJapgolly.grommet.grommetStrings.all
*/
trait BoxSideType extends _BorderType

object BoxSideType {
  @scala.inline
  def all: typingsJapgolly.grommet.grommetStrings.all = this.cast("all")
  @scala.inline
  def bottom: typingsJapgolly.grommet.grommetStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typingsJapgolly.grommet.grommetStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def left: typingsJapgolly.grommet.grommetStrings.left = this.cast("left")
  @scala.inline
  def right: typingsJapgolly.grommet.grommetStrings.right = this.cast("right")
  @scala.inline
  def top: typingsJapgolly.grommet.grommetStrings.top = this.cast("top")
  @scala.inline
  def vertical: typingsJapgolly.grommet.grommetStrings.vertical = this.cast("vertical")
}

