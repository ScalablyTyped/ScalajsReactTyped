package typingsJapgolly.karmaMochaReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.full
  - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.autowatch
  - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.minimal
  - typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.noFailures
*/
trait OutputOptions extends js.Object

object OutputOptions {
  @scala.inline
  def autowatch: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.autowatch = this.cast("autowatch")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def full: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.full = this.cast("full")
  @scala.inline
  def minimal: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.minimal = this.cast("minimal")
  @scala.inline
  def noFailures: typingsJapgolly.karmaMochaReporter.karmaMochaReporterStrings.noFailures = this.cast("noFailures")
}

