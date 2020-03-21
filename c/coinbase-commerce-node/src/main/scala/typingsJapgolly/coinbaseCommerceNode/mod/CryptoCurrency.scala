package typingsJapgolly.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Crypto currency.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.BTC
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.ETH
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.BCH
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.LTC
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.USDC
*/
trait CryptoCurrency extends js.Object

object CryptoCurrency {
  @scala.inline
  def BCH: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.BCH = this.cast("BCH")
  @scala.inline
  def BTC: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.BTC = this.cast("BTC")
  @scala.inline
  def ETH: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.ETH = this.cast("ETH")
  @scala.inline
  def LTC: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.LTC = this.cast("LTC")
  @scala.inline
  def USDC: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.USDC = this.cast("USDC")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

