package typingsJapgolly.bitcoinjsLib

import typingsJapgolly.bitcoinjsLib.paymentsMod.Payment
import typingsJapgolly.bitcoinjsLib.paymentsMod.PaymentOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/payments/p2sh", JSImport.Namespace)
@js.native
object p2shMod extends js.Object {
  def p2sh(a: Payment): Payment = js.native
  def p2sh(a: Payment, opts: PaymentOpts): Payment = js.native
}

