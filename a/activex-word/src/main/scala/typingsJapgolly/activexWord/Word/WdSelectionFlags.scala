package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexWord.activexWordNumbers.`16`
import typingsJapgolly.activexWord.activexWordNumbers.`1`
import typingsJapgolly.activexWord.activexWordNumbers.`2`
import typingsJapgolly.activexWord.activexWordNumbers.`4`
import typingsJapgolly.activexWord.activexWordNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexWord.activexWordNumbers.`8`
  - typingsJapgolly.activexWord.activexWordNumbers.`2`
  - typingsJapgolly.activexWord.activexWordNumbers.`4`
  - typingsJapgolly.activexWord.activexWordNumbers.`16`
  - typingsJapgolly.activexWord.activexWordNumbers.`1`
*/
trait WdSelectionFlags extends js.Object

object WdSelectionFlags {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdSelActive: `8` = this.cast(8)
  @scala.inline
  def wdSelAtEOL: `2` = this.cast(2)
  @scala.inline
  def wdSelOvertype: `4` = this.cast(4)
  @scala.inline
  def wdSelReplace: `16` = this.cast(16)
  @scala.inline
  def wdSelStartActive: `1` = this.cast(1)
}

