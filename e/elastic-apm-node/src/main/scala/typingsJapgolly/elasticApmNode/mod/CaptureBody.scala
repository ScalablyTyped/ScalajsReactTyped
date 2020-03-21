package typingsJapgolly.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticApmNode.elasticApmNodeStrings.off
  - typingsJapgolly.elasticApmNode.elasticApmNodeStrings.errors
  - typingsJapgolly.elasticApmNode.elasticApmNodeStrings.transactions
  - typingsJapgolly.elasticApmNode.elasticApmNodeStrings.all
*/
trait CaptureBody extends js.Object

object CaptureBody {
  @scala.inline
  def all: typingsJapgolly.elasticApmNode.elasticApmNodeStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def errors: typingsJapgolly.elasticApmNode.elasticApmNodeStrings.errors = this.cast("errors")
  @scala.inline
  def off: typingsJapgolly.elasticApmNode.elasticApmNodeStrings.off = this.cast("off")
  @scala.inline
  def transactions: typingsJapgolly.elasticApmNode.elasticApmNodeStrings.transactions = this.cast("transactions")
}

