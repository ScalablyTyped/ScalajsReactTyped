package typingsJapgolly.paypalRestSdk.mod.invoice

import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice.generateNumber")
@js.native
object generateNumber extends js.Object {
  def apply(config: RequestOptions): Unit = js.native
  def apply(config: RequestOptions, cb: CallbackFunction[NumberResponse]): Unit = js.native
  def apply(config: CallbackFunction[NumberResponse]): Unit = js.native
  def apply(config: CallbackFunction[NumberResponse], cb: CallbackFunction[NumberResponse]): Unit = js.native
}

