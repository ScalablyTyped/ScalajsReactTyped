package typingsJapgolly.awsSdkTypes.loggerMod

import typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.error_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.all
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.log
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.info
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.warn
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.error_
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.off
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def all: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: error_ = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.info = this.cast("info")
  @scala.inline
  def log: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.log = this.cast("log")
  @scala.inline
  def off: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.off = this.cast("off")
  @scala.inline
  def warn: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.warn = this.cast("warn")
}

