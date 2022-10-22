package typingsJapgolly.awsSdkMiddlewareEndpoint

import typingsJapgolly.awsSdkMiddlewareEndpoint.distTypesAdaptorsGetEndpointFromInstructionsMod.EndpointParameterInstructionsSupplier
import typingsJapgolly.awsSdkMiddlewareEndpoint.distTypesResolveEndpointConfigMod.EndpointResolvedConfig
import typingsJapgolly.awsSdkTypes.distTypesEndpointMod.EndpointParameters
import typingsJapgolly.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.Endpoint
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAdaptorsMod {
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/adaptors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointFromInstructions[T /* <: EndpointParameters */, CommandInput /* <: Record[String, Any] */, Config /* <: Record[String, Any] */](
    commandInput: CommandInput,
    instructionsSupplier: EndpointParameterInstructionsSupplier,
    clientConfig: Partial[EndpointResolvedConfig[T]] & Config
  ): js.Promise[EndpointV2] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointFromInstructions")(commandInput.asInstanceOf[js.Any], instructionsSupplier.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EndpointV2]]
  inline def getEndpointFromInstructions[T /* <: EndpointParameters */, CommandInput /* <: Record[String, Any] */, Config /* <: Record[String, Any] */](
    commandInput: CommandInput,
    instructionsSupplier: EndpointParameterInstructionsSupplier,
    clientConfig: Partial[EndpointResolvedConfig[T]] & Config,
    context: HandlerExecutionContext
  ): js.Promise[EndpointV2] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointFromInstructions")(commandInput.asInstanceOf[js.Any], instructionsSupplier.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EndpointV2]]
  
  inline def resolveParams[T /* <: EndpointParameters */, CommandInput /* <: Record[String, Any] */, Config /* <: Record[String, Any] */](
    commandInput: CommandInput,
    instructionsSupplier: EndpointParameterInstructionsSupplier,
    clientConfig: Partial[EndpointResolvedConfig[T]] & Config
  ): js.Promise[EndpointParameters] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveParams")(commandInput.asInstanceOf[js.Any], instructionsSupplier.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EndpointParameters]]
  
  inline def toEndpointV1(endpoint: String): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("toEndpointV1")(endpoint.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
  inline def toEndpointV1(endpoint: EndpointV2): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("toEndpointV1")(endpoint.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
  inline def toEndpointV1(endpoint: Endpoint): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("toEndpointV1")(endpoint.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
}
