package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexWord.activexWordNumbers.`0`
import typingsJapgolly.activexWord.activexWordNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexWord.activexWordNumbers.`1`
  - typingsJapgolly.activexWord.activexWordNumbers.`0`
*/
trait WdProofreadingErrorType extends js.Object

object WdProofreadingErrorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdGrammaticalError: `1` = this.cast(1)
  @scala.inline
  def wdSpellingError: `0` = this.cast(0)
}

