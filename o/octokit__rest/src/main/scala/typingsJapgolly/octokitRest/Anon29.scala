package typingsJapgolly.octokitRest

import typingsJapgolly.octokitRest.mod.Octokit.ActivityListFeedsResponse
import typingsJapgolly.octokitRest.mod.Octokit.EmptyParams
import typingsJapgolly.octokitRest.mod.Octokit.Endpoint
import typingsJapgolly.octokitRest.mod.Octokit.EndpointOptions
import typingsJapgolly.octokitRest.mod.Octokit.RequestOptions
import typingsJapgolly.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon29 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ActivityListFeedsResponse]] = js.native
  def apply(params: RequestOptions with EmptyParams): js.Promise[Response[ActivityListFeedsResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

