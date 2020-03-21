package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexWord.activexWordNumbers.`-1`
import typingsJapgolly.activexWord.activexWordNumbers.`1`
import typingsJapgolly.activexWord.activexWordNumbers.`2`
import typingsJapgolly.activexWord.activexWordNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexWord.activexWordNumbers.`1`
  - typingsJapgolly.activexWord.activexWordNumbers.`-1`
  - typingsJapgolly.activexWord.activexWordNumbers.`2`
  - typingsJapgolly.activexWord.activexWordNumbers.`3`
*/
trait WdGoToDirection extends js.Object

object WdGoToDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdGoToAbsolute: `1` = this.cast(1)
  @scala.inline
  def wdGoToFirst: `1` = this.cast(1)
  @scala.inline
  def wdGoToLast: `-1` = this.cast(-1)
  @scala.inline
  def wdGoToNext: `2` = this.cast(2)
  @scala.inline
  def wdGoToPrevious: `3` = this.cast(3)
  @scala.inline
  def wdGoToRelative: `2` = this.cast(2)
}

