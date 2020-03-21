package typingsJapgolly.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Vertical anchor type
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.victory.victoryStrings.start
  - typingsJapgolly.victory.victoryStrings.middle
  - typingsJapgolly.victory.victoryStrings.end
*/
trait VerticalAnchorType extends js.Object

object VerticalAnchorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typingsJapgolly.victory.victoryStrings.end = this.cast("end")
  @scala.inline
  def middle: typingsJapgolly.victory.victoryStrings.middle = this.cast("middle")
  @scala.inline
  def start: typingsJapgolly.victory.victoryStrings.start = this.cast("start")
}

