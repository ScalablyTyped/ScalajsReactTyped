package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.native
  - typingsJapgolly.std.stdStrings.transparent
*/
trait EndingType extends js.Object

object EndingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def native: typingsJapgolly.std.stdStrings.native = this.cast("native")
  @scala.inline
  def transparent: typingsJapgolly.std.stdStrings.transparent = this.cast("transparent")
}

