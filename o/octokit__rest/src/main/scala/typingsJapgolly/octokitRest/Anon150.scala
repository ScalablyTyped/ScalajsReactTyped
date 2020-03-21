package typingsJapgolly.octokitRest

import typingsJapgolly.octokitRest.mod.Octokit.Endpoint
import typingsJapgolly.octokitRest.mod.Octokit.EndpointOptions
import typingsJapgolly.octokitRest.mod.Octokit.IssuesCreateCommentParams
import typingsJapgolly.octokitRest.mod.Octokit.IssuesCreateCommentParamsDeprecatedNumber
import typingsJapgolly.octokitRest.mod.Octokit.IssuesCreateCommentResponse
import typingsJapgolly.octokitRest.mod.Octokit.RequestOptions
import typingsJapgolly.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon150 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesCreateCommentResponse]] = js.native
  def apply(
    params: RequestOptions with IssuesCreateCommentParamsDeprecatedNumber with IssuesCreateCommentParams
  ): js.Promise[Response[IssuesCreateCommentResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

