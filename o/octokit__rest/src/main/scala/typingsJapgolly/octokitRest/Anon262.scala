package typingsJapgolly.octokitRest

import typingsJapgolly.octokitRest.mod.Octokit.Endpoint
import typingsJapgolly.octokitRest.mod.Octokit.EndpointOptions
import typingsJapgolly.octokitRest.mod.Octokit.OrgsUpdateParams
import typingsJapgolly.octokitRest.mod.Octokit.OrgsUpdateParamsDeprecatedMembersAllowedRepositoryCreationType
import typingsJapgolly.octokitRest.mod.Octokit.OrgsUpdateResponse
import typingsJapgolly.octokitRest.mod.Octokit.RequestOptions
import typingsJapgolly.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon262 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[OrgsUpdateResponse]] = js.native
  def apply(
    params: RequestOptions with OrgsUpdateParamsDeprecatedMembersAllowedRepositoryCreationType with OrgsUpdateParams
  ): js.Promise[Response[OrgsUpdateResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

