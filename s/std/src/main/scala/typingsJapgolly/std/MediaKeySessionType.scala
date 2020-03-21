package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.`persistent-license`
  - typingsJapgolly.std.stdStrings.temporary
*/
trait MediaKeySessionType extends js.Object

object MediaKeySessionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `persistent-license`: typingsJapgolly.std.stdStrings.`persistent-license` = this.cast("persistent-license")
  @scala.inline
  def temporary: typingsJapgolly.std.stdStrings.temporary = this.cast("temporary")
}

