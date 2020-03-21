package typingsJapgolly.blessed.mod.Widgets.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.blessed.blessedStrings.mousedown
  - typingsJapgolly.blessed.blessedStrings.mouseup
  - typingsJapgolly.blessed.blessedStrings.mousemove
*/
trait TMouseAction extends js.Object

object TMouseAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mousedown: typingsJapgolly.blessed.blessedStrings.mousedown = this.cast("mousedown")
  @scala.inline
  def mousemove: typingsJapgolly.blessed.blessedStrings.mousemove = this.cast("mousemove")
  @scala.inline
  def mouseup: typingsJapgolly.blessed.blessedStrings.mouseup = this.cast("mouseup")
}

