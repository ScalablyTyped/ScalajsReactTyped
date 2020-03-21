package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexWord.activexWordNumbers.`0`
import typingsJapgolly.activexWord.activexWordNumbers.`1`
import typingsJapgolly.activexWord.activexWordNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexWord.activexWordNumbers.`1`
  - typingsJapgolly.activexWord.activexWordNumbers.`0`
  - typingsJapgolly.activexWord.activexWordNumbers.`2`
*/
trait WdFrameSizeRule extends js.Object

object WdFrameSizeRule {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdFrameAtLeast: `1` = this.cast(1)
  @scala.inline
  def wdFrameAuto: `0` = this.cast(0)
  @scala.inline
  def wdFrameExact: `2` = this.cast(2)
}

