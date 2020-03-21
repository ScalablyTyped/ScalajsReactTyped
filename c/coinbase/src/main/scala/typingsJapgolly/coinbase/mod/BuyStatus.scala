package typingsJapgolly.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.coinbase.coinbaseStrings.created
  - typingsJapgolly.coinbase.coinbaseStrings.completed
  - typingsJapgolly.coinbase.coinbaseStrings.canceled
*/
trait BuyStatus extends js.Object

object BuyStatus {
  @scala.inline
  def canceled: typingsJapgolly.coinbase.coinbaseStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typingsJapgolly.coinbase.coinbaseStrings.completed = this.cast("completed")
  @scala.inline
  def created: typingsJapgolly.coinbase.coinbaseStrings.created = this.cast("created")
}

