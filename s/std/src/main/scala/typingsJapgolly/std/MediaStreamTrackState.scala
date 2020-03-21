package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.ended
  - typingsJapgolly.std.stdStrings.live
*/
trait MediaStreamTrackState extends js.Object

object MediaStreamTrackState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ended: typingsJapgolly.std.stdStrings.ended = this.cast("ended")
  @scala.inline
  def live: typingsJapgolly.std.stdStrings.live = this.cast("live")
}

