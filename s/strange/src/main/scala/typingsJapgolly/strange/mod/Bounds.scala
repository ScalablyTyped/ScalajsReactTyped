package typingsJapgolly.strange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.strange.strangeStrings.LeftparenthesisRightparenthesis
  - typingsJapgolly.strange.strangeStrings.`[]`
  - typingsJapgolly.strange.strangeStrings.`[Rightparenthesis`
  - typingsJapgolly.strange.strangeStrings.`Leftparenthesis]`
*/
trait Bounds extends js.Object

object Bounds {
  @scala.inline
  def LeftparenthesisRightparenthesis: typingsJapgolly.strange.strangeStrings.LeftparenthesisRightparenthesis = this.cast("()")
  @scala.inline
  def `Leftparenthesis]`: typingsJapgolly.strange.strangeStrings.`Leftparenthesis]` = this.cast("(]")
  @scala.inline
  def `[Rightparenthesis`: typingsJapgolly.strange.strangeStrings.`[Rightparenthesis` = this.cast("[)")
  @scala.inline
  def `[]`: typingsJapgolly.strange.strangeStrings.`[]` = this.cast("[]")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

