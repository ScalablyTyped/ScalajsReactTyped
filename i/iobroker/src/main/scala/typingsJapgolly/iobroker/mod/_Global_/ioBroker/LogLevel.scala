package typingsJapgolly.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.iobroker.iobrokerStrings.silly
  - typingsJapgolly.iobroker.iobrokerStrings.debug
  - typingsJapgolly.iobroker.iobrokerStrings.info
  - typingsJapgolly.iobroker.iobrokerStrings.warn
  - typingsJapgolly.iobroker.iobrokerStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.iobroker.iobrokerStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.iobroker.iobrokerStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.iobroker.iobrokerStrings.info = this.cast("info")
  @scala.inline
  def silly: typingsJapgolly.iobroker.iobrokerStrings.silly = this.cast("silly")
  @scala.inline
  def warn: typingsJapgolly.iobroker.iobrokerStrings.warn = this.cast("warn")
}

