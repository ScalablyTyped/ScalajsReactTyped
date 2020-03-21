package typingsJapgolly.octokitRest

import typingsJapgolly.octokitRest.mod.Octokit.Endpoint
import typingsJapgolly.octokitRest.mod.Octokit.EndpointOptions
import typingsJapgolly.octokitRest.mod.Octokit.ReposCreateCommitCommentParams
import typingsJapgolly.octokitRest.mod.Octokit.ReposCreateCommitCommentParamsDeprecatedLine
import typingsJapgolly.octokitRest.mod.Octokit.ReposCreateCommitCommentParamsDeprecatedSha
import typingsJapgolly.octokitRest.mod.Octokit.ReposCreateCommitCommentResponse
import typingsJapgolly.octokitRest.mod.Octokit.RequestOptions
import typingsJapgolly.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon353 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ReposCreateCommitCommentResponse]] = js.native
  def apply(
    params: RequestOptions with ReposCreateCommitCommentParamsDeprecatedSha with ReposCreateCommitCommentParamsDeprecatedLine with ReposCreateCommitCommentParams
  ): js.Promise[Response[ReposCreateCommitCommentResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

