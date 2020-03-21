package typingsJapgolly.klaw.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.klaw.klawStrings.shift
  - typingsJapgolly.klaw.klawStrings.pop
*/
trait QueueMethod extends js.Object

object QueueMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pop: typingsJapgolly.klaw.klawStrings.pop = this.cast("pop")
  @scala.inline
  def shift: typingsJapgolly.klaw.klawStrings.shift = this.cast("shift")
}

