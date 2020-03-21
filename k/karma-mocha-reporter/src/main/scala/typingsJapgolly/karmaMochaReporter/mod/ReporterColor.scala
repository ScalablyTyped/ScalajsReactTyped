package typingsJapgolly.karmaMochaReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.success
  - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.info
  - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.warning
  - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.error
*/
trait ReporterColor extends js.Object

object ReporterColor {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.info = this.cast("info")
  @scala.inline
  def success: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.warning = this.cast("warning")
}

