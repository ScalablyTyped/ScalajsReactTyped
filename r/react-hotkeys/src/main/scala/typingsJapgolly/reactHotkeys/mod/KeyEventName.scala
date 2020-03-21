package typingsJapgolly.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactHotkeys.reactHotkeysStrings.keyup
  - typingsJapgolly.reactHotkeys.reactHotkeysStrings.keydown
  - typingsJapgolly.reactHotkeys.reactHotkeysStrings.keypress
*/
trait KeyEventName extends js.Object

object KeyEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keydown: typingsJapgolly.reactHotkeys.reactHotkeysStrings.keydown = this.cast("keydown")
  @scala.inline
  def keypress: typingsJapgolly.reactHotkeys.reactHotkeysStrings.keypress = this.cast("keypress")
  @scala.inline
  def keyup: typingsJapgolly.reactHotkeys.reactHotkeysStrings.keyup = this.cast("keyup")
}

