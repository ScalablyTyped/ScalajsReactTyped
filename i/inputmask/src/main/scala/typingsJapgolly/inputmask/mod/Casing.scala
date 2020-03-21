package typingsJapgolly.inputmask.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.inputmask.inputmaskStrings.upper
  - typingsJapgolly.inputmask.inputmaskStrings.lower
  - typingsJapgolly.inputmask.inputmaskStrings.title
*/
trait Casing extends js.Object

object Casing {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lower: typingsJapgolly.inputmask.inputmaskStrings.lower = this.cast("lower")
  @scala.inline
  def title: typingsJapgolly.inputmask.inputmaskStrings.title = this.cast("title")
  @scala.inline
  def upper: typingsJapgolly.inputmask.inputmaskStrings.upper = this.cast("upper")
}

