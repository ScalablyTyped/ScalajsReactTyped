package typingsJapgolly.octokitTypes

import typingsJapgolly.octokitTypes.distTypesEndpointOptionsMod.EndpointOptions
import typingsJapgolly.octokitTypes.distTypesOctokitResponseMod.OctokitResponse
import typingsJapgolly.octokitTypes.distTypesRequestInterfaceMod.RequestInterface
import typingsJapgolly.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typingsJapgolly.octokitTypes.distTypesRouteMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAuthInterfaceMod {
  
  @js.native
  trait AuthInterface[AuthOptions /* <: js.Array[Any] */, Authentication /* <: Any */] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AuthOptions is not an array type */ args: AuthOptions
    ): js.Promise[Authentication] = js.native
    
    def hook[T](request: RequestInterface[js.Object], options: EndpointOptions): js.Promise[OctokitResponse[T, Double]] = js.native
    def hook[T](request: RequestInterface[js.Object], route: Route): js.Promise[OctokitResponse[T, Double]] = js.native
    def hook[T](request: RequestInterface[js.Object], route: Route, parameters: RequestParameters): js.Promise[OctokitResponse[T, Double]] = js.native
  }
}
