package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.complete
  - typingsJapgolly.std.stdStrings.gathering
  - typingsJapgolly.std.stdStrings.`new`
*/
trait RTCIceGatheringState extends js.Object

object RTCIceGatheringState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.std.stdStrings.complete = this.cast("complete")
  @scala.inline
  def gathering: typingsJapgolly.std.stdStrings.gathering = this.cast("gathering")
  @scala.inline
  def `new`: typingsJapgolly.std.stdStrings.`new` = this.cast("new")
}

