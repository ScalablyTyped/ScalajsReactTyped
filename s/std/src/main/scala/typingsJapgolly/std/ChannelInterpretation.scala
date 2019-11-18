package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.speakers
  - typings.std.stdStrings.discrete
*/
trait ChannelInterpretation extends js.Object

object ChannelInterpretation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def discrete: typingsJapgolly.std.stdStrings.discrete = this.cast("discrete")
  @scala.inline
  def speakers: typingsJapgolly.std.stdStrings.speakers = this.cast("speakers")
}

