package typingsJapgolly.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticApmNode.elasticApmNodeStrings.trace
  - typingsJapgolly.elasticApmNode.elasticApmNodeStrings.debug
  - typingsJapgolly.elasticApmNode.elasticApmNodeStrings.info
  - typingsJapgolly.elasticApmNode.elasticApmNodeStrings.warn
  - typingsJapgolly.elasticApmNode.elasticApmNodeStrings.error
  - typingsJapgolly.elasticApmNode.elasticApmNodeStrings.fatal
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.elasticApmNode.elasticApmNodeStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.elasticApmNode.elasticApmNodeStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsJapgolly.elasticApmNode.elasticApmNodeStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsJapgolly.elasticApmNode.elasticApmNodeStrings.info = this.cast("info")
  @scala.inline
  def trace: typingsJapgolly.elasticApmNode.elasticApmNodeStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsJapgolly.elasticApmNode.elasticApmNodeStrings.warn = this.cast("warn")
}

