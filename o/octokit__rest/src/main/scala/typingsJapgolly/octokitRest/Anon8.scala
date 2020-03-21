package typingsJapgolly.octokitRest

import typingsJapgolly.octokitRest.mod.Octokit.ActionsListDownloadsForSelfHostedRunnerApplicationParams
import typingsJapgolly.octokitRest.mod.Octokit.ActionsListDownloadsForSelfHostedRunnerApplicationResponse
import typingsJapgolly.octokitRest.mod.Octokit.Endpoint
import typingsJapgolly.octokitRest.mod.Octokit.EndpointOptions
import typingsJapgolly.octokitRest.mod.Octokit.RequestOptions
import typingsJapgolly.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon8 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ActionsListDownloadsForSelfHostedRunnerApplicationResponse]] = js.native
  def apply(params: RequestOptions with ActionsListDownloadsForSelfHostedRunnerApplicationParams): js.Promise[Response[ActionsListDownloadsForSelfHostedRunnerApplicationResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

