package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.`new`
  - typings.std.stdStrings.gathering
  - typings.std.stdStrings.complete
*/
trait RTCIceGathererState extends js.Object

object RTCIceGathererState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.std.stdStrings.complete = this.cast("complete")
  @scala.inline
  def gathering: typingsJapgolly.std.stdStrings.gathering = this.cast("gathering")
  @scala.inline
  def `new`: typingsJapgolly.std.stdStrings.`new` = this.cast("new")
}

