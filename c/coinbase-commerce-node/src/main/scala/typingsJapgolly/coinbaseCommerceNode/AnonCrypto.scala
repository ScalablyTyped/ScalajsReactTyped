package typingsJapgolly.coinbaseCommerceNode

import typingsJapgolly.coinbaseCommerceNode.mod.CryptoCurrency
import typingsJapgolly.coinbaseCommerceNode.mod.FiatCurrency
import typingsJapgolly.coinbaseCommerceNode.mod.Price
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCrypto extends js.Object {
  var crypto: Price[CryptoCurrency]
  var local: Price[FiatCurrency]
}

object AnonCrypto {
  @scala.inline
  def apply(crypto: Price[CryptoCurrency], local: Price[FiatCurrency]): AnonCrypto = {
    val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCrypto]
  }
}

