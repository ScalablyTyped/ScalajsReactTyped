package typingsJapgolly.emberTestHelpers.triggerKeyEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.emberTestHelpers.emberTestHelpersStrings.keydown
  - typingsJapgolly.emberTestHelpers.emberTestHelpersStrings.keyup
  - typingsJapgolly.emberTestHelpers.emberTestHelpersStrings.keypress
*/
trait KeyEvent extends js.Object

object KeyEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keydown: typingsJapgolly.emberTestHelpers.emberTestHelpersStrings.keydown = this.cast("keydown")
  @scala.inline
  def keypress: typingsJapgolly.emberTestHelpers.emberTestHelpersStrings.keypress = this.cast("keypress")
  @scala.inline
  def keyup: typingsJapgolly.emberTestHelpers.emberTestHelpersStrings.keyup = this.cast("keyup")
}

