package typingsJapgolly.logProcessErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exception type.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.logProcessErrors.logProcessErrorsStrings.uncaughtException
  - typingsJapgolly.logProcessErrors.logProcessErrorsStrings.unhandledRejection
  - typingsJapgolly.logProcessErrors.logProcessErrorsStrings.rejectionHandled
  - typingsJapgolly.logProcessErrors.logProcessErrorsStrings.multipleResolves
  - typingsJapgolly.logProcessErrors.logProcessErrorsStrings.warning
*/
trait ExceptionType extends js.Object

object ExceptionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def multipleResolves: typingsJapgolly.logProcessErrors.logProcessErrorsStrings.multipleResolves = this.cast("multipleResolves")
  @scala.inline
  def rejectionHandled: typingsJapgolly.logProcessErrors.logProcessErrorsStrings.rejectionHandled = this.cast("rejectionHandled")
  @scala.inline
  def uncaughtException: typingsJapgolly.logProcessErrors.logProcessErrorsStrings.uncaughtException = this.cast("uncaughtException")
  @scala.inline
  def unhandledRejection: typingsJapgolly.logProcessErrors.logProcessErrorsStrings.unhandledRejection = this.cast("unhandledRejection")
  @scala.inline
  def warning: typingsJapgolly.logProcessErrors.logProcessErrorsStrings.warning = this.cast("warning")
}

