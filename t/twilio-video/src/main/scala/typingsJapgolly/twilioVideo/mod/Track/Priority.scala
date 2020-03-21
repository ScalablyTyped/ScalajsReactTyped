package typingsJapgolly.twilioVideo.mod.Track

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioVideo.twilioVideoStrings.low
  - typingsJapgolly.twilioVideo.twilioVideoStrings.standard
  - typingsJapgolly.twilioVideo.twilioVideoStrings.high
*/
trait Priority extends js.Object

object Priority {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsJapgolly.twilioVideo.twilioVideoStrings.high = this.cast("high")
  @scala.inline
  def low: typingsJapgolly.twilioVideo.twilioVideoStrings.low = this.cast("low")
  @scala.inline
  def standard: typingsJapgolly.twilioVideo.twilioVideoStrings.standard = this.cast("standard")
}

