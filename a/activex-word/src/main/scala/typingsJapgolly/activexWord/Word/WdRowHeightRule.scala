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
trait WdRowHeightRule extends js.Object

object WdRowHeightRule {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdRowHeightAtLeast: `1` = this.cast(1)
  @scala.inline
  def wdRowHeightAuto: `0` = this.cast(0)
  @scala.inline
  def wdRowHeightExactly: `2` = this.cast(2)
}

