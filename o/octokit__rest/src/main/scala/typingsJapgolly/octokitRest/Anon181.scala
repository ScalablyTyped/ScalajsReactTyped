package typingsJapgolly.octokitRest

import typingsJapgolly.octokitRest.mod.Octokit.Endpoint
import typingsJapgolly.octokitRest.mod.Octokit.EndpointOptions
import typingsJapgolly.octokitRest.mod.Octokit.IssuesUpdateParams
import typingsJapgolly.octokitRest.mod.Octokit.IssuesUpdateParamsDeprecatedAssignee
import typingsJapgolly.octokitRest.mod.Octokit.IssuesUpdateParamsDeprecatedNumber
import typingsJapgolly.octokitRest.mod.Octokit.IssuesUpdateResponse
import typingsJapgolly.octokitRest.mod.Octokit.RequestOptions
import typingsJapgolly.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon181 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesUpdateResponse]] = js.native
  def apply(
    params: RequestOptions with IssuesUpdateParamsDeprecatedNumber with IssuesUpdateParamsDeprecatedAssignee with IssuesUpdateParams
  ): js.Promise[Response[IssuesUpdateResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

