package typingsJapgolly.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.coinbase.coinbaseStrings.wallet
  - typingsJapgolly.coinbase.coinbaseStrings.fiat
  - typingsJapgolly.coinbase.coinbaseStrings.multisig
  - typingsJapgolly.coinbase.coinbaseStrings.vault
  - typingsJapgolly.coinbase.coinbaseStrings.multisig_vault
*/
trait AccountType extends js.Object

object AccountType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fiat: typingsJapgolly.coinbase.coinbaseStrings.fiat = this.cast("fiat")
  @scala.inline
  def multisig: typingsJapgolly.coinbase.coinbaseStrings.multisig = this.cast("multisig")
  @scala.inline
  def multisig_vault: typingsJapgolly.coinbase.coinbaseStrings.multisig_vault = this.cast("multisig_vault")
  @scala.inline
  def vault: typingsJapgolly.coinbase.coinbaseStrings.vault = this.cast("vault")
  @scala.inline
  def wallet: typingsJapgolly.coinbase.coinbaseStrings.wallet = this.cast("wallet")
}

