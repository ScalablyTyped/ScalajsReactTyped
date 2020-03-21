package typingsJapgolly.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.browserSync.browserSyncStrings.info
  - typingsJapgolly.browserSync.browserSyncStrings.debug
  - typingsJapgolly.browserSync.browserSyncStrings.warn
  - typingsJapgolly.browserSync.browserSyncStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.browserSync.browserSyncStrings.debug = this.cast("debug")
  @scala.inline
  def info: typingsJapgolly.browserSync.browserSyncStrings.info = this.cast("info")
  @scala.inline
  def silent: typingsJapgolly.browserSync.browserSyncStrings.silent = this.cast("silent")
  @scala.inline
  def warn: typingsJapgolly.browserSync.browserSyncStrings.warn = this.cast("warn")
}

