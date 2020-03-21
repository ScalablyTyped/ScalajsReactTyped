package typingsJapgolly.twilioVideo.mod.Track

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioVideo.twilioVideoStrings.audio
  - typingsJapgolly.twilioVideo.twilioVideoStrings.video
  - typingsJapgolly.twilioVideo.twilioVideoStrings.data
*/
trait Kind extends js.Object

object Kind {
  @scala.inline
  def audio: typingsJapgolly.twilioVideo.twilioVideoStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typingsJapgolly.twilioVideo.twilioVideoStrings.data = this.cast("data")
  @scala.inline
  def video: typingsJapgolly.twilioVideo.twilioVideoStrings.video = this.cast("video")
}

