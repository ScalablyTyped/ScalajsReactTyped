package typingsJapgolly.onionoo

import typingsJapgolly.got.mod.GotPromise
import typingsJapgolly.onionoo.mod.Onionoo.Bandwidth
import typingsJapgolly.onionoo.mod.Onionoo.Clients
import typingsJapgolly.onionoo.mod.Onionoo.Details
import typingsJapgolly.onionoo.mod.Onionoo.QueryParameters
import typingsJapgolly.onionoo.mod.Onionoo.Summary
import typingsJapgolly.onionoo.mod.Onionoo.Uptime
import typingsJapgolly.onionoo.mod.Onionoo.Weights
import typingsJapgolly.onionoo.onionooStrings.bandwidth
import typingsJapgolly.onionoo.onionooStrings.clients
import typingsJapgolly.onionoo.onionooStrings.details
import typingsJapgolly.onionoo.onionooStrings.summary
import typingsJapgolly.onionoo.onionooStrings.uptime
import typingsJapgolly.onionoo.onionooStrings.weights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined onionoo.onionoo.Onionoo.Instance & std.Partial<onionoo.onionoo.Onionoo.Endpoints> */
@js.native
trait InstancePartialEndpoints extends js.Object {
  var bandwidth: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Bandwidth]]] = js.native
  var clients: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Clients]]] = js.native
  var details: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Details]]] = js.native
  var summary: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Summary]]] = js.native
  var uptime: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Uptime]]] = js.native
  var weights: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Weights]]] = js.native
  @JSName("get")
  def get_bandwidth(endpoint: bandwidth): GotPromise[Bandwidth] = js.native
  @JSName("get")
  def get_bandwidth(endpoint: bandwidth, query: QueryParameters): GotPromise[Bandwidth] = js.native
  @JSName("get")
  def get_clients(endpoint: clients): GotPromise[Clients] = js.native
  @JSName("get")
  def get_clients(endpoint: clients, query: QueryParameters): GotPromise[Clients] = js.native
  @JSName("get")
  def get_details(endpoint: details): GotPromise[Details] = js.native
  @JSName("get")
  def get_details(endpoint: details, query: QueryParameters): GotPromise[Details] = js.native
  @JSName("get")
  def get_summary(endpoint: summary): GotPromise[Summary] = js.native
  @JSName("get")
  def get_summary(endpoint: summary, query: QueryParameters): GotPromise[Summary] = js.native
  @JSName("get")
  def get_uptime(endpoint: uptime): GotPromise[Uptime] = js.native
  @JSName("get")
  def get_uptime(endpoint: uptime, query: QueryParameters): GotPromise[Uptime] = js.native
  @JSName("get")
  def get_weights(endpoint: weights): GotPromise[Weights] = js.native
  @JSName("get")
  def get_weights(endpoint: weights, query: QueryParameters): GotPromise[Weights] = js.native
}

