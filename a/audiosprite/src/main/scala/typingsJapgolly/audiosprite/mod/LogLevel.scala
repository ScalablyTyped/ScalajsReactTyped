package typingsJapgolly.audiosprite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.audiosprite.audiospriteStrings.debug
  - typingsJapgolly.audiosprite.audiospriteStrings.info
  - typingsJapgolly.audiosprite.audiospriteStrings.notice
  - typingsJapgolly.audiosprite.audiospriteStrings.warning
  - typingsJapgolly.audiosprite.audiospriteStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.audiosprite.audiospriteStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.audiosprite.audiospriteStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.audiosprite.audiospriteStrings.info = this.cast("info")
  @scala.inline
  def notice: typingsJapgolly.audiosprite.audiospriteStrings.notice = this.cast("notice")
  @scala.inline
  def warning: typingsJapgolly.audiosprite.audiospriteStrings.warning = this.cast("warning")
}

