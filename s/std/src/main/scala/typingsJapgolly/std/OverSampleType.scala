package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.`2x`
  - typingsJapgolly.std.stdStrings.`4x`
  - typingsJapgolly.std.stdStrings.none
*/
trait OverSampleType extends js.Object

object OverSampleType {
  @scala.inline
  def `2x`: typingsJapgolly.std.stdStrings.`2x` = this.cast("2x")
  @scala.inline
  def `4x`: typingsJapgolly.std.stdStrings.`4x` = this.cast("4x")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.std.stdStrings.none = this.cast("none")
}

