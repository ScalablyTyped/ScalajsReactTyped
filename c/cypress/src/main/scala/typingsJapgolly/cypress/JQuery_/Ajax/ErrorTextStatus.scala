package typingsJapgolly.cypress.JQuery_.Ajax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cypress.cypressStrings.timeout
  - typingsJapgolly.cypress.cypressStrings.error
  - typingsJapgolly.cypress.cypressStrings.abort
  - typingsJapgolly.cypress.cypressStrings.parsererror
*/
trait ErrorTextStatus extends js.Object

object ErrorTextStatus {
  @scala.inline
  def abort: typingsJapgolly.cypress.cypressStrings.abort = this.cast("abort")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.cypress.cypressStrings.error = this.cast("error")
  @scala.inline
  def parsererror: typingsJapgolly.cypress.cypressStrings.parsererror = this.cast("parsererror")
  @scala.inline
  def timeout: typingsJapgolly.cypress.cypressStrings.timeout = this.cast("timeout")
}

