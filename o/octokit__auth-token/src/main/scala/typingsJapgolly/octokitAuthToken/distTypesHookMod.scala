package typingsJapgolly.octokitAuthToken

import typingsJapgolly.octokitAuthToken.distTypesTypesMod.AnyResponse
import typingsJapgolly.octokitAuthToken.distTypesTypesMod.EndpointOptions
import typingsJapgolly.octokitAuthToken.distTypesTypesMod.RequestInterface
import typingsJapgolly.octokitAuthToken.distTypesTypesMod.RequestParameters
import typingsJapgolly.octokitAuthToken.distTypesTypesMod.Route
import typingsJapgolly.octokitAuthToken.distTypesTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHookMod {
  
  @JSImport("@octokit/auth-token/dist-types/hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hook(token: Token, request: RequestInterface, route: EndpointOptions): js.Promise[AnyResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(token.asInstanceOf[js.Any], request.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnyResponse]]
  inline def hook(token: Token, request: RequestInterface, route: EndpointOptions, parameters: RequestParameters): js.Promise[AnyResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(token.asInstanceOf[js.Any], request.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnyResponse]]
  inline def hook(token: Token, request: RequestInterface, route: Route): js.Promise[AnyResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(token.asInstanceOf[js.Any], request.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnyResponse]]
  inline def hook(token: Token, request: RequestInterface, route: Route, parameters: RequestParameters): js.Promise[AnyResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(token.asInstanceOf[js.Any], request.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnyResponse]]
}
