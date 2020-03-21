package typingsJapgolly.stripe.mod.charges

import typingsJapgolly.stripe.mod.IList
import typingsJapgolly.stripe.mod.refunds.IRefund
import typingsJapgolly.stripe.mod.resources.ChargeRefunds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChargeRefunds
  extends ChargeRefunds
     with IList[IRefund]

