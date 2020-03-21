package typingsJapgolly.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.coinbase.coinbaseStrings.account
  - typingsJapgolly.coinbase.coinbaseStrings.transaction
  - typingsJapgolly.coinbase.coinbaseStrings.address
  - typingsJapgolly.coinbase.coinbaseStrings.user
  - typingsJapgolly.coinbase.coinbaseStrings.buy
  - typingsJapgolly.coinbase.coinbaseStrings.sell
  - typingsJapgolly.coinbase.coinbaseStrings.deposit
  - typingsJapgolly.coinbase.coinbaseStrings.withdrawal
  - typingsJapgolly.coinbase.coinbaseStrings.payment_method
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  def account: typingsJapgolly.coinbase.coinbaseStrings.account = this.cast("account")
  @scala.inline
  def address: typingsJapgolly.coinbase.coinbaseStrings.address = this.cast("address")
  @scala.inline
  def buy: typingsJapgolly.coinbase.coinbaseStrings.buy = this.cast("buy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deposit: typingsJapgolly.coinbase.coinbaseStrings.deposit = this.cast("deposit")
  @scala.inline
  def payment_method: typingsJapgolly.coinbase.coinbaseStrings.payment_method = this.cast("payment_method")
  @scala.inline
  def sell: typingsJapgolly.coinbase.coinbaseStrings.sell = this.cast("sell")
  @scala.inline
  def transaction: typingsJapgolly.coinbase.coinbaseStrings.transaction = this.cast("transaction")
  @scala.inline
  def user: typingsJapgolly.coinbase.coinbaseStrings.user = this.cast("user")
  @scala.inline
  def withdrawal: typingsJapgolly.coinbase.coinbaseStrings.withdrawal = this.cast("withdrawal")
}

