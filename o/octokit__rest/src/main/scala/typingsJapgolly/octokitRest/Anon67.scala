package typingsJapgolly.octokitRest

import typingsJapgolly.octokitRest.mod.Octokit.AppsFindUserInstallationParams
import typingsJapgolly.octokitRest.mod.Octokit.AppsFindUserInstallationResponse
import typingsJapgolly.octokitRest.mod.Octokit.Endpoint
import typingsJapgolly.octokitRest.mod.Octokit.EndpointOptions
import typingsJapgolly.octokitRest.mod.Octokit.RequestOptions
import typingsJapgolly.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon67 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[AppsFindUserInstallationResponse]] = js.native
  def apply(params: RequestOptions with AppsFindUserInstallationParams): js.Promise[Response[AppsFindUserInstallationResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

