package typingsJapgolly.stripe.mod.resources

import typingsJapgolly.stripe.mod.HeaderOptions
import typingsJapgolly.stripe.mod.IList
import typingsJapgolly.stripe.mod.IResponseFn
import typingsJapgolly.stripe.mod.StripeResource
import typingsJapgolly.stripe.mod.issuing.disputes.IIssuingDispute
import typingsJapgolly.stripe.mod.issuing.disputes.IIssuingDisputeCreateOptions
import typingsJapgolly.stripe.mod.issuing.disputes.IIssuingDisputeListOptions
import typingsJapgolly.stripe.mod.issuing.disputes.IIssuingDisputeUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.IssuingDisputes")
@js.native
class IssuingDisputes () extends StripeResource {
  def create(data: IIssuingDisputeCreateOptions): js.Promise[IIssuingDispute] = js.native
  /**
    * Creates an Issuing Dispute object.
    */
  def create(data: IIssuingDisputeCreateOptions, options: HeaderOptions): js.Promise[IIssuingDispute] = js.native
  def create(data: IIssuingDisputeCreateOptions, options: HeaderOptions, response: IResponseFn[IIssuingDispute]): js.Promise[IIssuingDispute] = js.native
  def create(data: IIssuingDisputeCreateOptions, response: IResponseFn[IIssuingDispute]): js.Promise[IIssuingDispute] = js.native
  def list(): js.Promise[IList[IIssuingDispute]] = js.native
  def list(data: IIssuingDisputeListOptions): js.Promise[IList[IIssuingDispute]] = js.native
  /**
    * Returns a list of Issuing Dispute objects. The objects are sorted in descending order by creation date, with the most recently created object appearing first.
    */
  def list(data: IIssuingDisputeListOptions, options: HeaderOptions): js.Promise[IList[IIssuingDispute]] = js.native
  def list(
    data: IIssuingDisputeListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[IIssuingDispute]]
  ): js.Promise[IList[IIssuingDispute]] = js.native
  def list(data: IIssuingDisputeListOptions, response: IResponseFn[IList[IIssuingDispute]]): js.Promise[IList[IIssuingDispute]] = js.native
  def list(options: HeaderOptions): js.Promise[IList[IIssuingDispute]] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IIssuingDispute]]): js.Promise[IList[IIssuingDispute]] = js.native
  def list(response: IResponseFn[IList[IIssuingDispute]]): js.Promise[IList[IIssuingDispute]] = js.native
  def retrieve(id: String): js.Promise[IIssuingDispute] = js.native
  /**
    * Retrieves an Issuing Dispute object.
    */
  def retrieve(id: String, options: HeaderOptions): js.Promise[IIssuingDispute] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IIssuingDispute]): js.Promise[IIssuingDispute] = js.native
  def retrieve(id: String, response: IResponseFn[IIssuingDispute]): js.Promise[IIssuingDispute] = js.native
  def update(id: String, data: IIssuingDisputeUpdateOptions): js.Promise[IIssuingDispute] = js.native
  /**
    * Updates the specified Issuing Dispute object by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    */
  def update(id: String, data: IIssuingDisputeUpdateOptions, options: HeaderOptions): js.Promise[IIssuingDispute] = js.native
  def update(
    id: String,
    data: IIssuingDisputeUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[IIssuingDispute]
  ): js.Promise[IIssuingDispute] = js.native
  def update(id: String, data: IIssuingDisputeUpdateOptions, response: IResponseFn[IIssuingDispute]): js.Promise[IIssuingDispute] = js.native
}

