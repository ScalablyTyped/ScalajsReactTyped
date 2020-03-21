package typingsJapgolly.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.coinbase.coinbaseStrings.send
  - typingsJapgolly.coinbase.coinbaseStrings.request
  - typingsJapgolly.coinbase.coinbaseStrings.transfer
  - typingsJapgolly.coinbase.coinbaseStrings.buy
  - typingsJapgolly.coinbase.coinbaseStrings.sell
  - typingsJapgolly.coinbase.coinbaseStrings.fiat_deposit
  - typingsJapgolly.coinbase.coinbaseStrings.fiat_withdrawal
  - typingsJapgolly.coinbase.coinbaseStrings.exchange_deposit
  - typingsJapgolly.coinbase.coinbaseStrings.exchange_withdrawal
  - typingsJapgolly.coinbase.coinbaseStrings.vault_withdrawal
*/
trait TransactionType extends js.Object

object TransactionType {
  @scala.inline
  def buy: typingsJapgolly.coinbase.coinbaseStrings.buy = this.cast("buy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exchange_deposit: typingsJapgolly.coinbase.coinbaseStrings.exchange_deposit = this.cast("exchange_deposit")
  @scala.inline
  def exchange_withdrawal: typingsJapgolly.coinbase.coinbaseStrings.exchange_withdrawal = this.cast("exchange_withdrawal")
  @scala.inline
  def fiat_deposit: typingsJapgolly.coinbase.coinbaseStrings.fiat_deposit = this.cast("fiat_deposit")
  @scala.inline
  def fiat_withdrawal: typingsJapgolly.coinbase.coinbaseStrings.fiat_withdrawal = this.cast("fiat_withdrawal")
  @scala.inline
  def request: typingsJapgolly.coinbase.coinbaseStrings.request = this.cast("request")
  @scala.inline
  def sell: typingsJapgolly.coinbase.coinbaseStrings.sell = this.cast("sell")
  @scala.inline
  def send: typingsJapgolly.coinbase.coinbaseStrings.send = this.cast("send")
  @scala.inline
  def transfer: typingsJapgolly.coinbase.coinbaseStrings.transfer = this.cast("transfer")
  @scala.inline
  def vault_withdrawal: typingsJapgolly.coinbase.coinbaseStrings.vault_withdrawal = this.cast("vault_withdrawal")
}

