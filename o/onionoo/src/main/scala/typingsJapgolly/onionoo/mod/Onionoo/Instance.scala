package typingsJapgolly.onionoo.mod.Onionoo

import typingsJapgolly.got.mod.GotPromise
import typingsJapgolly.onionoo.onionooStrings.bandwidth
import typingsJapgolly.onionoo.onionooStrings.clients
import typingsJapgolly.onionoo.onionooStrings.details
import typingsJapgolly.onionoo.onionooStrings.summary
import typingsJapgolly.onionoo.onionooStrings.uptime
import typingsJapgolly.onionoo.onionooStrings.weights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
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

