package typingsJapgolly.bitcoinjsLib

import typingsJapgolly.bitcoinjsLib.paymentsMod.Payment
import typingsJapgolly.bitcoinjsLib.paymentsMod.PaymentOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/payments/p2pkh", JSImport.Namespace)
@js.native
object p2pkhMod extends js.Object {
  def p2pkh(a: Payment): Payment = js.native
  def p2pkh(a: Payment, opts: PaymentOpts): Payment = js.native
}

