package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexWord.activexWordNumbers.`0`
import typingsJapgolly.activexWord.activexWordNumbers.`1`
import typingsJapgolly.activexWord.activexWordNumbers.`2`
import typingsJapgolly.activexWord.activexWordNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexWord.activexWordNumbers.`1`
  - typingsJapgolly.activexWord.activexWordNumbers.`3`
  - typingsJapgolly.activexWord.activexWordNumbers.`2`
  - typingsJapgolly.activexWord.activexWordNumbers.`0`
*/
trait WdChevronConvertRule extends js.Object

object WdChevronConvertRule {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdAlwaysConvert: `1` = this.cast(1)
  @scala.inline
  def wdAskToConvert: `3` = this.cast(3)
  @scala.inline
  def wdAskToNotConvert: `2` = this.cast(2)
  @scala.inline
  def wdNeverConvert: `0` = this.cast(0)
}

