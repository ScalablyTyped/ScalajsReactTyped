package typingsJapgolly.eventTargetShim.mod.EventTarget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.strict
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.standard
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.loose
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def loose: typingsJapgolly.eventTargetShim.eventTargetShimStrings.loose = this.cast("loose")
  @scala.inline
  def standard: typingsJapgolly.eventTargetShim.eventTargetShimStrings.standard = this.cast("standard")
  @scala.inline
  def strict: typingsJapgolly.eventTargetShim.eventTargetShimStrings.strict = this.cast("strict")
}

