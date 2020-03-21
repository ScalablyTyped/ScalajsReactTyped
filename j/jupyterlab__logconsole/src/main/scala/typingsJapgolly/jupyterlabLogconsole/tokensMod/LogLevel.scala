package typingsJapgolly.jupyterlabLogconsole.tokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical
  - typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error
  - typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning
  - typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info
  - typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical = this.cast("critical")
  @scala.inline
  def debug: typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info = this.cast("info")
  @scala.inline
  def warning: typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning = this.cast("warning")
}

