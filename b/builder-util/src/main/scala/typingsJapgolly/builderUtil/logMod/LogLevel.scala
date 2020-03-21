package typingsJapgolly.builderUtil.logMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.builderUtil.builderUtilStrings.info
  - typingsJapgolly.builderUtil.builderUtilStrings.warn
  - typingsJapgolly.builderUtil.builderUtilStrings.debug
  - typingsJapgolly.builderUtil.builderUtilStrings.notice
  - typingsJapgolly.builderUtil.builderUtilStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.builderUtil.builderUtilStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.builderUtil.builderUtilStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.builderUtil.builderUtilStrings.info = this.cast("info")
  @scala.inline
  def notice: typingsJapgolly.builderUtil.builderUtilStrings.notice = this.cast("notice")
  @scala.inline
  def warn: typingsJapgolly.builderUtil.builderUtilStrings.warn = this.cast("warn")
}

