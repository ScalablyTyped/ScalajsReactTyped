package typingsJapgolly.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Acceptable scale types
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.victory.victoryStrings.linear
  - typingsJapgolly.victory.victoryStrings.time
  - typingsJapgolly.victory.victoryStrings.log
  - typingsJapgolly.victory.victoryStrings.sqrt
*/
trait ScalePropType extends js.Object

object ScalePropType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linear: typingsJapgolly.victory.victoryStrings.linear = this.cast("linear")
  @scala.inline
  def log: typingsJapgolly.victory.victoryStrings.log = this.cast("log")
  @scala.inline
  def sqrt: typingsJapgolly.victory.victoryStrings.sqrt = this.cast("sqrt")
  @scala.inline
  def time: typingsJapgolly.victory.victoryStrings.time = this.cast("time")
}

