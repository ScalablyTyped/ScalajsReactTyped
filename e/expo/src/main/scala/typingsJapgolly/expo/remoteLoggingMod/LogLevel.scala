package typingsJapgolly.expo.remoteLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.expo.expoStrings.debug
  - typingsJapgolly.expo.expoStrings.info
  - typingsJapgolly.expo.expoStrings.warn
  - typingsJapgolly.expo.expoStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.expo.expoStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.expo.expoStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.expo.expoStrings.info = this.cast("info")
  @scala.inline
  def warn: typingsJapgolly.expo.expoStrings.warn = this.cast("warn")
}

