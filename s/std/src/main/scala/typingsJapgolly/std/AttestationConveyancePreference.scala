package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.direct
  - typingsJapgolly.std.stdStrings.indirect
  - typingsJapgolly.std.stdStrings.none
*/
trait AttestationConveyancePreference extends js.Object

object AttestationConveyancePreference {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def direct: typingsJapgolly.std.stdStrings.direct = this.cast("direct")
  @scala.inline
  def indirect: typingsJapgolly.std.stdStrings.indirect = this.cast("indirect")
  @scala.inline
  def none: typingsJapgolly.std.stdStrings.none = this.cast("none")
}

