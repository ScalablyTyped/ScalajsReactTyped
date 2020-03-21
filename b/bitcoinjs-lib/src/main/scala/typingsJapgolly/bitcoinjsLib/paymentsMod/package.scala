package typingsJapgolly.bitcoinjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object paymentsMod {
  type PaymentCreator = js.Function2[
    /* a */ typingsJapgolly.bitcoinjsLib.paymentsMod.Payment, 
    /* opts */ js.UndefOr[typingsJapgolly.bitcoinjsLib.paymentsMod.PaymentOpts], 
    typingsJapgolly.bitcoinjsLib.paymentsMod.Payment
  ]
  type PaymentFunction = js.Function0[typingsJapgolly.bitcoinjsLib.paymentsMod.Payment]
  type Stack = js.Array[typingsJapgolly.bitcoinjsLib.paymentsMod.StackElement]
  type StackElement = typingsJapgolly.node.Buffer | scala.Double
  type StackFunction = js.Function0[typingsJapgolly.bitcoinjsLib.paymentsMod.Stack]
}
