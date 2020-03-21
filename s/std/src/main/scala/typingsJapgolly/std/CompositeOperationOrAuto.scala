package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.accumulate
  - typingsJapgolly.std.stdStrings.add
  - typingsJapgolly.std.stdStrings.auto
  - typingsJapgolly.std.stdStrings.replace
*/
trait CompositeOperationOrAuto extends js.Object

object CompositeOperationOrAuto {
  @scala.inline
  def accumulate: typingsJapgolly.std.stdStrings.accumulate = this.cast("accumulate")
  @scala.inline
  def add: typingsJapgolly.std.stdStrings.add = this.cast("add")
  @scala.inline
  def auto: typingsJapgolly.std.stdStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def replace: typingsJapgolly.std.stdStrings.replace = this.cast("replace")
}

