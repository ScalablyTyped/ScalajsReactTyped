package typingsJapgolly.bitcoinjsLib

import typingsJapgolly.bitcoinjsLib.paymentsMod.Payment
import typingsJapgolly.bitcoinjsLib.paymentsMod.PaymentOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/payments/p2ms", JSImport.Namespace)
@js.native
object p2msMod extends js.Object {
  def p2ms(a: Payment): Payment = js.native
  def p2ms(a: Payment, opts: PaymentOpts): Payment = js.native
}

