package typingsJapgolly.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jestTestResult.jestTestResultStrings.passed
  - typingsJapgolly.jestTestResult.jestTestResultStrings.failed
  - typingsJapgolly.jestTestResult.jestTestResultStrings.skipped
  - typingsJapgolly.jestTestResult.jestTestResultStrings.pending
  - typingsJapgolly.jestTestResult.jestTestResultStrings.todo
  - typingsJapgolly.jestTestResult.jestTestResultStrings.disabled
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typingsJapgolly.jestTestResult.jestTestResultStrings.disabled = this.cast("disabled")
  @scala.inline
  def failed: typingsJapgolly.jestTestResult.jestTestResultStrings.failed = this.cast("failed")
  @scala.inline
  def passed: typingsJapgolly.jestTestResult.jestTestResultStrings.passed = this.cast("passed")
  @scala.inline
  def pending: typingsJapgolly.jestTestResult.jestTestResultStrings.pending = this.cast("pending")
  @scala.inline
  def skipped: typingsJapgolly.jestTestResult.jestTestResultStrings.skipped = this.cast("skipped")
  @scala.inline
  def todo: typingsJapgolly.jestTestResult.jestTestResultStrings.todo = this.cast("todo")
}

