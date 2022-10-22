package typingsJapgolly.bitcoinjsLib

import typingsJapgolly.bitcoinjsLib.srcPaymentsMod.Payment
import typingsJapgolly.bitcoinjsLib.srcPaymentsMod.PaymentOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPaymentsP2pkMod {
  
  @JSImport("bitcoinjs-lib/src/payments/p2pk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def p2pk(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2pk")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
  inline def p2pk(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2pk")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
}
