package typingsJapgolly.stripe.mod.resources

import typingsJapgolly.stripe.AnonCancellationreasonSetupIntentCancelationReason
import typingsJapgolly.stripe.mod.HeaderOptions
import typingsJapgolly.stripe.mod.IList
import typingsJapgolly.stripe.mod.IListPromise
import typingsJapgolly.stripe.mod.IResponseFn
import typingsJapgolly.stripe.mod.StripeResource
import typingsJapgolly.stripe.mod.setupIntents.ISetupIntent
import typingsJapgolly.stripe.mod.setupIntents.ISetupIntentConfirmOptions
import typingsJapgolly.stripe.mod.setupIntents.ISetupIntentCreationOptions
import typingsJapgolly.stripe.mod.setupIntents.ISetupIntentListOptions
import typingsJapgolly.stripe.mod.setupIntents.ISetupIntentRetrieveOptions
import typingsJapgolly.stripe.mod.setupIntents.ISetupIntentUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.SetupIntents")
@js.native
class SetupIntents () extends StripeResource {
  def cancel(intent: String): js.Promise[ISetupIntent] = js.native
  def cancel(intent: String, data: AnonCancellationreasonSetupIntentCancelationReason): js.Promise[ISetupIntent] = js.native
  /**
    * A SetupIntent object can be canceled when it is in one of these statuses:
    * `requires_payment_method`, `requires_capture`, `requires_confirmation`, `requires_action`.
    *
    * Once canceled, setup is abandoned and any operations on the SetupIntent will fail
    * with an error.
    *
    * @returns Returns a SetupIntent object if the cancellation succeeded. Returns an error if the SetupIntent has already been canceled or is not in a cancelable state.
    */
  def cancel(intent: String, data: AnonCancellationreasonSetupIntentCancelationReason, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
  def cancel(
    intent: String,
    data: AnonCancellationreasonSetupIntentCancelationReason,
    options: HeaderOptions,
    response: IResponseFn[ISetupIntent]
  ): js.Promise[ISetupIntent] = js.native
  def cancel(
    intent: String,
    data: AnonCancellationreasonSetupIntentCancelationReason,
    response: IResponseFn[ISetupIntent]
  ): js.Promise[ISetupIntent] = js.native
  def cancel(intent: String, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
  def cancel(intent: String, options: HeaderOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
  def cancel(intent: String, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
  def confirm(intent: String): js.Promise[ISetupIntent] = js.native
  def confirm(intent: String, data: ISetupIntentConfirmOptions): js.Promise[ISetupIntent] = js.native
  /**
    * Confirm that your customer intends to set up the current or provided payment method.
    * For example, you would confirm a SetupIntent when a customer hits the “Save” button
    * on a payment method management page on your website.
    *
    * If the selected payment method does not require any additional steps from the customer,
    * the SetupIntent will transition to the `succeeded` status.
    *
    * Otherwise, it will transition to the `requires_action` status and suggest additional
    * actions via `next_action`. If setup fails, the SetupIntent will transition to the
    * `requires_payment_method` status.
    */
  def confirm(intent: String, data: ISetupIntentConfirmOptions, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
  def confirm(
    intent: String,
    data: ISetupIntentConfirmOptions,
    options: HeaderOptions,
    response: IResponseFn[ISetupIntent]
  ): js.Promise[ISetupIntent] = js.native
  def confirm(intent: String, data: ISetupIntentConfirmOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
  def confirm(intent: String, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
  def confirm(intent: String, options: HeaderOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
  def confirm(intent: String, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
  def create(data: ISetupIntentCreationOptions): js.Promise[ISetupIntent] = js.native
  /**
    * Creates a SetupIntent object.
    *
    * After the SetupIntent is created, attach a payment method and confirm to collect
    * any required permissions to charge the payment method later.
    */
  def create(data: ISetupIntentCreationOptions, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
  def create(data: ISetupIntentCreationOptions, options: HeaderOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
  def create(data: ISetupIntentCreationOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
  def list(): IListPromise[ISetupIntent] = js.native
  def list(data: ISetupIntentListOptions): IListPromise[ISetupIntent] = js.native
  /**
    * Returns a list of SetupIntents.
    *
    * @returns An object with a data property that contains an array of up to limit SetupIntents, starting after SetupIntent starting_after. Each entry in the array is a separate SetupIntent object. If no more SetupIntents are available, the resulting array will be empty. This request should never throw an error.
    */
  def list(data: ISetupIntentListOptions, options: HeaderOptions): IListPromise[ISetupIntent] = js.native
  def list(data: ISetupIntentListOptions, options: HeaderOptions, response: IResponseFn[IList[ISetupIntent]]): IListPromise[ISetupIntent] = js.native
  def list(data: ISetupIntentListOptions, response: IResponseFn[IList[ISetupIntent]]): IListPromise[ISetupIntent] = js.native
  def list(options: HeaderOptions): IListPromise[ISetupIntent] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[ISetupIntent]]): IListPromise[ISetupIntent] = js.native
  def list(response: IResponseFn[IList[ISetupIntent]]): IListPromise[ISetupIntent] = js.native
  def retrieve(intent: String): js.Promise[ISetupIntent] = js.native
  def retrieve(intent: String, data: ISetupIntentRetrieveOptions): js.Promise[ISetupIntent] = js.native
  /**
    * Retrieves the details of a SetupIntent that has previously been created.
    *
    * Client-side retrieval using a publishable key is allowed when the `client_secret`
    * is provided in the query string.
    *
    * When retrieved with a publishable key, only a subset of properties will be returned.
    * Please refer to the SetupIntent object reference for more details.
    */
  def retrieve(intent: String, data: ISetupIntentRetrieveOptions, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
  def retrieve(
    intent: String,
    data: ISetupIntentRetrieveOptions,
    options: HeaderOptions,
    response: IResponseFn[ISetupIntent]
  ): js.Promise[ISetupIntent] = js.native
  def retrieve(intent: String, data: ISetupIntentRetrieveOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
  def retrieve(intent: String, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
  def retrieve(intent: String, options: HeaderOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
  def retrieve(intent: String, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
  def update(intent: String, data: ISetupIntentUpdateOptions): js.Promise[ISetupIntent] = js.native
  /**
    * Updates a SetupIntent object.
    */
  def update(intent: String, data: ISetupIntentUpdateOptions, options: HeaderOptions): js.Promise[ISetupIntent] = js.native
  def update(
    intent: String,
    data: ISetupIntentUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[ISetupIntent]
  ): js.Promise[ISetupIntent] = js.native
  def update(intent: String, data: ISetupIntentUpdateOptions, response: IResponseFn[ISetupIntent]): js.Promise[ISetupIntent] = js.native
}

