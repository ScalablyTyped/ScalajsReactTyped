package typingsJapgolly.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioVideo.twilioVideoStrings.H264
  - typingsJapgolly.twilioVideo.twilioVideoStrings.VP8
  - typingsJapgolly.twilioVideo.twilioVideoStrings.VP9
*/
trait VideoCodec extends js.Object

object VideoCodec {
  @scala.inline
  def H264: typingsJapgolly.twilioVideo.twilioVideoStrings.H264 = this.cast("H264")
  @scala.inline
  def VP8: typingsJapgolly.twilioVideo.twilioVideoStrings.VP8 = this.cast("VP8")
  @scala.inline
  def VP9: typingsJapgolly.twilioVideo.twilioVideoStrings.VP9 = this.cast("VP9")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

