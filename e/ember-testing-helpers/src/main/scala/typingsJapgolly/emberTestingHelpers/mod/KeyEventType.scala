package typingsJapgolly.emberTestingHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.emberTestingHelpers.emberTestingHelpersStrings.keydown
  - typingsJapgolly.emberTestingHelpers.emberTestingHelpersStrings.keyup
  - typingsJapgolly.emberTestingHelpers.emberTestingHelpersStrings.keypress
*/
trait KeyEventType extends js.Object

object KeyEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keydown: typingsJapgolly.emberTestingHelpers.emberTestingHelpersStrings.keydown = this.cast("keydown")
  @scala.inline
  def keypress: typingsJapgolly.emberTestingHelpers.emberTestingHelpersStrings.keypress = this.cast("keypress")
  @scala.inline
  def keyup: typingsJapgolly.emberTestingHelpers.emberTestingHelpersStrings.keyup = this.cast("keyup")
}

