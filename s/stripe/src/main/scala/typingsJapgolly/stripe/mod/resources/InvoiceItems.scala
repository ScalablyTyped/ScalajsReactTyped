package typingsJapgolly.stripe.mod.resources

import typingsJapgolly.stripe.mod.HeaderOptions
import typingsJapgolly.stripe.mod.IDeleteConfirmation
import typingsJapgolly.stripe.mod.IList
import typingsJapgolly.stripe.mod.IListPromise
import typingsJapgolly.stripe.mod.IResponseFn
import typingsJapgolly.stripe.mod.StripeResource
import typingsJapgolly.stripe.mod.invoiceItems.InvoiceItem
import typingsJapgolly.stripe.mod.invoiceItems.InvoiceItemCreationOptions
import typingsJapgolly.stripe.mod.invoiceItems.InvoiceItemListOptions
import typingsJapgolly.stripe.mod.invoiceItems.InvoiceItemUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.InvoiceItems")
@js.native
class InvoiceItems () extends StripeResource {
  def create(data: InvoiceItemCreationOptions): js.Promise[InvoiceItem] = js.native
  /**
    * Adds an arbitrary charge or credit to the customer’s upcoming invoice.
    */
  def create(data: InvoiceItemCreationOptions, options: HeaderOptions): js.Promise[InvoiceItem] = js.native
  def create(data: InvoiceItemCreationOptions, options: HeaderOptions, response: IResponseFn[InvoiceItem]): js.Promise[InvoiceItem] = js.native
  def create(data: InvoiceItemCreationOptions, response: IResponseFn[InvoiceItem]): js.Promise[InvoiceItem] = js.native
  def del(invoiceItemId: String): js.Promise[IDeleteConfirmation] = js.native
  /**
    * Removes an invoice item from the upcoming invoice. Removing an invoice item is only possible before the invoice it's attached
    * to is closed.
    */
  def del(invoiceItemId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def del(invoiceItemId: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def del(invoiceItemId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def list(): IListPromise[InvoiceItem] = js.native
  def list(data: InvoiceItemListOptions): IListPromise[InvoiceItem] = js.native
  /**
    * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with the most recently created invoice
    * items appearing first.
    */
  def list(data: InvoiceItemListOptions, options: HeaderOptions): IListPromise[InvoiceItem] = js.native
  def list(data: InvoiceItemListOptions, options: HeaderOptions, response: IResponseFn[IList[InvoiceItem]]): IListPromise[InvoiceItem] = js.native
  def list(data: InvoiceItemListOptions, response: IResponseFn[IList[InvoiceItem]]): IListPromise[InvoiceItem] = js.native
  def list(options: HeaderOptions): IListPromise[InvoiceItem] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[InvoiceItem]]): IListPromise[InvoiceItem] = js.native
  def list(response: IResponseFn[IList[InvoiceItem]]): IListPromise[InvoiceItem] = js.native
  def retrieve(invoiceItemId: String): js.Promise[InvoiceItem] = js.native
  /**
    * Retrieves the invoice item with the given ID.
    */
  def retrieve(invoiceItemId: String, options: HeaderOptions): js.Promise[InvoiceItem] = js.native
  def retrieve(invoiceItemId: String, options: HeaderOptions, response: IResponseFn[InvoiceItem]): js.Promise[InvoiceItem] = js.native
  def retrieve(invoiceItemId: String, response: IResponseFn[InvoiceItem]): js.Promise[InvoiceItem] = js.native
  def update(invoiceItemId: String, data: InvoiceItemUpdateOptions): js.Promise[InvoiceItem] = js.native
  /**
    * Updates the amount or description of an invoice item on an upcoming invoice. Updating an invoice item is only possible before the
    * invoice it's attached to is closed.
    */
  def update(invoiceItemId: String, data: InvoiceItemUpdateOptions, options: HeaderOptions): js.Promise[InvoiceItem] = js.native
  def update(
    invoiceItemId: String,
    data: InvoiceItemUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[InvoiceItem]
  ): js.Promise[InvoiceItem] = js.native
  def update(invoiceItemId: String, data: InvoiceItemUpdateOptions, response: IResponseFn[InvoiceItem]): js.Promise[InvoiceItem] = js.native
}

