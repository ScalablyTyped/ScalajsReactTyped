package typingsJapgolly.stripe.mod.resources

import typingsJapgolly.stripe.mod.HeaderOptions
import typingsJapgolly.stripe.mod.IList
import typingsJapgolly.stripe.mod.IListPromise
import typingsJapgolly.stripe.mod.IResponseFn
import typingsJapgolly.stripe.mod.StripeResource
import typingsJapgolly.stripe.mod.topups.ITopup
import typingsJapgolly.stripe.mod.topups.ITopupCreationOptions
import typingsJapgolly.stripe.mod.topups.ITopupUpdateOptions
import typingsJapgolly.stripe.mod.topups.ITopupsListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Topups")
@js.native
class Topups () extends StripeResource {
  def cancel(id: String): js.Promise[ITopup] = js.native
  /**
    * Cancels a top-up. Only pending top-ups can be canceled. Returns the canceled top-up. If the top-up
    * is already canceled or can’t be canceled, an error is returned.
    */
  def cancel(id: String, options: HeaderOptions): js.Promise[ITopup] = js.native
  def cancel(id: String, options: HeaderOptions, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
  def cancel(id: String, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
  def create(data: ITopupCreationOptions): js.Promise[ITopup] = js.native
  /**
    * Top up the balance of an account
    */
  def create(data: ITopupCreationOptions, options: HeaderOptions): js.Promise[ITopup] = js.native
  def create(data: ITopupCreationOptions, options: HeaderOptions, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
  def create(data: ITopupCreationOptions, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
  /**
    * A object containing the data property, which is an array of separate top-up objects. The number
    * of top-ups in the array is limited to the number designated in limit. If no more top-ups are available,
    * the resulting array will be empty. This request should never throw an error.
    */
  def list(data: ITopupsListOptions): IListPromise[ITopup] = js.native
  def list(data: ITopupsListOptions, options: HeaderOptions): IListPromise[ITopup] = js.native
  def list(data: ITopupsListOptions, options: HeaderOptions, response: IResponseFn[IList[ITopup]]): IListPromise[ITopup] = js.native
  def list(data: ITopupsListOptions, response: IResponseFn[IList[ITopup]]): IListPromise[ITopup] = js.native
  def retrieve(id: String): js.Promise[ITopup] = js.native
  /**
    * Retrieves the details of a top-up that has previously been created.
    */
  def retrieve(id: String, options: HeaderOptions): js.Promise[ITopup] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
  def retrieve(id: String, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
  def update(id: String, data: ITopupUpdateOptions): js.Promise[ITopup] = js.native
  /**
    * Updates the metadata of a top-up. Other top-up details are not editable by design.
    * Returns the newly updated top-up object if the call succeeded. Otherwise, this call throws an error.
    */
  def update(id: String, data: ITopupUpdateOptions, options: HeaderOptions): js.Promise[ITopup] = js.native
  def update(id: String, data: ITopupUpdateOptions, options: HeaderOptions, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
  def update(id: String, data: ITopupUpdateOptions, response: IResponseFn[ITopup]): js.Promise[ITopup] = js.native
}

