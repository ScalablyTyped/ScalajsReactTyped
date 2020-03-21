package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.controlled
  - typingsJapgolly.std.stdStrings.controlling
  - typingsJapgolly.std.stdStrings.unknown
*/
trait RTCIceRole extends js.Object

object RTCIceRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def controlled: typingsJapgolly.std.stdStrings.controlled = this.cast("controlled")
  @scala.inline
  def controlling: typingsJapgolly.std.stdStrings.controlling = this.cast("controlling")
  @scala.inline
  def unknown: typingsJapgolly.std.stdStrings.unknown = this.cast("unknown")
}

