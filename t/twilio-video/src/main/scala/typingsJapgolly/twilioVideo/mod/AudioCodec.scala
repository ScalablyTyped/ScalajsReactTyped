package typingsJapgolly.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioVideo.twilioVideoStrings.isac
  - typingsJapgolly.twilioVideo.twilioVideoStrings.opus
  - typingsJapgolly.twilioVideo.twilioVideoStrings.PCMA
  - typingsJapgolly.twilioVideo.twilioVideoStrings.PCMU
*/
trait AudioCodec extends js.Object

object AudioCodec {
  @scala.inline
  def PCMA: typingsJapgolly.twilioVideo.twilioVideoStrings.PCMA = this.cast("PCMA")
  @scala.inline
  def PCMU: typingsJapgolly.twilioVideo.twilioVideoStrings.PCMU = this.cast("PCMU")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def isac: typingsJapgolly.twilioVideo.twilioVideoStrings.isac = this.cast("isac")
  @scala.inline
  def opus: typingsJapgolly.twilioVideo.twilioVideoStrings.opus = this.cast("opus")
}

