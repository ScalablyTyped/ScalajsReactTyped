package typingsJapgolly.octokitRest

import typingsJapgolly.octokitRest.mod.Octokit.Endpoint
import typingsJapgolly.octokitRest.mod.Octokit.EndpointOptions
import typingsJapgolly.octokitRest.mod.Octokit.RequestOptions
import typingsJapgolly.octokitRest.mod.Octokit.Response
import typingsJapgolly.octokitRest.mod.Octokit.TeamsUpdateInOrgParams
import typingsJapgolly.octokitRest.mod.Octokit.TeamsUpdateInOrgParamsDeprecatedPermission
import typingsJapgolly.octokitRest.mod.Octokit.TeamsUpdateInOrgResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon590 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[TeamsUpdateInOrgResponse]] = js.native
  def apply(params: RequestOptions with TeamsUpdateInOrgParamsDeprecatedPermission with TeamsUpdateInOrgParams): js.Promise[Response[TeamsUpdateInOrgResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

