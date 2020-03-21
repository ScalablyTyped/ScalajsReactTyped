package typingsJapgolly.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.plaidLink.plaidLinkStrings.transactions
  - typingsJapgolly.plaidLink.plaidLinkStrings.auth
  - typingsJapgolly.plaidLink.plaidLinkStrings.identity
  - typingsJapgolly.plaidLink.plaidLinkStrings.income
  - typingsJapgolly.plaidLink.plaidLinkStrings.assets
  - typingsJapgolly.plaidLink.plaidLinkStrings.investments
  - typingsJapgolly.plaidLink.plaidLinkStrings.liabilities
*/
trait Product extends js.Object

object Product {
  @scala.inline
  def assets: typingsJapgolly.plaidLink.plaidLinkStrings.assets = this.cast("assets")
  @scala.inline
  def auth: typingsJapgolly.plaidLink.plaidLinkStrings.auth = this.cast("auth")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def identity: typingsJapgolly.plaidLink.plaidLinkStrings.identity = this.cast("identity")
  @scala.inline
  def income: typingsJapgolly.plaidLink.plaidLinkStrings.income = this.cast("income")
  @scala.inline
  def investments: typingsJapgolly.plaidLink.plaidLinkStrings.investments = this.cast("investments")
  @scala.inline
  def liabilities: typingsJapgolly.plaidLink.plaidLinkStrings.liabilities = this.cast("liabilities")
  @scala.inline
  def transactions: typingsJapgolly.plaidLink.plaidLinkStrings.transactions = this.cast("transactions")
}

