package typingsJapgolly.coinbaseCommerceNode.mod

import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.usdc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full crypto currency name.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.bitcoin
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.ethereum
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.bitcoincash
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.litecoin
  - typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.usdc_
*/
trait CryptoName extends js.Object

object CryptoName {
  @scala.inline
  def bitcoin: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.bitcoin = this.cast("bitcoin")
  @scala.inline
  def bitcoincash: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.bitcoincash = this.cast("bitcoincash")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ethereum: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.ethereum = this.cast("ethereum")
  @scala.inline
  def litecoin: typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.litecoin = this.cast("litecoin")
  @scala.inline
  def usdc: usdc_ = this.cast("usdc")
}

