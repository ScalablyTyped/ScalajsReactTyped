package typingsJapgolly.server.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.server.serverStrings.emergency
  - typingsJapgolly.server.serverStrings.alert
  - typingsJapgolly.server.serverStrings.critical
  - typingsJapgolly.server.serverStrings.error
  - typingsJapgolly.server.serverStrings.warning
  - typingsJapgolly.server.serverStrings.notice
  - typingsJapgolly.server.serverStrings.info
  - typingsJapgolly.server.serverStrings.debug
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def alert: typingsJapgolly.server.serverStrings.alert = this.cast("alert")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typingsJapgolly.server.serverStrings.critical = this.cast("critical")
  @scala.inline
  def debug: typingsJapgolly.server.serverStrings.debug = this.cast("debug")
  @scala.inline
  def emergency: typingsJapgolly.server.serverStrings.emergency = this.cast("emergency")
  @scala.inline
  def error: typingsJapgolly.server.serverStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.server.serverStrings.info = this.cast("info")
  @scala.inline
  def notice: typingsJapgolly.server.serverStrings.notice = this.cast("notice")
  @scala.inline
  def warning: typingsJapgolly.server.serverStrings.warning = this.cast("warning")
}

