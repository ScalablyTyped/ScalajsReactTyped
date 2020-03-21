package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexWord.activexWordNumbers.`11`
import typingsJapgolly.activexWord.activexWordNumbers.`12`
import typingsJapgolly.activexWord.activexWordNumbers.`14`
import typingsJapgolly.activexWord.activexWordNumbers.`65535`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexWord.activexWordNumbers.`65535`
  - typingsJapgolly.activexWord.activexWordNumbers.`11`
  - typingsJapgolly.activexWord.activexWordNumbers.`12`
  - typingsJapgolly.activexWord.activexWordNumbers.`14`
*/
trait WdCompatibilityMode extends js.Object

object WdCompatibilityMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdCurrent: `65535` = this.cast(65535)
  @scala.inline
  def wdWord2003: `11` = this.cast(11)
  @scala.inline
  def wdWord2007: `12` = this.cast(12)
  @scala.inline
  def wdWord2010: `14` = this.cast(14)
}

