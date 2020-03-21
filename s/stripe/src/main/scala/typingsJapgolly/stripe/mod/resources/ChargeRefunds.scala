package typingsJapgolly.stripe.mod.resources

import typingsJapgolly.stripe.mod.HeaderOptions
import typingsJapgolly.stripe.mod.IDataOptions
import typingsJapgolly.stripe.mod.IDataOptionsWithMetadata
import typingsJapgolly.stripe.mod.IList
import typingsJapgolly.stripe.mod.IListPromise
import typingsJapgolly.stripe.mod.IResponseFn
import typingsJapgolly.stripe.mod.StripeResource
import typingsJapgolly.stripe.mod.refunds.IRefund
import typingsJapgolly.stripe.mod.refunds.IRefundCreationOptions
import typingsJapgolly.stripe.mod.refunds.IRefundListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.ChargeRefunds")
@js.native
class ChargeRefunds () extends StripeResource {
  /**
    * When you create a new refund, you must specify a charge to create it on.
    *
    * Creating a new refund will refund a charge that has previously been created but not yet refunded.
    * Funds will be refunded to the credit or debit card that was originally charged.
    * The fees you were originally charged are also refunded.
    *
    * You can optionally refund only part of a charge.
    * You can do so as many times as you wish until the entire charge has been refunded.
    *
    * Once entirely refunded, a charge can't be refunded again.
    * This method will throw an error when called on an already-refunded charge, or when trying to refund more money than is left on a charge.
    */
  var create: js.UndefOr[
    (js.Function3[
      /* data */ IRefundCreationOptions, 
      /* options */ HeaderOptions, 
      /* response */ js.UndefOr[IResponseFn[IRefund]], 
      js.Promise[IRefund]
    ]) with (js.Function2[
      /* data */ IRefundCreationOptions, 
      /* response */ js.UndefOr[IResponseFn[IRefund]], 
      js.Promise[IRefund]
    ]) with (js.Function2[
      /* options */ HeaderOptions, 
      /* response */ js.UndefOr[IResponseFn[IRefund]], 
      js.Promise[IRefund]
    ]) with (js.Function1[/* response */ js.UndefOr[IResponseFn[IRefund]], js.Promise[IRefund]])
  ] = js.native
  /**
    * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted order,
    * with the most recent refunds appearing first.
    * For convenience, the 10 most recent refunds are always available by default on the charge object.
    */
  var list: js.UndefOr[
    (js.Function3[
      /* data */ IRefundListOptions, 
      /* options */ HeaderOptions, 
      /* response */ js.UndefOr[IResponseFn[IList[IRefund]]], 
      IListPromise[IRefund]
    ]) with (js.Function2[
      /* data */ IRefundListOptions, 
      /* response */ js.UndefOr[IResponseFn[IList[IRefund]]], 
      IListPromise[IRefund]
    ]) with (js.Function2[
      /* options */ HeaderOptions, 
      /* response */ js.UndefOr[IResponseFn[IList[IRefund]]], 
      IListPromise[IRefund]
    ]) with (js.Function1[/* response */ js.UndefOr[IResponseFn[IList[IRefund]]], IListPromise[IRefund]])
  ] = js.native
  /**
    * Retrieves the details of an existing refund.
    */
  var retrieve: js.UndefOr[
    (js.Function4[
      /* id */ String, 
      /* data */ IDataOptions, 
      /* options */ HeaderOptions, 
      /* response */ js.UndefOr[IResponseFn[IRefund]], 
      js.Promise[IRefund]
    ]) with (js.Function3[
      /* id */ String, 
      /* data */ IDataOptions, 
      /* response */ js.UndefOr[IResponseFn[IRefund]], 
      js.Promise[IRefund]
    ]) with (js.Function3[
      /* id */ String, 
      /* options */ HeaderOptions, 
      /* response */ js.UndefOr[IResponseFn[IRefund]], 
      js.Promise[IRefund]
    ]) with (js.Function2[
      /* id */ String, 
      /* response */ js.UndefOr[IResponseFn[IRefund]], 
      js.Promise[IRefund]
    ])
  ] = js.native
  /**
    * Updates the specified refund by setting the values of the parameters passed.
    * Any parameters not provided will be left unchanged.
    *
    * This request only accepts metadata as an argument.
    */
  var update: js.UndefOr[
    (js.Function4[
      /* id */ String, 
      /* data */ IDataOptionsWithMetadata, 
      /* options */ HeaderOptions, 
      /* response */ js.UndefOr[IResponseFn[IRefund]], 
      js.Promise[IRefund]
    ]) with (js.Function3[
      /* id */ String, 
      /* data */ IDataOptionsWithMetadata, 
      /* response */ js.UndefOr[IResponseFn[IRefund]], 
      js.Promise[IRefund]
    ])
  ] = js.native
}

