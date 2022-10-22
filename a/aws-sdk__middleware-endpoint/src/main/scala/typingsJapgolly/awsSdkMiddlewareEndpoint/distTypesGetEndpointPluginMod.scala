package typingsJapgolly.awsSdkMiddlewareEndpoint

import typingsJapgolly.awsSdkMiddlewareEndpoint.distTypesResolveEndpointConfigMod.EndpointResolvedConfig
import typingsJapgolly.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typingsJapgolly.awsSdkTypes.distTypesEndpointMod.EndpointParameters
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.RelativeMiddlewareOptions
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.SerializeHandlerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetEndpointPluginMod {
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/getEndpointPlugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/getEndpointPlugin", "endpointMiddlewareOptions")
  @js.native
  val endpointMiddlewareOptions: SerializeHandlerOptions & RelativeMiddlewareOptions = js.native
  
  inline def getEndpointPlugin[T /* <: EndpointParameters */](config: EndpointResolvedConfig[T], instructions: EndpointParameterInstructions): Pluggable[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointPlugin")(config.asInstanceOf[js.Any], instructions.asInstanceOf[js.Any])).asInstanceOf[Pluggable[Any, Any]]
}
