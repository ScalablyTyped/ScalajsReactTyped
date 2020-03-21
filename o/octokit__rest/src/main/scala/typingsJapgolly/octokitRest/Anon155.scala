package typingsJapgolly.octokitRest

import typingsJapgolly.octokitRest.mod.Octokit.AnyResponse
import typingsJapgolly.octokitRest.mod.Octokit.Endpoint
import typingsJapgolly.octokitRest.mod.Octokit.EndpointOptions
import typingsJapgolly.octokitRest.mod.Octokit.IssuesDeleteMilestoneParams
import typingsJapgolly.octokitRest.mod.Octokit.IssuesDeleteMilestoneParamsDeprecatedNumber
import typingsJapgolly.octokitRest.mod.Octokit.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon155 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[AnyResponse] = js.native
  def apply(
    params: RequestOptions with IssuesDeleteMilestoneParamsDeprecatedNumber with IssuesDeleteMilestoneParams
  ): js.Promise[AnyResponse] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

