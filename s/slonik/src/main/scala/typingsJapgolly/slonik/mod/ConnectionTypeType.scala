package typingsJapgolly.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.slonik.slonikStrings.EXPLICIT
  - typingsJapgolly.slonik.slonikStrings.IMPLICIT_QUERY
  - typingsJapgolly.slonik.slonikStrings.IMPLICIT_TRANSACTION
*/
trait ConnectionTypeType extends js.Object

object ConnectionTypeType {
  @scala.inline
  def EXPLICIT: typingsJapgolly.slonik.slonikStrings.EXPLICIT = this.cast("EXPLICIT")
  @scala.inline
  def IMPLICIT_QUERY: typingsJapgolly.slonik.slonikStrings.IMPLICIT_QUERY = this.cast("IMPLICIT_QUERY")
  @scala.inline
  def IMPLICIT_TRANSACTION: typingsJapgolly.slonik.slonikStrings.IMPLICIT_TRANSACTION = this.cast("IMPLICIT_TRANSACTION")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

