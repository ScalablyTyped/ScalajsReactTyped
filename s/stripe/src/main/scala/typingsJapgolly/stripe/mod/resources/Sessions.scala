package typingsJapgolly.stripe.mod.resources

import typingsJapgolly.stripe.mod.HeaderOptions
import typingsJapgolly.stripe.mod.IResponseFn
import typingsJapgolly.stripe.mod.StripeResource
import typingsJapgolly.stripe.mod.checkouts.sessions.ICheckoutCreationOptions
import typingsJapgolly.stripe.mod.checkouts.sessions.ICheckoutSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Sessions")
@js.native
class Sessions () extends StripeResource {
  def create(data: ICheckoutCreationOptions): js.Promise[ICheckoutSession] = js.native
  def create(data: ICheckoutCreationOptions, options: HeaderOptions): js.Promise[ICheckoutSession] = js.native
  def create(data: ICheckoutCreationOptions, options: HeaderOptions, response: IResponseFn[ICheckoutSession]): js.Promise[ICheckoutSession] = js.native
  def create(data: ICheckoutCreationOptions, response: IResponseFn[ICheckoutSession]): js.Promise[ICheckoutSession] = js.native
  def retrieve(data: String): js.Promise[ICheckoutSession] = js.native
  def retrieve(data: String, options: HeaderOptions): js.Promise[ICheckoutSession] = js.native
  def retrieve(data: String, options: HeaderOptions, response: IResponseFn[ICheckoutSession]): js.Promise[ICheckoutSession] = js.native
  def retrieve(data: String, response: IResponseFn[ICheckoutSession]): js.Promise[ICheckoutSession] = js.native
}

