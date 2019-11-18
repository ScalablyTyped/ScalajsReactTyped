package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.controlling
  - typings.std.stdStrings.controlled
*/
trait RTCIceRole extends js.Object

object RTCIceRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def controlled: typingsJapgolly.std.stdStrings.controlled = this.cast("controlled")
  @scala.inline
  def controlling: typingsJapgolly.std.stdStrings.controlling = this.cast("controlling")
}

