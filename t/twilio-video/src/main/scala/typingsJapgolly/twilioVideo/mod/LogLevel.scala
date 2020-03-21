package typingsJapgolly.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioVideo.twilioVideoStrings.debug
  - typingsJapgolly.twilioVideo.twilioVideoStrings.info
  - typingsJapgolly.twilioVideo.twilioVideoStrings.warn
  - typingsJapgolly.twilioVideo.twilioVideoStrings.error
  - typingsJapgolly.twilioVideo.twilioVideoStrings.off
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.twilioVideo.twilioVideoStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.twilioVideo.twilioVideoStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.twilioVideo.twilioVideoStrings.info = this.cast("info")
  @scala.inline
  def off: typingsJapgolly.twilioVideo.twilioVideoStrings.off = this.cast("off")
  @scala.inline
  def warn: typingsJapgolly.twilioVideo.twilioVideoStrings.warn = this.cast("warn")
}

