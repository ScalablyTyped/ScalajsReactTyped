package typingsJapgolly.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text anchor type
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.victory.victoryStrings.start
  - typingsJapgolly.victory.victoryStrings.middle
  - typingsJapgolly.victory.victoryStrings.end
  - typingsJapgolly.victory.victoryStrings.inherit
*/
trait TextAnchorType extends js.Object

object TextAnchorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typingsJapgolly.victory.victoryStrings.end = this.cast("end")
  @scala.inline
  def inherit: typingsJapgolly.victory.victoryStrings.inherit = this.cast("inherit")
  @scala.inline
  def middle: typingsJapgolly.victory.victoryStrings.middle = this.cast("middle")
  @scala.inline
  def start: typingsJapgolly.victory.victoryStrings.start = this.cast("start")
}

