package typingsJapgolly.paypalRestSdk.mod.invoice

import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice.search")
@js.native
object search extends js.Object {
  def apply(data: SearchRequest, config: RequestOptions): Unit = js.native
  def apply(data: SearchRequest, config: RequestOptions, cb: CallbackFunction[ListResponse]): Unit = js.native
  def apply(data: SearchRequest, config: CallbackFunction[ListResponse]): Unit = js.native
  def apply(data: SearchRequest, config: CallbackFunction[ListResponse], cb: CallbackFunction[ListResponse]): Unit = js.native
}

