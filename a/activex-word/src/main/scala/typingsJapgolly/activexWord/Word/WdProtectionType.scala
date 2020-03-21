package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexWord.activexWordNumbers.`-1`
import typingsJapgolly.activexWord.activexWordNumbers.`0`
import typingsJapgolly.activexWord.activexWordNumbers.`1`
import typingsJapgolly.activexWord.activexWordNumbers.`2`
import typingsJapgolly.activexWord.activexWordNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexWord.activexWordNumbers.`1`
  - typingsJapgolly.activexWord.activexWordNumbers.`2`
  - typingsJapgolly.activexWord.activexWordNumbers.`3`
  - typingsJapgolly.activexWord.activexWordNumbers.`0`
  - typingsJapgolly.activexWord.activexWordNumbers.`-1`
*/
trait WdProtectionType extends js.Object

object WdProtectionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdAllowOnlyComments: `1` = this.cast(1)
  @scala.inline
  def wdAllowOnlyFormFields: `2` = this.cast(2)
  @scala.inline
  def wdAllowOnlyReading: `3` = this.cast(3)
  @scala.inline
  def wdAllowOnlyRevisions: `0` = this.cast(0)
  @scala.inline
  def wdNoProtection: `-1` = this.cast(-1)
}

