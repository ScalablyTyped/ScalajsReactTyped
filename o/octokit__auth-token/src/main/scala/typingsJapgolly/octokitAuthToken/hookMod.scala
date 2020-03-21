package typingsJapgolly.octokitAuthToken

import typingsJapgolly.octokitAuthToken.typesMod.AnyResponse
import typingsJapgolly.octokitAuthToken.typesMod.EndpointOptions
import typingsJapgolly.octokitAuthToken.typesMod.RequestInterface
import typingsJapgolly.octokitAuthToken.typesMod.RequestParameters
import typingsJapgolly.octokitAuthToken.typesMod.Route
import typingsJapgolly.octokitAuthToken.typesMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/auth-token/dist-types/hook", JSImport.Namespace)
@js.native
object hookMod extends js.Object {
  def hook(token: Token, request: RequestInterface, route: EndpointOptions | Route): js.Promise[AnyResponse] = js.native
  def hook(
    token: Token,
    request: RequestInterface,
    route: EndpointOptions | Route,
    parameters: RequestParameters
  ): js.Promise[AnyResponse] = js.native
}

