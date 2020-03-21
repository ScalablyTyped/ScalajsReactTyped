package typingsJapgolly.octokitRest

import typingsJapgolly.octokitRest.mod.Octokit.Endpoint
import typingsJapgolly.octokitRest.mod.Octokit.EndpointOptions
import typingsJapgolly.octokitRest.mod.Octokit.RequestOptions
import typingsJapgolly.octokitRest.mod.Octokit.Response
import typingsJapgolly.octokitRest.mod.Octokit.TeamsUpdateLegacyParams
import typingsJapgolly.octokitRest.mod.Octokit.TeamsUpdateLegacyParamsDeprecatedPermission
import typingsJapgolly.octokitRest.mod.Octokit.TeamsUpdateLegacyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon591 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[TeamsUpdateLegacyResponse]] = js.native
  def apply(
    params: RequestOptions with TeamsUpdateLegacyParamsDeprecatedPermission with TeamsUpdateLegacyParams
  ): js.Promise[Response[TeamsUpdateLegacyResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

