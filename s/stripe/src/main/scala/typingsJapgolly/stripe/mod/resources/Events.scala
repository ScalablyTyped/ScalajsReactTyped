package typingsJapgolly.stripe.mod.resources

import typingsJapgolly.stripe.mod.HeaderOptions
import typingsJapgolly.stripe.mod.IDataOptions
import typingsJapgolly.stripe.mod.IList
import typingsJapgolly.stripe.mod.IListPromise
import typingsJapgolly.stripe.mod.IResponseFn
import typingsJapgolly.stripe.mod.StripeResource
import typingsJapgolly.stripe.mod.events.IEvent
import typingsJapgolly.stripe.mod.events.IEventListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Events")
@js.native
class Events () extends StripeResource {
  def list(): IListPromise[IEvent] = js.native
  def list(data: IEventListOptions): IListPromise[IEvent] = js.native
  /**
    * List events, going back up to 30 days.
    */
  def list(data: IEventListOptions, options: HeaderOptions): IListPromise[IEvent] = js.native
  def list(data: IEventListOptions, options: HeaderOptions, response: IResponseFn[IList[IEvent]]): IListPromise[IEvent] = js.native
  def list(data: IEventListOptions, response: IResponseFn[IList[IEvent]]): IListPromise[IEvent] = js.native
  def list(options: HeaderOptions): IListPromise[IEvent] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IEvent]]): IListPromise[IEvent] = js.native
  def list(response: IResponseFn[IList[IEvent]]): IListPromise[IEvent] = js.native
  def retrieve(id: String): js.Promise[IEvent] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[IEvent] = js.native
  /**
    * Retrieves the details of an event. Supply the unique identifier of the event, which you might have
    * received in a webhook.
    */
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IEvent] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IEvent]): js.Promise[IEvent] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[IEvent]): js.Promise[IEvent] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[IEvent] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IEvent]): js.Promise[IEvent] = js.native
  def retrieve(id: String, response: IResponseFn[IEvent]): js.Promise[IEvent] = js.native
}

