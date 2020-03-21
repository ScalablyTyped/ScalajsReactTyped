package typingsJapgolly.octokitRest

import typingsJapgolly.octokitRest.mod.Octokit.ActionsGetPublicKeyParams
import typingsJapgolly.octokitRest.mod.Octokit.ActionsGetPublicKeyResponse
import typingsJapgolly.octokitRest.mod.Octokit.Endpoint
import typingsJapgolly.octokitRest.mod.Octokit.EndpointOptions
import typingsJapgolly.octokitRest.mod.Octokit.RequestOptions
import typingsJapgolly.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon2 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ActionsGetPublicKeyResponse]] = js.native
  def apply(params: RequestOptions with ActionsGetPublicKeyParams): js.Promise[Response[ActionsGetPublicKeyResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

