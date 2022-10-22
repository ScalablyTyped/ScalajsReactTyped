package typingsJapgolly.awsSdkMiddlewareEndpoint

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSdkMiddlewareEndpoint.distTypesResolveEndpointConfigMod.EndpointResolvedConfig
import typingsJapgolly.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typingsJapgolly.awsSdkTypes.distTypesEndpointMod.EndpointParameters
import typingsJapgolly.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAdaptorsGetEndpointFromInstructionsMod {
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/adaptors/getEndpointFromInstructions", JSImport.Namespace)
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
  
  /* Inlined std.Partial<{getEndpointParameterInstructions (): @aws-sdk/middleware-endpoint.@aws-sdk/middleware-endpoint/dist-types/types.EndpointParameterInstructions}> */
  trait EndpointParameterInstructionsSupplier extends StObject {
    
    var getEndpointParameterInstructions: js.UndefOr[js.Function0[EndpointParameterInstructions]] = js.undefined
  }
  object EndpointParameterInstructionsSupplier {
    
    inline def apply(): EndpointParameterInstructionsSupplier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointParameterInstructionsSupplier]
    }
    
    extension [Self <: EndpointParameterInstructionsSupplier](x: Self) {
      
      inline def setGetEndpointParameterInstructions(value: CallbackTo[EndpointParameterInstructions]): Self = StObject.set(x, "getEndpointParameterInstructions", value.toJsFn)
      
      inline def setGetEndpointParameterInstructionsUndefined: Self = StObject.set(x, "getEndpointParameterInstructions", js.undefined)
    }
  }
}
